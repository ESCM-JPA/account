package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;

//@Entity
//@Table(name = "pt_branch_bzno", schema = "escm")
public class PtBranchBzno {
    @Id
    @Column(name = "NA_TRPL_C", nullable = false, length = 13)
    private String naTrplC;

    @Column(name = "BZNO", nullable = false, length = 32)
    private String bzno;

    @Column(name = "CLNTNM", length = 200)
    private String clntnm;

    @Column(name = "REPMNM", length = 50)
    private String repmnm;

    @Column(name = "ZIP", length = 6)
    private String zip;

    @Column(name = "DONGUP", length = 300)
    private String dongup;

    @Column(name = "DONGBW", length = 100)
    private String dongbw;

    @Column(name = "BZCCNM", length = 60)
    private String bzccnm;

    @Column(name = "BZTPNM", length = 50)
    private String bztpnm;

    @Column(name = "CONFIRM_YN", length = 1)
    private String confirmYn;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "FS_RGM", length = 9)
    private String fsRgm;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CHGM", length = 9)
    private String lsChgm;

    @Column(name = "TX_REG", length = 4)
    private String txReg;

    @Column(name = "CLOSE_YN", length = 1)
    private String closeYn;

    public String getNaTrplC() {
        return naTrplC;
    }

    public void setNaTrplC(String naTrplC) {
        this.naTrplC = naTrplC;
    }

    public String getBzno() {
        return bzno;
    }

    public void setBzno(String bzno) {
        this.bzno = bzno;
    }

    public String getClntnm() {
        return clntnm;
    }

    public void setClntnm(String clntnm) {
        this.clntnm = clntnm;
    }

    public String getRepmnm() {
        return repmnm;
    }

    public void setRepmnm(String repmnm) {
        this.repmnm = repmnm;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getDongup() {
        return dongup;
    }

    public void setDongup(String dongup) {
        this.dongup = dongup;
    }

    public String getDongbw() {
        return dongbw;
    }

    public void setDongbw(String dongbw) {
        this.dongbw = dongbw;
    }

    public String getBzccnm() {
        return bzccnm;
    }

    public void setBzccnm(String bzccnm) {
        this.bzccnm = bzccnm;
    }

    public String getBztpnm() {
        return bztpnm;
    }

    public void setBztpnm(String bztpnm) {
        this.bztpnm = bztpnm;
    }

    public String getConfirmYn() {
        return confirmYn;
    }

    public void setConfirmYn(String confirmYn) {
        this.confirmYn = confirmYn;
    }

    public Instant getFsrgDtm() {
        return fsrgDtm;
    }

    public void setFsrgDtm(Instant fsrgDtm) {
        this.fsrgDtm = fsrgDtm;
    }

    public String getFsRgm() {
        return fsRgm;
    }

    public void setFsRgm(String fsRgm) {
        this.fsRgm = fsRgm;
    }

    public Instant getLschgDtm() {
        return lschgDtm;
    }

    public void setLschgDtm(Instant lschgDtm) {
        this.lschgDtm = lschgDtm;
    }

    public String getLsChgm() {
        return lsChgm;
    }

    public void setLsChgm(String lsChgm) {
        this.lsChgm = lsChgm;
    }

    public String getTxReg() {
        return txReg;
    }

    public void setTxReg(String txReg) {
        this.txReg = txReg;
    }

    public String getCloseYn() {
        return closeYn;
    }

    public void setCloseYn(String closeYn) {
        this.closeYn = closeYn;
    }

}