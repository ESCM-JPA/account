package gil.portfolio.account.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

//@Entity
//@Table(name = "pt_blbd_cntn", schema = "escm")
public class PtBlbdCntn {
    @EmbeddedId
    private PtBlbdCntnId id;

    @Column(name = "BBRD_TI", length = 250)
    private String bbrdTi;

    @Lob
    @Column(name = "BBRD_CNTN")
    private String bbrdCntn;

    @Column(name = "BLTN_ST_DTM", length = 14)
    private String bltnStDtm;

    @Column(name = "BLTN_ED_DTM", length = 14)
    private String bltnEdDtm;

    @Column(name = "CKNL_DSC", length = 1)
    private String cknlDsc;

    @Column(name = "BBRD_DEL_YN", length = 1)
    private String bbrdDelYn;

    @Column(name = "BBRD_INQ_CN")
    private Integer bbrdInqCn;

    @Column(name = "BBRD_RGM_NM", length = 100)
    private String bbrdRgmNm;

    @Column(name = "PRET_BBRD_ID", length = 14)
    private String pretBbrdId;

    @Column(name = "BBRD_PUP_ST_DT", length = 8)
    private String bbrdPupStDt;

    @Column(name = "BBRD_PUP_ED_DT", length = 8)
    private String bbrdPupEdDt;

    @Column(name = "BBRD_PUP_YN", length = 1)
    private String bbrdPupYn;

    @Column(name = "BBRD_PUP_SYS_FLNM", length = 256)
    private String bbrdPupSysFlnm;

    @Column(name = "BBRD_PUP_APDFLNM", length = 64)
    private String bbrdPupApdflnm;

    @Column(name = "FSRG_DTM")
    private LocalDate fsrgDtm;

    @Column(name = "FS_RGM", length = 16)
    private String fsRgm;

    @Column(name = "LSCHG_DTM")
    private LocalDate lschgDtm;

    @Column(name = "LS_CHGM", length = 16)
    private String lsChgm;

    @Column(name = "BBRD_CLOSED_YN", length = 1)
    private String bbrdClosedYn;

    @Column(name = "MOB_PUSH_YN", length = 1)
    private String mobPushYn;

    public PtBlbdCntnId getId() {
        return id;
    }

    public void setId(PtBlbdCntnId id) {
        this.id = id;
    }

    public String getBbrdTi() {
        return bbrdTi;
    }

    public void setBbrdTi(String bbrdTi) {
        this.bbrdTi = bbrdTi;
    }

    public String getBbrdCntn() {
        return bbrdCntn;
    }

    public void setBbrdCntn(String bbrdCntn) {
        this.bbrdCntn = bbrdCntn;
    }

    public String getBltnStDtm() {
        return bltnStDtm;
    }

    public void setBltnStDtm(String bltnStDtm) {
        this.bltnStDtm = bltnStDtm;
    }

    public String getBltnEdDtm() {
        return bltnEdDtm;
    }

    public void setBltnEdDtm(String bltnEdDtm) {
        this.bltnEdDtm = bltnEdDtm;
    }

    public String getCknlDsc() {
        return cknlDsc;
    }

    public void setCknlDsc(String cknlDsc) {
        this.cknlDsc = cknlDsc;
    }

    public String getBbrdDelYn() {
        return bbrdDelYn;
    }

    public void setBbrdDelYn(String bbrdDelYn) {
        this.bbrdDelYn = bbrdDelYn;
    }

    public Integer getBbrdInqCn() {
        return bbrdInqCn;
    }

    public void setBbrdInqCn(Integer bbrdInqCn) {
        this.bbrdInqCn = bbrdInqCn;
    }

    public String getBbrdRgmNm() {
        return bbrdRgmNm;
    }

    public void setBbrdRgmNm(String bbrdRgmNm) {
        this.bbrdRgmNm = bbrdRgmNm;
    }

    public String getPretBbrdId() {
        return pretBbrdId;
    }

    public void setPretBbrdId(String pretBbrdId) {
        this.pretBbrdId = pretBbrdId;
    }

    public String getBbrdPupStDt() {
        return bbrdPupStDt;
    }

    public void setBbrdPupStDt(String bbrdPupStDt) {
        this.bbrdPupStDt = bbrdPupStDt;
    }

    public String getBbrdPupEdDt() {
        return bbrdPupEdDt;
    }

    public void setBbrdPupEdDt(String bbrdPupEdDt) {
        this.bbrdPupEdDt = bbrdPupEdDt;
    }

    public String getBbrdPupYn() {
        return bbrdPupYn;
    }

    public void setBbrdPupYn(String bbrdPupYn) {
        this.bbrdPupYn = bbrdPupYn;
    }

    public String getBbrdPupSysFlnm() {
        return bbrdPupSysFlnm;
    }

    public void setBbrdPupSysFlnm(String bbrdPupSysFlnm) {
        this.bbrdPupSysFlnm = bbrdPupSysFlnm;
    }

    public String getBbrdPupApdflnm() {
        return bbrdPupApdflnm;
    }

    public void setBbrdPupApdflnm(String bbrdPupApdflnm) {
        this.bbrdPupApdflnm = bbrdPupApdflnm;
    }

    public LocalDate getFsrgDtm() {
        return fsrgDtm;
    }

    public void setFsrgDtm(LocalDate fsrgDtm) {
        this.fsrgDtm = fsrgDtm;
    }

    public String getFsRgm() {
        return fsRgm;
    }

    public void setFsRgm(String fsRgm) {
        this.fsRgm = fsRgm;
    }

    public LocalDate getLschgDtm() {
        return lschgDtm;
    }

    public void setLschgDtm(LocalDate lschgDtm) {
        this.lschgDtm = lschgDtm;
    }

    public String getLsChgm() {
        return lsChgm;
    }

    public void setLsChgm(String lsChgm) {
        this.lsChgm = lsChgm;
    }

    public String getBbrdClosedYn() {
        return bbrdClosedYn;
    }

    public void setBbrdClosedYn(String bbrdClosedYn) {
        this.bbrdClosedYn = bbrdClosedYn;
    }

    public String getMobPushYn() {
        return mobPushYn;
    }

    public void setMobPushYn(String mobPushYn) {
        this.mobPushYn = mobPushYn;
    }

}