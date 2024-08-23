package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

//@Embeddable
public class TbOdTrtwrId implements Serializable {
    private static final long serialVersionUID = 3130007214591889832L;
    @Column(name = "NA_BZPLC", nullable = false, length = 13)
    private String naBzplc;

    @Column(name = "NA_WRS_C", nullable = false, length = 25)
    private String naWrsC;

    @Column(name = "PD_YY", nullable = false, length = 4)
    private String pdYy;

    @Column(name = "CSER_CTR_TPC", nullable = false)
    private Character cserCtrTpc;

    @Column(name = "BUY_TXT_DSC", nullable = false)
    private Character buyTxtDsc;

    @Column(name = "BUY_BZ_METC", nullable = false, length = 2)
    private String buyBzMetc;

    @Column(name = "NA_TEAM_C", nullable = false, length = 2)
    private String naTeamC;

    @Column(name = "MNGT_NA_TRPL_C", nullable = false, length = 13)
    private String mngtNaTrplC;

    @Column(name = "MNGT_NA_TEAM_C", nullable = false, length = 2)
    private String mngtNaTeamC;

    public String getNaBzplc() {
        return naBzplc;
    }

    public void setNaBzplc(String naBzplc) {
        this.naBzplc = naBzplc;
    }

    public String getNaWrsC() {
        return naWrsC;
    }

    public void setNaWrsC(String naWrsC) {
        this.naWrsC = naWrsC;
    }

    public String getPdYy() {
        return pdYy;
    }

    public void setPdYy(String pdYy) {
        this.pdYy = pdYy;
    }

    public Character getCserCtrTpc() {
        return cserCtrTpc;
    }

    public void setCserCtrTpc(Character cserCtrTpc) {
        this.cserCtrTpc = cserCtrTpc;
    }

    public Character getBuyTxtDsc() {
        return buyTxtDsc;
    }

    public void setBuyTxtDsc(Character buyTxtDsc) {
        this.buyTxtDsc = buyTxtDsc;
    }

    public String getBuyBzMetc() {
        return buyBzMetc;
    }

    public void setBuyBzMetc(String buyBzMetc) {
        this.buyBzMetc = buyBzMetc;
    }

    public String getNaTeamC() {
        return naTeamC;
    }

    public void setNaTeamC(String naTeamC) {
        this.naTeamC = naTeamC;
    }

    public String getMngtNaTrplC() {
        return mngtNaTrplC;
    }

    public void setMngtNaTrplC(String mngtNaTrplC) {
        this.mngtNaTrplC = mngtNaTrplC;
    }

    public String getMngtNaTeamC() {
        return mngtNaTeamC;
    }

    public void setMngtNaTeamC(String mngtNaTeamC) {
        this.mngtNaTeamC = mngtNaTeamC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TbOdTrtwrId entity = (TbOdTrtwrId) o;
        return Objects.equals(this.pdYy, entity.pdYy) &&
                Objects.equals(this.naTeamC, entity.naTeamC) &&
                Objects.equals(this.naBzplc, entity.naBzplc) &&
                Objects.equals(this.mngtNaTrplC, entity.mngtNaTrplC) &&
                Objects.equals(this.naWrsC, entity.naWrsC) &&
                Objects.equals(this.buyBzMetc, entity.buyBzMetc) &&
                Objects.equals(this.cserCtrTpc, entity.cserCtrTpc) &&
                Objects.equals(this.buyTxtDsc, entity.buyTxtDsc) &&
                Objects.equals(this.mngtNaTeamC, entity.mngtNaTeamC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pdYy, naTeamC, naBzplc, mngtNaTrplC, naWrsC, buyBzMetc, cserCtrTpc, buyTxtDsc, mngtNaTeamC);
    }

}