package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

//@Embeddable
public class PtPayInfHstId implements Serializable {
    private static final long serialVersionUID = 7091264146718433709L;
    @Column(name = "NA_TRPL_C", nullable = false, length = 13)
    private String naTrplC;

    @Column(name = "PAY_INF_RG_DTM", nullable = false, length = 14)
    private String payInfRgDtm;

    public String getNaTrplC() {
        return naTrplC;
    }

    public void setNaTrplC(String naTrplC) {
        this.naTrplC = naTrplC;
    }

    public String getPayInfRgDtm() {
        return payInfRgDtm;
    }

    public void setPayInfRgDtm(String payInfRgDtm) {
        this.payInfRgDtm = payInfRgDtm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PtPayInfHstId entity = (PtPayInfHstId) o;
        return Objects.equals(this.payInfRgDtm, entity.payInfRgDtm) &&
                Objects.equals(this.naTrplC, entity.naTrplC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payInfRgDtm, naTrplC);
    }

}