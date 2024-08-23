package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;

//@Entity
//@Table(name = "pt_pay_inf", schema = "escm")
public class PtPayInf {
    @Id
    @Column(name = "NA_TRPL_C", nullable = false, length = 13)
    private String naTrplC;

    @Column(name = "STL_METH_DSC")
    private Character stlMethDsc;

    @Column(name = "HOP_DRW_DD", length = 2)
    private String hopDrwDd;

    @Column(name = "DPRNM", length = 200)
    private String dprnm;

    @Column(name = "PSCRP_DSC")
    private Character pscrpDsc;

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

    @Column(name = "DRW_FTR_AGR_YN")
    private Character drwFtrAgrYn;

    @Column(name = "FNC_TR_INF_OFR_AGR_YN")
    private Character fncTrInfOfrAgrYn;

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

    public Character getStlMethDsc() {
        return stlMethDsc;
    }

    public void setStlMethDsc(Character stlMethDsc) {
        this.stlMethDsc = stlMethDsc;
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

    public Character getPscrpDsc() {
        return pscrpDsc;
    }

    public void setPscrpDsc(Character pscrpDsc) {
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

    public Character getDrwFtrAgrYn() {
        return drwFtrAgrYn;
    }

    public void setDrwFtrAgrYn(Character drwFtrAgrYn) {
        this.drwFtrAgrYn = drwFtrAgrYn;
    }

    public Character getFncTrInfOfrAgrYn() {
        return fncTrInfOfrAgrYn;
    }

    public void setFncTrInfOfrAgrYn(Character fncTrInfOfrAgrYn) {
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