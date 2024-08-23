package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.Instant;

//@Entity
//@Table(name = "ct_dcm_styl_amn", schema = "escm")
public class CtDcmStylAmn {
    @EmbeddedId
    private CtDcmStylAmnId id;

    @Column(name = "CTRW_PTN_TYP", length = 4)
    private String ctrwPtnTyp;

    @Column(name = "DCM_C", length = 4)
    private String dcmC;

    @Column(name = "DCM_NM", length = 64)
    private String dcmNm;

    @Column(name = "ESS_YN", length = 1)
    private String essYn;

    @Column(name = "RMK", length = 2048)
    private String rmk;

    @Column(name = "STS", length = 1)
    private String sts;

    @Column(name = "UPLOADER_TYP", length = 1)
    private String uploaderTyp;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "FS_RGM", length = 9)
    private String fsRgm;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CHGM", length = 9)
    private String lsChgm;

    public CtDcmStylAmnId getId() {
        return id;
    }

    public void setId(CtDcmStylAmnId id) {
        this.id = id;
    }

    public String getCtrwPtnTyp() {
        return ctrwPtnTyp;
    }

    public void setCtrwPtnTyp(String ctrwPtnTyp) {
        this.ctrwPtnTyp = ctrwPtnTyp;
    }

    public String getDcmC() {
        return dcmC;
    }

    public void setDcmC(String dcmC) {
        this.dcmC = dcmC;
    }

    public String getDcmNm() {
        return dcmNm;
    }

    public void setDcmNm(String dcmNm) {
        this.dcmNm = dcmNm;
    }

    public String getEssYn() {
        return essYn;
    }

    public void setEssYn(String essYn) {
        this.essYn = essYn;
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

    public String getUploaderTyp() {
        return uploaderTyp;
    }

    public void setUploaderTyp(String uploaderTyp) {
        this.uploaderTyp = uploaderTyp;
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