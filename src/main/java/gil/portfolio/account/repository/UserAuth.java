package gil.portfolio.account.repository;

import gil.portfolio.account.entities.*;
import jakarta.persistence.*;
import jakarta.persistence.criteria.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserAuth {

    @PersistenceContext
    private EntityManager em;

    public Object retrieveUserAuthHistory(){
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("primary");
//        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();

// Create a CriteriaQuery
        CriteriaQuery<Object[]> query = cb.createQuery(Object[].class);

        Root<PtUsrAuth> auth= query.from(PtUsrAuth.class);
        Root<PtUsrAuthHst> authHst= query.from(PtUsrAuthHst.class);

// Perform join based on Ids
        query.multiselect(auth, authHst);
        query.where(
                cb.equal(auth.<PtUsrAuth>get("id").get("mbId"), authHst.<PtUsrAuthHst>get("id").get("mbId")),
                cb.equal(auth.<PtUsrAuth>get("id").get("mbId"),"55")
        );

// run query
        TypedQuery<Object[]> typedQuery = em.createQuery(query);

        List<Object[]> results = typedQuery.getResultList();
        return null;
    }

    // theta-join
    public Object retrieveAuthListTheta(){
        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Object> query = cb.createQuery(Object.class);
        Root<PtUsrAuth> auth= query.from(PtUsrAuth.class);
        auth.join("ptUsrInf");

        query.select(auth).where(cb.equal(auth.get("id").get("mbId"),"55"));

        List<Object> result = em.createQuery(query).getResultList();
        return null;

    }

    public Object retrieveAuthListLeft(){
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<TbOdOrderM> query = cb.createQuery(TbOdOrderM.class);
        Root<TbOdOrderM> order = query.from(TbOdOrderM.class);
        Join<TbOdOrderM, TbOdOrderD> orderD = order.join("tbOdOrderDList", JoinType.LEFT);
        query.select(order).where(cb.equal(order.get("id").get("odrDt"),"20230102"));


        TypedQuery<TbOdOrderM> typedQuery = em.createQuery(query);
        typedQuery.setFirstResult(0);
        typedQuery.setMaxResults(10);

        //run query
        List<TbOdOrderM> result = typedQuery.getResultList();
        System.out.println(result);
        for(int i=0; i<result.size(); i++){
            TbOdOrderM tbOdOrderM = result.get(i);
            System.out.println(tbOdOrderM.getApplicationId());
            System.out.println(tbOdOrderM.getSpyplNaTrplC());
        }
        return null;
    }

    public Object retrieveAuthListLeft(String sort) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Tuple> query = cb.createTupleQuery();
        Root<TbOdOrderM> order = query.from(TbOdOrderM.class);
        Join<TbOdOrderM, TbOdOrderD> orderD = order.join("tbOdOrderDList", JoinType.LEFT);
        query.multiselect(order.get(TbOdOrderM_.applicationId), orderD.get(TbOdOrderD_.naWrsC))
                .where(cb.equal(order.get(TbOdOrderM_.id).get(TbOdOrderMId_.odrDt), "20230102"));

        TypedQuery<Tuple> typedQuery = em.createQuery(query);
        typedQuery.setFirstResult(0);
        typedQuery.setMaxResults(10);

        // Run query
        List<Tuple> result = typedQuery.getResultList();
        System.out.println(result);
        for(int i=0; i<result.size(); i++){
            Tuple tuple = result.get(i);
            System.out.println(tuple.get(0));
            System.out.println(tuple.get(1));
        }
        return null;
    }


    public List<TbOdOrderM> retrieveAuthListLeft(Integer sort) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<TbOdOrderM> query = cb.createQuery(TbOdOrderM.class);
        //select(from) clause
        Root<TbOdOrderM> order = query.from(TbOdOrderM.class);
        order.fetch(TbOdOrderM_.tbOdOrderDList, JoinType.LEFT);
        //where clause
        Predicate whereClause = cb.equal(order.get(TbOdOrderM_.id).get(TbOdOrderMId_.odrDt), "20230102");
        Predicate andClause1 = cb.equal(order.get(TbOdOrderM_.id).get(TbOdOrderMId_.ODRPL_NA_TRPL_C), "8808983000312");
        Predicate orClause1 = cb.or(whereClause, andClause1);

        //group by clause

        //having clause

        //order by clause

        //query build
        query.select(order)
                .where(
                        whereClause
                        , andClause1
                );

        //load query
        TypedQuery<TbOdOrderM> typedQuery = em.createQuery(query);

        //set paging
//        typedQuery.setFirstResult(0);
//        typedQuery.setMaxResults(10);

        //run query
        List<TbOdOrderM> result = typedQuery.getResultList();
        System.out.println(result.size());
        return result;
    }

    public Boolean isExistUser(String mbId, String mbPw, String transYn){
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> query = cb.createQuery(Long.class);
        Root<PtUsrInf> usrInf = query.from(PtUsrInf.class);
        query.select(cb.count(usrInf)).where(
                cb.equal(usrInf.get("mbId"),mbId)
                ,cb.equal(usrInf.get("mbPw"),mbPw)
//              ,cb.equal(usrInf.get("transYn"),transYn)
        );
        Long result = em.createQuery(query).getSingleResult();
        return result > 0;
    }

    /*추가 수정 요망*/
    public List<PtUsrInf> getUserType(){
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<PtUsrInf> query = cb.createQuery(PtUsrInf.class);
        Root<PtUsrInf> usrInf = query.from(PtUsrInf.class);
        query.select(usrInf.get("usrType")).where(cb.equal(usrInf.get("mbId"),"55"));
        List<PtUsrInf> result = em.createQuery(query).getResultList();
        return result;
    }
}
