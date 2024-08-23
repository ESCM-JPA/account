package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

//@Embeddable
public class CtPartnerEltAuthId implements Serializable {
    private static final long serialVersionUID = -7305688239573444592L;
    @Column(name = "MB_ID", nullable = false, length = 9)
    private String mbId;

    @Column(name = "ELT_AUTH_DSC", nullable = false, length = 3)
    private String eltAuthDsc;

    public String getMbId() {
        return mbId;
    }

    public void setMbId(String mbId) {
        this.mbId = mbId;
    }

    public String getEltAuthDsc() {
        return eltAuthDsc;
    }

    public void setEltAuthDsc(String eltAuthDsc) {
        this.eltAuthDsc = eltAuthDsc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CtPartnerEltAuthId entity = (CtPartnerEltAuthId) o;
        return Objects.equals(this.eltAuthDsc, entity.eltAuthDsc) &&
                Objects.equals(this.mbId, entity.mbId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eltAuthDsc, mbId);
    }

}