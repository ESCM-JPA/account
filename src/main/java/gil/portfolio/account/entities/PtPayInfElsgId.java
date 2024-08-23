package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

//@Embeddable
public class PtPayInfElsgId implements Serializable {
    private static final long serialVersionUID = -4556455209575943203L;
    @Column(name = "NA_TRPL_C", nullable = false, length = 13)
    private String naTrplC;

    @Column(name = "ELSG_DTM", nullable = false, length = 14)
    private String elsgDtm;

    public String getNaTrplC() {
        return naTrplC;
    }

    public void setNaTrplC(String naTrplC) {
        this.naTrplC = naTrplC;
    }

    public String getElsgDtm() {
        return elsgDtm;
    }

    public void setElsgDtm(String elsgDtm) {
        this.elsgDtm = elsgDtm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PtPayInfElsgId entity = (PtPayInfElsgId) o;
        return Objects.equals(this.elsgDtm, entity.elsgDtm) &&
                Objects.equals(this.naTrplC, entity.naTrplC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elsgDtm, naTrplC);
    }

}