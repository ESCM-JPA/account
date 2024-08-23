package gil.portfolio.account.entities;

import jakarta.persistence.*;

import java.time.Instant;

//@Entity
//@Table(name = "bl_rv_brk", schema = "escm", indexes = {
//        @Index(name = "IDX_BL_RV_BRK_1", columnList = "RV_DT, RV_TRPL_C")
//}, uniqueConstraints = {
//        @UniqueConstraint(name = "PK_BL_RV_BRK", columnNames = {"RV_DT", "RV_SEQ"})
//})
public class BlRvBrk {
    @EmbeddedId
    private BlRvBrkId id;

    @Column(name = "RV_TRPL_C", length = 13)
    private String rvTrplC;

    @Column(name = "RQS_BAC")
    private Double rqsBac;

    @Column(name = "RV_AM")
    private Double rvAm;

    @Column(name = "RQS_MM", length = 1024)
    private String rqsMm;

    @Column(name = "RV_METH_C")
    private Character rvMethC;

    @Column(name = "TR_SEQ", length = 12)
    private String trSeq;

    @Column(name = "RV_BNK", length = 3)
    private String rvBnk;

    @Column(name = "ACNO", length = 64)
    private String acno;

    @Column(name = "PAY_DSC")
    private Character payDsc;

    @Column(name = "PRCRZT")
    private Character prcrzt;

    @Column(name = "ERR_C", length = 4)
    private String errC;

    @Column(name = "RFL_DT", length = 8)
    private String rflDt;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "FS_RGM", length = 9)
    private String fsRgm;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CHGM", length = 9)
    private String lsChgm;

    @Column(name = "TR_CNTN", length = 128)
    private String trCntn;

    @Column(name = "TR_REC_SJT_CNTN", length = 128)
    private String trRecSjtCntn;

    @Column(name = "TR_STOR", length = 128)
    private String trStor;

    @Column(name = "BZNO", length = 32)
    private String bzno;

    @Column(name = "ORD_RV_AM")
    private Double ordRvAm;

    @Column(name = "BD_RV_AM")
    private Double bdRvAm;

    @Column(name = "REMARKS", length = 1000)
    private String remarks;

    public BlRvBrkId getId() {
        return id;
    }

    public void setId(BlRvBrkId id) {
        this.id = id;
    }

    public String getRvTrplC() {
        return rvTrplC;
    }

    public void setRvTrplC(String rvTrplC) {
        this.rvTrplC = rvTrplC;
    }

    public Double getRqsBac() {
        return rqsBac;
    }

    public void setRqsBac(Double rqsBac) {
        this.rqsBac = rqsBac;
    }

    public Double getRvAm() {
        return rvAm;
    }

    public void setRvAm(Double rvAm) {
        this.rvAm = rvAm;
    }

    public String getRqsMm() {
        return rqsMm;
    }

    public void setRqsMm(String rqsMm) {
        this.rqsMm = rqsMm;
    }

    public Character getRvMethC() {
        return rvMethC;
    }

    public void setRvMethC(Character rvMethC) {
        this.rvMethC = rvMethC;
    }

    public String getTrSeq() {
        return trSeq;
    }

    public void setTrSeq(String trSeq) {
        this.trSeq = trSeq;
    }

    public String getRvBnk() {
        return rvBnk;
    }

    public void setRvBnk(String rvBnk) {
        this.rvBnk = rvBnk;
    }

    public String getAcno() {
        return acno;
    }

    public void setAcno(String acno) {
        this.acno = acno;
    }

    public Character getPayDsc() {
        return payDsc;
    }

    public void setPayDsc(Character payDsc) {
        this.payDsc = payDsc;
    }

    public Character getPrcrzt() {
        return prcrzt;
    }

    public void setPrcrzt(Character prcrzt) {
        this.prcrzt = prcrzt;
    }

    public String getErrC() {
        return errC;
    }

    public void setErrC(String errC) {
        this.errC = errC;
    }

    public String getRflDt() {
        return rflDt;
    }

    public void setRflDt(String rflDt) {
        this.rflDt = rflDt;
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

    public String getTrCntn() {
        return trCntn;
    }

    public void setTrCntn(String trCntn) {
        this.trCntn = trCntn;
    }

    public String getTrRecSjtCntn() {
        return trRecSjtCntn;
    }

    public void setTrRecSjtCntn(String trRecSjtCntn) {
        this.trRecSjtCntn = trRecSjtCntn;
    }

    public String getTrStor() {
        return trStor;
    }

    public void setTrStor(String trStor) {
        this.trStor = trStor;
    }

    public String getBzno() {
        return bzno;
    }

    public void setBzno(String bzno) {
        this.bzno = bzno;
    }

    public Double getOrdRvAm() {
        return ordRvAm;
    }

    public void setOrdRvAm(Double ordRvAm) {
        this.ordRvAm = ordRvAm;
    }

    public Double getBdRvAm() {
        return bdRvAm;
    }

    public void setBdRvAm(Double bdRvAm) {
        this.bdRvAm = bdRvAm;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

}