package gil.portfolio.account.entities;

import jakarta.persistence.*;

import java.time.Instant;

//@Entity
//@Table(name = "pt_usr_inf_hst", schema = "escm", indexes = {
//        @Index(name = "IDX_PT_USR_INF_HST_1", columnList = "USR_MPNO"),
//        @Index(name = "IDX_PT_USR_INF_HST_2", columnList = "ENT_PRG_STSC")
//})
public class PtUsrInfHst {
    @EmbeddedId
    private PtUsrInfHstId id;

    @Column(name = "MB_PW", length = 64)
    private String mbPw;

    @Column(name = "USR_TPC", length = 2)
    private String usrTpc;

    @Column(name = "COMP_TPC", length = 4)
    private String compTpc;

    @Column(name = "USR_NM", length = 50)
    private String usrNm;

    @Column(name = "BIRTH", length = 8)
    private String birth;

    @Column(name = "SEX_DSC", length = 1)
    private String sexDsc;

    @Column(name = "USR_TELNO", length = 14)
    private String usrTelno;

    @Column(name = "USR_MPNO", length = 32)
    private String usrMpno;

    @Column(name = "USR_EMAIL", length = 60)
    private String usrEmail;

    @Column(name = "SMS_RMS_YN", length = 1)
    private String smsRmsYn;

    @Column(name = "EMAIL_RMS_YN", length = 1)
    private String emailRmsYn;

    @Column(name = "NA_TRPL_C", length = 13)
    private String naTrplC;

    @Column(name = "BZNO", length = 32)
    private String bzno;

    @Column(name = "ENT_PRG_STSC", length = 1)
    private String entPrgStsc;

    @Column(name = "CHRG_BSNNM", length = 150)
    private String chrgBsnnm;

    @Column(name = "PW_LSRG_DT", length = 8)
    private String pwLsrgDt;

    @Column(name = "MB_CV_DSC", length = 1)
    private String mbCvDsc;

    @Column(name = "ENT_PRG_CNTN", length = 500)
    private String entPrgCntn;

    @Column(name = "HOFF_APV_YN", length = 1)
    private String hoffApvYn;

    @Column(name = "BL_CHG_YN", length = 1)
    private String blChgYn;

    @Column(name = "APV_MB_ID", length = 9)
    private String apvMbId;

    @Column(name = "SVC_CHG_YN", length = 1)
    private String svcChgYn;

    @Column(name = "AUTH_CHG_YN", length = 1)
    private String authChgYn;

    @Column(name = "REQ_DT", length = 8)
    private String reqDt;

    @Column(name = "APV_DT", length = 8)
    private String apvDt;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "FS_RGM", length = 9)
    private String fsRgm;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CHGM", length = 9)
    private String lsChgm;

    @Column(name = "CH_HST", length = 7)
    private String chHst;

    @Column(name = "BEFORE_USR_TPC", length = 50)
    private String beforeUsrTpc;

    @Column(name = "BEFORE_ENT_PRG_STSC", length = 1)
    private String beforeEntPrgStsc;

    public PtUsrInfHstId getId() {
        return id;
    }

    public void setId(PtUsrInfHstId id) {
        this.id = id;
    }

    public String getMbPw() {
        return mbPw;
    }

    public void setMbPw(String mbPw) {
        this.mbPw = mbPw;
    }

    public String getUsrTpc() {
        return usrTpc;
    }

    public void setUsrTpc(String usrTpc) {
        this.usrTpc = usrTpc;
    }

    public String getCompTpc() {
        return compTpc;
    }

    public void setCompTpc(String compTpc) {
        this.compTpc = compTpc;
    }

    public String getUsrNm() {
        return usrNm;
    }

    public void setUsrNm(String usrNm) {
        this.usrNm = usrNm;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getSexDsc() {
        return sexDsc;
    }

    public void setSexDsc(String sexDsc) {
        this.sexDsc = sexDsc;
    }

    public String getUsrTelno() {
        return usrTelno;
    }

    public void setUsrTelno(String usrTelno) {
        this.usrTelno = usrTelno;
    }

    public String getUsrMpno() {
        return usrMpno;
    }

    public void setUsrMpno(String usrMpno) {
        this.usrMpno = usrMpno;
    }

    public String getUsrEmail() {
        return usrEmail;
    }

    public void setUsrEmail(String usrEmail) {
        this.usrEmail = usrEmail;
    }

    public String getSmsRmsYn() {
        return smsRmsYn;
    }

    public void setSmsRmsYn(String smsRmsYn) {
        this.smsRmsYn = smsRmsYn;
    }

    public String getEmailRmsYn() {
        return emailRmsYn;
    }

    public void setEmailRmsYn(String emailRmsYn) {
        this.emailRmsYn = emailRmsYn;
    }

    public String getNaTrplC() {
        return naTrplC;
    }

    public void setNaTrplC(String naTrplC) {
        this.naTrplC = naTrplC;
    }

    public String getBzno() {
        return bzno;
    }

    public void setBzno(String bzno) {
        this.bzno = bzno;
    }

    public String getEntPrgStsc() {
        return entPrgStsc;
    }

    public void setEntPrgStsc(String entPrgStsc) {
        this.entPrgStsc = entPrgStsc;
    }

    public String getChrgBsnnm() {
        return chrgBsnnm;
    }

    public void setChrgBsnnm(String chrgBsnnm) {
        this.chrgBsnnm = chrgBsnnm;
    }

    public String getPwLsrgDt() {
        return pwLsrgDt;
    }

    public void setPwLsrgDt(String pwLsrgDt) {
        this.pwLsrgDt = pwLsrgDt;
    }

    public String getMbCvDsc() {
        return mbCvDsc;
    }

    public void setMbCvDsc(String mbCvDsc) {
        this.mbCvDsc = mbCvDsc;
    }

    public String getEntPrgCntn() {
        return entPrgCntn;
    }

    public void setEntPrgCntn(String entPrgCntn) {
        this.entPrgCntn = entPrgCntn;
    }

    public String getHoffApvYn() {
        return hoffApvYn;
    }

    public void setHoffApvYn(String hoffApvYn) {
        this.hoffApvYn = hoffApvYn;
    }

    public String getBlChgYn() {
        return blChgYn;
    }

    public void setBlChgYn(String blChgYn) {
        this.blChgYn = blChgYn;
    }

    public String getApvMbId() {
        return apvMbId;
    }

    public void setApvMbId(String apvMbId) {
        this.apvMbId = apvMbId;
    }

    public String getSvcChgYn() {
        return svcChgYn;
    }

    public void setSvcChgYn(String svcChgYn) {
        this.svcChgYn = svcChgYn;
    }

    public String getAuthChgYn() {
        return authChgYn;
    }

    public void setAuthChgYn(String authChgYn) {
        this.authChgYn = authChgYn;
    }

    public String getReqDt() {
        return reqDt;
    }

    public void setReqDt(String reqDt) {
        this.reqDt = reqDt;
    }

    public String getApvDt() {
        return apvDt;
    }

    public void setApvDt(String apvDt) {
        this.apvDt = apvDt;
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

    public String getChHst() {
        return chHst;
    }

    public void setChHst(String chHst) {
        this.chHst = chHst;
    }

    public String getBeforeUsrTpc() {
        return beforeUsrTpc;
    }

    public void setBeforeUsrTpc(String beforeUsrTpc) {
        this.beforeUsrTpc = beforeUsrTpc;
    }

    public String getBeforeEntPrgStsc() {
        return beforeEntPrgStsc;
    }

    public void setBeforeEntPrgStsc(String beforeEntPrgStsc) {
        this.beforeEntPrgStsc = beforeEntPrgStsc;
    }

}