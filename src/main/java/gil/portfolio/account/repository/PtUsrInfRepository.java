package gil.portfolio.account.repository;

import gil.portfolio.account.entities.PtUsrInf;
import gil.portfolio.account.entities.PtUsrInf_;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PtUsrInfRepository extends JpaRepository<PtUsrInf, String> {

    PtUsrInf findAllByMbIdAndMbPw(String mbId, String mbPw);

    Integer countPtUsrInfByMbIdAndMbPw(String mbId, String mbPw);

    PtUsrInf findAllByMbId(String mbId);












//
//    default List<PtUsrInf> getUserType(){
//        CriteriaBuilder cb = em.getCriteriaBuilder();
//        CriteriaQuery<PtUsrInf> query = cb.createQuery(PtUsrInf.class);
//        Root<PtUsrInf> usrInf = query.from(PtUsrInf.class);
//        query.select(usrInf.get("usrType")).where(cb.equal(usrInf.get("mbId"),"55"));
//        List<PtUsrInf> result = em.createQuery(query).getResultList();
//        return result;
//    }

}
