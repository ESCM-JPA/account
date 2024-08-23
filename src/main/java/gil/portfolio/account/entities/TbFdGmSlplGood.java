package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.Instant;

//@Entity
//@Table(name = "tb_fd_gm_slpl_good", schema = "escm")
public class TbFdGmSlplGood {
    @EmbeddedId
    private TbFdGmSlplGoodId id;

    @Column(name = "NA_WRS_C", length = 25)
    private String naWrsC;

    @Column(name = "COMP_WRSNM", length = 100)
    private String compWrsnm;

    @Column(name = "WRS_STDNM", length = 80)
    private String wrsStdnm;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "FSRG_ENO", length = 9)
    private String fsrgEno;

    @Column(name = "FSRGMN_NA_BZPLC", length = 13)
    private String fsrgmnNaBzplc;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CMENO", length = 9)
    private String lsCmeno;

    @Column(name = "LSCGMN_NA_BZPLC", length = 13)
    private String lscgmnNaBzplc;

    @Column(name = "DEL_DTM")
    private Instant delDtm;

    @Column(name = "DLMN_ENO", length = 9)
    private String dlmnEno;

    @Column(name = "DLMN_NA_BZPLC", length = 13)
    private String dlmnNaBzplc;

    @Column(name = "ETR_FEERT", precision = 10, scale = 6)
    private BigDecimal etrFeert;

    @Column(name = "PHD_SSDY_C", length = 4)
    private String phdSsdyC;

    @Column(name = "ADJ_NA_TRPL_C", length = 13)
    private String adjNaTrplC;

    @Column(name = "SOG_SLPL_NA_TRPL_C", length = 13)
    private String sogSlplNaTrplC;

    @Column(name = "DEL_YN")
    private Character delYn;

    public TbFdGmSlplGoodId getId() {
        return id;
    }

    public void setId(TbFdGmSlplGoodId id) {
        this.id = id;
    }

    public String getNaWrsC() {
        return naWrsC;
    }

    public void setNaWrsC(String naWrsC) {
        this.naWrsC = naWrsC;
    }

    public String getCompWrsnm() {
        return compWrsnm;
    }

    public void setCompWrsnm(String compWrsnm) {
        this.compWrsnm = compWrsnm;
    }

    public String getWrsStdnm() {
        return wrsStdnm;
    }

    public void setWrsStdnm(String wrsStdnm) {
        this.wrsStdnm = wrsStdnm;
    }

    public Instant getFsrgDtm() {
        return fsrgDtm;
    }

    public void setFsrgDtm(Instant fsrgDtm) {
        this.fsrgDtm = fsrgDtm;
    }

    public String getFsrgEno() {
        return fsrgEno;
    }

    public void setFsrgEno(String fsrgEno) {
        this.fsrgEno = fsrgEno;
    }

    public String getFsrgmnNaBzplc() {
        return fsrgmnNaBzplc;
    }

    public void setFsrgmnNaBzplc(String fsrgmnNaBzplc) {
        this.fsrgmnNaBzplc = fsrgmnNaBzplc;
    }

    public Instant getLschgDtm() {
        return lschgDtm;
    }

    public void setLschgDtm(Instant lschgDtm) {
        this.lschgDtm = lschgDtm;
    }

    public String getLsCmeno() {
        return lsCmeno;
    }

    public void setLsCmeno(String lsCmeno) {
        this.lsCmeno = lsCmeno;
    }

    public String getLscgmnNaBzplc() {
        return lscgmnNaBzplc;
    }

    public void setLscgmnNaBzplc(String lscgmnNaBzplc) {
        this.lscgmnNaBzplc = lscgmnNaBzplc;
    }

    public Instant getDelDtm() {
        return delDtm;
    }

    public void setDelDtm(Instant delDtm) {
        this.delDtm = delDtm;
    }

    public String getDlmnEno() {
        return dlmnEno;
    }

    public void setDlmnEno(String dlmnEno) {
        this.dlmnEno = dlmnEno;
    }

    public String getDlmnNaBzplc() {
        return dlmnNaBzplc;
    }

    public void setDlmnNaBzplc(String dlmnNaBzplc) {
        this.dlmnNaBzplc = dlmnNaBzplc;
    }

    public BigDecimal getEtrFeert() {
        return etrFeert;
    }

    public void setEtrFeert(BigDecimal etrFeert) {
        this.etrFeert = etrFeert;
    }

    public String getPhdSsdyC() {
        return phdSsdyC;
    }

    public void setPhdSsdyC(String phdSsdyC) {
        this.phdSsdyC = phdSsdyC;
    }

    public String getAdjNaTrplC() {
        return adjNaTrplC;
    }

    public void setAdjNaTrplC(String adjNaTrplC) {
        this.adjNaTrplC = adjNaTrplC;
    }

    public String getSogSlplNaTrplC() {
        return sogSlplNaTrplC;
    }

    public void setSogSlplNaTrplC(String sogSlplNaTrplC) {
        this.sogSlplNaTrplC = sogSlplNaTrplC;
    }

    public Character getDelYn() {
        return delYn;
    }

    public void setDelYn(Character delYn) {
        this.delYn = delYn;
    }

}