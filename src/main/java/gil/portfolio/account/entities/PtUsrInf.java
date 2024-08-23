package gil.portfolio.account.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Fetch;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "pt_usr_inf", schema = "escm", indexes = {
        @Index(name = "IDX_PT_USR_INF_1", columnList = "USR_MPNO"),
        @Index(name = "IDX_PT_USR_INF_3", columnList = "NA_TRPL_C"),
        @Index(name = "IDX_PT_USR_INF_4", columnList = "BZNO"),
        @Index(name = "IDX_PT_USR_INF_2", columnList = "ENT_PRG_STSC")
}, uniqueConstraints = {
        @UniqueConstraint(name = "PK_PT_USR_INF", columnNames = {"MB_ID"})
})
public class PtUsrInf {
    @Id
    @Column(name = "MB_ID", nullable = false, length = 9)
    private String mbId;

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

    @Column(name = "ENT_PRG_STSC")
    private Character entPrgStsc;

    @Column(name = "CHRG_BSNNM", length = 150)
    private String chrgBsnnm;

    @Column(name = "PW_LSRG_DT", length = 8)
    private String pwLsrgDt;

    @Column(name = "MB_CV_DSC")
    private Character mbCvDsc;

    @Column(name = "ENT_PRG_CNTN", length = 500)
    private String entPrgCntn;

    @Column(name = "HOFF_APV_YN")
    private Character hoffApvYn;

    @Column(name = "BL_CHG_YN")
    private Character blChgYn;

    @Column(name = "APV_MB_ID", length = 9)
    private String apvMbId;

    @Column(name = "SVC_CHG_YN")
    private Character svcChgYn;

    @Column(name = "AUTH_CHG_YN")
    private Character authChgYn;

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

    @ColumnDefault("0")
    @Column(name = "LGIN_TRY")
    private Integer lginTry;

    @ColumnDefault("'0'")
    @Column(name = "LOCK_YN", length = 2)
    private String lockYn;

    @Column(name = "MGR_YN", length = 1)
    private String mgrYn;

    @Column(name = "RESIGN_YN", length = 1)
    private String resignYn;

    @Column(name = "RESIGN_DT", length = 8)
    private String resignDt;

    @MapsId("mbId")
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "MB_ID", referencedColumnName = "MB_ID")
    })

    private List<PtUsrTpc> ptUsrTpc;

    public String getMbId() {
        return mbId;
    }

    public void setMbId(String mbId) {
        this.mbId = mbId;
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

    public Character getEntPrgStsc() {
        return entPrgStsc;
    }

    public void setEntPrgStsc(Character entPrgStsc) {
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

    public Character getMbCvDsc() {
        return mbCvDsc;
    }

    public void setMbCvDsc(Character mbCvDsc) {
        this.mbCvDsc = mbCvDsc;
    }

    public String getEntPrgCntn() {
        return entPrgCntn;
    }

    public void setEntPrgCntn(String entPrgCntn) {
        this.entPrgCntn = entPrgCntn;
    }

    public Character getHoffApvYn() {
        return hoffApvYn;
    }

    public void setHoffApvYn(Character hoffApvYn) {
        this.hoffApvYn = hoffApvYn;
    }

    public Character getBlChgYn() {
        return blChgYn;
    }

    public void setBlChgYn(Character blChgYn) {
        this.blChgYn = blChgYn;
    }

    public String getApvMbId() {
        return apvMbId;
    }

    public void setApvMbId(String apvMbId) {
        this.apvMbId = apvMbId;
    }

    public Character getSvcChgYn() {
        return svcChgYn;
    }

    public void setSvcChgYn(Character svcChgYn) {
        this.svcChgYn = svcChgYn;
    }

    public Character getAuthChgYn() {
        return authChgYn;
    }

    public void setAuthChgYn(Character authChgYn) {
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

    public Integer getLginTry() {
        return lginTry;
    }

    public void setLginTry(Integer lginTry) {
        this.lginTry = lginTry;
    }

    public String getLockYn() {
        return lockYn;
    }

    public void setLockYn(String lockYn) {
        this.lockYn = lockYn;
    }

    public String getMgrYn() {
        return mgrYn;
    }

    public void setMgrYn(String mgrYn) {
        this.mgrYn = mgrYn;
    }

    public String getResignYn() {
        return resignYn;
    }

    public void setResignYn(String resignYn) {
        this.resignYn = resignYn;
    }

    public String getResignDt() {
        return resignDt;
    }

    public void setResignDt(String resignDt) {
        this.resignDt = resignDt;
    }

    public List<PtUsrTpc> getPtUsrTpc() {
        return ptUsrTpc;
    }

    public void setPtUsrTpc(List<PtUsrTpc> ptUsrTpc) {
        this.ptUsrTpc = ptUsrTpc;
    }

    @Override
    public String toString() {
        String resultString = "PtUsrInf{" +
                "mbId='" + mbId + '\'' +
                ", mbPw='" + mbPw + '\'' +
                ", usrTpc='" + usrTpc + '\'' +
                ", compTpc='" + compTpc + '\'' +
                ", usrNm='" + usrNm + '\'' +
                ", birth='" + birth + '\'' +
                ", sexDsc='" + sexDsc + '\'' +
                ", usrTelno='" + usrTelno + '\'' +
                ", usrMpno='" + usrMpno + '\'' +
                ", usrEmail='" + usrEmail + '\'' +
                ", smsRmsYn='" + smsRmsYn + '\'' +
                ", emailRmsYn='" + emailRmsYn + '\'' +
                ", naTrplC='" + naTrplC + '\'' +
                ", bzno='" + bzno + '\'' +
                ", entPrgStsc=" + entPrgStsc +
                ", chrgBsnnm='" + chrgBsnnm + '\'' +
                ", pwLsrgDt='" + pwLsrgDt + '\'' +
                ", mbCvDsc=" + mbCvDsc +
                ", entPrgCntn='" + entPrgCntn + '\'' +
                ", hoffApvYn=" + hoffApvYn +
                ", blChgYn=" + blChgYn +
                ", apvMbId='" + apvMbId + '\'' +
                ", svcChgYn=" + svcChgYn +
                ", authChgYn=" + authChgYn +
                ", reqDt='" + reqDt + '\'' +
                ", apvDt='" + apvDt + '\'' +
                ", fsrgDtm=" + fsrgDtm +
                ", fsRgm='" + fsRgm + '\'' +
                ", lschgDtm=" + lschgDtm +
                ", lsChgm='" + lsChgm + '\'' +
                ", lginTry=" + lginTry +
                ", lockYn='" + lockYn + '\'' +
                ", mgrYn='" + mgrYn + '\'' +
                ", resignYn='" + resignYn + '\'' +
                ", resignDt='" + resignDt + '\'' ;
//                ", ptUsrTpc=" + ptUsrTpc +
                resultString += "ptUsrTpc= [";
                for(int i=0; i<ptUsrTpc.size(); i++){
                    resultString += ptUsrTpc.get(i).getId().getUsrTpc();
                    if(i != ptUsrTpc.size()-1){
                        resultString += "|";
                    }
                }
                resultString += "]";
                resultString += '}';
        return resultString;
    }
}