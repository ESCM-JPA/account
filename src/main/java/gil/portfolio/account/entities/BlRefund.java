package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.Instant;

//@Entity
//@Table(name = "bl_refund", schema = "escm")
public class BlRefund {
    @EmbeddedId
    private BlRefundId id;

    @Column(name = "RF_AM", precision = 10)
    private BigDecimal rfAm;

    @Column(name = "PRC_ST")
    private Character prcSt;

    @Column(name = "RF_CD", length = 2)
    private String rfCd;

    @Column(name = "BNK_C", length = 3)
    private String bnkC;

    @Column(name = "ACNO", length = 64)
    private String acno;

    @Column(name = "ACNM", length = 200)
    private String acnm;

    @Column(name = "RF_DT", length = 8)
    private String rfDt;

    @Column(name = "BZNO", length = 32)
    private String bzno;

    @Column(name = "REMARK", length = 100)
    private String remark;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "FS_RGM", length = 9)
    private String fsRgm;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CHGM", length = 9)
    private String lsChgm;

    public BlRefundId getId() {
        return id;
    }

    public void setId(BlRefundId id) {
        this.id = id;
    }

    public BigDecimal getRfAm() {
        return rfAm;
    }

    public void setRfAm(BigDecimal rfAm) {
        this.rfAm = rfAm;
    }

    public Character getPrcSt() {
        return prcSt;
    }

    public void setPrcSt(Character prcSt) {
        this.prcSt = prcSt;
    }

    public String getRfCd() {
        return rfCd;
    }

    public void setRfCd(String rfCd) {
        this.rfCd = rfCd;
    }

    public String getBnkC() {
        return bnkC;
    }

    public void setBnkC(String bnkC) {
        this.bnkC = bnkC;
    }

    public String getAcno() {
        return acno;
    }

    public void setAcno(String acno) {
        this.acno = acno;
    }

    public String getAcnm() {
        return acnm;
    }

    public void setAcnm(String acnm) {
        this.acnm = acnm;
    }

    public String getRfDt() {
        return rfDt;
    }

    public void setRfDt(String rfDt) {
        this.rfDt = rfDt;
    }

    public String getBzno() {
        return bzno;
    }

    public void setBzno(String bzno) {
        this.bzno = bzno;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

}