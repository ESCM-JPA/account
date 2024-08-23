package gil.portfolio.account.entities;

import jakarta.persistence.*;

import java.time.Instant;

//@Entity
//@Table(name = "mg_tpc_amn", schema = "escm", uniqueConstraints = {
//        @UniqueConstraint(name = "PK_MG_TPC_AMN", columnNames = {"SIMP_TPC"})
//})
public class MgTpcAmn {
    @Id
    @Column(name = "SIMP_TPC", nullable = false, length = 30)
    private String simpTpc;

    @Column(name = "SIMP_TPCNM", length = 150)
    private String simpTpcnm;

    @Column(name = "SYSNM", length = 150)
    private String sysnm;

    @Column(name = "SIMP_T_EXPL", length = 100)
    private String simpTExpl;

    @Column(name = "UYN")
    private Character uyn;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "FS_RGM", length = 16)
    private String fsRgm;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CHGM", length = 16)
    private String lsChgm;

    public String getSimpTpc() {
        return simpTpc;
    }

    public void setSimpTpc(String simpTpc) {
        this.simpTpc = simpTpc;
    }

    public String getSimpTpcnm() {
        return simpTpcnm;
    }

    public void setSimpTpcnm(String simpTpcnm) {
        this.simpTpcnm = simpTpcnm;
    }

    public String getSysnm() {
        return sysnm;
    }

    public void setSysnm(String sysnm) {
        this.sysnm = sysnm;
    }

    public String getSimpTExpl() {
        return simpTExpl;
    }

    public void setSimpTExpl(String simpTExpl) {
        this.simpTExpl = simpTExpl;
    }

    public Character getUyn() {
        return uyn;
    }

    public void setUyn(Character uyn) {
        this.uyn = uyn;
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