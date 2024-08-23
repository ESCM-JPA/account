package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;

//@Entity
//@Table(name = "bl_mm_rqs_am", schema = "escm")
public class BlMmRqsAm {
    @EmbeddedId
    private BlMmRqsAmId id;

    @Column(name = "CLNTNM", length = 200)
    private String clntnm;

    @Column(name = "NA_MBCO_DSC")
    private Character naMbcoDsc;

    @Column(name = "EDI_UGQT", precision = 10)
    private BigDecimal ediUgqt;

    @Column(name = "ADINF_UGQT", precision = 10)
    private BigDecimal adinfUgqt;

    @Column(name = "SLAM", precision = 10)
    private BigDecimal slam;

    @Column(name = "FDAM_MSR_RT_C", precision = 10)
    private BigDecimal fdamMsrRtC;

    @Column(name = "BASIC_RATE", precision = 10)
    private BigDecimal basicRate;

    @Column(name = "EDI_RATE", precision = 10)
    private BigDecimal ediRate;

    @Column(name = "EDI_UG_AM", precision = 10)
    private BigDecimal ediUgAm;

    @Column(name = "ADINF_UG_AM", precision = 10)
    private BigDecimal adinfUgAm;

    @Column(name = "IA_BI_UG_AM", precision = 10)
    private BigDecimal iaBiUgAm;

    @Column(name = "IA_PG_UG_AM", precision = 10)
    private BigDecimal iaPgUgAm;

    @Column(name = "IA_MA_UG_AM", precision = 10)
    private BigDecimal iaMaUgAm;

    @Column(name = "IA_CTGR_UG_AM", precision = 10)
    private BigDecimal iaCtgrUgAm;

    @Column(name = "IA_BLBD_UG_AM", precision = 10)
    private BigDecimal iaBlbdUgAm;

    @Column(name = "SMS_UG_AM", precision = 10)
    private BigDecimal smsUgAm;

    @Column(name = "ETC_UG_AM", precision = 10)
    private BigDecimal etcUgAm;

    @Column(name = "DC_BF_UG_AM", precision = 10)
    private BigDecimal dcBfUgAm;

    @Column(name = "PAY_UNAPL_YN")
    private Character payUnaplYn;

    @Column(name = "DC_AM", precision = 10)
    private BigDecimal dcAm;

    @Column(name = "SPPR", precision = 10)
    private BigDecimal sppr;

    @Column(name = "VAT_AM", precision = 10)
    private BigDecimal vatAm;

    @Column(name = "FS_RQS_AM", precision = 10)
    private BigDecimal fsRqsAm;

    @Column(name = "PRXP_COMP_TRPL_C", length = 13)
    private String prxpCompTrplC;

    @Column(name = "LS_RQS_AM", precision = 10)
    private BigDecimal lsRqsAm;

    @Column(name = "PBC_SQNO", length = 24)
    private String pbcSqno;

    @ColumnDefault("'N'")
    @Column(name = "PAY_DSC")
    private Character payDsc;

    @Column(name = "RQS_BAC", precision = 10)
    private BigDecimal rqsBac;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "FS_RGM", length = 9)
    private String fsRgm;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CHGM", length = 9)
    private String lsChgm;

    @Column(name = "REMARKS", length = 100)
    private String remarks;

    @Column(name = "LATE_AM", precision = 10)
    private BigDecimal lateAm;

    @Column(name = "CTGR_SL_UGQT", precision = 10)
    private BigDecimal ctgrSlUgqt;

    @Column(name = "CTGR_SL_UG_AM", precision = 10)
    private BigDecimal ctgrSlUgAm;

    @Column(name = "BAD_DEBT_AM", precision = 10)
    private BigDecimal badDebtAm;

    @Column(name = "XMLEDI_BASIC_RATE", precision = 10)
    private BigDecimal xmlediBasicRate;

    public BlMmRqsAmId getId() {
        return id;
    }

    public void setId(BlMmRqsAmId id) {
        this.id = id;
    }

    public String getClntnm() {
        return clntnm;
    }

    public void setClntnm(String clntnm) {
        this.clntnm = clntnm;
    }

    public Character getNaMbcoDsc() {
        return naMbcoDsc;
    }

    public void setNaMbcoDsc(Character naMbcoDsc) {
        this.naMbcoDsc = naMbcoDsc;
    }

    public BigDecimal getEdiUgqt() {
        return ediUgqt;
    }

    public void setEdiUgqt(BigDecimal ediUgqt) {
        this.ediUgqt = ediUgqt;
    }

    public BigDecimal getAdinfUgqt() {
        return adinfUgqt;
    }

    public void setAdinfUgqt(BigDecimal adinfUgqt) {
        this.adinfUgqt = adinfUgqt;
    }

    public BigDecimal getSlam() {
        return slam;
    }

    public void setSlam(BigDecimal slam) {
        this.slam = slam;
    }

    public BigDecimal getFdamMsrRtC() {
        return fdamMsrRtC;
    }

    public void setFdamMsrRtC(BigDecimal fdamMsrRtC) {
        this.fdamMsrRtC = fdamMsrRtC;
    }

    public BigDecimal getBasicRate() {
        return basicRate;
    }

    public void setBasicRate(BigDecimal basicRate) {
        this.basicRate = basicRate;
    }

    public BigDecimal getEdiRate() {
        return ediRate;
    }

    public void setEdiRate(BigDecimal ediRate) {
        this.ediRate = ediRate;
    }

    public BigDecimal getEdiUgAm() {
        return ediUgAm;
    }

    public void setEdiUgAm(BigDecimal ediUgAm) {
        this.ediUgAm = ediUgAm;
    }

    public BigDecimal getAdinfUgAm() {
        return adinfUgAm;
    }

    public void setAdinfUgAm(BigDecimal adinfUgAm) {
        this.adinfUgAm = adinfUgAm;
    }

    public BigDecimal getIaBiUgAm() {
        return iaBiUgAm;
    }

    public void setIaBiUgAm(BigDecimal iaBiUgAm) {
        this.iaBiUgAm = iaBiUgAm;
    }

    public BigDecimal getIaPgUgAm() {
        return iaPgUgAm;
    }

    public void setIaPgUgAm(BigDecimal iaPgUgAm) {
        this.iaPgUgAm = iaPgUgAm;
    }

    public BigDecimal getIaMaUgAm() {
        return iaMaUgAm;
    }

    public void setIaMaUgAm(BigDecimal iaMaUgAm) {
        this.iaMaUgAm = iaMaUgAm;
    }

    public BigDecimal getIaCtgrUgAm() {
        return iaCtgrUgAm;
    }

    public void setIaCtgrUgAm(BigDecimal iaCtgrUgAm) {
        this.iaCtgrUgAm = iaCtgrUgAm;
    }

    public BigDecimal getIaBlbdUgAm() {
        return iaBlbdUgAm;
    }

    public void setIaBlbdUgAm(BigDecimal iaBlbdUgAm) {
        this.iaBlbdUgAm = iaBlbdUgAm;
    }

    public BigDecimal getSmsUgAm() {
        return smsUgAm;
    }

    public void setSmsUgAm(BigDecimal smsUgAm) {
        this.smsUgAm = smsUgAm;
    }

    public BigDecimal getEtcUgAm() {
        return etcUgAm;
    }

    public void setEtcUgAm(BigDecimal etcUgAm) {
        this.etcUgAm = etcUgAm;
    }

    public BigDecimal getDcBfUgAm() {
        return dcBfUgAm;
    }

    public void setDcBfUgAm(BigDecimal dcBfUgAm) {
        this.dcBfUgAm = dcBfUgAm;
    }

    public Character getPayUnaplYn() {
        return payUnaplYn;
    }

    public void setPayUnaplYn(Character payUnaplYn) {
        this.payUnaplYn = payUnaplYn;
    }

    public BigDecimal getDcAm() {
        return dcAm;
    }

    public void setDcAm(BigDecimal dcAm) {
        this.dcAm = dcAm;
    }

    public BigDecimal getSppr() {
        return sppr;
    }

    public void setSppr(BigDecimal sppr) {
        this.sppr = sppr;
    }

    public BigDecimal getVatAm() {
        return vatAm;
    }

    public void setVatAm(BigDecimal vatAm) {
        this.vatAm = vatAm;
    }

    public BigDecimal getFsRqsAm() {
        return fsRqsAm;
    }

    public void setFsRqsAm(BigDecimal fsRqsAm) {
        this.fsRqsAm = fsRqsAm;
    }

    public String getPrxpCompTrplC() {
        return prxpCompTrplC;
    }

    public void setPrxpCompTrplC(String prxpCompTrplC) {
        this.prxpCompTrplC = prxpCompTrplC;
    }

    public BigDecimal getLsRqsAm() {
        return lsRqsAm;
    }

    public void setLsRqsAm(BigDecimal lsRqsAm) {
        this.lsRqsAm = lsRqsAm;
    }

    public String getPbcSqno() {
        return pbcSqno;
    }

    public void setPbcSqno(String pbcSqno) {
        this.pbcSqno = pbcSqno;
    }

    public Character getPayDsc() {
        return payDsc;
    }

    public void setPayDsc(Character payDsc) {
        this.payDsc = payDsc;
    }

    public BigDecimal getRqsBac() {
        return rqsBac;
    }

    public void setRqsBac(BigDecimal rqsBac) {
        this.rqsBac = rqsBac;
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public BigDecimal getLateAm() {
        return lateAm;
    }

    public void setLateAm(BigDecimal lateAm) {
        this.lateAm = lateAm;
    }

    public BigDecimal getCtgrSlUgqt() {
        return ctgrSlUgqt;
    }

    public void setCtgrSlUgqt(BigDecimal ctgrSlUgqt) {
        this.ctgrSlUgqt = ctgrSlUgqt;
    }

    public BigDecimal getCtgrSlUgAm() {
        return ctgrSlUgAm;
    }

    public void setCtgrSlUgAm(BigDecimal ctgrSlUgAm) {
        this.ctgrSlUgAm = ctgrSlUgAm;
    }

    public BigDecimal getBadDebtAm() {
        return badDebtAm;
    }

    public void setBadDebtAm(BigDecimal badDebtAm) {
        this.badDebtAm = badDebtAm;
    }

    public BigDecimal getXmlediBasicRate() {
        return xmlediBasicRate;
    }

    public void setXmlediBasicRate(BigDecimal xmlediBasicRate) {
        this.xmlediBasicRate = xmlediBasicRate;
    }

}