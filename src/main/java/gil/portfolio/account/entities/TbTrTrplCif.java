package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

//@Entity
//@Table(name = "tb_tr_trpl_cif", schema = "escm")
public class TbTrTrplCif {
    @Column(name = "NA_TRPL_C", nullable = false, length = 13)
    private String naTrplC;

    @Column(name = "NA_TRPL_DSC", nullable = false, length = 2)
    private String naTrplDsc;

    @Column(name = "NAAC_DSC", nullable = false)
    private Character naacDsc;

    @Column(name = "CLNTNM", nullable = false, length = 200)
    private String clntnm;

    @Column(name = "TRPL_ABR_NM", length = 200)
    private String trplAbrNm;

    @Column(name = "NA_MBCO_DSC", nullable = false)
    private Character naMbcoDsc;

    @Column(name = "UP_NA_TRPL_C", length = 13)
    private String upNaTrplC;

    @Column(name = "FZIP", length = 3)
    private String fzip;

    @Column(name = "RZIP", length = 3)
    private String rzip;

    @Column(name = "ZIP_SQNO")
    private Integer zipSqno;

    @Column(name = "DONGUP", length = 300)
    private String dongup;

    @Column(name = "DONGBW", length = 100)
    private String dongbw;

    @Column(name = "NA_RGN_C", nullable = false, length = 4)
    private String naRgnC;

    @Column(name = "TEL_NAT_NO", length = 3)
    private String telNatNo;

    @Column(name = "ATEL", length = 4)
    private String atel;

    @Column(name = "HTEL", length = 4)
    private String htel;

    @Column(name = "STEL", length = 4)
    private String stel;

    @Column(name = "FAX_RGNO", length = 4)
    private String faxRgno;

    @Column(name = "HFAX", length = 4)
    private String hfax;

    @Column(name = "FAX_SQNO", length = 4)
    private String faxSqno;

    @Column(name = "MPSVNO", length = 32)
    private String mpsvno;

    @Column(name = "MPHNO", length = 32)
    private String mphno;

    @Column(name = "MPSQNO", length = 32)
    private String mpsqno;

    @Column(name = "NA_BZPL_TXBZ_RPT_FORM_C")
    private Character naBzplTxbzRptFormC;

    @Column(name = "NA_USR_SYS_KDC", length = 2)
    private String naUsrSysKdc;

    @Column(name = "ELT_TXBIL_UYN")
    private Character eltTxbilUyn;

    @Column(name = "TR_STOP_YN", nullable = false)
    private Character trStopYn;

    @Column(name = "TR_STOP_RSNC", length = 2)
    private String trStopRsnc;

    @Column(name = "TR_STOP_DT", length = 8)
    private String trStopDt;

    @Column(name = "COPNO_CIF_NO", length = 13)
    private String copnoCifNo;

    @Column(name = "REPMNM", length = 50)
    private String repmnm;

    @Column(name = "BZCCNM", length = 60)
    private String bzccnm;

    @Column(name = "BZTPNM", length = 60)
    private String bztpnm;

    @Column(name = "LIQ_SEL_RPT_NO", length = 9)
    private String liqSelRptNo;

    @Column(name = "LIQ_WHSL_COMP_C")
    private Character liqWhslCompC;

    @Column(name = "LIQ_RTL_COMP_C")
    private Character liqRtlCompC;

    @Column(name = "NA_TXBZ_DSC")
    private Character naTxbzDsc;

    @Column(name = "BIZ_NUMBER", length = 32)
    private String bizNumber;

    @Column(name = "CHG_YN")
    private Character chgYn;

    @Column(name = "LS_CMENO", length = 9)
    private String lsCmeno;

    @Column(name = "LS_NA_BZPLC", length = 13)
    private String lsNaBzplc;

    @ColumnDefault("'N'")
    @Column(name = "PRC_YN")
    private Character prcYn;

    @Column(name = "RSP_C_CNTN", length = 200)
    private String rspCCntn;

    @Column(name = "EDI_IF_ID", length = 64)
    private String ediIfId;

    @ColumnDefault("'0'")
    @Column(name = "DEL_YN")
    private Character delYn;

    @Column(name = "USR_SYS_C", length = 2)
    private String usrSysC;

    @Column(name = "NA_TRPL_SEAL_FLNM", length = 20)
    private String naTrplSealFlnm;

    @Column(name = "TRPL_DTL_TPC", length = 4)
    private String trplDtlTpc;

    @Column(name = "STD_COMP_C", length = 9)
    private String stdCompC;

    @Column(name = "NA_TRPL_APL_YN")
    private Character naTrplAplYn;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "FSRGMN_ENO", length = 9)
    private String fsrgmnEno;

    @Column(name = "FSRGMN_NA_BZPLC", length = 13)
    private String fsrgmnNaBzplc;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LSCGMN_NA_BZPLC", length = 13)
    private String lscgmnNaBzplc;

    @Column(name = "DSTR_TRPL_YN")
    private Character dstrTrplYn;

    @Column(name = "NA_REP_CUSNO")
    private Integer naRepCusno;

    @Column(name = "NA_CUSNO")
    private Integer naCusno;

    public String getNaTrplC() {
        return naTrplC;
    }

    public void setNaTrplC(String naTrplC) {
        this.naTrplC = naTrplC;
    }

    public String getNaTrplDsc() {
        return naTrplDsc;
    }

    public void setNaTrplDsc(String naTrplDsc) {
        this.naTrplDsc = naTrplDsc;
    }

    public Character getNaacDsc() {
        return naacDsc;
    }

    public void setNaacDsc(Character naacDsc) {
        this.naacDsc = naacDsc;
    }

    public String getClntnm() {
        return clntnm;
    }

    public void setClntnm(String clntnm) {
        this.clntnm = clntnm;
    }

    public String getTrplAbrNm() {
        return trplAbrNm;
    }

    public void setTrplAbrNm(String trplAbrNm) {
        this.trplAbrNm = trplAbrNm;
    }

    public Character getNaMbcoDsc() {
        return naMbcoDsc;
    }

    public void setNaMbcoDsc(Character naMbcoDsc) {
        this.naMbcoDsc = naMbcoDsc;
    }

    public String getUpNaTrplC() {
        return upNaTrplC;
    }

    public void setUpNaTrplC(String upNaTrplC) {
        this.upNaTrplC = upNaTrplC;
    }

    public String getFzip() {
        return fzip;
    }

    public void setFzip(String fzip) {
        this.fzip = fzip;
    }

    public String getRzip() {
        return rzip;
    }

    public void setRzip(String rzip) {
        this.rzip = rzip;
    }

    public Integer getZipSqno() {
        return zipSqno;
    }

    public void setZipSqno(Integer zipSqno) {
        this.zipSqno = zipSqno;
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

    public String getNaRgnC() {
        return naRgnC;
    }

    public void setNaRgnC(String naRgnC) {
        this.naRgnC = naRgnC;
    }

    public String getTelNatNo() {
        return telNatNo;
    }

    public void setTelNatNo(String telNatNo) {
        this.telNatNo = telNatNo;
    }

    public String getAtel() {
        return atel;
    }

    public void setAtel(String atel) {
        this.atel = atel;
    }

    public String getHtel() {
        return htel;
    }

    public void setHtel(String htel) {
        this.htel = htel;
    }

    public String getStel() {
        return stel;
    }

    public void setStel(String stel) {
        this.stel = stel;
    }

    public String getFaxRgno() {
        return faxRgno;
    }

    public void setFaxRgno(String faxRgno) {
        this.faxRgno = faxRgno;
    }

    public String getHfax() {
        return hfax;
    }

    public void setHfax(String hfax) {
        this.hfax = hfax;
    }

    public String getFaxSqno() {
        return faxSqno;
    }

    public void setFaxSqno(String faxSqno) {
        this.faxSqno = faxSqno;
    }

    public String getMpsvno() {
        return mpsvno;
    }

    public void setMpsvno(String mpsvno) {
        this.mpsvno = mpsvno;
    }

    public String getMphno() {
        return mphno;
    }

    public void setMphno(String mphno) {
        this.mphno = mphno;
    }

    public String getMpsqno() {
        return mpsqno;
    }

    public void setMpsqno(String mpsqno) {
        this.mpsqno = mpsqno;
    }

    public Character getNaBzplTxbzRptFormC() {
        return naBzplTxbzRptFormC;
    }

    public void setNaBzplTxbzRptFormC(Character naBzplTxbzRptFormC) {
        this.naBzplTxbzRptFormC = naBzplTxbzRptFormC;
    }

    public String getNaUsrSysKdc() {
        return naUsrSysKdc;
    }

    public void setNaUsrSysKdc(String naUsrSysKdc) {
        this.naUsrSysKdc = naUsrSysKdc;
    }

    public Character getEltTxbilUyn() {
        return eltTxbilUyn;
    }

    public void setEltTxbilUyn(Character eltTxbilUyn) {
        this.eltTxbilUyn = eltTxbilUyn;
    }

    public Character getTrStopYn() {
        return trStopYn;
    }

    public void setTrStopYn(Character trStopYn) {
        this.trStopYn = trStopYn;
    }

    public String getTrStopRsnc() {
        return trStopRsnc;
    }

    public void setTrStopRsnc(String trStopRsnc) {
        this.trStopRsnc = trStopRsnc;
    }

    public String getTrStopDt() {
        return trStopDt;
    }

    public void setTrStopDt(String trStopDt) {
        this.trStopDt = trStopDt;
    }

    public String getCopnoCifNo() {
        return copnoCifNo;
    }

    public void setCopnoCifNo(String copnoCifNo) {
        this.copnoCifNo = copnoCifNo;
    }

    public String getRepmnm() {
        return repmnm;
    }

    public void setRepmnm(String repmnm) {
        this.repmnm = repmnm;
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

    public String getLiqSelRptNo() {
        return liqSelRptNo;
    }

    public void setLiqSelRptNo(String liqSelRptNo) {
        this.liqSelRptNo = liqSelRptNo;
    }

    public Character getLiqWhslCompC() {
        return liqWhslCompC;
    }

    public void setLiqWhslCompC(Character liqWhslCompC) {
        this.liqWhslCompC = liqWhslCompC;
    }

    public Character getLiqRtlCompC() {
        return liqRtlCompC;
    }

    public void setLiqRtlCompC(Character liqRtlCompC) {
        this.liqRtlCompC = liqRtlCompC;
    }

    public Character getNaTxbzDsc() {
        return naTxbzDsc;
    }

    public void setNaTxbzDsc(Character naTxbzDsc) {
        this.naTxbzDsc = naTxbzDsc;
    }

    public String getBizNumber() {
        return bizNumber;
    }

    public void setBizNumber(String bizNumber) {
        this.bizNumber = bizNumber;
    }

    public Character getChgYn() {
        return chgYn;
    }

    public void setChgYn(Character chgYn) {
        this.chgYn = chgYn;
    }

    public String getLsCmeno() {
        return lsCmeno;
    }

    public void setLsCmeno(String lsCmeno) {
        this.lsCmeno = lsCmeno;
    }

    public String getLsNaBzplc() {
        return lsNaBzplc;
    }

    public void setLsNaBzplc(String lsNaBzplc) {
        this.lsNaBzplc = lsNaBzplc;
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

    public String getEdiIfId() {
        return ediIfId;
    }

    public void setEdiIfId(String ediIfId) {
        this.ediIfId = ediIfId;
    }

    public Character getDelYn() {
        return delYn;
    }

    public void setDelYn(Character delYn) {
        this.delYn = delYn;
    }

    public String getUsrSysC() {
        return usrSysC;
    }

    public void setUsrSysC(String usrSysC) {
        this.usrSysC = usrSysC;
    }

    public String getNaTrplSealFlnm() {
        return naTrplSealFlnm;
    }

    public void setNaTrplSealFlnm(String naTrplSealFlnm) {
        this.naTrplSealFlnm = naTrplSealFlnm;
    }

    public String getTrplDtlTpc() {
        return trplDtlTpc;
    }

    public void setTrplDtlTpc(String trplDtlTpc) {
        this.trplDtlTpc = trplDtlTpc;
    }

    public String getStdCompC() {
        return stdCompC;
    }

    public void setStdCompC(String stdCompC) {
        this.stdCompC = stdCompC;
    }

    public Character getNaTrplAplYn() {
        return naTrplAplYn;
    }

    public void setNaTrplAplYn(Character naTrplAplYn) {
        this.naTrplAplYn = naTrplAplYn;
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

    public String getLscgmnNaBzplc() {
        return lscgmnNaBzplc;
    }

    public void setLscgmnNaBzplc(String lscgmnNaBzplc) {
        this.lscgmnNaBzplc = lscgmnNaBzplc;
    }

    public Character getDstrTrplYn() {
        return dstrTrplYn;
    }

    public void setDstrTrplYn(Character dstrTrplYn) {
        this.dstrTrplYn = dstrTrplYn;
    }

    public Integer getNaRepCusno() {
        return naRepCusno;
    }

    public void setNaRepCusno(Integer naRepCusno) {
        this.naRepCusno = naRepCusno;
    }

    public Integer getNaCusno() {
        return naCusno;
    }

    public void setNaCusno(Integer naCusno) {
        this.naCusno = naCusno;
    }

}