package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

//@Entity
//@Table(name = "pt_pay_inf_hst", schema = "escm")
public class PtPayInfHst {
    @EmbeddedId
    private PtPayInfHstId id;

    @Column(name = "STL_METH_DSC", length = 1)
    private String stlMethDsc;

    @Column(name = "ENT_PRG_STSC", length = 1)
    private String entPrgStsc;

    @Column(name = "HOP_DRW_DD", length = 2)
    private String hopDrwDd;

    @Column(name = "DPRNM", length = 200)
    private String dprnm;

    @Column(name = "PSCRP_DSC", length = 1)
    private String pscrpDsc;

    @Column(name = "DPR_NO", length = 10)
    private String dprNo;

    @Column(name = "BNK_C", length = 4)
    private String bnkC;

    @Column(name = "ACNO", length = 64)
    private String acno;

    @Column(name = "BB_FLNM", length = 100)
    private String bbFlnm;

    @Column(name = "BB_FL_TMPNM", length = 50)
    private String bbFlTmpnm;

    @Column(name = "BZ_RGWRRT_FLNM", length = 100)
    private String bzRgwrrtFlnm;

    @Column(name = "BZ_RGWRRT_FL_TMPNM", length = 50)
    private String bzRgwrrtFlTmpnm;

    @Column(name = "FL_PATHNM", length = 256)
    private String flPathnm;

    @Column(name = "DRW_FTR_AGR_YN", length = 1)
    private String drwFtrAgrYn;

    @Column(name = "FNC_TR_INF_OFR_AGR_YN", length = 1)
    private String fncTrInfOfrAgrYn;

    @ColumnDefault("current_timestamp()")
    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "FS_RGM", length = 9)
    private String fsRgm;

    @ColumnDefault("current_timestamp()")
    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CHGM", length = 9)
    private String lsChgm;

    public PtPayInfHstId getId() {
        return id;
    }

    public void setId(PtPayInfHstId id) {
        this.id = id;
    }

    public String getStlMethDsc() {
        return stlMethDsc;
    }

    public void setStlMethDsc(String stlMethDsc) {
        this.stlMethDsc = stlMethDsc;
    }

    public String getEntPrgStsc() {
        return entPrgStsc;
    }

    public void setEntPrgStsc(String entPrgStsc) {
        this.entPrgStsc = entPrgStsc;
    }

    public String getHopDrwDd() {
        return hopDrwDd;
    }

    public void setHopDrwDd(String hopDrwDd) {
        this.hopDrwDd = hopDrwDd;
    }

    public String getDprnm() {
        return dprnm;
    }

    public void setDprnm(String dprnm) {
        this.dprnm = dprnm;
    }

    public String getPscrpDsc() {
        return pscrpDsc;
    }

    public void setPscrpDsc(String pscrpDsc) {
        this.pscrpDsc = pscrpDsc;
    }

    public String getDprNo() {
        return dprNo;
    }

    public void setDprNo(String dprNo) {
        this.dprNo = dprNo;
    }

    public String getBnkC() {
        return bnkC;
    }

    public void setBnkC(String bnkC) {
        this.bnkC = bnkC;
    }

    public String getAcno() {
        return acno;
    }

    public void setAcno(String acno) {
        this.acno = acno;
    }

    public String getBbFlnm() {
        return bbFlnm;
    }

    public void setBbFlnm(String bbFlnm) {
        this.bbFlnm = bbFlnm;
    }

    public String getBbFlTmpnm() {
        return bbFlTmpnm;
    }

    public void setBbFlTmpnm(String bbFlTmpnm) {
        this.bbFlTmpnm = bbFlTmpnm;
    }

    public String getBzRgwrrtFlnm() {
        return bzRgwrrtFlnm;
    }

    public void setBzRgwrrtFlnm(String bzRgwrrtFlnm) {
        this.bzRgwrrtFlnm = bzRgwrrtFlnm;
    }

    public String getBzRgwrrtFlTmpnm() {
        return bzRgwrrtFlTmpnm;
    }

    public void setBzRgwrrtFlTmpnm(String bzRgwrrtFlTmpnm) {
        this.bzRgwrrtFlTmpnm = bzRgwrrtFlTmpnm;
    }

    public String getFlPathnm() {
        return flPathnm;
    }

    public void setFlPathnm(String flPathnm) {
        this.flPathnm = flPathnm;
    }

    public String getDrwFtrAgrYn() {
        return drwFtrAgrYn;
    }

    public void setDrwFtrAgrYn(String drwFtrAgrYn) {
        this.drwFtrAgrYn = drwFtrAgrYn;
    }

    public String getFncTrInfOfrAgrYn() {
        return fncTrInfOfrAgrYn;
    }

    public void setFncTrInfOfrAgrYn(String fncTrInfOfrAgrYn) {
        this.fncTrInfOfrAgrYn = fncTrInfOfrAgrYn;
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