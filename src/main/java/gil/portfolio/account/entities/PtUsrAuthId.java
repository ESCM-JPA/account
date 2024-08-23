package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PtUsrAuthId implements Serializable {
    private static final long serialVersionUID = 6013980793447943666L;
    @Column(name = "MB_ID", nullable = false, length = 9)
    private String mbId;

    @Column(name = "USR_AUTH_DSC", nullable = false, length = 1)
    private String usrAuthDsc;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PtUsrAuthId entity = (PtUsrAuthId) o;
        return Objects.equals(this.mbId, entity.mbId) &&
                Objects.equals(this.usrAuthDsc, entity.usrAuthDsc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mbId, usrAuthDsc);
    }

}