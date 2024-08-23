package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

//@Embeddable
public class BlRvBrkId implements Serializable {
    private static final long serialVersionUID = -6218886976955053883L;
    @Column(name = "RV_DT", nullable = false, length = 8)
    private String rvDt;

    @Column(name = "RV_SEQ", nullable = false)
    private Integer rvSeq;

    public String getRvDt() {
        return rvDt;
    }

    public void setRvDt(String rvDt) {
        this.rvDt = rvDt;
    }

    public Integer getRvSeq() {
        return rvSeq;
    }

    public void setRvSeq(Integer rvSeq) {
        this.rvSeq = rvSeq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BlRvBrkId entity = (BlRvBrkId) o;
        return Objects.equals(this.rvDt, entity.rvDt) &&
                Objects.equals(this.rvSeq, entity.rvSeq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rvDt, rvSeq);
    }

}