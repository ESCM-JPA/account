package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

//@Embeddable
public class BlMmRqsAmId implements Serializable {
    private static final long serialVersionUID = 4340758423557884066L;
    @Column(name = "RMS_MM", nullable = false, length = 6)
    private String rmsMm;

    @Column(name = "RMS_TRPL_C", nullable = false, length = 13)
    private String rmsTrplC;

    public String getRmsMm() {
        return rmsMm;
    }

    public void setRmsMm(String rmsMm) {
        this.rmsMm = rmsMm;
    }

    public String getRmsTrplC() {
        return rmsTrplC;
    }

    public void setRmsTrplC(String rmsTrplC) {
        this.rmsTrplC = rmsTrplC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BlMmRqsAmId entity = (BlMmRqsAmId) o;
        return Objects.equals(this.rmsMm, entity.rmsMm) &&
                Objects.equals(this.rmsTrplC, entity.rmsTrplC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rmsMm, rmsTrplC);
    }

}