package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

//@Entity
//@Table(name = "tb_pd_md_usr_inf", schema = "escm")
public class TbPdMdUsrInf {
    @Id
    @Column(name = "MD_ID", nullable = false, length = 9)
    private String mdId;

    @Column(name = "MD_IMEI_NO", length = 30)
    private String mdImeiNo;

    @Column(name = "MD_UUID_NO", length = 200)
    private String mdUuidNo;

    @ColumnDefault("'Y'")
    @Column(name = "MD_PUSH_AP")
    private Character mdPushAp;

    @Column(name = "MD_MNGR_CD")
    private Character mdMngrCd;

    @Column(name = "MD_CHGR_CD")
    private Character mdChgrCd;

    @Column(name = "MD_USE_CD")
    private Character mdUseCd;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "FS_RGM", length = 9)
    private String fsRgm;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CHGM", length = 9)
    private String lsChgm;

    public String getMdId() {
        return mdId;
    }

    public void setMdId(String mdId) {
        this.mdId = mdId;
    }

    public String getMdImeiNo() {
        return mdImeiNo;
    }

    public void setMdImeiNo(String mdImeiNo) {
        this.mdImeiNo = mdImeiNo;
    }

    public String getMdUuidNo() {
        return mdUuidNo;
    }

    public void setMdUuidNo(String mdUuidNo) {
        this.mdUuidNo = mdUuidNo;
    }

    public Character getMdPushAp() {
        return mdPushAp;
    }

    public void setMdPushAp(Character mdPushAp) {
        this.mdPushAp = mdPushAp;
    }

    public Character getMdMngrCd() {
        return mdMngrCd;
    }

    public void setMdMngrCd(Character mdMngrCd) {
        this.mdMngrCd = mdMngrCd;
    }

    public Character getMdChgrCd() {
        return mdChgrCd;
    }

    public void setMdChgrCd(Character mdChgrCd) {
        this.mdChgrCd = mdChgrCd;
    }

    public Character getMdUseCd() {
        return mdUseCd;
    }

    public void setMdUseCd(Character mdUseCd) {
        this.mdUseCd = mdUseCd;
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

}