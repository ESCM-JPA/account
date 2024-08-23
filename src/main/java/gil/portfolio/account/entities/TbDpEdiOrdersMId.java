package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

//@Embeddable
public class TbDpEdiOrdersMId implements Serializable {
    private static final long serialVersionUID = 186964473315900533L;
    @Column(name = "MESG_NAME", nullable = false, length = 35)
    private String mesgName;

    @Column(name = "MESG_ID", nullable = false, length = 128)
    private String mesgId;

    @Column(name = "MESG_FROM", nullable = false, length = 64)
    private String mesgFrom;

    @Column(name = "MESG_TO", nullable = false, length = 35)
    private String mesgTo;

    @Column(name = "ORDR_DATE", nullable = false, length = 35)
    private String ordrDate;

    @Column(name = "MESG_NO", nullable = false, length = 128)
    private String mesgNo;

    public String getMesgName() {
        return mesgName;
    }

    public void setMesgName(String mesgName) {
        this.mesgName = mesgName;
    }

    public String getMesgId() {
        return mesgId;
    }

    public void setMesgId(String mesgId) {
        this.mesgId = mesgId;
    }

    public String getMesgFrom() {
        return mesgFrom;
    }

    public void setMesgFrom(String mesgFrom) {
        this.mesgFrom = mesgFrom;
    }

    public String getMesgTo() {
        return mesgTo;
    }

    public void setMesgTo(String mesgTo) {
        this.mesgTo = mesgTo;
    }

    public String getOrdrDate() {
        return ordrDate;
    }

    public void setOrdrDate(String ordrDate) {
        this.ordrDate = ordrDate;
    }

    public String getMesgNo() {
        return mesgNo;
    }

    public void setMesgNo(String mesgNo) {
        this.mesgNo = mesgNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TbDpEdiOrdersMId entity = (TbDpEdiOrdersMId) o;
        return Objects.equals(this.mesgId, entity.mesgId) &&
                Objects.equals(this.mesgTo, entity.mesgTo) &&
                Objects.equals(this.mesgName, entity.mesgName) &&
                Objects.equals(this.mesgNo, entity.mesgNo) &&
                Objects.equals(this.mesgFrom, entity.mesgFrom) &&
                Objects.equals(this.ordrDate, entity.ordrDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mesgId, mesgTo, mesgName, mesgNo, mesgFrom, ordrDate);
    }

}