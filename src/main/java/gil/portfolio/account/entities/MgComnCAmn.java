package gil.portfolio.account.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

//@Entity
//@Table(name = "mg_comn_c_amn", schema = "escm", uniqueConstraints = {
//        @UniqueConstraint(name = "PK_MG_COMN_C_AMN", columnNames = {"SIMP_TPC", "SIMP_C"})
//})
public class MgComnCAmn {
    @EmbeddedId
    private MgComnCAmnId id;

    @Column(name = "SIMP_CNM", length = 150)
    private String simpCnm;

    @Column(name = "SIMP_C_EXPL", length = 100)
    private String simpCExpl;

    @Column(name = "SIMP_C_SORT_SQ")
    private Long simpCSortSq;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "FS_RGM", length = 16)
    private String fsRgm;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CHGM", length = 16)
    private String lsChgm;

    @ColumnDefault("'Y'")
    @Column(name = "UYN")
    private Character uyn;

    public MgComnCAmnId getId() {
        return id;
    }

    public void setId(MgComnCAmnId id) {
        this.id = id;
    }

    public String getSimpCnm() {
        return simpCnm;
    }

    public void setSimpCnm(String simpCnm) {
        this.simpCnm = simpCnm;
    }

    public String getSimpCExpl() {
        return simpCExpl;
    }

    public void setSimpCExpl(String simpCExpl) {
        this.simpCExpl = simpCExpl;
    }

    public Long getSimpCSortSq() {
        return simpCSortSq;
    }

    public void setSimpCSortSq(Long simpCSortSq) {
        this.simpCSortSq = simpCSortSq;
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

    public Character getUyn() {
        return uyn;
    }

    public void setUyn(Character uyn) {
        this.uyn = uyn;
    }

}