package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

//@Embeddable
public class TbGdPrgrGoodrsvId implements Serializable {
    private static final long serialVersionUID = 3929966348576690727L;
    @Column(name = "NA_BZPLC", nullable = false, length = 13)
    private String naBzplc;

    @Column(name = "NA_TEAM_C", nullable = false, length = 2)
    private String naTeamC;

    @Column(name = "PRGR_C", nullable = false, length = 4)
    private String prgrC;

    @Column(name = "NA_WRS_C", nullable = false, length = 25)
    private String naWrsC;

    @Column(name = "APL_DT", nullable = false, length = 8)
    private String aplDt;

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

    public String getPrgrC() {
        return prgrC;
    }

    public void setPrgrC(String prgrC) {
        this.prgrC = prgrC;
    }

    public String getNaWrsC() {
        return naWrsC;
    }

    public void setNaWrsC(String naWrsC) {
        this.naWrsC = naWrsC;
    }

    public String getAplDt() {
        return aplDt;
    }

    public void setAplDt(String aplDt) {
        this.aplDt = aplDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TbGdPrgrGoodrsvId entity = (TbGdPrgrGoodrsvId) o;
        return Objects.equals(this.naTeamC, entity.naTeamC) &&
                Objects.equals(this.naBzplc, entity.naBzplc) &&
                Objects.equals(this.aplDt, entity.aplDt) &&
                Objects.equals(this.prgrC, entity.prgrC) &&
                Objects.equals(this.naWrsC, entity.naWrsC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naTeamC, naBzplc, aplDt, prgrC, naWrsC);
    }

}