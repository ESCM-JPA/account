package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.Instant;

//@Entity
//@Table(name = "tb_gd_prgr_goodrsv", schema = "escm")
public class TbGdPrgrGoodrsv {
    @EmbeddedId
    private TbGdPrgrGoodrsvId id;

    @Column(name = "PRGR_DSC")
    private Character prgrDsc;

    @Column(name = "SEL_UPR", precision = 18, scale = 3)
    private BigDecimal selUpr;

    @Column(name = "COMP_FEERT", precision = 9, scale = 5)
    private BigDecimal compFeert;

    @Column(name = "AMN_FEERT", precision = 9, scale = 5)
    private BigDecimal amnFeert;

    @Column(name = "TROT_FEERT", precision = 9, scale = 5)
    private BigDecimal trotFeert;

    @Column(name = "PHD_FEERT", precision = 9, scale = 5)
    private BigDecimal phdFeert;

    @Column(name = "DDLY_PHD_FEERT", precision = 9, scale = 5)
    private BigDecimal ddlyPhdFeert;

    @Column(name = "ECG_SEL_UPR", precision = 17, scale = 2)
    private BigDecimal ecgSelUpr;

    @Column(name = "BYNG_UPR", precision = 18, scale = 3)
    private BigDecimal byngUpr;

    @Column(name = "PY_FDTCN")
    private Integer pyFdtcn;

    @Column(name = "ODR_FBID_YN")
    private Character odrFbidYn;

    @Column(name = "ODR_FBID_RSNC", length = 2)
    private String odrFbidRsnc;

    @Column(name = "CHRG_BUYER_ENO", length = 9)
    private String chrgBuyerEno;

    @Column(name = "APL_YN")
    private Character aplYn;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "FSRGMN_ENO", length = 9)
    private String fsrgmnEno;

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

    public TbGdPrgrGoodrsvId getId() {
        return id;
    }

    public void setId(TbGdPrgrGoodrsvId id) {
        this.id = id;
    }

    public Character getPrgrDsc() {
        return prgrDsc;
    }

    public void setPrgrDsc(Character prgrDsc) {
        this.prgrDsc = prgrDsc;
    }

    public BigDecimal getSelUpr() {
        return selUpr;
    }

    public void setSelUpr(BigDecimal selUpr) {
        this.selUpr = selUpr;
    }

    public BigDecimal getCompFeert() {
        return compFeert;
    }

    public void setCompFeert(BigDecimal compFeert) {
        this.compFeert = compFeert;
    }

    public BigDecimal getAmnFeert() {
        return amnFeert;
    }

    public void setAmnFeert(BigDecimal amnFeert) {
        this.amnFeert = amnFeert;
    }

    public BigDecimal getTrotFeert() {
        return trotFeert;
    }

    public void setTrotFeert(BigDecimal trotFeert) {
        this.trotFeert = trotFeert;
    }

    public BigDecimal getPhdFeert() {
        return phdFeert;
    }

    public void setPhdFeert(BigDecimal phdFeert) {
        this.phdFeert = phdFeert;
    }

    public BigDecimal getDdlyPhdFeert() {
        return ddlyPhdFeert;
    }

    public void setDdlyPhdFeert(BigDecimal ddlyPhdFeert) {
        this.ddlyPhdFeert = ddlyPhdFeert;
    }

    public BigDecimal getEcgSelUpr() {
        return ecgSelUpr;
    }

    public void setEcgSelUpr(BigDecimal ecgSelUpr) {
        this.ecgSelUpr = ecgSelUpr;
    }

    public BigDecimal getByngUpr() {
        return byngUpr;
    }

    public void setByngUpr(BigDecimal byngUpr) {
        this.byngUpr = byngUpr;
    }

    public Integer getPyFdtcn() {
        return pyFdtcn;
    }

    public void setPyFdtcn(Integer pyFdtcn) {
        this.pyFdtcn = pyFdtcn;
    }

    public Character getOdrFbidYn() {
        return odrFbidYn;
    }

    public void setOdrFbidYn(Character odrFbidYn) {
        this.odrFbidYn = odrFbidYn;
    }

    public String getOdrFbidRsnc() {
        return odrFbidRsnc;
    }

    public void setOdrFbidRsnc(String odrFbidRsnc) {
        this.odrFbidRsnc = odrFbidRsnc;
    }

    public String getChrgBuyerEno() {
        return chrgBuyerEno;
    }

    public void setChrgBuyerEno(String chrgBuyerEno) {
        this.chrgBuyerEno = chrgBuyerEno;
    }

    public Character getAplYn() {
        return aplYn;
    }

    public void setAplYn(Character aplYn) {
        this.aplYn = aplYn;
    }

    public Instant getFsrgDtm() {
        return fsrgDtm;
    }

    public void setFsrgDtm(Instant fsrgDtm) {
        this.fsrgDtm = fsrgDtm;
    }

    public String getFsrgmnEno() {
        return fsrgmnEno;
    }

    public void setFsrgmnEno(String fsrgmnEno) {
        this.fsrgmnEno = fsrgmnEno;
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

}