package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.Instant;

//@Entity
//@Table(name = "tb_by_byng_m", schema = "escm")
public class TbByByngM {
    @EmbeddedId
    private TbByByngMId id;

    @Column(name = "NA_TR_DSC", length = 4)
    private String naTrDsc;

    @Column(name = "CNR_DT", length = 8)
    private String cnrDt;

    @Column(name = "ADJ_NA_BZPLC", length = 13)
    private String adjNaBzplc;

    @Column(name = "ADJ_BZPL_NA_TEAM_C", length = 2)
    private String adjBzplNaTeamC;

    @Column(name = "BUYPL_NA_TRPL_C", length = 13)
    private String buyplNaTrplC;

    @Column(name = "BUYPL_NA_TEAM_C", length = 2)
    private String buyplNaTeamC;

    @Column(name = "ADJ_NA_TRPL_C", length = 13)
    private String adjNaTrplC;

    @Column(name = "ADJ_NA_TEAM_C", length = 2)
    private String adjNaTeamC;

    @Column(name = "MNGT_NA_TRPL_C", length = 13)
    private String mngtNaTrplC;

    @Column(name = "MNGT_NA_TEAM_C", length = 2)
    private String mngtNaTeamC;

    @Column(name = "ACTL_BUYPL_NA_TRPL_C", length = 13)
    private String actlBuyplNaTrplC;

    @Column(name = "ACTL_BUYPL_NA_TEAM_C", length = 2)
    private String actlBuyplNaTeamC;

    @Column(name = "DDLY_BUYPL_NA_TRPL_C", length = 13)
    private String ddlyBuyplNaTrplC;

    @Column(name = "DDLY_BUYPL_NA_TEAM_C", length = 2)
    private String ddlyBuyplNaTeamC;

    @Column(name = "NA_BLB_DFC_DSC")
    private Character naBlbDfcDsc;

    @Column(name = "BYAM", precision = 18)
    private BigDecimal byam;

    @Column(name = "BYNG_VAT", precision = 18)
    private BigDecimal byngVat;

    @Column(name = "VCBT_AM", precision = 18)
    private BigDecimal vcbtAm;

    @Column(name = "VCBX_AM", precision = 18)
    private BigDecimal vcbxAm;

    @Column(name = "BYNG_SSDY", precision = 18)
    private BigDecimal byngSsdy;

    @Column(name = "NA_STL_TP_DSC", length = 2)
    private String naStlTpDsc;

    @Column(name = "RPY_PLA_DT", length = 8)
    private String rpyPlaDt;

    @Column(name = "NA_DVY_PLASH_SLPNO", length = 17)
    private String naDvyPlashSlpno;

    @Column(name = "DDLY_YN")
    private Character ddlyYn;

    @Column(name = "BZ_METH_DSC", length = 2)
    private String bzMethDsc;

    @Column(name = "ROTS_CTR_DSC")
    private Character rotsCtrDsc;

    @Column(name = "LED_RFL_DT", length = 8)
    private String ledRflDt;

    @Column(name = "NA_CRC_CAN_DSC", nullable = false)
    private Character naCrcCanDsc;

    @Column(name = "OSLIP_DT", length = 8)
    private String oslipDt;

    @Column(name = "OSLIP_NA_SLPNO", length = 9)
    private String oslipNaSlpno;

    @Column(name = "DEL_YN")
    private Character delYn;

    @Column(name = "FSRGMN_ENO", length = 9)
    private String fsrgmnEno;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "LS_CMENO", length = 9)
    private String lsCmeno;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "DLMN_ENO", length = 9)
    private String dlmnEno;

    @Column(name = "DEL_DTM")
    private Instant delDtm;

    @Column(name = "XML_RGD_PLA_NO", length = 35)
    private String xmlRgdPlaNo;

    @Column(name = "INQ_CN")
    private Integer inqCn;

    @Column(name = "LINE_CN")
    private Integer lineCn;

    @Column(name = "FS_RMS_DT", length = 8)
    private String fsRmsDt;

    @Column(name = "FS_RMS_HR", length = 6)
    private String fsRmsHr;

    @Column(name = "LS_RMS_DT", length = 8)
    private String lsRmsDt;

    @Column(name = "LS_RMS_HR", length = 6)
    private String lsRmsHr;

    @Column(name = "EDIRG_DTM")
    private Instant edirgDtm;

    @Column(name = "ACK_RMS_YN")
    private Character ackRmsYn;

    @Column(name = "RMS_SPYPL_C", length = 13)
    private String rmsSpyplC;

    @Column(name = "MB_ID", length = 9)
    private String mbId;

    @Column(name = "APPLICATION_ID", length = 35)
    private String applicationId;

    @Column(name = "DOC_NAME", length = 6)
    private String docName;

    @Column(name = "DOC_RMS_LOC_DSC", length = 3)
    private String docRmsLocDsc;

    @Column(name = "DVYAA_NA_TRPL_C", length = 13)
    private String dvyaaNaTrplC;

    @Column(name = "DVYAA_NA_TEAM_C", length = 2)
    private String dvyaaNaTeamC;

    @Column(name = "NH_IF_DTM", length = 14)
    private String nhIfDtm;

    @Column(name = "WHSE_C", length = 6)
    private String whseC;

    @Column(name = "SOGMN_NA_TRPL_C", length = 13)
    private String sogmnNaTrplC;

    @Column(name = "SOGMN_NA_TEAM_C", length = 2)
    private String sogmnNaTeamC;

    @Column(name = "SOG_SLPL_NA_TRPL_C", length = 13)
    private String sogSlplNaTrplC;

    @Column(name = "SOG_SLPL_NA_TEAM_C", length = 2)
    private String sogSlplNaTeamC;

    @Column(name = "SEL_PLA_AM", precision = 18)
    private BigDecimal selPlaAm;

    @Column(name = "TXT_SPY_AM", precision = 18)
    private BigDecimal txtSpyAm;

    @Column(name = "VAT_SPY_AM", precision = 18)
    private BigDecimal vatSpyAm;

    @Column(name = "EXTX_SPY_AM", precision = 18)
    private BigDecimal extxSpyAm;

    @Column(name = "SMA_SPY_AM", precision = 18)
    private BigDecimal smaSpyAm;

    @Column(name = "LIQ_TXT_SPY_AM", precision = 18)
    private BigDecimal liqTxtSpyAm;

    @Column(name = "LIQ_VAT_SPY_AM", precision = 18)
    private BigDecimal liqVatSpyAm;

    @Column(name = "CBAM", precision = 18)
    private BigDecimal cbam;

    @Column(name = "CSH_PY_AM", precision = 18)
    private BigDecimal cshPyAm;

    @Column(name = "PPY_BYAM", precision = 18)
    private BigDecimal ppyByam;

    @Column(name = "TFR_AM", precision = 18)
    private BigDecimal tfrAm;

    @Column(name = "DSTR_TR_LCLC")
    private Character dstrTrLclc;

    @Column(name = "BYNG_SLP_DSC", length = 2)
    private String byngSlpDsc;

    @Column(name = "BYNG_REF_DSC", length = 2)
    private String byngRefDsc;

    @Column(name = "DVY_PLASH_REF_YN")
    private Character dvyPlashRefYn;

    @Column(name = "TR_BASS_NO", length = 16)
    private String trBassNo;

    @Column(name = "PATN_SLPL_SLP_DT", length = 8)
    private String patnSlplSlpDt;

    @Column(name = "PATN_SLPL_NA_SLPNO", length = 9)
    private String patnSlplNaSlpno;

    @Column(name = "RGD_PR_PRC_DSC")
    private Character rgdPrPrcDsc;

    @Column(name = "NAAC_DSC")
    private Character naacDsc;

    @Column(name = "INO_DSC")
    private Character inoDsc;

    @Column(name = "BYNG_INP_TRM_DSC")
    private Character byngInpTrmDsc;

    @Column(name = "NA_TR_OCU_DSC", length = 2)
    private String naTrOcuDsc;

    @Column(name = "STVCS_OCU_YN")
    private Character stvcsOcuYn;

    @Column(name = "PVRPD_YN")
    private Character pvrpdYn;

    @Column(name = "LBDY_BFC_DSC")
    private Character lbdyBfcDsc;

    @Column(name = "BFC_CSTT_DSC")
    private Character bfcCsttDsc;

    @Column(name = "BFC_HDCN", precision = 10)
    private BigDecimal bfcHdcn;

    @Column(name = "LBDY_WT", precision = 16)
    private BigDecimal lbdyWt;

    @Column(name = "BFC_WT", precision = 16)
    private BigDecimal bfcWt;

    @Column(name = "BFC_DMT_TOT_WT", precision = 16)
    private BigDecimal bfcDmtTotWt;

    @Column(name = "ACTL_WT", precision = 16)
    private BigDecimal actlWt;

    @Column(name = "BFC_AM", precision = 18)
    private BigDecimal bfcAm;

    @Column(name = "RMK_CNTN", length = 200)
    private String rmkCntn;

    @Column(name = "TRPRC_SQNO", precision = 20)
    private BigDecimal trprcSqno;

    @Column(name = "RTL_DSTR_CV_SYS_DSC")
    private Character rtlDstrCvSysDsc;

    @Column(name = "DATA_TMS_YN")
    private Character dataTmsYn;

    @Column(name = "PATN_NA_TR_DSC", length = 4)
    private String patnNaTrDsc;

    @Column(name = "CSER_TR_REL_AMNNO", precision = 10)
    private BigDecimal cserTrRelAmnno;

    @Column(name = "MNGT_TR_REL_AMNNO", precision = 10)
    private BigDecimal mngtTrRelAmnno;

    @Column(name = "TRF_REF_DSC", length = 1)
    private String trfRefDsc;

    public TbByByngMId getId() {
        return id;
    }

    public void setId(TbByByngMId id) {
        this.id = id;
    }

    public String getNaTrDsc() {
        return naTrDsc;
    }

    public void setNaTrDsc(String naTrDsc) {
        this.naTrDsc = naTrDsc;
    }

    public String getCnrDt() {
        return cnrDt;
    }

    public void setCnrDt(String cnrDt) {
        this.cnrDt = cnrDt;
    }

    public String getAdjNaBzplc() {
        return adjNaBzplc;
    }

    public void setAdjNaBzplc(String adjNaBzplc) {
        this.adjNaBzplc = adjNaBzplc;
    }

    public String getAdjBzplNaTeamC() {
        return adjBzplNaTeamC;
    }

    public void setAdjBzplNaTeamC(String adjBzplNaTeamC) {
        this.adjBzplNaTeamC = adjBzplNaTeamC;
    }

    public String getBuyplNaTrplC() {
        return buyplNaTrplC;
    }

    public void setBuyplNaTrplC(String buyplNaTrplC) {
        this.buyplNaTrplC = buyplNaTrplC;
    }

    public String getBuyplNaTeamC() {
        return buyplNaTeamC;
    }

    public void setBuyplNaTeamC(String buyplNaTeamC) {
        this.buyplNaTeamC = buyplNaTeamC;
    }

    public String getAdjNaTrplC() {
        return adjNaTrplC;
    }

    public void setAdjNaTrplC(String adjNaTrplC) {
        this.adjNaTrplC = adjNaTrplC;
    }

    public String getAdjNaTeamC() {
        return adjNaTeamC;
    }

    public void setAdjNaTeamC(String adjNaTeamC) {
        this.adjNaTeamC = adjNaTeamC;
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

    public String getActlBuyplNaTrplC() {
        return actlBuyplNaTrplC;
    }

    public void setActlBuyplNaTrplC(String actlBuyplNaTrplC) {
        this.actlBuyplNaTrplC = actlBuyplNaTrplC;
    }

    public String getActlBuyplNaTeamC() {
        return actlBuyplNaTeamC;
    }

    public void setActlBuyplNaTeamC(String actlBuyplNaTeamC) {
        this.actlBuyplNaTeamC = actlBuyplNaTeamC;
    }

    public String getDdlyBuyplNaTrplC() {
        return ddlyBuyplNaTrplC;
    }

    public void setDdlyBuyplNaTrplC(String ddlyBuyplNaTrplC) {
        this.ddlyBuyplNaTrplC = ddlyBuyplNaTrplC;
    }

    public String getDdlyBuyplNaTeamC() {
        return ddlyBuyplNaTeamC;
    }

    public void setDdlyBuyplNaTeamC(String ddlyBuyplNaTeamC) {
        this.ddlyBuyplNaTeamC = ddlyBuyplNaTeamC;
    }

    public Character getNaBlbDfcDsc() {
        return naBlbDfcDsc;
    }

    public void setNaBlbDfcDsc(Character naBlbDfcDsc) {
        this.naBlbDfcDsc = naBlbDfcDsc;
    }

    public BigDecimal getByam() {
        return byam;
    }

    public void setByam(BigDecimal byam) {
        this.byam = byam;
    }

    public BigDecimal getByngVat() {
        return byngVat;
    }

    public void setByngVat(BigDecimal byngVat) {
        this.byngVat = byngVat;
    }

    public BigDecimal getVcbtAm() {
        return vcbtAm;
    }

    public void setVcbtAm(BigDecimal vcbtAm) {
        this.vcbtAm = vcbtAm;
    }

    public BigDecimal getVcbxAm() {
        return vcbxAm;
    }

    public void setVcbxAm(BigDecimal vcbxAm) {
        this.vcbxAm = vcbxAm;
    }

    public BigDecimal getByngSsdy() {
        return byngSsdy;
    }

    public void setByngSsdy(BigDecimal byngSsdy) {
        this.byngSsdy = byngSsdy;
    }

    public String getNaStlTpDsc() {
        return naStlTpDsc;
    }

    public void setNaStlTpDsc(String naStlTpDsc) {
        this.naStlTpDsc = naStlTpDsc;
    }

    public String getRpyPlaDt() {
        return rpyPlaDt;
    }

    public void setRpyPlaDt(String rpyPlaDt) {
        this.rpyPlaDt = rpyPlaDt;
    }

    public String getNaDvyPlashSlpno() {
        return naDvyPlashSlpno;
    }

    public void setNaDvyPlashSlpno(String naDvyPlashSlpno) {
        this.naDvyPlashSlpno = naDvyPlashSlpno;
    }

    public Character getDdlyYn() {
        return ddlyYn;
    }

    public void setDdlyYn(Character ddlyYn) {
        this.ddlyYn = ddlyYn;
    }

    public String getBzMethDsc() {
        return bzMethDsc;
    }

    public void setBzMethDsc(String bzMethDsc) {
        this.bzMethDsc = bzMethDsc;
    }

    public Character getRotsCtrDsc() {
        return rotsCtrDsc;
    }

    public void setRotsCtrDsc(Character rotsCtrDsc) {
        this.rotsCtrDsc = rotsCtrDsc;
    }

    public String getLedRflDt() {
        return ledRflDt;
    }

    public void setLedRflDt(String ledRflDt) {
        this.ledRflDt = ledRflDt;
    }

    public Character getNaCrcCanDsc() {
        return naCrcCanDsc;
    }

    public void setNaCrcCanDsc(Character naCrcCanDsc) {
        this.naCrcCanDsc = naCrcCanDsc;
    }

    public String getOslipDt() {
        return oslipDt;
    }

    public void setOslipDt(String oslipDt) {
        this.oslipDt = oslipDt;
    }

    public String getOslipNaSlpno() {
        return oslipNaSlpno;
    }

    public void setOslipNaSlpno(String oslipNaSlpno) {
        this.oslipNaSlpno = oslipNaSlpno;
    }

    public Character getDelYn() {
        return delYn;
    }

    public void setDelYn(Character delYn) {
        this.delYn = delYn;
    }

    public String getFsrgmnEno() {
        return fsrgmnEno;
    }

    public void setFsrgmnEno(String fsrgmnEno) {
        this.fsrgmnEno = fsrgmnEno;
    }

    public Instant getFsrgDtm() {
        return fsrgDtm;
    }

    public void setFsrgDtm(Instant fsrgDtm) {
        this.fsrgDtm = fsrgDtm;
    }

    public String getLsCmeno() {
        return lsCmeno;
    }

    public void setLsCmeno(String lsCmeno) {
        this.lsCmeno = lsCmeno;
    }

    public Instant getLschgDtm() {
        return lschgDtm;
    }

    public void setLschgDtm(Instant lschgDtm) {
        this.lschgDtm = lschgDtm;
    }

    public String getDlmnEno() {
        return dlmnEno;
    }

    public void setDlmnEno(String dlmnEno) {
        this.dlmnEno = dlmnEno;
    }

    public Instant getDelDtm() {
        return delDtm;
    }

    public void setDelDtm(Instant delDtm) {
        this.delDtm = delDtm;
    }

    public String getXmlRgdPlaNo() {
        return xmlRgdPlaNo;
    }

    public void setXmlRgdPlaNo(String xmlRgdPlaNo) {
        this.xmlRgdPlaNo = xmlRgdPlaNo;
    }

    public Integer getInqCn() {
        return inqCn;
    }

    public void setInqCn(Integer inqCn) {
        this.inqCn = inqCn;
    }

    public Integer getLineCn() {
        return lineCn;
    }

    public void setLineCn(Integer lineCn) {
        this.lineCn = lineCn;
    }

    public String getFsRmsDt() {
        return fsRmsDt;
    }

    public void setFsRmsDt(String fsRmsDt) {
        this.fsRmsDt = fsRmsDt;
    }

    public String getFsRmsHr() {
        return fsRmsHr;
    }

    public void setFsRmsHr(String fsRmsHr) {
        this.fsRmsHr = fsRmsHr;
    }

    public String getLsRmsDt() {
        return lsRmsDt;
    }

    public void setLsRmsDt(String lsRmsDt) {
        this.lsRmsDt = lsRmsDt;
    }

    public String getLsRmsHr() {
        return lsRmsHr;
    }

    public void setLsRmsHr(String lsRmsHr) {
        this.lsRmsHr = lsRmsHr;
    }

    public Instant getEdirgDtm() {
        return edirgDtm;
    }

    public void setEdirgDtm(Instant edirgDtm) {
        this.edirgDtm = edirgDtm;
    }

    public Character getAckRmsYn() {
        return ackRmsYn;
    }

    public void setAckRmsYn(Character ackRmsYn) {
        this.ackRmsYn = ackRmsYn;
    }

    public String getRmsSpyplC() {
        return rmsSpyplC;
    }

    public void setRmsSpyplC(String rmsSpyplC) {
        this.rmsSpyplC = rmsSpyplC;
    }

    public String getMbId() {
        return mbId;
    }

    public void setMbId(String mbId) {
        this.mbId = mbId;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocRmsLocDsc() {
        return docRmsLocDsc;
    }

    public void setDocRmsLocDsc(String docRmsLocDsc) {
        this.docRmsLocDsc = docRmsLocDsc;
    }

    public String getDvyaaNaTrplC() {
        return dvyaaNaTrplC;
    }

    public void setDvyaaNaTrplC(String dvyaaNaTrplC) {
        this.dvyaaNaTrplC = dvyaaNaTrplC;
    }

    public String getDvyaaNaTeamC() {
        return dvyaaNaTeamC;
    }

    public void setDvyaaNaTeamC(String dvyaaNaTeamC) {
        this.dvyaaNaTeamC = dvyaaNaTeamC;
    }

    public String getNhIfDtm() {
        return nhIfDtm;
    }

    public void setNhIfDtm(String nhIfDtm) {
        this.nhIfDtm = nhIfDtm;
    }

    public String getWhseC() {
        return whseC;
    }

    public void setWhseC(String whseC) {
        this.whseC = whseC;
    }

    public String getSogmnNaTrplC() {
        return sogmnNaTrplC;
    }

    public void setSogmnNaTrplC(String sogmnNaTrplC) {
        this.sogmnNaTrplC = sogmnNaTrplC;
    }

    public String getSogmnNaTeamC() {
        return sogmnNaTeamC;
    }

    public void setSogmnNaTeamC(String sogmnNaTeamC) {
        this.sogmnNaTeamC = sogmnNaTeamC;
    }

    public String getSogSlplNaTrplC() {
        return sogSlplNaTrplC;
    }

    public void setSogSlplNaTrplC(String sogSlplNaTrplC) {
        this.sogSlplNaTrplC = sogSlplNaTrplC;
    }

    public String getSogSlplNaTeamC() {
        return sogSlplNaTeamC;
    }

    public void setSogSlplNaTeamC(String sogSlplNaTeamC) {
        this.sogSlplNaTeamC = sogSlplNaTeamC;
    }

    public BigDecimal getSelPlaAm() {
        return selPlaAm;
    }

    public void setSelPlaAm(BigDecimal selPlaAm) {
        this.selPlaAm = selPlaAm;
    }

    public BigDecimal getTxtSpyAm() {
        return txtSpyAm;
    }

    public void setTxtSpyAm(BigDecimal txtSpyAm) {
        this.txtSpyAm = txtSpyAm;
    }

    public BigDecimal getVatSpyAm() {
        return vatSpyAm;
    }

    public void setVatSpyAm(BigDecimal vatSpyAm) {
        this.vatSpyAm = vatSpyAm;
    }

    public BigDecimal getExtxSpyAm() {
        return extxSpyAm;
    }

    public void setExtxSpyAm(BigDecimal extxSpyAm) {
        this.extxSpyAm = extxSpyAm;
    }

    public BigDecimal getSmaSpyAm() {
        return smaSpyAm;
    }

    public void setSmaSpyAm(BigDecimal smaSpyAm) {
        this.smaSpyAm = smaSpyAm;
    }

    public BigDecimal getLiqTxtSpyAm() {
        return liqTxtSpyAm;
    }

    public void setLiqTxtSpyAm(BigDecimal liqTxtSpyAm) {
        this.liqTxtSpyAm = liqTxtSpyAm;
    }

    public BigDecimal getLiqVatSpyAm() {
        return liqVatSpyAm;
    }

    public void setLiqVatSpyAm(BigDecimal liqVatSpyAm) {
        this.liqVatSpyAm = liqVatSpyAm;
    }

    public BigDecimal getCbam() {
        return cbam;
    }

    public void setCbam(BigDecimal cbam) {
        this.cbam = cbam;
    }

    public BigDecimal getCshPyAm() {
        return cshPyAm;
    }

    public void setCshPyAm(BigDecimal cshPyAm) {
        this.cshPyAm = cshPyAm;
    }

    public BigDecimal getPpyByam() {
        return ppyByam;
    }

    public void setPpyByam(BigDecimal ppyByam) {
        this.ppyByam = ppyByam;
    }

    public BigDecimal getTfrAm() {
        return tfrAm;
    }

    public void setTfrAm(BigDecimal tfrAm) {
        this.tfrAm = tfrAm;
    }

    public Character getDstrTrLclc() {
        return dstrTrLclc;
    }

    public void setDstrTrLclc(Character dstrTrLclc) {
        this.dstrTrLclc = dstrTrLclc;
    }

    public String getByngSlpDsc() {
        return byngSlpDsc;
    }

    public void setByngSlpDsc(String byngSlpDsc) {
        this.byngSlpDsc = byngSlpDsc;
    }

    public String getByngRefDsc() {
        return byngRefDsc;
    }

    public void setByngRefDsc(String byngRefDsc) {
        this.byngRefDsc = byngRefDsc;
    }

    public Character getDvyPlashRefYn() {
        return dvyPlashRefYn;
    }

    public void setDvyPlashRefYn(Character dvyPlashRefYn) {
        this.dvyPlashRefYn = dvyPlashRefYn;
    }

    public String getTrBassNo() {
        return trBassNo;
    }

    public void setTrBassNo(String trBassNo) {
        this.trBassNo = trBassNo;
    }

    public String getPatnSlplSlpDt() {
        return patnSlplSlpDt;
    }

    public void setPatnSlplSlpDt(String patnSlplSlpDt) {
        this.patnSlplSlpDt = patnSlplSlpDt;
    }

    public String getPatnSlplNaSlpno() {
        return patnSlplNaSlpno;
    }

    public void setPatnSlplNaSlpno(String patnSlplNaSlpno) {
        this.patnSlplNaSlpno = patnSlplNaSlpno;
    }

    public Character getRgdPrPrcDsc() {
        return rgdPrPrcDsc;
    }

    public void setRgdPrPrcDsc(Character rgdPrPrcDsc) {
        this.rgdPrPrcDsc = rgdPrPrcDsc;
    }

    public Character getNaacDsc() {
        return naacDsc;
    }

    public void setNaacDsc(Character naacDsc) {
        this.naacDsc = naacDsc;
    }

    public Character getInoDsc() {
        return inoDsc;
    }

    public void setInoDsc(Character inoDsc) {
        this.inoDsc = inoDsc;
    }

    public Character getByngInpTrmDsc() {
        return byngInpTrmDsc;
    }

    public void setByngInpTrmDsc(Character byngInpTrmDsc) {
        this.byngInpTrmDsc = byngInpTrmDsc;
    }

    public String getNaTrOcuDsc() {
        return naTrOcuDsc;
    }

    public void setNaTrOcuDsc(String naTrOcuDsc) {
        this.naTrOcuDsc = naTrOcuDsc;
    }

    public Character getStvcsOcuYn() {
        return stvcsOcuYn;
    }

    public void setStvcsOcuYn(Character stvcsOcuYn) {
        this.stvcsOcuYn = stvcsOcuYn;
    }

    public Character getPvrpdYn() {
        return pvrpdYn;
    }

    public void setPvrpdYn(Character pvrpdYn) {
        this.pvrpdYn = pvrpdYn;
    }

    public Character getLbdyBfcDsc() {
        return lbdyBfcDsc;
    }

    public void setLbdyBfcDsc(Character lbdyBfcDsc) {
        this.lbdyBfcDsc = lbdyBfcDsc;
    }

    public Character getBfcCsttDsc() {
        return bfcCsttDsc;
    }

    public void setBfcCsttDsc(Character bfcCsttDsc) {
        this.bfcCsttDsc = bfcCsttDsc;
    }

    public BigDecimal getBfcHdcn() {
        return bfcHdcn;
    }

    public void setBfcHdcn(BigDecimal bfcHdcn) {
        this.bfcHdcn = bfcHdcn;
    }

    public BigDecimal getLbdyWt() {
        return lbdyWt;
    }

    public void setLbdyWt(BigDecimal lbdyWt) {
        this.lbdyWt = lbdyWt;
    }

    public BigDecimal getBfcWt() {
        return bfcWt;
    }

    public void setBfcWt(BigDecimal bfcWt) {
        this.bfcWt = bfcWt;
    }

    public BigDecimal getBfcDmtTotWt() {
        return bfcDmtTotWt;
    }

    public void setBfcDmtTotWt(BigDecimal bfcDmtTotWt) {
        this.bfcDmtTotWt = bfcDmtTotWt;
    }

    public BigDecimal getActlWt() {
        return actlWt;
    }

    public void setActlWt(BigDecimal actlWt) {
        this.actlWt = actlWt;
    }

    public BigDecimal getBfcAm() {
        return bfcAm;
    }

    public void setBfcAm(BigDecimal bfcAm) {
        this.bfcAm = bfcAm;
    }

    public String getRmkCntn() {
        return rmkCntn;
    }

    public void setRmkCntn(String rmkCntn) {
        this.rmkCntn = rmkCntn;
    }

    public BigDecimal getTrprcSqno() {
        return trprcSqno;
    }

    public void setTrprcSqno(BigDecimal trprcSqno) {
        this.trprcSqno = trprcSqno;
    }

    public Character getRtlDstrCvSysDsc() {
        return rtlDstrCvSysDsc;
    }

    public void setRtlDstrCvSysDsc(Character rtlDstrCvSysDsc) {
        this.rtlDstrCvSysDsc = rtlDstrCvSysDsc;
    }

    public Character getDataTmsYn() {
        return dataTmsYn;
    }

    public void setDataTmsYn(Character dataTmsYn) {
        this.dataTmsYn = dataTmsYn;
    }

    public String getPatnNaTrDsc() {
        return patnNaTrDsc;
    }

    public void setPatnNaTrDsc(String patnNaTrDsc) {
        this.patnNaTrDsc = patnNaTrDsc;
    }

    public BigDecimal getCserTrRelAmnno() {
        return cserTrRelAmnno;
    }

    public void setCserTrRelAmnno(BigDecimal cserTrRelAmnno) {
        this.cserTrRelAmnno = cserTrRelAmnno;
    }

    public BigDecimal getMngtTrRelAmnno() {
        return mngtTrRelAmnno;
    }

    public void setMngtTrRelAmnno(BigDecimal mngtTrRelAmnno) {
        this.mngtTrRelAmnno = mngtTrRelAmnno;
    }

    public String getTrfRefDsc() {
        return trfRefDsc;
    }

    public void setTrfRefDsc(String trfRefDsc) {
        this.trfRefDsc = trfRefDsc;
    }

}