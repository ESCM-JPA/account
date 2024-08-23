package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;

//@Entity
//@Table(name = "bl_comp_svc_amn", schema = "escm")
public class BlCompSvcAmn {
    @Id
    @Column(name = "NA_TRPL_C", nullable = false, length = 13)
    private String naTrplC;

    @Column(name = "SVC_STSC")
    private Character svcStsc;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "FS_RGM", length = 9)
    private String fsRgm;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CHGM", length = 9)
    private String lsChgm;

    public String getNaTrplC() {
        return naTrplC;
    }

    public void setNaTrplC(String naTrplC) {
        this.naTrplC = naTrplC;
    }

    public Character getSvcStsc() {
        return svcStsc;
    }

    public void setSvcStsc(Character svcStsc) {
        this.svcStsc = svcStsc;
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