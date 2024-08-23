package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;

//@Entity
//@Table(name = "tx_txbil", schema = "escm")
public class TxTxbil {
    @Column(name = "PBC_SQNO", nullable = false, length = 24)
    private String pbcSqno;

    @Column(name = "NTS_TMS_SQNO", length = 24)
    private String ntsTmsSqno;

    @Column(name = "TXBIL_CNT", length = 10)
    private String txbilCnt;

    @Column(name = "TXBIL_NO", length = 5)
    private String txbilNo;

    @Column(name = "TXBIL_SQNO", length = 14)
    private String txbilSqno;

    @Column(name = "CRT_DT", length = 8)
    private String crtDt;

    @Column(name = "TXBIL_KD", length = 4)
    private String txbilKd;

    @Column(name = "RCT_RQS_DSC", length = 2)
    private String rctRqsDsc;

    @Column(name = "MOD_C", length = 2)
    private String modC;

    @Column(name = "RMK1", length = 150)
    private String rmk1;

    @Column(name = "RMK2", length = 150)
    private String rmk2;

    @Column(name = "RMK3", length = 150)
    private String rmk3;

    @Column(name = "REV_RPT_NO", length = 15)
    private String revRptNo;

    @Column(name = "BAT_ISU_ST_DT", length = 8)
    private String batIsuStDt;

    @Column(name = "BAT_ISU_ED_DT", length = 8)
    private String batIsuEdDt;

    @Column(name = "REV_TTCN", length = 6)
    private String revTtcn;

    @Column(name = "SPLR_BZNO", length = 32)
    private String splrBzno;

    @Column(name = "SPLR_NA_TRPL_C", length = 4)
    private String splrNaTrplC;

    @Column(name = "SPLR_MTALNM", length = 200)
    private String splrMtalnm;

    @Column(name = "SPLR_REPMNM", length = 100)
    private String splrRepmnm;

    @Column(name = "SPLR_ADR", length = 300)
    private String splrAdr;

    @Column(name = "SPLR_BZTPNM", length = 100)
    private String splrBztpnm;

    @Column(name = "SPLR_BZC", length = 100)
    private String splrBzc;

    @Column(name = "SPLR_DEPTNM", length = 100)
    private String splrDeptnm;

    @Column(name = "SPLR_CHRRNM", length = 100)
    private String splrChrrnm;

    @Column(name = "SPLR_CHRR_TELNO", length = 20)
    private String splrChrrTelno;

    @Column(name = "SPLR_CHRR_EMAIL", length = 100)
    private String splrChrrEmail;

    @Column(name = "SPLR_CHRR_MPNO", length = 64)
    private String splrChrrMpno;

    @Column(name = "SPLR_FAXNO", length = 20)
    private String splrFaxno;

    @Column(name = "BUY_DSC", length = 2)
    private String buyDsc;

    @Column(name = "BUY_BZNO", length = 32)
    private String buyBzno;

    @Column(name = "BUY_NA_TRPL_C", length = 4)
    private String buyNaTrplC;

    @Column(name = "BUY_MTALNM", length = 200)
    private String buyMtalnm;

    @Column(name = "BUY_REPMNM", length = 100)
    private String buyRepmnm;

    @Column(name = "BUY_ADR", length = 300)
    private String buyAdr;

    @Column(name = "BUY_BZTPNM", length = 100)
    private String buyBztpnm;

    @Column(name = "BUY_BZC", length = 100)
    private String buyBzc;

    @Column(name = "BUY_FAXNO", length = 20)
    private String buyFaxno;

    @Column(name = "BUY_DEPTNM1", length = 100)
    private String buyDeptnm1;

    @Column(name = "BUY_CHRRNM1", length = 100)
    private String buyChrrnm1;

    @Column(name = "BUY_CHRR_TELNO1", length = 20)
    private String buyChrrTelno1;

    @Column(name = "BUY_CHRR_EMAIL1", length = 100)
    private String buyChrrEmail1;

    @Column(name = "BUY_CHRR_MPNO1", length = 20)
    private String buyChrrMpno1;

    @Column(name = "BUY_DEPTNM2", length = 100)
    private String buyDeptnm2;

    @Column(name = "BUY_CHRRNM2", length = 100)
    private String buyChrrnm2;

    @Column(name = "BUY_CHRR_TELNO2", length = 20)
    private String buyChrrTelno2;

    @Column(name = "BUY_CHRR_EMAIL2", length = 100)
    private String buyChrrEmail2;

    @Column(name = "BUY_CHRR_MPNO2", length = 20)
    private String buyChrrMpno2;

    @Column(name = "ETR_BZNO", length = 13)
    private String etrBzno;

    @Column(name = "ETR_NA_TRPL_C", length = 4)
    private String etrNaTrplC;

    @Column(name = "ETR_MTALNM", length = 70)
    private String etrMtalnm;

    @Column(name = "ETR_REPMNM", length = 30)
    private String etrRepmnm;

    @Column(name = "ETR_ADR", length = 150)
    private String etrAdr;

    @Column(name = "ETR_BZTPNM", length = 40)
    private String etrBztpnm;

    @Column(name = "ETR_BZC", length = 40)
    private String etrBzc;

    @Column(name = "ETR_DEPTNM", length = 40)
    private String etrDeptnm;

    @Column(name = "ETR_CHRRNM", length = 30)
    private String etrChrrnm;

    @Column(name = "ETR_CHRR_TELNO", length = 20)
    private String etrChrrTelno;

    @Column(name = "ETR_CHRR_EMAIL", length = 40)
    private String etrChrrEmail;

    @Column(name = "STL_METHC1", length = 2)
    private String stlMethc1;

    @Column(name = "STL_AM1", precision = 10)
    private BigDecimal stlAm1;

    @Column(name = "STL_METHC2", length = 2)
    private String stlMethc2;

    @Column(name = "STL_AM2", precision = 10)
    private BigDecimal stlAm2;

    @Column(name = "STL_METHC3", length = 2)
    private String stlMethc3;

    @Column(name = "STL_AM3", precision = 10)
    private BigDecimal stlAm3;

    @Column(name = "STL_METHC4", length = 2)
    private String stlMethc4;

    @Column(name = "STL_AM4", precision = 10)
    private BigDecimal stlAm4;

    @Column(name = "SPRTT", precision = 10)
    private BigDecimal sprtt;

    @Column(name = "TXA_TT", precision = 10)
    private BigDecimal txaTt;

    @Column(name = "TOT_AM", precision = 10)
    private BigDecimal totAm;

    @Column(name = "RQR_STS_C", length = 2)
    private String rqrStsC;

    @Column(name = "RPBC_DSC", length = 1)
    private String rpbcDsc;

    @Column(name = "BYNG_SL_DSC", length = 1)
    private String byngSlDsc;

    @Column(name = "RSP_C", length = 200)
    private String rspC;

    @Column(name = "RSP_MSG", length = 500)
    private String rspMsg;

    @Column(name = "RQR_CHAN_DSC", length = 6)
    private String rqrChanDsc;

    @Column(name = "EMAIL_PBC_RQR_YN", length = 1)
    private String emailPbcRqrYn;

    @Column(name = "SMS_PBC_RQR_YN", length = 1)
    private String smsPbcRqrYn;

    @Column(name = "FAX_PBC_RQR_YN", length = 1)
    private String faxPbcRqrYn;

    @Column(name = "MOD_TAX_PBC_SQNO", length = 24)
    private String modTaxPbcSqno;

    @Column(name = "MOD_TAX_NTS_TMS_SQNO", length = 24)
    private String modTaxNtsTmsSqno;

    @Column(name = "ISTT_PBC_YN", length = 1)
    private String isttPbcYn;

    @Column(name = "PBC_DT", length = 14)
    private String pbcDt;

    @Column(name = "ERP_REF_NO", length = 50)
    private String erpRefNo;

    @Column(name = "ASP_TMS_DTM", length = 14)
    private String aspTmsDtm;

    @Column(name = "ASP_RSP_DTM", length = 14)
    private String aspRspDtm;

    @Column(name = "DEPT_C", length = 20)
    private String deptC;

    @Column(name = "DEPTNM", length = 50)
    private String deptnm;

    @Column(name = "BRC", length = 6)
    private String brc;

    @Column(name = "BRNM", length = 60)
    private String brnm;

    @Column(name = "NA_BZPLC", length = 13)
    private String naBzplc;

    @Column(name = "NA_BZPLNM", length = 60)
    private String naBzplnm;

    @Column(name = "NA_TEAM_C", length = 2)
    private String naTeamC;

    @Column(name = "NA_TEAMNM", length = 60)
    private String naTeamnm;

    @Column(name = "NA_TRPL_C", length = 13)
    private String naTrplC;

    @Column(name = "NA_CLNTNM", length = 60)
    private String naClntnm;

    @Column(name = "NA_CLNT_TEAM_C", length = 2)
    private String naClntTeamC;

    @Column(name = "NA_CLNT_TEAMNM", length = 60)
    private String naClntTeamnm;

    @Column(name = "NA_WRS_LCLC", length = 3)
    private String naWrsLclc;

    @Column(name = "NA_WRS_LCLFNM", length = 50)
    private String naWrsLclfnm;

    @Column(name = "NA_WRS_MCLC", length = 3)
    private String naWrsMclc;

    @Column(name = "NA_WRS_MCLFNM", length = 50)
    private String naWrsMclfnm;

    @Column(name = "NA_TOT_DSC", length = 2)
    private String naTotDsc;

    @Column(name = "NA_TOT_DSNM", length = 40)
    private String naTotDsnm;

    @Column(name = "NA_TOT_DTI_DSC", length = 40)
    private String naTotDtiDsc;

    @Column(name = "NA_TOT_DTI_DSNM", length = 40)
    private String naTotDtiDsnm;

    @Column(name = "TXBZ_TP_DSC", length = 3)
    private String txbzTpDsc;

    @Column(name = "TXBZ_TP_PBCNM", length = 40)
    private String txbzTpPbcnm;

    @Column(name = "RC_MSG", length = 400)
    private String rcMsg;

    @Column(name = "HOFC_BAT_RG_DSC", length = 2)
    private String hofcBatRgDsc;

    @Column(name = "INPMN_ENO", length = 9)
    private String inpmnEno;

    @Column(name = "APVMN_ENO", length = 9)
    private String apvmnEno;

    @Column(name = "ELSG_YN", length = 1)
    private String elsgYn;

    @Column(name = "DCZ_UYN", length = 1)
    private String dczUyn;

    @Column(name = "ASP_ETR_YN", length = 1)
    private String aspEtrYn;

    @Column(name = "SIGN_R_VAL", length = 50)
    private String signRVal;

    @Column(name = "SPYPL_C", length = 10)
    private String spyplC;

    @Column(name = "VENDER_C", length = 6)
    private String venderC;

    @Column(name = "ORR_DT", length = 8)
    private String orrDt;

    @Column(name = "ORR_NO", length = 6)
    private String orrNo;

    @Column(name = "RSR_HDNG1", length = 50)
    private String rsrHdng1;

    @Column(name = "RSR_HDNG2", length = 50)
    private String rsrHdng2;

    @Column(name = "RSR_HDNG3", length = 50)
    private String rsrHdng3;

    @Column(name = "RSR_HDNG4", length = 50)
    private String rsrHdng4;

    @Column(name = "RSR_HDNG5", length = 50)
    private String rsrHdng5;

    @Column(name = "RSR_HDNG6", length = 50)
    private String rsrHdng6;

    @Column(name = "RSR_HDNG7", length = 50)
    private String rsrHdng7;

    @Column(name = "RSR_HDNG8", length = 50)
    private String rsrHdng8;

    @ColumnDefault("'01'")
    @Column(name = "TXBIL_STSC", length = 2)
    private String txbilStsc;

    @ColumnDefault("current_timestamp()")
    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "FS_RGM", length = 9)
    private String fsRgm;

    @ColumnDefault("current_timestamp()")
    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CHGM", length = 9)
    private String lsChgm;

    @Column(name = "PKG_SQNO", length = 24)
    private String pkgSqno;

    @ColumnDefault("current_timestamp()")
    @Column(name = "RG_DT", length = 14)
    private String rgDt;

    public String getPbcSqno() {
        return pbcSqno;
    }

    public void setPbcSqno(String pbcSqno) {
        this.pbcSqno = pbcSqno;
    }

    public String getNtsTmsSqno() {
        return ntsTmsSqno;
    }

    public void setNtsTmsSqno(String ntsTmsSqno) {
        this.ntsTmsSqno = ntsTmsSqno;
    }

    public String getTxbilCnt() {
        return txbilCnt;
    }

    public void setTxbilCnt(String txbilCnt) {
        this.txbilCnt = txbilCnt;
    }

    public String getTxbilNo() {
        return txbilNo;
    }

    public void setTxbilNo(String txbilNo) {
        this.txbilNo = txbilNo;
    }

    public String getTxbilSqno() {
        return txbilSqno;
    }

    public void setTxbilSqno(String txbilSqno) {
        this.txbilSqno = txbilSqno;
    }

    public String getCrtDt() {
        return crtDt;
    }

    public void setCrtDt(String crtDt) {
        this.crtDt = crtDt;
    }

    public String getTxbilKd() {
        return txbilKd;
    }

    public void setTxbilKd(String txbilKd) {
        this.txbilKd = txbilKd;
    }

    public String getRctRqsDsc() {
        return rctRqsDsc;
    }

    public void setRctRqsDsc(String rctRqsDsc) {
        this.rctRqsDsc = rctRqsDsc;
    }

    public String getModC() {
        return modC;
    }

    public void setModC(String modC) {
        this.modC = modC;
    }

    public String getRmk1() {
        return rmk1;
    }

    public void setRmk1(String rmk1) {
        this.rmk1 = rmk1;
    }

    public String getRmk2() {
        return rmk2;
    }

    public void setRmk2(String rmk2) {
        this.rmk2 = rmk2;
    }

    public String getRmk3() {
        return rmk3;
    }

    public void setRmk3(String rmk3) {
        this.rmk3 = rmk3;
    }

    public String getRevRptNo() {
        return revRptNo;
    }

    public void setRevRptNo(String revRptNo) {
        this.revRptNo = revRptNo;
    }

    public String getBatIsuStDt() {
        return batIsuStDt;
    }

    public void setBatIsuStDt(String batIsuStDt) {
        this.batIsuStDt = batIsuStDt;
    }

    public String getBatIsuEdDt() {
        return batIsuEdDt;
    }

    public void setBatIsuEdDt(String batIsuEdDt) {
        this.batIsuEdDt = batIsuEdDt;
    }

    public String getRevTtcn() {
        return revTtcn;
    }

    public void setRevTtcn(String revTtcn) {
        this.revTtcn = revTtcn;
    }

    public String getSplrBzno() {
        return splrBzno;
    }

    public void setSplrBzno(String splrBzno) {
        this.splrBzno = splrBzno;
    }

    public String getSplrNaTrplC() {
        return splrNaTrplC;
    }

    public void setSplrNaTrplC(String splrNaTrplC) {
        this.splrNaTrplC = splrNaTrplC;
    }

    public String getSplrMtalnm() {
        return splrMtalnm;
    }

    public void setSplrMtalnm(String splrMtalnm) {
        this.splrMtalnm = splrMtalnm;
    }

    public String getSplrRepmnm() {
        return splrRepmnm;
    }

    public void setSplrRepmnm(String splrRepmnm) {
        this.splrRepmnm = splrRepmnm;
    }

    public String getSplrAdr() {
        return splrAdr;
    }

    public void setSplrAdr(String splrAdr) {
        this.splrAdr = splrAdr;
    }

    public String getSplrBztpnm() {
        return splrBztpnm;
    }

    public void setSplrBztpnm(String splrBztpnm) {
        this.splrBztpnm = splrBztpnm;
    }

    public String getSplrBzc() {
        return splrBzc;
    }

    public void setSplrBzc(String splrBzc) {
        this.splrBzc = splrBzc;
    }

    public String getSplrDeptnm() {
        return splrDeptnm;
    }

    public void setSplrDeptnm(String splrDeptnm) {
        this.splrDeptnm = splrDeptnm;
    }

    public String getSplrChrrnm() {
        return splrChrrnm;
    }

    public void setSplrChrrnm(String splrChrrnm) {
        this.splrChrrnm = splrChrrnm;
    }

    public String getSplrChrrTelno() {
        return splrChrrTelno;
    }

    public void setSplrChrrTelno(String splrChrrTelno) {
        this.splrChrrTelno = splrChrrTelno;
    }

    public String getSplrChrrEmail() {
        return splrChrrEmail;
    }

    public void setSplrChrrEmail(String splrChrrEmail) {
        this.splrChrrEmail = splrChrrEmail;
    }

    public String getSplrChrrMpno() {
        return splrChrrMpno;
    }

    public void setSplrChrrMpno(String splrChrrMpno) {
        this.splrChrrMpno = splrChrrMpno;
    }

    public String getSplrFaxno() {
        return splrFaxno;
    }

    public void setSplrFaxno(String splrFaxno) {
        this.splrFaxno = splrFaxno;
    }

    public String getBuyDsc() {
        return buyDsc;
    }

    public void setBuyDsc(String buyDsc) {
        this.buyDsc = buyDsc;
    }

    public String getBuyBzno() {
        return buyBzno;
    }

    public void setBuyBzno(String buyBzno) {
        this.buyBzno = buyBzno;
    }

    public String getBuyNaTrplC() {
        return buyNaTrplC;
    }

    public void setBuyNaTrplC(String buyNaTrplC) {
        this.buyNaTrplC = buyNaTrplC;
    }

    public String getBuyMtalnm() {
        return buyMtalnm;
    }

    public void setBuyMtalnm(String buyMtalnm) {
        this.buyMtalnm = buyMtalnm;
    }

    public String getBuyRepmnm() {
        return buyRepmnm;
    }

    public void setBuyRepmnm(String buyRepmnm) {
        this.buyRepmnm = buyRepmnm;
    }

    public String getBuyAdr() {
        return buyAdr;
    }

    public void setBuyAdr(String buyAdr) {
        this.buyAdr = buyAdr;
    }

    public String getBuyBztpnm() {
        return buyBztpnm;
    }

    public void setBuyBztpnm(String buyBztpnm) {
        this.buyBztpnm = buyBztpnm;
    }

    public String getBuyBzc() {
        return buyBzc;
    }

    public void setBuyBzc(String buyBzc) {
        this.buyBzc = buyBzc;
    }

    public String getBuyFaxno() {
        return buyFaxno;
    }

    public void setBuyFaxno(String buyFaxno) {
        this.buyFaxno = buyFaxno;
    }

    public String getBuyDeptnm1() {
        return buyDeptnm1;
    }

    public void setBuyDeptnm1(String buyDeptnm1) {
        this.buyDeptnm1 = buyDeptnm1;
    }

    public String getBuyChrrnm1() {
        return buyChrrnm1;
    }

    public void setBuyChrrnm1(String buyChrrnm1) {
        this.buyChrrnm1 = buyChrrnm1;
    }

    public String getBuyChrrTelno1() {
        return buyChrrTelno1;
    }

    public void setBuyChrrTelno1(String buyChrrTelno1) {
        this.buyChrrTelno1 = buyChrrTelno1;
    }

    public String getBuyChrrEmail1() {
        return buyChrrEmail1;
    }

    public void setBuyChrrEmail1(String buyChrrEmail1) {
        this.buyChrrEmail1 = buyChrrEmail1;
    }

    public String getBuyChrrMpno1() {
        return buyChrrMpno1;
    }

    public void setBuyChrrMpno1(String buyChrrMpno1) {
        this.buyChrrMpno1 = buyChrrMpno1;
    }

    public String getBuyDeptnm2() {
        return buyDeptnm2;
    }

    public void setBuyDeptnm2(String buyDeptnm2) {
        this.buyDeptnm2 = buyDeptnm2;
    }

    public String getBuyChrrnm2() {
        return buyChrrnm2;
    }

    public void setBuyChrrnm2(String buyChrrnm2) {
        this.buyChrrnm2 = buyChrrnm2;
    }

    public String getBuyChrrTelno2() {
        return buyChrrTelno2;
    }

    public void setBuyChrrTelno2(String buyChrrTelno2) {
        this.buyChrrTelno2 = buyChrrTelno2;
    }

    public String getBuyChrrEmail2() {
        return buyChrrEmail2;
    }

    public void setBuyChrrEmail2(String buyChrrEmail2) {
        this.buyChrrEmail2 = buyChrrEmail2;
    }

    public String getBuyChrrMpno2() {
        return buyChrrMpno2;
    }

    public void setBuyChrrMpno2(String buyChrrMpno2) {
        this.buyChrrMpno2 = buyChrrMpno2;
    }

    public String getEtrBzno() {
        return etrBzno;
    }

    public void setEtrBzno(String etrBzno) {
        this.etrBzno = etrBzno;
    }

    public String getEtrNaTrplC() {
        return etrNaTrplC;
    }

    public void setEtrNaTrplC(String etrNaTrplC) {
        this.etrNaTrplC = etrNaTrplC;
    }

    public String getEtrMtalnm() {
        return etrMtalnm;
    }

    public void setEtrMtalnm(String etrMtalnm) {
        this.etrMtalnm = etrMtalnm;
    }

    public String getEtrRepmnm() {
        return etrRepmnm;
    }

    public void setEtrRepmnm(String etrRepmnm) {
        this.etrRepmnm = etrRepmnm;
    }

    public String getEtrAdr() {
        return etrAdr;
    }

    public void setEtrAdr(String etrAdr) {
        this.etrAdr = etrAdr;
    }

    public String getEtrBztpnm() {
        return etrBztpnm;
    }

    public void setEtrBztpnm(String etrBztpnm) {
        this.etrBztpnm = etrBztpnm;
    }

    public String getEtrBzc() {
        return etrBzc;
    }

    public void setEtrBzc(String etrBzc) {
        this.etrBzc = etrBzc;
    }

    public String getEtrDeptnm() {
        return etrDeptnm;
    }

    public void setEtrDeptnm(String etrDeptnm) {
        this.etrDeptnm = etrDeptnm;
    }

    public String getEtrChrrnm() {
        return etrChrrnm;
    }

    public void setEtrChrrnm(String etrChrrnm) {
        this.etrChrrnm = etrChrrnm;
    }

    public String getEtrChrrTelno() {
        return etrChrrTelno;
    }

    public void setEtrChrrTelno(String etrChrrTelno) {
        this.etrChrrTelno = etrChrrTelno;
    }

    public String getEtrChrrEmail() {
        return etrChrrEmail;
    }

    public void setEtrChrrEmail(String etrChrrEmail) {
        this.etrChrrEmail = etrChrrEmail;
    }

    public String getStlMethc1() {
        return stlMethc1;
    }

    public void setStlMethc1(String stlMethc1) {
        this.stlMethc1 = stlMethc1;
    }

    public BigDecimal getStlAm1() {
        return stlAm1;
    }

    public void setStlAm1(BigDecimal stlAm1) {
        this.stlAm1 = stlAm1;
    }

    public String getStlMethc2() {
        return stlMethc2;
    }

    public void setStlMethc2(String stlMethc2) {
        this.stlMethc2 = stlMethc2;
    }

    public BigDecimal getStlAm2() {
        return stlAm2;
    }

    public void setStlAm2(BigDecimal stlAm2) {
        this.stlAm2 = stlAm2;
    }

    public String getStlMethc3() {
        return stlMethc3;
    }

    public void setStlMethc3(String stlMethc3) {
        this.stlMethc3 = stlMethc3;
    }

    public BigDecimal getStlAm3() {
        return stlAm3;
    }

    public void setStlAm3(BigDecimal stlAm3) {
        this.stlAm3 = stlAm3;
    }

    public String getStlMethc4() {
        return stlMethc4;
    }

    public void setStlMethc4(String stlMethc4) {
        this.stlMethc4 = stlMethc4;
    }

    public BigDecimal getStlAm4() {
        return stlAm4;
    }

    public void setStlAm4(BigDecimal stlAm4) {
        this.stlAm4 = stlAm4;
    }

    public BigDecimal getSprtt() {
        return sprtt;
    }

    public void setSprtt(BigDecimal sprtt) {
        this.sprtt = sprtt;
    }

    public BigDecimal getTxaTt() {
        return txaTt;
    }

    public void setTxaTt(BigDecimal txaTt) {
        this.txaTt = txaTt;
    }

    public BigDecimal getTotAm() {
        return totAm;
    }

    public void setTotAm(BigDecimal totAm) {
        this.totAm = totAm;
    }

    public String getRqrStsC() {
        return rqrStsC;
    }

    public void setRqrStsC(String rqrStsC) {
        this.rqrStsC = rqrStsC;
    }

    public String getRpbcDsc() {
        return rpbcDsc;
    }

    public void setRpbcDsc(String rpbcDsc) {
        this.rpbcDsc = rpbcDsc;
    }

    public String getByngSlDsc() {
        return byngSlDsc;
    }

    public void setByngSlDsc(String byngSlDsc) {
        this.byngSlDsc = byngSlDsc;
    }

    public String getRspC() {
        return rspC;
    }

    public void setRspC(String rspC) {
        this.rspC = rspC;
    }

    public String getRspMsg() {
        return rspMsg;
    }

    public void setRspMsg(String rspMsg) {
        this.rspMsg = rspMsg;
    }

    public String getRqrChanDsc() {
        return rqrChanDsc;
    }

    public void setRqrChanDsc(String rqrChanDsc) {
        this.rqrChanDsc = rqrChanDsc;
    }

    public String getEmailPbcRqrYn() {
        return emailPbcRqrYn;
    }

    public void setEmailPbcRqrYn(String emailPbcRqrYn) {
        this.emailPbcRqrYn = emailPbcRqrYn;
    }

    public String getSmsPbcRqrYn() {
        return smsPbcRqrYn;
    }

    public void setSmsPbcRqrYn(String smsPbcRqrYn) {
        this.smsPbcRqrYn = smsPbcRqrYn;
    }

    public String getFaxPbcRqrYn() {
        return faxPbcRqrYn;
    }

    public void setFaxPbcRqrYn(String faxPbcRqrYn) {
        this.faxPbcRqrYn = faxPbcRqrYn;
    }

    public String getModTaxPbcSqno() {
        return modTaxPbcSqno;
    }

    public void setModTaxPbcSqno(String modTaxPbcSqno) {
        this.modTaxPbcSqno = modTaxPbcSqno;
    }

    public String getModTaxNtsTmsSqno() {
        return modTaxNtsTmsSqno;
    }

    public void setModTaxNtsTmsSqno(String modTaxNtsTmsSqno) {
        this.modTaxNtsTmsSqno = modTaxNtsTmsSqno;
    }

    public String getIsttPbcYn() {
        return isttPbcYn;
    }

    public void setIsttPbcYn(String isttPbcYn) {
        this.isttPbcYn = isttPbcYn;
    }

    public String getPbcDt() {
        return pbcDt;
    }

    public void setPbcDt(String pbcDt) {
        this.pbcDt = pbcDt;
    }

    public String getErpRefNo() {
        return erpRefNo;
    }

    public void setErpRefNo(String erpRefNo) {
        this.erpRefNo = erpRefNo;
    }

    public String getAspTmsDtm() {
        return aspTmsDtm;
    }

    public void setAspTmsDtm(String aspTmsDtm) {
        this.aspTmsDtm = aspTmsDtm;
    }

    public String getAspRspDtm() {
        return aspRspDtm;
    }

    public void setAspRspDtm(String aspRspDtm) {
        this.aspRspDtm = aspRspDtm;
    }

    public String getDeptC() {
        return deptC;
    }

    public void setDeptC(String deptC) {
        this.deptC = deptC;
    }

    public String getDeptnm() {
        return deptnm;
    }

    public void setDeptnm(String deptnm) {
        this.deptnm = deptnm;
    }

    public String getBrc() {
        return brc;
    }

    public void setBrc(String brc) {
        this.brc = brc;
    }

    public String getBrnm() {
        return brnm;
    }

    public void setBrnm(String brnm) {
        this.brnm = brnm;
    }

    public String getNaBzplc() {
        return naBzplc;
    }

    public void setNaBzplc(String naBzplc) {
        this.naBzplc = naBzplc;
    }

    public String getNaBzplnm() {
        return naBzplnm;
    }

    public void setNaBzplnm(String naBzplnm) {
        this.naBzplnm = naBzplnm;
    }

    public String getNaTeamC() {
        return naTeamC;
    }

    public void setNaTeamC(String naTeamC) {
        this.naTeamC = naTeamC;
    }

    public String getNaTeamnm() {
        return naTeamnm;
    }

    public void setNaTeamnm(String naTeamnm) {
        this.naTeamnm = naTeamnm;
    }

    public String getNaTrplC() {
        return naTrplC;
    }

    public void setNaTrplC(String naTrplC) {
        this.naTrplC = naTrplC;
    }

    public String getNaClntnm() {
        return naClntnm;
    }

    public void setNaClntnm(String naClntnm) {
        this.naClntnm = naClntnm;
    }

    public String getNaClntTeamC() {
        return naClntTeamC;
    }

    public void setNaClntTeamC(String naClntTeamC) {
        this.naClntTeamC = naClntTeamC;
    }

    public String getNaClntTeamnm() {
        return naClntTeamnm;
    }

    public void setNaClntTeamnm(String naClntTeamnm) {
        this.naClntTeamnm = naClntTeamnm;
    }

    public String getNaWrsLclc() {
        return naWrsLclc;
    }

    public void setNaWrsLclc(String naWrsLclc) {
        this.naWrsLclc = naWrsLclc;
    }

    public String getNaWrsLclfnm() {
        return naWrsLclfnm;
    }

    public void setNaWrsLclfnm(String naWrsLclfnm) {
        this.naWrsLclfnm = naWrsLclfnm;
    }

    public String getNaWrsMclc() {
        return naWrsMclc;
    }

    public void setNaWrsMclc(String naWrsMclc) {
        this.naWrsMclc = naWrsMclc;
    }

    public String getNaWrsMclfnm() {
        return naWrsMclfnm;
    }

    public void setNaWrsMclfnm(String naWrsMclfnm) {
        this.naWrsMclfnm = naWrsMclfnm;
    }

    public String getNaTotDsc() {
        return naTotDsc;
    }

    public void setNaTotDsc(String naTotDsc) {
        this.naTotDsc = naTotDsc;
    }

    public String getNaTotDsnm() {
        return naTotDsnm;
    }

    public void setNaTotDsnm(String naTotDsnm) {
        this.naTotDsnm = naTotDsnm;
    }

    public String getNaTotDtiDsc() {
        return naTotDtiDsc;
    }

    public void setNaTotDtiDsc(String naTotDtiDsc) {
        this.naTotDtiDsc = naTotDtiDsc;
    }

    public String getNaTotDtiDsnm() {
        return naTotDtiDsnm;
    }

    public void setNaTotDtiDsnm(String naTotDtiDsnm) {
        this.naTotDtiDsnm = naTotDtiDsnm;
    }

    public String getTxbzTpDsc() {
        return txbzTpDsc;
    }

    public void setTxbzTpDsc(String txbzTpDsc) {
        this.txbzTpDsc = txbzTpDsc;
    }

    public String getTxbzTpPbcnm() {
        return txbzTpPbcnm;
    }

    public void setTxbzTpPbcnm(String txbzTpPbcnm) {
        this.txbzTpPbcnm = txbzTpPbcnm;
    }

    public String getRcMsg() {
        return rcMsg;
    }

    public void setRcMsg(String rcMsg) {
        this.rcMsg = rcMsg;
    }

    public String getHofcBatRgDsc() {
        return hofcBatRgDsc;
    }

    public void setHofcBatRgDsc(String hofcBatRgDsc) {
        this.hofcBatRgDsc = hofcBatRgDsc;
    }

    public String getInpmnEno() {
        return inpmnEno;
    }

    public void setInpmnEno(String inpmnEno) {
        this.inpmnEno = inpmnEno;
    }

    public String getApvmnEno() {
        return apvmnEno;
    }

    public void setApvmnEno(String apvmnEno) {
        this.apvmnEno = apvmnEno;
    }

    public String getElsgYn() {
        return elsgYn;
    }

    public void setElsgYn(String elsgYn) {
        this.elsgYn = elsgYn;
    }

    public String getDczUyn() {
        return dczUyn;
    }

    public void setDczUyn(String dczUyn) {
        this.dczUyn = dczUyn;
    }

    public String getAspEtrYn() {
        return aspEtrYn;
    }

    public void setAspEtrYn(String aspEtrYn) {
        this.aspEtrYn = aspEtrYn;
    }

    public String getSignRVal() {
        return signRVal;
    }

    public void setSignRVal(String signRVal) {
        this.signRVal = signRVal;
    }

    public String getSpyplC() {
        return spyplC;
    }

    public void setSpyplC(String spyplC) {
        this.spyplC = spyplC;
    }

    public String getVenderC() {
        return venderC;
    }

    public void setVenderC(String venderC) {
        this.venderC = venderC;
    }

    public String getOrrDt() {
        return orrDt;
    }

    public void setOrrDt(String orrDt) {
        this.orrDt = orrDt;
    }

    public String getOrrNo() {
        return orrNo;
    }

    public void setOrrNo(String orrNo) {
        this.orrNo = orrNo;
    }

    public String getRsrHdng1() {
        return rsrHdng1;
    }

    public void setRsrHdng1(String rsrHdng1) {
        this.rsrHdng1 = rsrHdng1;
    }

    public String getRsrHdng2() {
        return rsrHdng2;
    }

    public void setRsrHdng2(String rsrHdng2) {
        this.rsrHdng2 = rsrHdng2;
    }

    public String getRsrHdng3() {
        return rsrHdng3;
    }

    public void setRsrHdng3(String rsrHdng3) {
        this.rsrHdng3 = rsrHdng3;
    }

    public String getRsrHdng4() {
        return rsrHdng4;
    }

    public void setRsrHdng4(String rsrHdng4) {
        this.rsrHdng4 = rsrHdng4;
    }

    public String getRsrHdng5() {
        return rsrHdng5;
    }

    public void setRsrHdng5(String rsrHdng5) {
        this.rsrHdng5 = rsrHdng5;
    }

    public String getRsrHdng6() {
        return rsrHdng6;
    }

    public void setRsrHdng6(String rsrHdng6) {
        this.rsrHdng6 = rsrHdng6;
    }

    public String getRsrHdng7() {
        return rsrHdng7;
    }

    public void setRsrHdng7(String rsrHdng7) {
        this.rsrHdng7 = rsrHdng7;
    }

    public String getRsrHdng8() {
        return rsrHdng8;
    }

    public void setRsrHdng8(String rsrHdng8) {
        this.rsrHdng8 = rsrHdng8;
    }

    public String getTxbilStsc() {
        return txbilStsc;
    }

    public void setTxbilStsc(String txbilStsc) {
        this.txbilStsc = txbilStsc;
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

    public String getPkgSqno() {
        return pkgSqno;
    }

    public void setPkgSqno(String pkgSqno) {
        this.pkgSqno = pkgSqno;
    }

    public String getRgDt() {
        return rgDt;
    }

    public void setRgDt(String rgDt) {
        this.rgDt = rgDt;
    }

}