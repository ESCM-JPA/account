package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

//@Embeddable
public class TbByByngMId implements Serializable {
    private static final long serialVersionUID = -6907314953479478167L;
    @Column(name = "NA_BZPLC", nullable = false, length = 13)
    private String naBzplc;

    @Column(name = "NA_TEAM_C", nullable = false, length = 2)
    private String naTeamC;

    @Column(name = "SLP_DT", nullable = false, length = 8)
    private String slpDt;

    @Column(name = "NA_SLPNO", nullable = false, length = 9)
    private String naSlpno;

    public String getNaBzplc() {
        return naBzplc;
    }

    public void setNaBzplc(String naBzplc) {
        this.naBzplc = naBzplc;
    }

    public String getNaTeamC() {
        return naTeamC;
    }

    public void setNaTeamC(String naTeamC) {
        this.naTeamC = naTeamC;
    }

    public String getSlpDt() {
        return slpDt;
    }

    public void setSlpDt(String slpDt) {
        this.slpDt = slpDt;
    }

    public String getNaSlpno() {
        return naSlpno;
    }

    public void setNaSlpno(String naSlpno) {
        this.naSlpno = naSlpno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TbByByngMId entity = (TbByByngMId) o;
        return Objects.equals(this.slpDt, entity.slpDt) &&
                Objects.equals(this.naTeamC, entity.naTeamC) &&
                Objects.equals(this.naBzplc, entity.naBzplc) &&
                Objects.equals(this.naSlpno, entity.naSlpno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(slpDt, naTeamC, naBzplc, naSlpno);
    }

}