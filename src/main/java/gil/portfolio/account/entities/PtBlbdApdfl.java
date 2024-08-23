package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.Instant;

//@Entity
//@Table(name = "pt_blbd_apdfl", schema = "escm")
public class PtBlbdApdfl {
    @EmbeddedId
    private PtBlbdApdflId id;

    @Column(name = "APDFLNM", length = 250)
    private String apdflnm;

    @Column(name = "APDFL_PATHNM", length = 250)
    private String apdflPathnm;

    @Column(name = "APDFL_SZE")
    private Integer apdflSze;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "FS_RGM", length = 9)
    private String fsRgm;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CHGM", length = 9)
    private String lsChgm;

    public PtBlbdApdflId getId() {
        return id;
    }

    public void setId(PtBlbdApdflId id) {
        this.id = id;
    }

    public String getApdflnm() {
        return apdflnm;
    }

    public void setApdflnm(String apdflnm) {
        this.apdflnm = apdflnm;
    }

    public String getApdflPathnm() {
        return apdflPathnm;
    }

    public void setApdflPathnm(String apdflPathnm) {
        this.apdflPathnm = apdflPathnm;
    }

    public Integer getApdflSze() {
        return apdflSze;
    }

    public void setApdflSze(Integer apdflSze) {
        this.apdflSze = apdflSze;
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