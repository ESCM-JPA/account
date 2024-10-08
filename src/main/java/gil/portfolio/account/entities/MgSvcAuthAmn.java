package gil.portfolio.account.entities;

import jakarta.persistence.*;

import java.time.Instant;

//@Entity
//@Table(name = "mg_svc_auth_amn", schema = "escm", indexes = {
//        @Index(name = "IDX_MG_SVC_AUTH_AMN_1", columnList = "MENU_ID")
//})
public class MgSvcAuthAmn {
    @EmbeddedId
    private MgSvcAuthAmnId id;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "FS_RGM", length = 16)
    private String fsRgm;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CHGM", length = 16)
    private String lsChgm;

    public MgSvcAuthAmnId getId() {
        return id;
    }

    public void setId(MgSvcAuthAmnId id) {
        this.id = id;
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