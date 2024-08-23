package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TbOdOrderDId implements Serializable {
    private static final long serialVersionUID = -6259544961281542045L;
    @Column(name = "ODRPL_NA_TRPL_C", nullable = false, length = 13)
    private String odrplNaTrplC;

    @Column(name = "ODRPL_NA_TEAM_C", nullable = false, length = 2)
    private String odrplNaTeamC;

    @Column(name = "ODR_DT", nullable = false, length = 8)
    private String odrDt;

    @Column(name = "ODR_SLPNO", nullable = false, length = 16)
    private String odrSlpno;

    @Column(name = "ODR_DSQNO", nullable = false)
    private Integer odrDsqno;

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

    public Integer getOdrDsqno() {
        return odrDsqno;
    }

    public void setOdrDsqno(Integer odrDsqno) {
        this.odrDsqno = odrDsqno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TbOdOrderDId entity = (TbOdOrderDId) o;
        return Objects.equals(this.odrplNaTeamC, entity.odrplNaTeamC) &&
                Objects.equals(this.odrSlpno, entity.odrSlpno) &&
                Objects.equals(this.odrDt, entity.odrDt) &&
                Objects.equals(this.odrDsqno, entity.odrDsqno) &&
                Objects.equals(this.odrplNaTrplC, entity.odrplNaTrplC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(odrplNaTeamC, odrSlpno, odrDt, odrDsqno, odrplNaTrplC);
    }

}