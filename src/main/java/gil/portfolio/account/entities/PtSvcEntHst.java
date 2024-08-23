package gil.portfolio.account.entities;

import jakarta.persistence.*;

import java.time.Instant;

//@Entity
//@Table(name = "pt_svc_ent_hst", schema = "escm", uniqueConstraints = {
//        @UniqueConstraint(name = "PK_PT_SVC_ENT_HST", columnNames = {"NA_TRPL_C", "SVC_ENT_DTM", "SVC_ID"})
//})
public class PtSvcEntHst {
    @EmbeddedId
    private PtSvcEntHstId id;

    @Column(name = "RQ_DSC", length = 1)
    private String rqDsc;

    @Column(name = "ENT_PRG_STSC", length = 1)
    private String entPrgStsc;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "FS_RGM", length = 9)
    private String fsRgm;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CHGM", length = 9)
    private String lsChgm;

    public PtSvcEntHstId getId() {
        return id;
    }

    public void setId(PtSvcEntHstId id) {
        this.id = id;
    }

    public String getRqDsc() {
        return rqDsc;
    }

    public void setRqDsc(String rqDsc) {
        this.rqDsc = rqDsc;
    }

    public String getEntPrgStsc() {
        return entPrgStsc;
    }

    public void setEntPrgStsc(String entPrgStsc) {
        this.entPrgStsc = entPrgStsc;
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