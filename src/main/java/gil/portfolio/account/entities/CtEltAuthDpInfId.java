package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

//@Embeddable
public class CtEltAuthDpInfId implements Serializable {
    private static final long serialVersionUID = 5995630837771227238L;
    @Column(name = "ELT_DEPT_DSC", nullable = false)
    private Character eltDeptDsc;

    @Column(name = "USR_TPC", nullable = false, length = 2)
    private String usrTpc;

    @Column(name = "ELT_AUTH_DSC", nullable = false, length = 2)
    private String eltAuthDsc;

    public Character getEltDeptDsc() {
        return eltDeptDsc;
    }

    public void setEltDeptDsc(Character eltDeptDsc) {
        this.eltDeptDsc = eltDeptDsc;
    }

    public String getUsrTpc() {
        return usrTpc;
    }

    public void setUsrTpc(String usrTpc) {
        this.usrTpc = usrTpc;
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
        CtEltAuthDpInfId entity = (CtEltAuthDpInfId) o;
        return Objects.equals(this.eltDeptDsc, entity.eltDeptDsc) &&
                Objects.equals(this.eltAuthDsc, entity.eltAuthDsc) &&
                Objects.equals(this.usrTpc, entity.usrTpc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eltDeptDsc, eltAuthDsc, usrTpc);
    }

}