package gil.portfolio.account.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "tb_od_order_m", schema = "escm")
public class TbOdOrderM {
    @EmbeddedId
    private TbOdOrderMId id;

    @Column(name = "VAN_SEQ", nullable = false, length = 16)
    private String vanSeq;

    @Column(name = "ROGO_INF_CRT_DSC", length = 3)
    private String rogoInfCrtDsc;

    @Column(name = "NA_ODR_STS_DSC", length = 2)
    private String naOdrStsDsc;

    @Column(name = "RVOPL_NA_TRPL_C", length = 13)
    private String rvoplNaTrplC;

    @Column(name = "RVOPL_NA_TEAM_C", length = 2)
    private String rvoplNaTeamC;

    @Column(name = "CSER_CTR_TPC")
    private Character cserCtrTpc;

    @Column(name = "SPY_TPC", length = 2)
    private String spyTpc;

    @Column(name = "DVY_RQR_DT", length = 8)
    private String dvyRqrDt;

    @Column(name = "DVYAA_NA_TRPL_C", length = 13)
    private String dvyaaNaTrplC;

    @Column(name = "DVYAA_NA_TEAM_C", length = 2)
    private String dvyaaNaTeamC;

    @Column(name = "DVYAA_C", length = 4)
    private String dvyaaC;

    @Column(name = "DVY_VHC_DSC")
    private Character dvyVhcDsc;

    @Column(name = "VHCNO", length = 20)
    private String vhcno;

    @Column(name = "DVY_RQR_CNTN", length = 200)
    private String dvyRqrCntn;

    @Column(name = "DDLY_YN")
    private Character ddlyYn;

    @Column(name = "SPYPL_NA_TRPL_C", length = 13)
    private String spyplNaTrplC;

    @Column(name = "SPYPL_NA_TEAM_C", length = 2)
    private String spyplNaTeamC;

    @Column(name = "MNGT_NA_TR_TPC")
    private Character mngtNaTrTpc;

    @Column(name = "MNGT_NA_TRPL_C", length = 13)
    private String mngtNaTrplC;

    @Column(name = "MNGT_NA_TEAM_C", length = 2)
    private String mngtNaTeamC;

    @Column(name = "VCBT_AM", precision = 18)
    private BigDecimal vcbtAm;

    @Column(name = "VCBX_AM", precision = 18)
    private BigDecimal vcbxAm;

    @Column(name = "ODR_QTTT", precision = 7)
    private BigDecimal odrQttt;

    @Column(name = "ODR_SAM", precision = 18)
    private BigDecimal odrSam;

    @Column(name = "VATTT", precision = 18)
    private BigDecimal vattt;

    @Column(name = "SCRN_IDNM", length = 60)
    private String scrnIdnm;

    @Column(name = "APL_BAS_DT", length = 8)
    private String aplBasDt;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CMENO", length = 9)
    private String lsCmeno;

    @Column(name = "DEL_DTM")
    private Instant delDtm;

    @Column(name = "LDTM_DDS", precision = 3)
    private BigDecimal ldtmDds;

    @Column(name = "EMRG_ODR_YN")
    private Character emrgOdrYn;

    @Column(name = "GRS_SOJU_YN")
    private Character grsSojuYn;

    @Column(name = "ODR_DSC", length = 6)
    private String odrDsc;

    @Column(name = "ACCP_C", length = 2)
    private String accpC;

    @Column(name = "NA_WRS_LCLC", length = 3)
    private String naWrsLclc;

    @Column(name = "NA_WRS_MCLC", length = 3)
    private String naWrsMclc;

    @Column(name = "BYNG_UPR_GR_C", length = 2)
    private String byngUprGrC;

    @ColumnDefault("'N'")
    @Column(name = "TEMP_YN")
    private Character tempYn;

    @ColumnDefault("'N'")
    @Column(name = "PRC_YN")
    private Character prcYn;

    @Column(name = "RSP_C_CNTN", length = 200)
    private String rspCCntn;

    @Column(name = "INQ_CN", precision = 5)
    private BigDecimal inqCn;

    @Column(name = "LINE_CN", precision = 5)
    private BigDecimal lineCn;

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

    @Column(name = "EDI_IF_ID", length = 64)
    private String ediIfId;

    @Column(name = "CSER_TR_REL_AMNNO", precision = 10)
    private BigDecimal cserTrRelAmnno;

    @Column(name = "FSRGMN_ENO", length = 9)
    private String fsrgmnEno;

    @Column(name = "PRGR_C", length = 4)
    private String prgrC;

    @Column(name = "MNGT_TR_REL_AMNNO", precision = 10)
    private BigDecimal mngtTrRelAmnno;

    @Column(name = "XML_CHDOC_NO", length = 16)
    private String xmlChdocNo;

    @Column(name = "XML_ODRW_NO", length = 16)
    private String xmlOdrwNo;

    @Column(name = "XML_DOC_TMS_DT", length = 8)
    private String xmlDocTmsDt;

    @Column(name = "SRA_WK_DSC", length = 2)
    private String sraWkDsc;

    @Column(name = "BOX_DSC", length = 2)
    private String boxDsc;

    @Column(name = "NA_PAK_DSC", length = 2)
    private String naPakDsc;

    @Column(name = "SRA_WRS_DSC", length = 2)
    private String sraWrsDsc;

    @Column(name = "DDL_WRS_KDC")
    private Character ddlWrsKdc;

    @Column(name = "NH_IF_DTM", length = 14)
    private String nhIfDtm;

    @Column(name = "RMK_CNTN", length = 4000)
    private String rmkCntn;

    @Column(name = "LGQT_TR_YN")
    private Character lgqtTrYn;

    @Column(name = "OGN_SLPNO", length = 16)
    private String ognSlpno;

    @Column(name = "OSLIP_DT", length = 8)
    private String oslipDt;

    @Column(name = "NA_STL_TP_DSC", length = 100)
    private String naStlTpDsc;

    @Column(name = "DEL_YN")
    private Character delYn;

    /* mapping
    * ODRPL_NA_TRPL_C
    * ODR_SLPNO
    * with TbOdOrderD*/
    @MapsId("id")
    @OneToMany
    @JoinColumns({
            @JoinColumn(name = "ODRPL_NA_TRPL_C", referencedColumnName = "ODRPL_NA_TRPL_C"),
            @JoinColumn(name = "ODRPL_NA_TEAM_C", referencedColumnName = "ODRPL_NA_TEAM_C"),
            @JoinColumn(name = "ODR_DT", referencedColumnName = "ODR_DT"),
            @JoinColumn(name = "ODR_SLPNO", referencedColumnName = "ODR_SLPNO")
    })
    private List<TbOdOrderD> tbOdOrderDList;

    public TbOdOrderMId getId() {
        return id;
    }

    public void setId(TbOdOrderMId id) {
        this.id = id;
    }

    public String getVanSeq() {
        return vanSeq;
    }

    public void setVanSeq(String vanSeq) {
        this.vanSeq = vanSeq;
    }

    public String getRogoInfCrtDsc() {
        return rogoInfCrtDsc;
    }

    public void setRogoInfCrtDsc(String rogoInfCrtDsc) {
        this.rogoInfCrtDsc = rogoInfCrtDsc;
    }

    public String getNaOdrStsDsc() {
        return naOdrStsDsc;
    }

    public void setNaOdrStsDsc(String naOdrStsDsc) {
        this.naOdrStsDsc = naOdrStsDsc;
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

    public String getDvyRqrDt() {
        return dvyRqrDt;
    }

    public void setDvyRqrDt(String dvyRqrDt) {
        this.dvyRqrDt = dvyRqrDt;
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

    public String getDvyaaC() {
        return dvyaaC;
    }

    public void setDvyaaC(String dvyaaC) {
        this.dvyaaC = dvyaaC;
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

    public String getDvyRqrCntn() {
        return dvyRqrCntn;
    }

    public void setDvyRqrCntn(String dvyRqrCntn) {
        this.dvyRqrCntn = dvyRqrCntn;
    }

    public Character getDdlyYn() {
        return ddlyYn;
    }

    public void setDdlyYn(Character ddlyYn) {
        this.ddlyYn = ddlyYn;
    }

    public String getSpyplNaTrplC() {
        return spyplNaTrplC;
    }

    public void setSpyplNaTrplC(String spyplNaTrplC) {
        this.spyplNaTrplC = spyplNaTrplC;
    }

    public String getSpyplNaTeamC() {
        return spyplNaTeamC;
    }

    public void setSpyplNaTeamC(String spyplNaTeamC) {
        this.spyplNaTeamC = spyplNaTeamC;
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

    public BigDecimal getOdrQttt() {
        return odrQttt;
    }

    public void setOdrQttt(BigDecimal odrQttt) {
        this.odrQttt = odrQttt;
    }

    public BigDecimal getOdrSam() {
        return odrSam;
    }

    public void setOdrSam(BigDecimal odrSam) {
        this.odrSam = odrSam;
    }

    public BigDecimal getVattt() {
        return vattt;
    }

    public void setVattt(BigDecimal vattt) {
        this.vattt = vattt;
    }

    public String getScrnIdnm() {
        return scrnIdnm;
    }

    public void setScrnIdnm(String scrnIdnm) {
        this.scrnIdnm = scrnIdnm;
    }

    public String getAplBasDt() {
        return aplBasDt;
    }

    public void setAplBasDt(String aplBasDt) {
        this.aplBasDt = aplBasDt;
    }

    public Instant getFsrgDtm() {
        return fsrgDtm;
    }

    public void setFsrgDtm(Instant fsrgDtm) {
        this.fsrgDtm = fsrgDtm;
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

    public Instant getDelDtm() {
        return delDtm;
    }

    public void setDelDtm(Instant delDtm) {
        this.delDtm = delDtm;
    }

    public BigDecimal getLdtmDds() {
        return ldtmDds;
    }

    public void setLdtmDds(BigDecimal ldtmDds) {
        this.ldtmDds = ldtmDds;
    }

    public Character getEmrgOdrYn() {
        return emrgOdrYn;
    }

    public void setEmrgOdrYn(Character emrgOdrYn) {
        this.emrgOdrYn = emrgOdrYn;
    }

    public Character getGrsSojuYn() {
        return grsSojuYn;
    }

    public void setGrsSojuYn(Character grsSojuYn) {
        this.grsSojuYn = grsSojuYn;
    }

    public String getOdrDsc() {
        return odrDsc;
    }

    public void setOdrDsc(String odrDsc) {
        this.odrDsc = odrDsc;
    }

    public String getAccpC() {
        return accpC;
    }

    public void setAccpC(String accpC) {
        this.accpC = accpC;
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

    public String getByngUprGrC() {
        return byngUprGrC;
    }

    public void setByngUprGrC(String byngUprGrC) {
        this.byngUprGrC = byngUprGrC;
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

    public String getRspCCntn() {
        return rspCCntn;
    }

    public void setRspCCntn(String rspCCntn) {
        this.rspCCntn = rspCCntn;
    }

    public BigDecimal getInqCn() {
        return inqCn;
    }

    public void setInqCn(BigDecimal inqCn) {
        this.inqCn = inqCn;
    }

    public BigDecimal getLineCn() {
        return lineCn;
    }

    public void setLineCn(BigDecimal lineCn) {
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

    public BigDecimal getCserTrRelAmnno() {
        return cserTrRelAmnno;
    }

    public void setCserTrRelAmnno(BigDecimal cserTrRelAmnno) {
        this.cserTrRelAmnno = cserTrRelAmnno;
    }

    public String getFsrgmnEno() {
        return fsrgmnEno;
    }

    public void setFsrgmnEno(String fsrgmnEno) {
        this.fsrgmnEno = fsrgmnEno;
    }

    public String getPrgrC() {
        return prgrC;
    }

    public void setPrgrC(String prgrC) {
        this.prgrC = prgrC;
    }

    public BigDecimal getMngtTrRelAmnno() {
        return mngtTrRelAmnno;
    }

    public void setMngtTrRelAmnno(BigDecimal mngtTrRelAmnno) {
        this.mngtTrRelAmnno = mngtTrRelAmnno;
    }

    public String getXmlChdocNo() {
        return xmlChdocNo;
    }

    public void setXmlChdocNo(String xmlChdocNo) {
        this.xmlChdocNo = xmlChdocNo;
    }

    public String getXmlOdrwNo() {
        return xmlOdrwNo;
    }

    public void setXmlOdrwNo(String xmlOdrwNo) {
        this.xmlOdrwNo = xmlOdrwNo;
    }

    public String getXmlDocTmsDt() {
        return xmlDocTmsDt;
    }

    public void setXmlDocTmsDt(String xmlDocTmsDt) {
        this.xmlDocTmsDt = xmlDocTmsDt;
    }

    public String getSraWkDsc() {
        return sraWkDsc;
    }

    public void setSraWkDsc(String sraWkDsc) {
        this.sraWkDsc = sraWkDsc;
    }

    public String getBoxDsc() {
        return boxDsc;
    }

    public void setBoxDsc(String boxDsc) {
        this.boxDsc = boxDsc;
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

    public Character getDdlWrsKdc() {
        return ddlWrsKdc;
    }

    public void setDdlWrsKdc(Character ddlWrsKdc) {
        this.ddlWrsKdc = ddlWrsKdc;
    }

    public String getNhIfDtm() {
        return nhIfDtm;
    }

    public void setNhIfDtm(String nhIfDtm) {
        this.nhIfDtm = nhIfDtm;
    }

    public String getRmkCntn() {
        return rmkCntn;
    }

    public void setRmkCntn(String rmkCntn) {
        this.rmkCntn = rmkCntn;
    }

    public Character getLgqtTrYn() {
        return lgqtTrYn;
    }

    public void setLgqtTrYn(Character lgqtTrYn) {
        this.lgqtTrYn = lgqtTrYn;
    }

    public String getOgnSlpno() {
        return ognSlpno;
    }

    public void setOgnSlpno(String ognSlpno) {
        this.ognSlpno = ognSlpno;
    }

    public String getOslipDt() {
        return oslipDt;
    }

    public void setOslipDt(String oslipDt) {
        this.oslipDt = oslipDt;
    }

    public String getNaStlTpDsc() {
        return naStlTpDsc;
    }

    public void setNaStlTpDsc(String naStlTpDsc) {
        this.naStlTpDsc = naStlTpDsc;
    }

    public Character getDelYn() {
        return delYn;
    }

    public void setDelYn(Character delYn) {
        this.delYn = delYn;
    }

    public List<TbOdOrderD> getTbOdOrderDList() {
        return tbOdOrderDList;
    }

    public void setTbOdOrderDList(List<TbOdOrderD> tbOdOrderDList) {
        this.tbOdOrderDList = tbOdOrderDList;
    }

}