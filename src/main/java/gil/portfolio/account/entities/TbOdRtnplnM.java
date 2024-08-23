package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.Instant;

//@Entity
//@Table(name = "tb_od_rtnpln_m", schema = "escm")
public class TbOdRtnplnM {
    @Column(name = "NA_TRPL_C", nullable = false, length = 13)
    private String naTrplC;

    @Column(name = "NA_TEAM_C", nullable = false, length = 2)
    private String naTeamC;

    @Column(name = "RGD_RG_DT", nullable = false, length = 8)
    private String rgdRgDt;

    @Column(name = "RGD_PLA_NO", nullable = false, length = 16)
    private String rgdPlaNo;

    @Column(name = "RVOPL_NA_TRPL_C", length = 13)
    private String rvoplNaTrplC;

    @Column(name = "RVOPL_NA_TEAM_C", length = 2)
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

    @Column(name = "PHD_RLYBR_NA_TRPL_C", length = 13)
    private String phdRlybrNaTrplC;

    @Column(name = "WDRPL_NA_TRPL_C", length = 13)
    private String wdrplNaTrplC;

    @Column(name = "WDRPL_NA_TEAM_C", length = 2)
    private String wdrplNaTeamC;

    @Column(name = "WDR_DVYAA_C", length = 4)
    private String wdrDvyaaC;

    @Column(name = "WDR_RQR_DT", length = 8)
    private String wdrRqrDt;

    @Column(name = "WDR_PLA_DT", length = 8)
    private String wdrPlaDt;

    @Column(name = "WDR_PLA_TM", length = 6)
    private String wdrPlaTm;

    @Column(name = "SPY_TPC", length = 2)
    private String spyTpc;

    @Column(name = "CSER_CTR_TPC")
    private Character cserCtrTpc;

    @Column(name = "NA_WRS_LCLC", length = 3)
    private String naWrsLclc;

    @Column(name = "NA_WRS_MCLC", length = 3)
    private String naWrsMclc;

    @Column(name = "NA_STL_TP_DSC", length = 2)
    private String naStlTpDsc;

    @Column(name = "PRGR_C", length = 4)
    private String prgrC;

    @Column(name = "BUY_UPR_DSC")
    private Character buyUprDsc;

    @Column(name = "BYNG_UPR_GR_C", length = 2)
    private String byngUprGrC;

    @Column(name = "SL_UPR_TPC", length = 2)
    private String slUprTpc;

    @Column(name = "BUY_BZ_METC", length = 2)
    private String buyBzMetc;

    @Column(name = "SRA_WK_DSC", length = 2)
    private String sraWkDsc;

    @Column(name = "NA_PAK_DSC", length = 2)
    private String naPakDsc;

    @Column(name = "BOX_DSC", length = 2)
    private String boxDsc;

    @Column(name = "SRA_WRS_DSC", length = 2)
    private String sraWrsDsc;

    @Column(name = "ACCP_C", length = 2)
    private String accpC;

    @Column(name = "DVY_VHC_DSC")
    private Character dvyVhcDsc;

    @Column(name = "VHCNO", length = 20)
    private String vhcno;

    @Column(name = "TMS_DT", length = 8)
    private String tmsDt;

    @Column(name = "VCBT_AM", precision = 38, scale = 2)
    private BigDecimal vcbtAm;

    @Column(name = "VCBX_AM", precision = 38, scale = 2)
    private BigDecimal vcbxAm;

    @Column(name = "RGD_QT", precision = 38, scale = 2)
    private BigDecimal rgdQt;

    @Column(name = "RGD_VAT", precision = 38, scale = 2)
    private BigDecimal rgdVat;

    @Column(name = "RGD_AM", precision = 38, scale = 2)
    private BigDecimal rgdAm;

    @Column(name = "OGN_SLPNO", length = 16)
    private String ognSlpno;

    @Column(name = "OSLIP_DT", length = 8)
    private String oslipDt;

    @Column(name = "RGD_FORM_DSC")
    private Character rgdFormDsc;

    @Column(name = "SPYPL_NA_TRPL_C", length = 13)
    private String spyplNaTrplC;

    @Column(name = "DVYAA_NA_TRPL_C", length = 13)
    private String dvyaaNaTrplC;

    @Column(name = "SLGT_ETR_DSC")
    private Character slgtEtrDsc;

    @Column(name = "CNR_STS_DSC", length = 2)
    private String cnrStsDsc;

    @Column(name = "CHG_RSNCTT", length = 200)
    private String chgRsnctt;

    @Column(name = "DEL_RSNCTT", length = 200)
    private String delRsnctt;

    @Column(name = "NA_RGD_STS_DSC", length = 2)
    private String naRgdStsDsc;

    @Column(name = "RGD_AMN_DSC")
    private Character rgdAmnDsc;

    @Column(name = "APVMN_ENO", length = 9)
    private String apvmnEno;

    @Column(name = "APV_DTM")
    private Instant apvDtm;

    @Column(name = "XML_RGD_PLA_NO", length = 35)
    private String xmlRgdPlaNo;

    @Column(name = "RMK_CNTN", length = 4000)
    private String rmkCntn;

    @Column(name = "TR_DSNM", length = 100)
    private String trDsnm;

    @Column(name = "BYNG_DFN_QT", precision = 38, scale = 2)
    private BigDecimal byngDfnQt;

    @Column(name = "BYNG_DFN_AM", precision = 38, scale = 2)
    private BigDecimal byngDfnAm;

    @Column(name = "BYNG_DFN_VAT", precision = 38, scale = 2)
    private BigDecimal byngDfnVat;

    @Column(name = "BYNG_DFN_VCBT_AM", precision = 38, scale = 2)
    private BigDecimal byngDfnVcbtAm;

    @Column(name = "BYNG_DFN_VCBX_AM", precision = 38, scale = 2)
    private BigDecimal byngDfnVcbxAm;

    @Column(name = "BYNG_DFN_SSDY", precision = 38, scale = 2)
    private BigDecimal byngDfnSsdy;

    @Column(name = "BYNG_DFN_TROT_FEE", precision = 38, scale = 2)
    private BigDecimal byngDfnTrotFee;

    @Column(name = "BYNG_DFN_PHD_FEE", precision = 38, scale = 2)
    private BigDecimal byngDfnPhdFee;

    @Column(name = "BYNG_DFN_FAR_ASTCS", precision = 38, scale = 2)
    private BigDecimal byngDfnFarAstcs;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CMENO", length = 9)
    private String lsCmeno;

    @Column(name = "DEL_DTM")
    private Instant delDtm;

    @Column(name = "RTNCNF_DTM")
    private Instant rtncnfDtm;

    @Column(name = "NH_IF_DTM", length = 14)
    private String nhIfDtm;

    @Column(name = "DEL_YN")
    private Character delYn;

    public String getNaTrplC() {
        return naTrplC;
    }

    public void setNaTrplC(String naTrplC) {
        this.naTrplC = naTrplC;
    }

    public String getNaTeamC() {
        return naTeamC;
    }

    public void setNaTeamC(String naTeamC) {
        this.naTeamC = naTeamC;
    }

    public String getRgdRgDt() {
        return rgdRgDt;
    }

    public void setRgdRgDt(String rgdRgDt) {
        this.rgdRgDt = rgdRgDt;
    }

    public String getRgdPlaNo() {
        return rgdPlaNo;
    }

    public void setRgdPlaNo(String rgdPlaNo) {
        this.rgdPlaNo = rgdPlaNo;
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

    public String getPhdRlybrNaTrplC() {
        return phdRlybrNaTrplC;
    }

    public void setPhdRlybrNaTrplC(String phdRlybrNaTrplC) {
        this.phdRlybrNaTrplC = phdRlybrNaTrplC;
    }

    public String getWdrplNaTrplC() {
        return wdrplNaTrplC;
    }

    public void setWdrplNaTrplC(String wdrplNaTrplC) {
        this.wdrplNaTrplC = wdrplNaTrplC;
    }

    public String getWdrplNaTeamC() {
        return wdrplNaTeamC;
    }

    public void setWdrplNaTeamC(String wdrplNaTeamC) {
        this.wdrplNaTeamC = wdrplNaTeamC;
    }

    public String getWdrDvyaaC() {
        return wdrDvyaaC;
    }

    public void setWdrDvyaaC(String wdrDvyaaC) {
        this.wdrDvyaaC = wdrDvyaaC;
    }

    public String getWdrRqrDt() {
        return wdrRqrDt;
    }

    public void setWdrRqrDt(String wdrRqrDt) {
        this.wdrRqrDt = wdrRqrDt;
    }

    public String getWdrPlaDt() {
        return wdrPlaDt;
    }

    public void setWdrPlaDt(String wdrPlaDt) {
        this.wdrPlaDt = wdrPlaDt;
    }

    public String getWdrPlaTm() {
        return wdrPlaTm;
    }

    public void setWdrPlaTm(String wdrPlaTm) {
        this.wdrPlaTm = wdrPlaTm;
    }

    public String getSpyTpc() {
        return spyTpc;
    }

    public void setSpyTpc(String spyTpc) {
        this.spyTpc = spyTpc;
    }

    public Character getCserCtrTpc() {
        return cserCtrTpc;
    }

    public void setCserCtrTpc(Character cserCtrTpc) {
        this.cserCtrTpc = cserCtrTpc;
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

    public String getNaStlTpDsc() {
        return naStlTpDsc;
    }

    public void setNaStlTpDsc(String naStlTpDsc) {
        this.naStlTpDsc = naStlTpDsc;
    }

    public String getPrgrC() {
        return prgrC;
    }

    public void setPrgrC(String prgrC) {
        this.prgrC = prgrC;
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

    public String getSlUprTpc() {
        return slUprTpc;
    }

    public void setSlUprTpc(String slUprTpc) {
        this.slUprTpc = slUprTpc;
    }

    public String getBuyBzMetc() {
        return buyBzMetc;
    }

    public void setBuyBzMetc(String buyBzMetc) {
        this.buyBzMetc = buyBzMetc;
    }

    public String getSraWkDsc() {
        return sraWkDsc;
    }

    public void setSraWkDsc(String sraWkDsc) {
        this.sraWkDsc = sraWkDsc;
    }

    public String getNaPakDsc() {
        return naPakDsc;
    }

    public void setNaPakDsc(String naPakDsc) {
        this.naPakDsc = naPakDsc;
    }

    public String getBoxDsc() {
        return boxDsc;
    }

    public void setBoxDsc(String boxDsc) {
        this.boxDsc = boxDsc;
    }

    public String getSraWrsDsc() {
        return sraWrsDsc;
    }

    public void setSraWrsDsc(String sraWrsDsc) {
        this.sraWrsDsc = sraWrsDsc;
    }

    public String getAccpC() {
        return accpC;
    }

    public void setAccpC(String accpC) {
        this.accpC = accpC;
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

    public String getTmsDt() {
        return tmsDt;
    }

    public void setTmsDt(String tmsDt) {
        this.tmsDt = tmsDt;
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

    public BigDecimal getRgdQt() {
        return rgdQt;
    }

    public void setRgdQt(BigDecimal rgdQt) {
        this.rgdQt = rgdQt;
    }

    public BigDecimal getRgdVat() {
        return rgdVat;
    }

    public void setRgdVat(BigDecimal rgdVat) {
        this.rgdVat = rgdVat;
    }

    public BigDecimal getRgdAm() {
        return rgdAm;
    }

    public void setRgdAm(BigDecimal rgdAm) {
        this.rgdAm = rgdAm;
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

    public Character getRgdFormDsc() {
        return rgdFormDsc;
    }

    public void setRgdFormDsc(Character rgdFormDsc) {
        this.rgdFormDsc = rgdFormDsc;
    }

    public String getSpyplNaTrplC() {
        return spyplNaTrplC;
    }

    public void setSpyplNaTrplC(String spyplNaTrplC) {
        this.spyplNaTrplC = spyplNaTrplC;
    }

    public String getDvyaaNaTrplC() {
        return dvyaaNaTrplC;
    }

    public void setDvyaaNaTrplC(String dvyaaNaTrplC) {
        this.dvyaaNaTrplC = dvyaaNaTrplC;
    }

    public Character getSlgtEtrDsc() {
        return slgtEtrDsc;
    }

    public void setSlgtEtrDsc(Character slgtEtrDsc) {
        this.slgtEtrDsc = slgtEtrDsc;
    }

    public String getCnrStsDsc() {
        return cnrStsDsc;
    }

    public void setCnrStsDsc(String cnrStsDsc) {
        this.cnrStsDsc = cnrStsDsc;
    }

    public String getChgRsnctt() {
        return chgRsnctt;
    }

    public void setChgRsnctt(String chgRsnctt) {
        this.chgRsnctt = chgRsnctt;
    }

    public String getDelRsnctt() {
        return delRsnctt;
    }

    public void setDelRsnctt(String delRsnctt) {
        this.delRsnctt = delRsnctt;
    }

    public String getNaRgdStsDsc() {
        return naRgdStsDsc;
    }

    public void setNaRgdStsDsc(String naRgdStsDsc) {
        this.naRgdStsDsc = naRgdStsDsc;
    }

    public Character getRgdAmnDsc() {
        return rgdAmnDsc;
    }

    public void setRgdAmnDsc(Character rgdAmnDsc) {
        this.rgdAmnDsc = rgdAmnDsc;
    }

    public String getApvmnEno() {
        return apvmnEno;
    }

    public void setApvmnEno(String apvmnEno) {
        this.apvmnEno = apvmnEno;
    }

    public Instant getApvDtm() {
        return apvDtm;
    }

    public void setApvDtm(Instant apvDtm) {
        this.apvDtm = apvDtm;
    }

    public String getXmlRgdPlaNo() {
        return xmlRgdPlaNo;
    }

    public void setXmlRgdPlaNo(String xmlRgdPlaNo) {
        this.xmlRgdPlaNo = xmlRgdPlaNo;
    }

    public String getRmkCntn() {
        return rmkCntn;
    }

    public void setRmkCntn(String rmkCntn) {
        this.rmkCntn = rmkCntn;
    }

    public String getTrDsnm() {
        return trDsnm;
    }

    public void setTrDsnm(String trDsnm) {
        this.trDsnm = trDsnm;
    }

    public BigDecimal getByngDfnQt() {
        return byngDfnQt;
    }

    public void setByngDfnQt(BigDecimal byngDfnQt) {
        this.byngDfnQt = byngDfnQt;
    }

    public BigDecimal getByngDfnAm() {
        return byngDfnAm;
    }

    public void setByngDfnAm(BigDecimal byngDfnAm) {
        this.byngDfnAm = byngDfnAm;
    }

    public BigDecimal getByngDfnVat() {
        return byngDfnVat;
    }

    public void setByngDfnVat(BigDecimal byngDfnVat) {
        this.byngDfnVat = byngDfnVat;
    }

    public BigDecimal getByngDfnVcbtAm() {
        return byngDfnVcbtAm;
    }

    public void setByngDfnVcbtAm(BigDecimal byngDfnVcbtAm) {
        this.byngDfnVcbtAm = byngDfnVcbtAm;
    }

    public BigDecimal getByngDfnVcbxAm() {
        return byngDfnVcbxAm;
    }

    public void setByngDfnVcbxAm(BigDecimal byngDfnVcbxAm) {
        this.byngDfnVcbxAm = byngDfnVcbxAm;
    }

    public BigDecimal getByngDfnSsdy() {
        return byngDfnSsdy;
    }

    public void setByngDfnSsdy(BigDecimal byngDfnSsdy) {
        this.byngDfnSsdy = byngDfnSsdy;
    }

    public BigDecimal getByngDfnTrotFee() {
        return byngDfnTrotFee;
    }

    public void setByngDfnTrotFee(BigDecimal byngDfnTrotFee) {
        this.byngDfnTrotFee = byngDfnTrotFee;
    }

    public BigDecimal getByngDfnPhdFee() {
        return byngDfnPhdFee;
    }

    public void setByngDfnPhdFee(BigDecimal byngDfnPhdFee) {
        this.byngDfnPhdFee = byngDfnPhdFee;
    }

    public BigDecimal getByngDfnFarAstcs() {
        return byngDfnFarAstcs;
    }

    public void setByngDfnFarAstcs(BigDecimal byngDfnFarAstcs) {
        this.byngDfnFarAstcs = byngDfnFarAstcs;
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

    public Instant getRtncnfDtm() {
        return rtncnfDtm;
    }

    public void setRtncnfDtm(Instant rtncnfDtm) {
        this.rtncnfDtm = rtncnfDtm;
    }

    public String getNhIfDtm() {
        return nhIfDtm;
    }

    public void setNhIfDtm(String nhIfDtm) {
        this.nhIfDtm = nhIfDtm;
    }

    public Character getDelYn() {
        return delYn;
    }

    public void setDelYn(Character delYn) {
        this.delYn = delYn;
    }

}