package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TbOdOrderMId implements Serializable {
    private static final long serialVersionUID = -8652507866469784504L;
    @Column(name = "ODRPL_NA_TRPL_C", nullable = false, length = 13)
    private String odrplNaTrplC;

    @Column(name = "ODRPL_NA_TEAM_C", nullable = false, length = 2)
    private String odrplNaTeamC;

    @Column(name = "ODR_DT", nullable = false, length = 8)
    private String odrDt;

    @Column(name = "ODR_SLPNO", nullable = false, length = 16)
    private String odrSlpno;

    public String getOdrplNaTrplC() {
        return odrplNaTrplC;
    }

    public void setOdrplNaTrplC(String odrplNaTrplC) {
        this.odrplNaTrplC = odrplNaTrplC;
    }

    public String getOdrplNaTeamC() {
        return odrplNaTeamC;
    }

    public void setOdrplNaTeamC(String odrplNaTeamC) {
        this.odrplNaTeamC = odrplNaTeamC;
    }

    public String getOdrDt() {
        return odrDt;
    }

    public void setOdrDt(String odrDt) {
        this.odrDt = odrDt;
    }

    public String getOdrSlpno() {
        return odrSlpno;
    }

    public void setOdrSlpno(String odrSlpno) {
        this.odrSlpno = odrSlpno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TbOdOrderMId entity = (TbOdOrderMId) o;
        return Objects.equals(this.odrplNaTeamC, entity.odrplNaTeamC) &&
                Objects.equals(this.odrSlpno, entity.odrSlpno) &&
                Objects.equals(this.odrDt, entity.odrDt) &&
                Objects.equals(this.odrplNaTrplC, entity.odrplNaTrplC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(odrplNaTeamC, odrSlpno, odrDt, odrplNaTrplC);
    }

}