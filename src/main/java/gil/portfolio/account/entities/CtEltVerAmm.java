package gil.portfolio.account.entities;

import jakarta.persistence.*;

import java.time.Instant;

//@Entity
//@Table(name = "ct_elt_ver_amm", schema = "escm", indexes = {
//        @Index(name = "IX_CT_ELT_VER_AMM_01", columnList = "MN_CTRW_KDC")
//})
public class CtEltVerAmm {
    @EmbeddedId
    private CtEltVerAmmId id;

    @Column(name = "USE_YN", nullable = false)
    private Character useYn;

    @Column(name = "CTRW_STY_FLNM", nullable = false, length = 256)
    private String ctrwStyFlnm;

    @Column(name = "CTRW_STY_DESC", length = 256)
    private String ctrwStyDesc;

    @Column(name = "ADD_CTRW_YN", nullable = false)
    private Character addCtrwYn;

    @Column(name = "PMIW_YN", nullable = false)
    private Character pmiwYn;

    @Column(name = "SCTRW_YN", nullable = false)
    private Character sctrwYn;

    @Column(name = "ETC_CTRW_YN", nullable = false)
    private Character etcCtrwYn;

    @Column(name = "CPMLEYN")
    private Character cpmleyn;

    @Column(name = "PTNTYPYN")
    private Character ptntypyn;

    @Column(name = "CHRRYN")
    private Character chrryn;

    @Column(name = "PASTDATEYN")
    private Character pastdateyn;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "FS_RGM", length = 9)
    private String fsRgm;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CHGM", length = 9)
    private String lsChgm;

    @Column(name = "CTRPRDAUTXTNYN")
    private Character ctrprdautxtnyn;

    @Column(name = "FILEDOWN_PRD", length = 4)
    private String filedownPrd;

    public CtEltVerAmmId getId() {
        return id;
    }

    public void setId(CtEltVerAmmId id) {
        this.id = id;
    }

    public Character getUseYn() {
        return useYn;
    }

    public void setUseYn(Character useYn) {
        this.useYn = useYn;
    }

    public String getCtrwStyFlnm() {
        return ctrwStyFlnm;
    }

    public void setCtrwStyFlnm(String ctrwStyFlnm) {
        this.ctrwStyFlnm = ctrwStyFlnm;
    }

    public String getCtrwStyDesc() {
        return ctrwStyDesc;
    }

    public void setCtrwStyDesc(String ctrwStyDesc) {
        this.ctrwStyDesc = ctrwStyDesc;
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

    public Character getCpmleyn() {
        return cpmleyn;
    }

    public void setCpmleyn(Character cpmleyn) {
        this.cpmleyn = cpmleyn;
    }

    public Character getPtntypyn() {
        return ptntypyn;
    }

    public void setPtntypyn(Character ptntypyn) {
        this.ptntypyn = ptntypyn;
    }

    public Character getChrryn() {
        return chrryn;
    }

    public void setChrryn(Character chrryn) {
        this.chrryn = chrryn;
    }

    public Character getPastdateyn() {
        return pastdateyn;
    }

    public void setPastdateyn(Character pastdateyn) {
        this.pastdateyn = pastdateyn;
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

    public Character getCtrprdautxtnyn() {
        return ctrprdautxtnyn;
    }

    public void setCtrprdautxtnyn(Character ctrprdautxtnyn) {
        this.ctrprdautxtnyn = ctrprdautxtnyn;
    }

    public String getFiledownPrd() {
        return filedownPrd;
    }

    public void setFiledownPrd(String filedownPrd) {
        this.filedownPrd = filedownPrd;
    }

}