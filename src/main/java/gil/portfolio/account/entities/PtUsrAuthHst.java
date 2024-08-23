package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "pt_usr_auth_hst", schema = "escm")
public class PtUsrAuthHst {
    @EmbeddedId
    private PtUsrAuthHstId id;

    @Column(name = "RQ_DSC", length = 1)
    private String rqDsc;

    @Column(name = "ENT_PRG_STSC", length = 1)
    private String entPrgStsc;

    @Column(name = "NA_TRPL_C", length = 13)
    private String naTrplC;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "FS_RGM", length = 9)
    private String fsRgm;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CHGM", length = 9)
    private String lsChgm;

    public PtUsrAuthHstId getId() {
        return id;
    }

    public void setId(PtUsrAuthHstId id) {
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

    public String getNaTrplC() {
        return naTrplC;
    }

    public void setNaTrplC(String naTrplC) {
        this.naTrplC = naTrplC;
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