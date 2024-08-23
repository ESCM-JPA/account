package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

//@Embeddable
public class BlRefundId implements Serializable {
    private static final long serialVersionUID = -2504507708381135080L;
    @Column(name = "REQ_DT", nullable = false, length = 8)
    private String reqDt;

    @Column(name = "NA_TRPL_C", nullable = false, length = 13)
    private String naTrplC;

    public String getReqDt() {
        return reqDt;
    }

    public void setReqDt(String reqDt) {
        this.reqDt = reqDt;
    }

    public String getNaTrplC() {
        return naTrplC;
    }

    public void setNaTrplC(String naTrplC) {
        this.naTrplC = naTrplC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BlRefundId entity = (BlRefundId) o;
        return Objects.equals(this.reqDt, entity.reqDt) &&
                Objects.equals(this.naTrplC, entity.naTrplC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reqDt, naTrplC);
    }

}