package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

//@Embeddable
public class TbCmSimpcId implements Serializable {
    private static final long serialVersionUID = -1787409364898826915L;
    @Column(name = "SIMP_TPC", nullable = false, length = 50)
    private String simpTpc;

    @Column(name = "SIMP_C", nullable = false, length = 50)
    private String simpC;

    public String getSimpTpc() {
        return simpTpc;
    }

    public void setSimpTpc(String simpTpc) {
        this.simpTpc = simpTpc;
    }

    public String getSimpC() {
        return simpC;
    }

    public void setSimpC(String simpC) {
        this.simpC = simpC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TbCmSimpcId entity = (TbCmSimpcId) o;
        return Objects.equals(this.simpTpc, entity.simpTpc) &&
                Objects.equals(this.simpC, entity.simpC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(simpTpc, simpC);
    }

}