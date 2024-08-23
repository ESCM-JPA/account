package gil.portfolio.account.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

//@Entity
//@Table(name = "pt_pay_inf_elsg", schema = "escm")
public class PtPayInfElsg {
    @EmbeddedId
    private PtPayInfElsgId id;

    @Lob
    @Column(name = "ELSG_CNTN")
    private String elsgCntn;

    @ColumnDefault("'0'")
    @Column(name = "ENT_PRG_STSC", length = 1)
    private String entPrgStsc;

    @Column(name = "MB_ID", length = 9)
    private String mbId;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "FS_RGM", length = 9)
    private String fsRgm;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CHGM", length = 9)
    private String lsChgm;

    public PtPayInfElsgId getId() {
        return id;
    }

    public void setId(PtPayInfElsgId id) {
        this.id = id;
    }

    public String getElsgCntn() {
        return elsgCntn;
    }

    public void setElsgCntn(String elsgCntn) {
        this.elsgCntn = elsgCntn;
    }

    public String getEntPrgStsc() {
        return entPrgStsc;
    }

    public void setEntPrgStsc(String entPrgStsc) {
        this.entPrgStsc = entPrgStsc;
    }

    public String getMbId() {
        return mbId;
    }

    public void setMbId(String mbId) {
        this.mbId = mbId;
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