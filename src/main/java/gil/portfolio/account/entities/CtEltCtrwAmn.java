package gil.portfolio.account.entities;

import jakarta.persistence.*;

import java.time.Instant;

//@Entity
//@Table(name = "ct_elt_ctrw_amn", schema = "escm")
public class CtEltCtrwAmn {
    @Id
    @Column(name = "ELT_CTRW_NO", nullable = false, length = 14)
    private String eltCtrwNo;

    @Column(name = "CTRW_TYP", nullable = false, length = 4)
    private String ctrwTyp;

    @Column(name = "CTRW_STY_VER", nullable = false, length = 4)
    private String ctrwStyVer;

    @Column(name = "MN_CTRW_KDC", length = 8)
    private String mnCtrwKdc;

    @Column(name = "ADD_CTRW_YN")
    private Character addCtrwYn;

    @Column(name = "PMIW_YN")
    private Character pmiwYn;

    @Column(name = "SCTRW_YN")
    private Character sctrwYn;

    @Column(name = "ETC_CTRW_YN")
    private Character etcCtrwYn;

    @Column(name = "CTR_ST_DT", length = 8)
    private String ctrStDt;

    @Column(name = "CTR_ED_DT", length = 8)
    private String ctrEdDt;

    @Column(name = "CTRW_DRUP_DT_TYP", nullable = false)
    private Character ctrwDrupDtTyp;

    @Column(name = "CTRW_DRUP_DT", length = 30)
    private String ctrwDrupDt;

    @Column(name = "CTRW_PTN_TYP", length = 4)
    private String ctrwPtnTyp;

    @Column(name = "BUYER_NA_TRPL_C", nullable = false, length = 13)
    private String buyerNaTrplC;

    @Column(name = "NA_TRPL_C", length = 13)
    private String naTrplC;

    @Column(name = "MTALNM", length = 200)
    private String mtalnm;

    @Column(name = "CEO", length = 50)
    private String ceo;

    @Column(name = "BZNO", length = 10)
    private String bzno;

    @Column(name = "COPNO", length = 32)
    private String copno;

    @Column(name = "TELNO", length = 12)
    private String telno;

    @Column(name = "CTR_CHRR", length = 50)
    private String ctrChrr;

    @Column(name = "MPNO", length = 32)
    private String mpno;

    @Column(name = "EMAIL", length = 50)
    private String email;

    @Column(name = "FZIP", length = 3)
    private String fzip;

    @Column(name = "RZIP", length = 3)
    private String rzip;

    @Column(name = "DONGUP", length = 80)
    private String dongup;

    @Column(name = "DONGBW", length = 100)
    private String dongbw;

    @Column(name = "BUYER_ENO", length = 9)
    private String buyerEno;

    @Column(name = "BUYER_BLG", length = 200)
    private String buyerBlg;

    @Column(name = "BUYER_NM", length = 64)
    private String buyerNm;

    @Column(name = "BUYER_TELNO", length = 12)
    private String buyerTelno;

    @Column(name = "BUYER_MPNO", length = 32)
    private String buyerMpno;

    @Column(name = "BUYER_EMAIL", length = 50)
    private String buyerEmail;

    @Column(name = "CTR_CHRR_MTALNM", length = 200)
    private String ctrChrrMtalnm;

    @Column(name = "CTR_CHRR_REPMN", length = 50)
    private String ctrChrrRepmn;

    @Column(name = "CTR_CHRR_REP_DTYNM", length = 256)
    private String ctrChrrRepDtynm;

    @Column(name = "LA_AGNT", length = 50)
    private String laAgnt;

    @Column(name = "LA_AGNT_DTYNM", length = 50)
    private String laAgntDtynm;

    @Column(name = "CTR_CHRR_FZIP", length = 3)
    private String ctrChrrFzip;

    @Column(name = "CTR_CHRR_RZIP", length = 3)
    private String ctrChrrRzip;

    @Column(name = "CTR_CHRR_DONGUP", length = 80)
    private String ctrChrrDongup;

    @Column(name = "CTR_CHRR_DONGBW", length = 100)
    private String ctrChrrDongbw;

    @Column(name = "RMK", length = 2048)
    private String rmk;

    @Column(name = "STS", length = 2)
    private String sts;

    @Lob
    @Column(name = "COLB_COMP_SGNT")
    private String colbCompSgnt;

    @Column(name = "COLB_COMP_SGNT_DTM")
    private Instant colbCompSgntDtm;

    @Column(name = "COLB_COMP_SEAL_APDFLNM", length = 64)
    private String colbCompSealApdflnm;

    @Column(name = "COLB_COMP_SEAL_SYS_FLNM", length = 256)
    private String colbCompSealSysFlnm;

    @Column(name = "BUYER_APV_STS")
    private Character buyerApvSts;

    @Column(name = "BUYER_APV_DTM")
    private Instant buyerApvDtm;

    @Lob
    @Column(name = "BUYER_SGNT")
    private String buyerSgnt;

    @Column(name = "BUYER_SGNT_DTM")
    private Instant buyerSgntDtm;

    @Column(name = "BUYER_SEAL_APDFLNM", length = 64)
    private String buyerSealApdflnm;

    @Column(name = "BUYER_SEAL_SYS_FLNM", length = 256)
    private String buyerSealSysFlnm;

    @Column(name = "MANAGER_ENO", length = 9)
    private String managerEno;

    @Column(name = "MANAGER_APV_STS")
    private Character managerApvSts;

    @Column(name = "MANAGER_APV_DTM")
    private Instant managerApvDtm;

    @Column(name = "CTR_PRD_AUT_XTN_YN")
    private Character ctrPrdAutXtnYn;

    @Column(name = "FGAT_PRVT_C", length = 256)
    private String fgatPrvtC;

    @Column(name = "BF_CTR_NO", length = 16)
    private String bfCtrNo;

    @Column(name = "CANCEL", length = 1)
    private String cancel;

    @Column(name = "CHG_REQ_STAT")
    private Character chgReqStat;

    @Column(name = "TEMP_YN")
    private Character tempYn;

    @Column(name = "CLEAN_YN")
    private Character cleanYn;

    @Column(name = "SEAL_OMIT_YN")
    private Character sealOmitYn;

    @Column(name = "LATE_CONCLUSION_YN")
    private Character lateConclusionYn;

    @Column(name = "BAK_PDF")
    private byte[] bakPdf;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "FS_RGM", length = 9)
    private String fsRgm;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CHGM", length = 9)
    private String lsChgm;

    @Column(name = "BUYER_CTRW_TYPE", length = 2)
    private String buyerCtrwType;

    @Column(name = "CTR_PRD_AUT_XTN_PER", length = 3)
    private String ctrPrdAutXtnPer;

    @Column(name = "WRITE_DIV")
    private Character writeDiv;

    public String getEltCtrwNo() {
        return eltCtrwNo;
    }

    public void setEltCtrwNo(String eltCtrwNo) {
        this.eltCtrwNo = eltCtrwNo;
    }

    public String getCtrwTyp() {
        return ctrwTyp;
    }

    public void setCtrwTyp(String ctrwTyp) {
        this.ctrwTyp = ctrwTyp;
    }

    public String getCtrwStyVer() {
        return ctrwStyVer;
    }

    public void setCtrwStyVer(String ctrwStyVer) {
        this.ctrwStyVer = ctrwStyVer;
    }

    public String getMnCtrwKdc() {
        return mnCtrwKdc;
    }

    public void setMnCtrwKdc(String mnCtrwKdc) {
        this.mnCtrwKdc = mnCtrwKdc;
    }

    public Character getAddCtrwYn() {
        return addCtrwYn;
    }

    public void setAddCtrwYn(Character addCtrwYn) {
        this.addCtrwYn = addCtrwYn;
    }

    public Character getPmiwYn() {
        return pmiwYn;
    }

    public void setPmiwYn(Character pmiwYn) {
        this.pmiwYn = pmiwYn;
    }

    public Character getSctrwYn() {
        return sctrwYn;
    }

    public void setSctrwYn(Character sctrwYn) {
        this.sctrwYn = sctrwYn;
    }

    public Character getEtcCtrwYn() {
        return etcCtrwYn;
    }

    public void setEtcCtrwYn(Character etcCtrwYn) {
        this.etcCtrwYn = etcCtrwYn;
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

    public Character getCtrwDrupDtTyp() {
        return ctrwDrupDtTyp;
    }

    public void setCtrwDrupDtTyp(Character ctrwDrupDtTyp) {
        this.ctrwDrupDtTyp = ctrwDrupDtTyp;
    }

    public String getCtrwDrupDt() {
        return ctrwDrupDt;
    }

    public void setCtrwDrupDt(String ctrwDrupDt) {
        this.ctrwDrupDt = ctrwDrupDt;
    }

    public String getCtrwPtnTyp() {
        return ctrwPtnTyp;
    }

    public void setCtrwPtnTyp(String ctrwPtnTyp) {
        this.ctrwPtnTyp = ctrwPtnTyp;
    }

    public String getBuyerNaTrplC() {
        return buyerNaTrplC;
    }

    public void setBuyerNaTrplC(String buyerNaTrplC) {
        this.buyerNaTrplC = buyerNaTrplC;
    }

    public String getNaTrplC() {
        return naTrplC;
    }

    public void setNaTrplC(String naTrplC) {
        this.naTrplC = naTrplC;
    }

    public String getMtalnm() {
        return mtalnm;
    }

    public void setMtalnm(String mtalnm) {
        this.mtalnm = mtalnm;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String getBzno() {
        return bzno;
    }

    public void setBzno(String bzno) {
        this.bzno = bzno;
    }

    public String getCopno() {
        return copno;
    }

    public void setCopno(String copno) {
        this.copno = copno;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public String getCtrChrr() {
        return ctrChrr;
    }

    public void setCtrChrr(String ctrChrr) {
        this.ctrChrr = ctrChrr;
    }

    public String getMpno() {
        return mpno;
    }

    public void setMpno(String mpno) {
        this.mpno = mpno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getBuyerEno() {
        return buyerEno;
    }

    public void setBuyerEno(String buyerEno) {
        this.buyerEno = buyerEno;
    }

    public String getBuyerBlg() {
        return buyerBlg;
    }

    public void setBuyerBlg(String buyerBlg) {
        this.buyerBlg = buyerBlg;
    }

    public String getBuyerNm() {
        return buyerNm;
    }

    public void setBuyerNm(String buyerNm) {
        this.buyerNm = buyerNm;
    }

    public String getBuyerTelno() {
        return buyerTelno;
    }

    public void setBuyerTelno(String buyerTelno) {
        this.buyerTelno = buyerTelno;
    }

    public String getBuyerMpno() {
        return buyerMpno;
    }

    public void setBuyerMpno(String buyerMpno) {
        this.buyerMpno = buyerMpno;
    }

    public String getBuyerEmail() {
        return buyerEmail;
    }

    public void setBuyerEmail(String buyerEmail) {
        this.buyerEmail = buyerEmail;
    }

    public String getCtrChrrMtalnm() {
        return ctrChrrMtalnm;
    }

    public void setCtrChrrMtalnm(String ctrChrrMtalnm) {
        this.ctrChrrMtalnm = ctrChrrMtalnm;
    }

    public String getCtrChrrRepmn() {
        return ctrChrrRepmn;
    }

    public void setCtrChrrRepmn(String ctrChrrRepmn) {
        this.ctrChrrRepmn = ctrChrrRepmn;
    }

    public String getCtrChrrRepDtynm() {
        return ctrChrrRepDtynm;
    }

    public void setCtrChrrRepDtynm(String ctrChrrRepDtynm) {
        this.ctrChrrRepDtynm = ctrChrrRepDtynm;
    }

    public String getLaAgnt() {
        return laAgnt;
    }

    public void setLaAgnt(String laAgnt) {
        this.laAgnt = laAgnt;
    }

    public String getLaAgntDtynm() {
        return laAgntDtynm;
    }

    public void setLaAgntDtynm(String laAgntDtynm) {
        this.laAgntDtynm = laAgntDtynm;
    }

    public String getCtrChrrFzip() {
        return ctrChrrFzip;
    }

    public void setCtrChrrFzip(String ctrChrrFzip) {
        this.ctrChrrFzip = ctrChrrFzip;
    }

    public String getCtrChrrRzip() {
        return ctrChrrRzip;
    }

    public void setCtrChrrRzip(String ctrChrrRzip) {
        this.ctrChrrRzip = ctrChrrRzip;
    }

    public String getCtrChrrDongup() {
        return ctrChrrDongup;
    }

    public void setCtrChrrDongup(String ctrChrrDongup) {
        this.ctrChrrDongup = ctrChrrDongup;
    }

    public String getCtrChrrDongbw() {
        return ctrChrrDongbw;
    }

    public void setCtrChrrDongbw(String ctrChrrDongbw) {
        this.ctrChrrDongbw = ctrChrrDongbw;
    }

    public String getRmk() {
        return rmk;
    }

    public void setRmk(String rmk) {
        this.rmk = rmk;
    }

    public String getSts() {
        return sts;
    }

    public void setSts(String sts) {
        this.sts = sts;
    }

    public String getColbCompSgnt() {
        return colbCompSgnt;
    }

    public void setColbCompSgnt(String colbCompSgnt) {
        this.colbCompSgnt = colbCompSgnt;
    }

    public Instant getColbCompSgntDtm() {
        return colbCompSgntDtm;
    }

    public void setColbCompSgntDtm(Instant colbCompSgntDtm) {
        this.colbCompSgntDtm = colbCompSgntDtm;
    }

    public String getColbCompSealApdflnm() {
        return colbCompSealApdflnm;
    }

    public void setColbCompSealApdflnm(String colbCompSealApdflnm) {
        this.colbCompSealApdflnm = colbCompSealApdflnm;
    }

    public String getColbCompSealSysFlnm() {
        return colbCompSealSysFlnm;
    }

    public void setColbCompSealSysFlnm(String colbCompSealSysFlnm) {
        this.colbCompSealSysFlnm = colbCompSealSysFlnm;
    }

    public Character getBuyerApvSts() {
        return buyerApvSts;
    }

    public void setBuyerApvSts(Character buyerApvSts) {
        this.buyerApvSts = buyerApvSts;
    }

    public Instant getBuyerApvDtm() {
        return buyerApvDtm;
    }

    public void setBuyerApvDtm(Instant buyerApvDtm) {
        this.buyerApvDtm = buyerApvDtm;
    }

    public String getBuyerSgnt() {
        return buyerSgnt;
    }

    public void setBuyerSgnt(String buyerSgnt) {
        this.buyerSgnt = buyerSgnt;
    }

    public Instant getBuyerSgntDtm() {
        return buyerSgntDtm;
    }

    public void setBuyerSgntDtm(Instant buyerSgntDtm) {
        this.buyerSgntDtm = buyerSgntDtm;
    }

    public String getBuyerSealApdflnm() {
        return buyerSealApdflnm;
    }

    public void setBuyerSealApdflnm(String buyerSealApdflnm) {
        this.buyerSealApdflnm = buyerSealApdflnm;
    }

    public String getBuyerSealSysFlnm() {
        return buyerSealSysFlnm;
    }

    public void setBuyerSealSysFlnm(String buyerSealSysFlnm) {
        this.buyerSealSysFlnm = buyerSealSysFlnm;
    }

    public String getManagerEno() {
        return managerEno;
    }

    public void setManagerEno(String managerEno) {
        this.managerEno = managerEno;
    }

    public Character getManagerApvSts() {
        return managerApvSts;
    }

    public void setManagerApvSts(Character managerApvSts) {
        this.managerApvSts = managerApvSts;
    }

    public Instant getManagerApvDtm() {
        return managerApvDtm;
    }

    public void setManagerApvDtm(Instant managerApvDtm) {
        this.managerApvDtm = managerApvDtm;
    }

    public Character getCtrPrdAutXtnYn() {
        return ctrPrdAutXtnYn;
    }

    public void setCtrPrdAutXtnYn(Character ctrPrdAutXtnYn) {
        this.ctrPrdAutXtnYn = ctrPrdAutXtnYn;
    }

    public String getFgatPrvtC() {
        return fgatPrvtC;
    }

    public void setFgatPrvtC(String fgatPrvtC) {
        this.fgatPrvtC = fgatPrvtC;
    }

    public String getBfCtrNo() {
        return bfCtrNo;
    }

    public void setBfCtrNo(String bfCtrNo) {
        this.bfCtrNo = bfCtrNo;
    }

    public String getCancel() {
        return cancel;
    }

    public void setCancel(String cancel) {
        this.cancel = cancel;
    }

    public Character getChgReqStat() {
        return chgReqStat;
    }

    public void setChgReqStat(Character chgReqStat) {
        this.chgReqStat = chgReqStat;
    }

    public Character getTempYn() {
        return tempYn;
    }

    public void setTempYn(Character tempYn) {
        this.tempYn = tempYn;
    }

    public Character getCleanYn() {
        return cleanYn;
    }

    public void setCleanYn(Character cleanYn) {
        this.cleanYn = cleanYn;
    }

    public Character getSealOmitYn() {
        return sealOmitYn;
    }

    public void setSealOmitYn(Character sealOmitYn) {
        this.sealOmitYn = sealOmitYn;
    }

    public Character getLateConclusionYn() {
        return lateConclusionYn;
    }

    public void setLateConclusionYn(Character lateConclusionYn) {
        this.lateConclusionYn = lateConclusionYn;
    }

    public byte[] getBakPdf() {
        return bakPdf;
    }

    public void setBakPdf(byte[] bakPdf) {
        this.bakPdf = bakPdf;
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

    public String getBuyerCtrwType() {
        return buyerCtrwType;
    }

    public void setBuyerCtrwType(String buyerCtrwType) {
        this.buyerCtrwType = buyerCtrwType;
    }

    public String getCtrPrdAutXtnPer() {
        return ctrPrdAutXtnPer;
    }

    public void setCtrPrdAutXtnPer(String ctrPrdAutXtnPer) {
        this.ctrPrdAutXtnPer = ctrPrdAutXtnPer;
    }

    public Character getWriteDiv() {
        return writeDiv;
    }

    public void setWriteDiv(Character writeDiv) {
        this.writeDiv = writeDiv;
    }

}