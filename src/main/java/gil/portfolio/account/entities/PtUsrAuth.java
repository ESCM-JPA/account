package gil.portfolio.account.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "pt_usr_auth", schema = "escm", uniqueConstraints = {
        @UniqueConstraint(name = "PK_PT_USR_AUTH", columnNames = {"MB_ID", "USR_AUTH_DSC"})
})
public class PtUsrAuth {
    @EmbeddedId
    private PtUsrAuthId id;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "FS_RGM", length = 9)
    private String fsRgm;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CHGM", length = 9)
    private String lsChgm;

    @ManyToOne
    @JoinColumn(name = "MB_ID", referencedColumnName = "MB_ID", insertable=false, updatable=false)
    private PtUsrInf ptUsrInf;

    public PtUsrAuthId getId() {
        return id;
    }

    public void setId(PtUsrAuthId id) {
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