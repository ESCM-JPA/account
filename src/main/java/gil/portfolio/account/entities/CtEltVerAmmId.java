package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

//@Embeddable
public class CtEltVerAmmId implements Serializable {
    private static final long serialVersionUID = -5823470231804110111L;
    @Column(name = "CTRW_TYP", nullable = false, length = 4)
    private String ctrwTyp;

    @Column(name = "MN_CTRW_KDC", nullable = false, length = 8)
    private String mnCtrwKdc;

    @Column(name = "CTRW_STY_VER", nullable = false, length = 4)
    private String ctrwStyVer;

    public String getCtrwTyp() {
        return ctrwTyp;
    }

    public void setCtrwTyp(String ctrwTyp) {
        this.ctrwTyp = ctrwTyp;
    }

    public String getMnCtrwKdc() {
        return mnCtrwKdc;
    }

    public void setMnCtrwKdc(String mnCtrwKdc) {
        this.mnCtrwKdc = mnCtrwKdc;
    }

    public String getCtrwStyVer() {
        return ctrwStyVer;
    }

    public void setCtrwStyVer(String ctrwStyVer) {
        this.ctrwStyVer = ctrwStyVer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CtEltVerAmmId entity = (CtEltVerAmmId) o;
        return Objects.equals(this.ctrwStyVer, entity.ctrwStyVer) &&
                Objects.equals(this.mnCtrwKdc, entity.mnCtrwKdc) &&
                Objects.equals(this.ctrwTyp, entity.ctrwTyp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ctrwStyVer, mnCtrwKdc, ctrwTyp);
    }

}