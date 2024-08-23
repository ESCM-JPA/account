package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

//@Embeddable
public class PtBranchHstId implements Serializable {
    private static final long serialVersionUID = 8021009623880538842L;
    @Column(name = "NA_TRPL_C", nullable = false, length = 13)
    private String naTrplC;

    @Column(name = "CHGM_DTM", nullable = false, length = 14)
    private String chgmDtm;

    public String getNaTrplC() {
        return naTrplC;
    }

    public void setNaTrplC(String naTrplC) {
        this.naTrplC = naTrplC;
    }

    public String getChgmDtm() {
        return chgmDtm;
    }

    public void setChgmDtm(String chgmDtm) {
        this.chgmDtm = chgmDtm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PtBranchHstId entity = (PtBranchHstId) o;
        return Objects.equals(this.chgmDtm, entity.chgmDtm) &&
                Objects.equals(this.naTrplC, entity.naTrplC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chgmDtm, naTrplC);
    }

}