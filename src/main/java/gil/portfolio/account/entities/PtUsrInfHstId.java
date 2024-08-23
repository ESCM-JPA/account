package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

//@Embeddable
public class PtUsrInfHstId implements Serializable {
    private static final long serialVersionUID = -2760901578754228869L;
    @Column(name = "MB_ID", nullable = false, length = 9)
    private String mbId;

    @Column(name = "HST_RG_DTM", nullable = false, length = 14)
    private String hstRgDtm;

    public String getMbId() {
        return mbId;
    }

    public void setMbId(String mbId) {
        this.mbId = mbId;
    }

    public String getHstRgDtm() {
        return hstRgDtm;
    }

    public void setHstRgDtm(String hstRgDtm) {
        this.hstRgDtm = hstRgDtm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PtUsrInfHstId entity = (PtUsrInfHstId) o;
        return Objects.equals(this.mbId, entity.mbId) &&
                Objects.equals(this.hstRgDtm, entity.hstRgDtm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mbId, hstRgDtm);
    }

}