package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PtUsrAuthHstId implements Serializable {
    private static final long serialVersionUID = -8674030883511544264L;
    @Column(name = "MB_ID", nullable = false, length = 9)
    private String mbId;

    @Column(name = "USR_AUTH_DSC", nullable = false, length = 1)
    private String usrAuthDsc;

    @Column(name = "AUTH_RG_DTM", nullable = false, length = 14)
    private String authRgDtm;

    public String getMbId() {
        return mbId;
    }

    public void setMbId(String mbId) {
        this.mbId = mbId;
    }

    public String getUsrAuthDsc() {
        return usrAuthDsc;
    }

    public void setUsrAuthDsc(String usrAuthDsc) {
        this.usrAuthDsc = usrAuthDsc;
    }

    public String getAuthRgDtm() {
        return authRgDtm;
    }

    public void setAuthRgDtm(String authRgDtm) {
        this.authRgDtm = authRgDtm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PtUsrAuthHstId entity = (PtUsrAuthHstId) o;
        return Objects.equals(this.mbId, entity.mbId) &&
                Objects.equals(this.authRgDtm, entity.authRgDtm) &&
                Objects.equals(this.usrAuthDsc, entity.usrAuthDsc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mbId, authRgDtm, usrAuthDsc);
    }

}