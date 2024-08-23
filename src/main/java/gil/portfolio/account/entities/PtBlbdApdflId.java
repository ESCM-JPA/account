package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

//@Embeddable
public class PtBlbdApdflId implements Serializable {
    private static final long serialVersionUID = 6681202536217154748L;
    @Column(name = "BLBD_ID", nullable = false, length = 14)
    private String blbdId;

    @Column(name = "BBRD_ID", nullable = false, length = 14)
    private String bbrdId;

    @Column(name = "APDFL_ID", nullable = false, length = 14)
    private String apdflId;

    public String getBlbdId() {
        return blbdId;
    }

    public void setBlbdId(String blbdId) {
        this.blbdId = blbdId;
    }

    public String getBbrdId() {
        return bbrdId;
    }

    public void setBbrdId(String bbrdId) {
        this.bbrdId = bbrdId;
    }

    public String getApdflId() {
        return apdflId;
    }

    public void setApdflId(String apdflId) {
        this.apdflId = apdflId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PtBlbdApdflId entity = (PtBlbdApdflId) o;
        return Objects.equals(this.bbrdId, entity.bbrdId) &&
                Objects.equals(this.apdflId, entity.apdflId) &&
                Objects.equals(this.blbdId, entity.blbdId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bbrdId, apdflId, blbdId);
    }

}