package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

//@Embeddable
public class BlCompSvcAmnHstId implements Serializable {
    private static final long serialVersionUID = -6540262364844517657L;
    @Column(name = "NA_TRPL_C", nullable = false, length = 13)
    private String naTrplC;

    @Column(name = "SVC_STS_RG_DTM", nullable = false, length = 14)
    private String svcStsRgDtm;

    public String getNaTrplC() {
        return naTrplC;
    }

    public void setNaTrplC(String naTrplC) {
        this.naTrplC = naTrplC;
    }

    public String getSvcStsRgDtm() {
        return svcStsRgDtm;
    }

    public void setSvcStsRgDtm(String svcStsRgDtm) {
        this.svcStsRgDtm = svcStsRgDtm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BlCompSvcAmnHstId entity = (BlCompSvcAmnHstId) o;
        return Objects.equals(this.svcStsRgDtm, entity.svcStsRgDtm) &&
                Objects.equals(this.naTrplC, entity.naTrplC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(svcStsRgDtm, naTrplC);
    }

}