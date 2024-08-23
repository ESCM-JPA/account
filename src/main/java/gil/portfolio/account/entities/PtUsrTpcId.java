package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PtUsrTpcId implements Serializable {
    private static final long serialVersionUID = -8267861888187365224L;
    @Column(name = "MB_ID", nullable = false, length = 9)
    private String mbId;

    @Column(name = "USR_TPC", nullable = false, length = 2)
    private String usrTpc;

    public String getMbId() {
        return mbId;
    }

    public void setMbId(String mbId) {
        this.mbId = mbId;
    }

    public String getUsrTpc() {
        return usrTpc;
    }

    public void setUsrTpc(String usrTpc) {
        this.usrTpc = usrTpc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PtUsrTpcId entity = (PtUsrTpcId) o;
        return Objects.equals(this.mbId, entity.mbId) &&
                Objects.equals(this.usrTpc, entity.usrTpc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mbId, usrTpc);
    }

}