package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;

//@Entity
//@Table(name = "tb_od_dlvpnsht_m", schema = "escm")
public class TbOdDlvpnshtM {
    @EmbeddedId
    private TbOdDlvpnshtMId id;

    @Column(name = "SPYPL_NA_TEAM_C", nullable = false, length = 2)
    private String spyplNaTeamC;

    @Column(name = "ODRPL_NA_TRPL_C", length = 13)
    private String odrplNaTrplC;

    @Column(name = "ODRPL_NA_TEAM_C", length = 2)
    private String odrplNaTeamC;

    @Column(name = "RVOPL_NA_TRPL_C", nullable = false, length = 13)
    private String rvoplNaTrplC;

    @Column(name = "RVOPL_NA_TEAM_C", nullable = false, length = 2)
    private String rvoplNaTeamC;

    @Column(name = "ADJPL_NA_TRPL_C", length = 13)
    private String adjplNaTrplC;

    @Column(name = "ADJPL_NA_TEAM_C", length = 2)
    private String adjplNaTeamC;

    @Column(name = "MNGT_NA_TR_TPC")
    private Character mngtNaTrTpc;

    @Column(name = "MNGT_NA_TRPL_C", length = 13)
    private String mngtNaTrplC;

    @Column(name = "MNGT_NA_TEAM_C", length = 2)
    private String mngtNaTeamC;

    @Column(name = "DVYAA_NA_TEAM_C", nullable = false, length = 2)
    private String dvyaaNaTeamC;

    @Column(name = "DVYAA_C", length = 4)
    private String dvyaaC;

    @Column(name = "DDLY_YN")
    private Character ddlyYn;

    @Column(name = "CSER_CTR_TPC")
    private Character cserCtrTpc;

    @Column(name = "SPY_TPC", length = 2)
    private String spyTpc;

    @Column(name = "SLGT_ETR_DSC")
    private Character slgtEtrDsc;

    @Column(name = "DVY_VHC_DSC")
    private Character dvyVhcDsc;

    @Column(name = "VHCNO", length = 20)
    private String vhcno;

    @Column(name = "VCBT_AM", precision = 18, scale = 2)
    private BigDecimal vcbtAm;

    @Column(name = "VCBX_AM", precision = 18, scale = 2)
    private BigDecimal vcbxAm;

    @Column(name = "DVY_PLA_QT", precision = 15, scale = 2)
    private BigDecimal dvyPlaQt;

    @Column(name = "DVY_AM", precision = 18, scale = 2)
    private BigDecimal dvyAm;

    @Column(name = "DVY_VAT", precision = 20, scale = 2)
    private BigDecimal dvyVat;

    @Column(name = "DVY_SSDY", precision = 18, scale = 2)
    private BigDecimal dvySsdy;

    @Column(name = "DVY_TROT_FEE", precision = 18, scale = 2)
    private BigDecimal dvyTrotFee;

    @Column(name = "DVY_PHD_FEE", precision = 18, scale = 2)
    private BigDecimal dvyPhdFee;

    @Column(name = "DVY_FAR_ASTCS", precision = 18, scale = 2)
    private BigDecimal dvyFarAstcs;

    @Column(name = "DVY_PLASH_KDC", length = 2)
    private String dvyPlashKdc;

    @Column(name = "OGN_NA_DVY_PLASH_SLPNO", length = 17)
    private String ognNaDvyPlashSlpno;

    @Column(name = "GRS_SOJU_YN")
    private Character grsSojuYn;

    @Column(name = "FSRGMN_ENO", length = 9)
    private String fsrgmnEno;

    @Column(name = "NA_WRS_LCLC", length = 3)
    private String naWrsLclc;

    @Column(name = "NA_WRS_MCLC", length = 3)
    private String naWrsMclc;

    @Column(name = "DVY_PLASH_STSC", length = 2)
    private String dvyPlashStsc;

    @Column(name = "RMK_CNTN", length = 4000)
    private String rmkCntn;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CMENO", length = 9)
    private String lsCmeno;

    @ColumnDefault("'N'")
    @Column(name = "TEMP_YN", nullable = false)
    private Character tempYn;

    @ColumnDefault("'N'")
    @Column(name = "PRC_YN")
    private Character prcYn;

    @Column(name = "RES_CODE", length = 4)
    private String resCode;

    @Column(name = "RES_DESC", length = 200)
    private String resDesc;

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

    @Column(name = "DOC_RMS_LOC_DSC", length = 6)
    private String docRmsLocDsc;

    @Column(name = "EDI_IF_ID", length = 64)
    private String ediIfId;

    @Column(name = "MNGT_TR_REL_AMNNO")
    private Integer mngtTrRelAmnno;

    @Column(name = "CSER_TR_REL_AMNNO")
    private Integer cserTrRelAmnno;

    @Column(name = "HDNGCN")
    private Integer hdngcn;

    @ColumnDefault("'I'")
    @Column(name = "WK_DS")
    private Character wkDs;

    @Column(name = "NORDER_YN")
    private Character norderYn;

    @Column(name = "EDI_IF_DT", length = 17)
    private String ediIfDt;

    @Column(name = "EDI_IF_RSND_SEQ")
    private Integer ediIfRsndSeq;

    @Column(name = "SRA_WK_DSC", length = 2)
    private String sraWkDsc;

    @Column(name = "SFP_BOX_DSC", length = 2)
    private String sfpBoxDsc;

    @Column(name = "NA_PAK_DSC", length = 2)
    private String naPakDsc;

    @Column(name = "SRA_WRS_DSC", length = 2)
    private String sraWrsDsc;

    @Column(name = "DVY_WT", precision = 15, scale = 3)
    private BigDecimal dvyWt;

    @Column(name = "BUY_UPR_DSC")
    private Character buyUprDsc;

    @Column(name = "BYNG_UPR_GR_C", length = 2)
    private String byngUprGrC;

    @Column(name = "ACCP_C", length = 2)
    private String accpC;

    @Column(name = "WD_PLTT_QT")
    private Integer wdPlttQt;

    @Column(name = "PSC_PLTT_QT", precision = 15)
    private BigDecimal pscPlttQt;

    @Column(name = "BYNG_UPR_MOD_YN")
    private Character byngUprModYn;

    @ColumnDefault("current_timestamp()")
    @Column(name = "SLPNO_RMS_DTM")
    private Instant slpnoRmsDtm;

    @Column(name = "INS_CODE")
    private Character insCode;

    @Column(name = "TRU_AGCY_NA_TRPL_C", length = 13)
    private String truAgcyNaTrplC;

    @ColumnDefault("'0'")
    @Column(name = "PBDDLY_YN")
    private Character pbddlyYn;

    @ColumnDefault("'001'")
    @Column(name = "DVY_PLASH_CRT_DSC", length = 3)
    private String dvyPlashCrtDsc;

    @Column(name = "BYNG_DFN_SSDY", precision = 22)
    private BigDecimal byngDfnSsdy;

    @Column(name = "BYNG_DFN_VAT", precision = 22)
    private BigDecimal byngDfnVat;

    @Column(name = "BYNG_DFN_AM", precision = 22)
    private BigDecimal byngDfnAm;

    @Column(name = "BYNG_DFN_WT", precision = 22)
    private BigDecimal byngDfnWt;

    @Column(name = "BYNG_DFN_QT", precision = 22)
    private BigDecimal byngDfnQt;

    @Column(name = "ABUS_DFN_YN")
    private Character abusDfnYn;

    @Column(name = "DVY_PLASH_UGAV_YN")
    private Character dvyPlashUgavYn;

    @Column(name = "DEL_YN")
    private Character delYn;

    public TbOdDlvpnshtMId getId() {
        return id;
    }

    public void setId(TbOdDlvpnshtMId id) {
        this.id = id;
    }

    public String getSpyplNaTeamC() {
        return spyplNaTeamC;
    }

    public void setSpyplNaTeamC(String spyplNaTeamC) {
        this.spyplNaTeamC = spyplNaTeamC;
    }

    public String getOdrplNaTrplC() {
        return odrplNaTrplC;
    }

    public void setOdrplNaTrplC(String odrplNaTrplC) {
        this.odrplNaTrplC = odrplNaTrplC;
    }

    public String getOdrplNaTeamC() {
        return odrplNaTeamC;
    }

    public void setOdrplNaTeamC(String odrplNaTeamC) {
        this.odrplNaTeamC = odrplNaTeamC;
    }

    public String getRvoplNaTrplC() {
        return rvoplNaTrplC;
    }

    public void setRvoplNaTrplC(String rvoplNaTrplC) {
        this.rvoplNaTrplC = rvoplNaTrplC;
    }

    public String getRvoplNaTeamC() {
        return rvoplNaTeamC;
    }

    public void setRvoplNaTeamC(String rvoplNaTeamC) {
        this.rvoplNaTeamC = rvoplNaTeamC;
    }

    public String getAdjplNaTrplC() {
        return adjplNaTrplC;
    }

    public void setAdjplNaTrplC(String adjplNaTrplC) {
        this.adjplNaTrplC = adjplNaTrplC;
    }

    public String getAdjplNaTeamC() {
        return adjplNaTeamC;
    }

    public void setAdjplNaTeamC(String adjplNaTeamC) {
        this.adjplNaTeamC = adjplNaTeamC;
    }

    public Character getMngtNaTrTpc() {
        return mngtNaTrTpc;
    }

    public void setMngtNaTrTpc(Character mngtNaTrTpc) {
        this.mngtNaTrTpc = mngtNaTrTpc;
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

    public String getDvyaaNaTeamC() {
        return dvyaaNaTeamC;
    }

    public void setDvyaaNaTeamC(String dvyaaNaTeamC) {
        this.dvyaaNaTeamC = dvyaaNaTeamC;
    }

    public String getDvyaaC() {
        return dvyaaC;
    }

    public void setDvyaaC(String dvyaaC) {
        this.dvyaaC = dvyaaC;
    }

    public Character getDdlyYn() {
        return ddlyYn;
    }

    public void setDdlyYn(Character ddlyYn) {
        this.ddlyYn = ddlyYn;
    }

    public Character getCserCtrTpc() {
        return cserCtrTpc;
    }

    public void setCserCtrTpc(Character cserCtrTpc) {
        this.cserCtrTpc = cserCtrTpc;
    }

    public String getSpyTpc() {
        return spyTpc;
    }

    public void setSpyTpc(String spyTpc) {
        this.spyTpc = spyTpc;
    }

    public Character getSlgtEtrDsc() {
        return slgtEtrDsc;
    }

    public void setSlgtEtrDsc(Character slgtEtrDsc) {
        this.slgtEtrDsc = slgtEtrDsc;
    }

    public Character getDvyVhcDsc() {
        return dvyVhcDsc;
    }

    public void setDvyVhcDsc(Character dvyVhcDsc) {
        this.dvyVhcDsc = dvyVhcDsc;
    }

    public String getVhcno() {
        return vhcno;
    }

    public void setVhcno(String vhcno) {
        this.vhcno = vhcno;
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

    public BigDecimal getDvyPlaQt() {
        return dvyPlaQt;
    }

    public void setDvyPlaQt(BigDecimal dvyPlaQt) {
        this.dvyPlaQt = dvyPlaQt;
    }

    public BigDecimal getDvyAm() {
        return dvyAm;
    }

    public void setDvyAm(BigDecimal dvyAm) {
        this.dvyAm = dvyAm;
    }

    public BigDecimal getDvyVat() {
        return dvyVat;
    }

    public void setDvyVat(BigDecimal dvyVat) {
        this.dvyVat = dvyVat;
    }

    public BigDecimal getDvySsdy() {
        return dvySsdy;
    }

    public void setDvySsdy(BigDecimal dvySsdy) {
        this.dvySsdy = dvySsdy;
    }

    public BigDecimal getDvyTrotFee() {
        return dvyTrotFee;
    }

    public void setDvyTrotFee(BigDecimal dvyTrotFee) {
        this.dvyTrotFee = dvyTrotFee;
    }

    public BigDecimal getDvyPhdFee() {
        return dvyPhdFee;
    }

    public void setDvyPhdFee(BigDecimal dvyPhdFee) {
        this.dvyPhdFee = dvyPhdFee;
    }

    public BigDecimal getDvyFarAstcs() {
        return dvyFarAstcs;
    }

    public void setDvyFarAstcs(BigDecimal dvyFarAstcs) {
        this.dvyFarAstcs = dvyFarAstcs;
    }

    public String getDvyPlashKdc() {
        return dvyPlashKdc;
    }

    public void setDvyPlashKdc(String dvyPlashKdc) {
        this.dvyPlashKdc = dvyPlashKdc;
    }

    public String getOgnNaDvyPlashSlpno() {
        return ognNaDvyPlashSlpno;
    }

    public void setOgnNaDvyPlashSlpno(String ognNaDvyPlashSlpno) {
        this.ognNaDvyPlashSlpno = ognNaDvyPlashSlpno;
    }

    public Character getGrsSojuYn() {
        return grsSojuYn;
    }

    public void setGrsSojuYn(Character grsSojuYn) {
        this.grsSojuYn = grsSojuYn;
    }

    public String getFsrgmnEno() {
        return fsrgmnEno;
    }

    public void setFsrgmnEno(String fsrgmnEno) {
        this.fsrgmnEno = fsrgmnEno;
    }

    public String getNaWrsLclc() {
        return naWrsLclc;
    }

    public void setNaWrsLclc(String naWrsLclc) {
        this.naWrsLclc = naWrsLclc;
    }

    public String getNaWrsMclc() {
        return naWrsMclc;
    }

    public void setNaWrsMclc(String naWrsMclc) {
        this.naWrsMclc = naWrsMclc;
    }

    public String getDvyPlashStsc() {
        return dvyPlashStsc;
    }

    public void setDvyPlashStsc(String dvyPlashStsc) {
        this.dvyPlashStsc = dvyPlashStsc;
    }

    public String getRmkCntn() {
        return rmkCntn;
    }

    public void setRmkCntn(String rmkCntn) {
        this.rmkCntn = rmkCntn;
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

    public Character getTempYn() {
        return tempYn;
    }

    public void setTempYn(Character tempYn) {
        this.tempYn = tempYn;
    }

    public Character getPrcYn() {
        return prcYn;
    }

    public void setPrcYn(Character prcYn) {
        this.prcYn = prcYn;
    }

    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public String getResDesc() {
        return resDesc;
    }

    public void setResDesc(String resDesc) {
        this.resDesc = resDesc;
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

    public String getEdiIfId() {
        return ediIfId;
    }

    public void setEdiIfId(String ediIfId) {
        this.ediIfId = ediIfId;
    }

    public Integer getMngtTrRelAmnno() {
        return mngtTrRelAmnno;
    }

    public void setMngtTrRelAmnno(Integer mngtTrRelAmnno) {
        this.mngtTrRelAmnno = mngtTrRelAmnno;
    }

    public Integer getCserTrRelAmnno() {
        return cserTrRelAmnno;
    }

    public void setCserTrRelAmnno(Integer cserTrRelAmnno) {
        this.cserTrRelAmnno = cserTrRelAmnno;
    }

    public Integer getHdngcn() {
        return hdngcn;
    }

    public void setHdngcn(Integer hdngcn) {
        this.hdngcn = hdngcn;
    }

    public Character getWkDs() {
        return wkDs;
    }

    public void setWkDs(Character wkDs) {
        this.wkDs = wkDs;
    }

    public Character getNorderYn() {
        return norderYn;
    }

    public void setNorderYn(Character norderYn) {
        this.norderYn = norderYn;
    }

    public String getEdiIfDt() {
        return ediIfDt;
    }

    public void setEdiIfDt(String ediIfDt) {
        this.ediIfDt = ediIfDt;
    }

    public Integer getEdiIfRsndSeq() {
        return ediIfRsndSeq;
    }

    public void setEdiIfRsndSeq(Integer ediIfRsndSeq) {
        this.ediIfRsndSeq = ediIfRsndSeq;
    }

    public String getSraWkDsc() {
        return sraWkDsc;
    }

    public void setSraWkDsc(String sraWkDsc) {
        this.sraWkDsc = sraWkDsc;
    }

    public String getSfpBoxDsc() {
        return sfpBoxDsc;
    }

    public void setSfpBoxDsc(String sfpBoxDsc) {
        this.sfpBoxDsc = sfpBoxDsc;
    }

    public String getNaPakDsc() {
        return naPakDsc;
    }

    public void setNaPakDsc(String naPakDsc) {
        this.naPakDsc = naPakDsc;
    }

    public String getSraWrsDsc() {
        return sraWrsDsc;
    }

    public void setSraWrsDsc(String sraWrsDsc) {
        this.sraWrsDsc = sraWrsDsc;
    }

    public BigDecimal getDvyWt() {
        return dvyWt;
    }

    public void setDvyWt(BigDecimal dvyWt) {
        this.dvyWt = dvyWt;
    }

    public Character getBuyUprDsc() {
        return buyUprDsc;
    }

    public void setBuyUprDsc(Character buyUprDsc) {
        this.buyUprDsc = buyUprDsc;
    }

    public String getByngUprGrC() {
        return byngUprGrC;
    }

    public void setByngUprGrC(String byngUprGrC) {
        this.byngUprGrC = byngUprGrC;
    }

    public String getAccpC() {
        return accpC;
    }

    public void setAccpC(String accpC) {
        this.accpC = accpC;
    }

    public Integer getWdPlttQt() {
        return wdPlttQt;
    }

    public void setWdPlttQt(Integer wdPlttQt) {
        this.wdPlttQt = wdPlttQt;
    }

    public BigDecimal getPscPlttQt() {
        return pscPlttQt;
    }

    public void setPscPlttQt(BigDecimal pscPlttQt) {
        this.pscPlttQt = pscPlttQt;
    }

    public Character getByngUprModYn() {
        return byngUprModYn;
    }

    public void setByngUprModYn(Character byngUprModYn) {
        this.byngUprModYn = byngUprModYn;
    }

    public Instant getSlpnoRmsDtm() {
        return slpnoRmsDtm;
    }

    public void setSlpnoRmsDtm(Instant slpnoRmsDtm) {
        this.slpnoRmsDtm = slpnoRmsDtm;
    }

    public Character getInsCode() {
        return insCode;
    }

    public void setInsCode(Character insCode) {
        this.insCode = insCode;
    }

    public String getTruAgcyNaTrplC() {
        return truAgcyNaTrplC;
    }

    public void setTruAgcyNaTrplC(String truAgcyNaTrplC) {
        this.truAgcyNaTrplC = truAgcyNaTrplC;
    }

    public Character getPbddlyYn() {
        return pbddlyYn;
    }

    public void setPbddlyYn(Character pbddlyYn) {
        this.pbddlyYn = pbddlyYn;
    }

    public String getDvyPlashCrtDsc() {
        return dvyPlashCrtDsc;
    }

    public void setDvyPlashCrtDsc(String dvyPlashCrtDsc) {
        this.dvyPlashCrtDsc = dvyPlashCrtDsc;
    }

    public BigDecimal getByngDfnSsdy() {
        return byngDfnSsdy;
    }

    public void setByngDfnSsdy(BigDecimal byngDfnSsdy) {
        this.byngDfnSsdy = byngDfnSsdy;
    }

    public BigDecimal getByngDfnVat() {
        return byngDfnVat;
    }

    public void setByngDfnVat(BigDecimal byngDfnVat) {
        this.byngDfnVat = byngDfnVat;
    }

    public BigDecimal getByngDfnAm() {
        return byngDfnAm;
    }

    public void setByngDfnAm(BigDecimal byngDfnAm) {
        this.byngDfnAm = byngDfnAm;
    }

    public BigDecimal getByngDfnWt() {
        return byngDfnWt;
    }

    public void setByngDfnWt(BigDecimal byngDfnWt) {
        this.byngDfnWt = byngDfnWt;
    }

    public BigDecimal getByngDfnQt() {
        return byngDfnQt;
    }

    public void setByngDfnQt(BigDecimal byngDfnQt) {
        this.byngDfnQt = byngDfnQt;
    }

    public Character getAbusDfnYn() {
        return abusDfnYn;
    }

    public void setAbusDfnYn(Character abusDfnYn) {
        this.abusDfnYn = abusDfnYn;
    }

    public Character getDvyPlashUgavYn() {
        return dvyPlashUgavYn;
    }

    public void setDvyPlashUgavYn(Character dvyPlashUgavYn) {
        this.dvyPlashUgavYn = dvyPlashUgavYn;
    }

    public Character getDelYn() {
        return delYn;
    }

    public void setDelYn(Character delYn) {
        this.delYn = delYn;
    }

}