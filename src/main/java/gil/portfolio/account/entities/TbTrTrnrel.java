package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.Instant;

//@Entity
//@Table(name = "tb_tr_trnrel", schema = "escm")
public class TbTrTrnrel {
    @Column(name = "CSER_NA_TRPL_C", nullable = false, length = 13)
    private String cserNaTrplC;

    @Column(name = "CSER_NA_TEAM_C", nullable = false, length = 2)
    private String cserNaTeamC;

    @Column(name = "SPLR_NA_TRPL_C", nullable = false, length = 13)
    private String splrNaTrplC;

    @Column(name = "SPLR_NA_TEAM_C", nullable = false, length = 2)
    private String splrNaTeamC;

    @Column(name = "CSER_CTR_TPC", nullable = false)
    private Character cserCtrTpc;

    @Column(name = "SPY_TPC", nullable = false, length = 2)
    private String spyTpc;

    @Column(name = "NA_WRS_LCLC", nullable = false, length = 3)
    private String naWrsLclc;

    @Column(name = "NA_WRS_MCLC", nullable = false, length = 3)
    private String naWrsMclc;

    @Column(name = "MNGT_NA_TRPL_C", nullable = false, length = 13)
    private String mngtNaTrplC;

    @Column(name = "MNGT_NA_TEAM_C", nullable = false, length = 2)
    private String mngtNaTeamC;

    @Column(name = "MNGT_NA_TR_TPC", nullable = false)
    private Character mngtNaTrTpc;

    @Column(name = "BZ_METH_DSC", length = 2)
    private String bzMethDsc;

    @Column(name = "CSER_NA_USR_SYS_KDC", length = 2)
    private String cserNaUsrSysKdc;

    @Column(name = "CSER_NAAC_DSC")
    private Character cserNaacDsc;

    @Column(name = "SPLR_NA_USR_SYS_KDC", length = 2)
    private String splrNaUsrSysKdc;

    @Column(name = "SPLR_NAAC_DSC")
    private Character splrNaacDsc;

    @Column(name = "CSER_ADJPL_NA_TRPL_C", length = 13)
    private String cserAdjplNaTrplC;

    @Column(name = "CSER_ADJPL_NA_TEAM_C", length = 2)
    private String cserAdjplNaTeamC;

    @Column(name = "CSER_CTR_CHRRNM", length = 160)
    private String cserCtrChrrnm;

    @Column(name = "CSER_CTR_CHRR_TELNO", length = 14)
    private String cserCtrChrrTelno;

    @Column(name = "CSER_CTR_CHRR_MPNO", length = 128)
    private String cserCtrChrrMpno;

    @Column(name = "SPLR_ADJPL_NA_TRPL_C", nullable = false, length = 13)
    private String splrAdjplNaTrplC;

    @Column(name = "SPLR_ADJPL_NA_TEAM_C", nullable = false, length = 2)
    private String splrAdjplNaTeamC;

    @Column(name = "SPYPL_HOFF_NA_TRPL_C", length = 13)
    private String spyplHoffNaTrplC;

    @Column(name = "SPLR_BNK_C", length = 2)
    private String splrBnkC;

    @Column(name = "SPLR_STL_ACNO", length = 128)
    private String splrStlAcno;

    @Column(name = "SPLR_DPRNM", length = 160)
    private String splrDprnm;

    @Column(name = "SPLR_CTR_CHRRNM", length = 160)
    private String splrCtrChrrnm;

    @Column(name = "SPLR_CTR_CHRR_TELNO", length = 14)
    private String splrCtrChrrTelno;

    @Column(name = "SPLR_CTR_CHRR_MPNO", length = 128)
    private String splrCtrChrrMpno;

    @Column(name = "CTR_ST_DT", length = 8)
    private String ctrStDt;

    @Column(name = "CTR_ED_DT", length = 8)
    private String ctrEdDt;

    @Column(name = "CTR_STOP_DT", length = 8)
    private String ctrStopDt;

    @Column(name = "CTR_CLO_DT", length = 8)
    private String ctrCloDt;

    @Column(name = "CTR_CLO_RSNC", length = 2)
    private String ctrCloRsnc;

    @Column(name = "TR_STOP_RSNC", length = 2)
    private String trStopRsnc;

    @Column(name = "PRGR_DSC")
    private Character prgrDsc;

    @Column(name = "PRGR_C", length = 4)
    private String prgrC;

    @Column(name = "ROTS_FLEX_PR_APL_YN")
    private Character rotsFlexPrAplYn;

    @Column(name = "BYNG_UPR_MOD_YN")
    private Character byngUprModYn;

    @Column(name = "NA_ODR_FBID_RSNC", length = 2)
    private String naOdrFbidRsnc;

    @Column(name = "ODR_FBID_DT", length = 8)
    private String odrFbidDt;

    @Column(name = "ODRPL_BUYER_ENO", length = 9)
    private String odrplBuyerEno;

    @Column(name = "NA_RVO_FBID_RSNC", length = 2)
    private String naRvoFbidRsnc;

    @Column(name = "RVO_FBID_DT", length = 8)
    private String rvoFbidDt;

    @Column(name = "RVOPL_BUYER_ENO", length = 9)
    private String rvoplBuyerEno;

    @Column(name = "LDTM_DDS", precision = 7)
    private BigDecimal ldtmDds;

    @Column(name = "RGD_AMN_DSC")
    private Character rgdAmnDsc;

    @Column(name = "NA_PMI_SBJ_DSC", length = 3)
    private String naPmiSbjDsc;

    @Column(name = "STL_FDT_BASCD")
    private Character stlFdtBascd;

    @Column(name = "SSDYRT_BASCD")
    private Character ssdyrtBascd;

    @Column(name = "SSDYRT", precision = 10, scale = 2)
    private BigDecimal ssdyrt;

    @Column(name = "SSDY_BAS_AM", precision = 15, scale = 2)
    private BigDecimal ssdyBasAm;

    @Column(name = "DDLY_SSDYRT", precision = 5, scale = 2)
    private BigDecimal ddlySsdyrt;

    @Column(name = "SSDY_PY_PTM_DSC")
    private Character ssdyPyPtmDsc;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "DEL_DTM")
    private Instant delDtm;

    @Column(name = "LS_CMENO", length = 9)
    private String lsCmeno;

    @Column(name = "PY_FDTCN", precision = 10)
    private BigDecimal pyFdtcn;

    @Column(name = "CSER_TR_REL_AMNNO", precision = 10)
    private BigDecimal cserTrRelAmnno;

    @Column(name = "MNGT_TR_REL_AMNNO", precision = 10)
    private BigDecimal mngtTrRelAmnno;

    @Column(name = "PRC_YN")
    private Character prcYn;

    @Column(name = "ODRPL_ACCP_C", length = 2)
    private String odrplAccpC;

    @Column(name = "ODRPL_PLTT_TRT_YN")
    private Character odrplPlttTrtYn;

    @Column(name = "OPT_DDS", precision = 10)
    private BigDecimal optDds;

    @Column(name = "OPT_DDS1", precision = 10)
    private BigDecimal optDds1;

    @Column(name = "OPT_DDS2", precision = 10)
    private BigDecimal optDds2;

    @Column(name = "OPT_DDS3", precision = 10)
    private BigDecimal optDds3;

    @Column(name = "TR_PRD_TPC", length = 3)
    private String trPrdTpc;

    @Column(name = "DLA_ITR", precision = 9, scale = 5)
    private BigDecimal dlaItr;

    @Column(name = "DLA_ITR2", precision = 9, scale = 5)
    private BigDecimal dlaItr2;

    @Column(name = "DLA_ITR3", precision = 9, scale = 5)
    private BigDecimal dlaItr3;

    @Column(name = "DLA_ITR4", precision = 9, scale = 5)
    private BigDecimal dlaItr4;

    @Column(name = "DLAYPZ_EXMP_DDS", precision = 7)
    private BigDecimal dlaypzExmpDds;

    @Column(name = "DLAY_ITR", precision = 9, scale = 5)
    private BigDecimal dlayItr;

    @Column(name = "DSTR_TER_AMN_YN")
    private Character dstrTerAmnYn;

    @Column(name = "FSRGMN_ENO", length = 9)
    private String fsrgmnEno;

    @Column(name = "FSRGMN_NA_BZPLC", length = 13)
    private String fsrgmnNaBzplc;

    @Column(name = "LSCGMN_NA_BZPLC", length = 13)
    private String lscgmnNaBzplc;

    @Column(name = "DLMN_ENO", length = 9)
    private String dlmnEno;

    @Column(name = "DLMN_NA_BZPLC", length = 13)
    private String dlmnNaBzplc;

    public String getCserNaTrplC() {
        return cserNaTrplC;
    }

    public void setCserNaTrplC(String cserNaTrplC) {
        this.cserNaTrplC = cserNaTrplC;
    }

    public String getCserNaTeamC() {
        return cserNaTeamC;
    }

    public void setCserNaTeamC(String cserNaTeamC) {
        this.cserNaTeamC = cserNaTeamC;
    }

    public String getSplrNaTrplC() {
        return splrNaTrplC;
    }

    public void setSplrNaTrplC(String splrNaTrplC) {
        this.splrNaTrplC = splrNaTrplC;
    }

    public String getSplrNaTeamC() {
        return splrNaTeamC;
    }

    public void setSplrNaTeamC(String splrNaTeamC) {
        this.splrNaTeamC = splrNaTeamC;
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

    public Character getMngtNaTrTpc() {
        return mngtNaTrTpc;
    }

    public void setMngtNaTrTpc(Character mngtNaTrTpc) {
        this.mngtNaTrTpc = mngtNaTrTpc;
    }

    public String getBzMethDsc() {
        return bzMethDsc;
    }

    public void setBzMethDsc(String bzMethDsc) {
        this.bzMethDsc = bzMethDsc;
    }

    public String getCserNaUsrSysKdc() {
        return cserNaUsrSysKdc;
    }

    public void setCserNaUsrSysKdc(String cserNaUsrSysKdc) {
        this.cserNaUsrSysKdc = cserNaUsrSysKdc;
    }

    public Character getCserNaacDsc() {
        return cserNaacDsc;
    }

    public void setCserNaacDsc(Character cserNaacDsc) {
        this.cserNaacDsc = cserNaacDsc;
    }

    public String getSplrNaUsrSysKdc() {
        return splrNaUsrSysKdc;
    }

    public void setSplrNaUsrSysKdc(String splrNaUsrSysKdc) {
        this.splrNaUsrSysKdc = splrNaUsrSysKdc;
    }

    public Character getSplrNaacDsc() {
        return splrNaacDsc;
    }

    public void setSplrNaacDsc(Character splrNaacDsc) {
        this.splrNaacDsc = splrNaacDsc;
    }

    public String getCserAdjplNaTrplC() {
        return cserAdjplNaTrplC;
    }

    public void setCserAdjplNaTrplC(String cserAdjplNaTrplC) {
        this.cserAdjplNaTrplC = cserAdjplNaTrplC;
    }

    public String getCserAdjplNaTeamC() {
        return cserAdjplNaTeamC;
    }

    public void setCserAdjplNaTeamC(String cserAdjplNaTeamC) {
        this.cserAdjplNaTeamC = cserAdjplNaTeamC;
    }

    public String getCserCtrChrrnm() {
        return cserCtrChrrnm;
    }

    public void setCserCtrChrrnm(String cserCtrChrrnm) {
        this.cserCtrChrrnm = cserCtrChrrnm;
    }

    public String getCserCtrChrrTelno() {
        return cserCtrChrrTelno;
    }

    public void setCserCtrChrrTelno(String cserCtrChrrTelno) {
        this.cserCtrChrrTelno = cserCtrChrrTelno;
    }

    public String getCserCtrChrrMpno() {
        return cserCtrChrrMpno;
    }

    public void setCserCtrChrrMpno(String cserCtrChrrMpno) {
        this.cserCtrChrrMpno = cserCtrChrrMpno;
    }

    public String getSplrAdjplNaTrplC() {
        return splrAdjplNaTrplC;
    }

    public void setSplrAdjplNaTrplC(String splrAdjplNaTrplC) {
        this.splrAdjplNaTrplC = splrAdjplNaTrplC;
    }

    public String getSplrAdjplNaTeamC() {
        return splrAdjplNaTeamC;
    }

    public void setSplrAdjplNaTeamC(String splrAdjplNaTeamC) {
        this.splrAdjplNaTeamC = splrAdjplNaTeamC;
    }

    public String getSpyplHoffNaTrplC() {
        return spyplHoffNaTrplC;
    }

    public void setSpyplHoffNaTrplC(String spyplHoffNaTrplC) {
        this.spyplHoffNaTrplC = spyplHoffNaTrplC;
    }

    public String getSplrBnkC() {
        return splrBnkC;
    }

    public void setSplrBnkC(String splrBnkC) {
        this.splrBnkC = splrBnkC;
    }

    public String getSplrStlAcno() {
        return splrStlAcno;
    }

    public void setSplrStlAcno(String splrStlAcno) {
        this.splrStlAcno = splrStlAcno;
    }

    public String getSplrDprnm() {
        return splrDprnm;
    }

    public void setSplrDprnm(String splrDprnm) {
        this.splrDprnm = splrDprnm;
    }

    public String getSplrCtrChrrnm() {
        return splrCtrChrrnm;
    }

    public void setSplrCtrChrrnm(String splrCtrChrrnm) {
        this.splrCtrChrrnm = splrCtrChrrnm;
    }

    public String getSplrCtrChrrTelno() {
        return splrCtrChrrTelno;
    }

    public void setSplrCtrChrrTelno(String splrCtrChrrTelno) {
        this.splrCtrChrrTelno = splrCtrChrrTelno;
    }

    public String getSplrCtrChrrMpno() {
        return splrCtrChrrMpno;
    }

    public void setSplrCtrChrrMpno(String splrCtrChrrMpno) {
        this.splrCtrChrrMpno = splrCtrChrrMpno;
    }

    public String getCtrStDt() {
        return ctrStDt;
    }

    public void setCtrStDt(String ctrStDt) {
        this.ctrStDt = ctrStDt;
    }

    public String getCtrEdDt() {
        return ctrEdDt;
    }

    public void setCtrEdDt(String ctrEdDt) {
        this.ctrEdDt = ctrEdDt;
    }

    public String getCtrStopDt() {
        return ctrStopDt;
    }

    public void setCtrStopDt(String ctrStopDt) {
        this.ctrStopDt = ctrStopDt;
    }

    public String getCtrCloDt() {
        return ctrCloDt;
    }

    public void setCtrCloDt(String ctrCloDt) {
        this.ctrCloDt = ctrCloDt;
    }

    public String getCtrCloRsnc() {
        return ctrCloRsnc;
    }

    public void setCtrCloRsnc(String ctrCloRsnc) {
        this.ctrCloRsnc = ctrCloRsnc;
    }

    public String getTrStopRsnc() {
        return trStopRsnc;
    }

    public void setTrStopRsnc(String trStopRsnc) {
        this.trStopRsnc = trStopRsnc;
    }

    public Character getPrgrDsc() {
        return prgrDsc;
    }

    public void setPrgrDsc(Character prgrDsc) {
        this.prgrDsc = prgrDsc;
    }

    public String getPrgrC() {
        return prgrC;
    }

    public void setPrgrC(String prgrC) {
        this.prgrC = prgrC;
    }

    public Character getRotsFlexPrAplYn() {
        return rotsFlexPrAplYn;
    }

    public void setRotsFlexPrAplYn(Character rotsFlexPrAplYn) {
        this.rotsFlexPrAplYn = rotsFlexPrAplYn;
    }

    public Character getByngUprModYn() {
        return byngUprModYn;
    }

    public void setByngUprModYn(Character byngUprModYn) {
        this.byngUprModYn = byngUprModYn;
    }

    public String getNaOdrFbidRsnc() {
        return naOdrFbidRsnc;
    }

    public void setNaOdrFbidRsnc(String naOdrFbidRsnc) {
        this.naOdrFbidRsnc = naOdrFbidRsnc;
    }

    public String getOdrFbidDt() {
        return odrFbidDt;
    }

    public void setOdrFbidDt(String odrFbidDt) {
        this.odrFbidDt = odrFbidDt;
    }

    public String getOdrplBuyerEno() {
        return odrplBuyerEno;
    }

    public void setOdrplBuyerEno(String odrplBuyerEno) {
        this.odrplBuyerEno = odrplBuyerEno;
    }

    public String getNaRvoFbidRsnc() {
        return naRvoFbidRsnc;
    }

    public void setNaRvoFbidRsnc(String naRvoFbidRsnc) {
        this.naRvoFbidRsnc = naRvoFbidRsnc;
    }

    public String getRvoFbidDt() {
        return rvoFbidDt;
    }

    public void setRvoFbidDt(String rvoFbidDt) {
        this.rvoFbidDt = rvoFbidDt;
    }

    public String getRvoplBuyerEno() {
        return rvoplBuyerEno;
    }

    public void setRvoplBuyerEno(String rvoplBuyerEno) {
        this.rvoplBuyerEno = rvoplBuyerEno;
    }

    public BigDecimal getLdtmDds() {
        return ldtmDds;
    }

    public void setLdtmDds(BigDecimal ldtmDds) {
        this.ldtmDds = ldtmDds;
    }

    public Character getRgdAmnDsc() {
        return rgdAmnDsc;
    }

    public void setRgdAmnDsc(Character rgdAmnDsc) {
        this.rgdAmnDsc = rgdAmnDsc;
    }

    public String getNaPmiSbjDsc() {
        return naPmiSbjDsc;
    }

    public void setNaPmiSbjDsc(String naPmiSbjDsc) {
        this.naPmiSbjDsc = naPmiSbjDsc;
    }

    public Character getStlFdtBascd() {
        return stlFdtBascd;
    }

    public void setStlFdtBascd(Character stlFdtBascd) {
        this.stlFdtBascd = stlFdtBascd;
    }

    public Character getSsdyrtBascd() {
        return ssdyrtBascd;
    }

    public void setSsdyrtBascd(Character ssdyrtBascd) {
        this.ssdyrtBascd = ssdyrtBascd;
    }

    public BigDecimal getSsdyrt() {
        return ssdyrt;
    }

    public void setSsdyrt(BigDecimal ssdyrt) {
        this.ssdyrt = ssdyrt;
    }

    public BigDecimal getSsdyBasAm() {
        return ssdyBasAm;
    }

    public void setSsdyBasAm(BigDecimal ssdyBasAm) {
        this.ssdyBasAm = ssdyBasAm;
    }

    public BigDecimal getDdlySsdyrt() {
        return ddlySsdyrt;
    }

    public void setDdlySsdyrt(BigDecimal ddlySsdyrt) {
        this.ddlySsdyrt = ddlySsdyrt;
    }

    public Character getSsdyPyPtmDsc() {
        return ssdyPyPtmDsc;
    }

    public void setSsdyPyPtmDsc(Character ssdyPyPtmDsc) {
        this.ssdyPyPtmDsc = ssdyPyPtmDsc;
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

    public Instant getDelDtm() {
        return delDtm;
    }

    public void setDelDtm(Instant delDtm) {
        this.delDtm = delDtm;
    }

    public String getLsCmeno() {
        return lsCmeno;
    }

    public void setLsCmeno(String lsCmeno) {
        this.lsCmeno = lsCmeno;
    }

    public BigDecimal getPyFdtcn() {
        return pyFdtcn;
    }

    public void setPyFdtcn(BigDecimal pyFdtcn) {
        this.pyFdtcn = pyFdtcn;
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

    public Character getPrcYn() {
        return prcYn;
    }

    public void setPrcYn(Character prcYn) {
        this.prcYn = prcYn;
    }

    public String getOdrplAccpC() {
        return odrplAccpC;
    }

    public void setOdrplAccpC(String odrplAccpC) {
        this.odrplAccpC = odrplAccpC;
    }

    public Character getOdrplPlttTrtYn() {
        return odrplPlttTrtYn;
    }

    public void setOdrplPlttTrtYn(Character odrplPlttTrtYn) {
        this.odrplPlttTrtYn = odrplPlttTrtYn;
    }

    public BigDecimal getOptDds() {
        return optDds;
    }

    public void setOptDds(BigDecimal optDds) {
        this.optDds = optDds;
    }

    public BigDecimal getOptDds1() {
        return optDds1;
    }

    public void setOptDds1(BigDecimal optDds1) {
        this.optDds1 = optDds1;
    }

    public BigDecimal getOptDds2() {
        return optDds2;
    }

    public void setOptDds2(BigDecimal optDds2) {
        this.optDds2 = optDds2;
    }

    public BigDecimal getOptDds3() {
        return optDds3;
    }

    public void setOptDds3(BigDecimal optDds3) {
        this.optDds3 = optDds3;
    }

    public String getTrPrdTpc() {
        return trPrdTpc;
    }

    public void setTrPrdTpc(String trPrdTpc) {
        this.trPrdTpc = trPrdTpc;
    }

    public BigDecimal getDlaItr() {
        return dlaItr;
    }

    public void setDlaItr(BigDecimal dlaItr) {
        this.dlaItr = dlaItr;
    }

    public BigDecimal getDlaItr2() {
        return dlaItr2;
    }

    public void setDlaItr2(BigDecimal dlaItr2) {
        this.dlaItr2 = dlaItr2;
    }

    public BigDecimal getDlaItr3() {
        return dlaItr3;
    }

    public void setDlaItr3(BigDecimal dlaItr3) {
        this.dlaItr3 = dlaItr3;
    }

    public BigDecimal getDlaItr4() {
        return dlaItr4;
    }

    public void setDlaItr4(BigDecimal dlaItr4) {
        this.dlaItr4 = dlaItr4;
    }

    public BigDecimal getDlaypzExmpDds() {
        return dlaypzExmpDds;
    }

    public void setDlaypzExmpDds(BigDecimal dlaypzExmpDds) {
        this.dlaypzExmpDds = dlaypzExmpDds;
    }

    public BigDecimal getDlayItr() {
        return dlayItr;
    }

    public void setDlayItr(BigDecimal dlayItr) {
        this.dlayItr = dlayItr;
    }

    public Character getDstrTerAmnYn() {
        return dstrTerAmnYn;
    }

    public void setDstrTerAmnYn(Character dstrTerAmnYn) {
        this.dstrTerAmnYn = dstrTerAmnYn;
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

    public String getLscgmnNaBzplc() {
        return lscgmnNaBzplc;
    }

    public void setLscgmnNaBzplc(String lscgmnNaBzplc) {
        this.lscgmnNaBzplc = lscgmnNaBzplc;
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