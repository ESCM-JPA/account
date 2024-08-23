package gil.portfolio.account.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

//@Entity
//@Table(name = "tb_cm_bzpl", schema = "escm", indexes = {
//        @Index(name = "IDX_CM_BZPL_01", columnList = "NA_BZPLC, BZPL_TPC"),
//        @Index(name = "IDX_CM_BZPL_02", columnList = "BZPL_TPC, NA_BZPLC")
//})
public class TbCmBzpl {
    @Id
    @Column(name = "NA_BZPLC", nullable = false, length = 13)
    private String naBzplc;

    @Column(name = "NA_BZ_TPC", length = 2)
    private String naBzTpc;

    @Column(name = "BZPL_TPC", nullable = false, length = 3)
    private String bzplTpc;

    @Column(name = "BZPL_DTI_TPC", length = 3)
    private String bzplDtiTpc;

    @Column(name = "SHRT_BZPLNM", length = 50)
    private String shrtBzplnm;

    @Column(name = "PRGR_DSC")
    private Character prgrDsc;

    @Column(name = "DSTR_BSN_DSC", length = 2)
    private String dstrBsnDsc;

    @Column(name = "DEL_DTM")
    private LocalDate delDtm;

    @Column(name = "AMN_NA_BZPLC", length = 13)
    private String amnNaBzplc;

    @Column(name = "PHDCT_UZ_DSC")
    private Character phdctUzDsc;

    @Column(name = "REP_NA_BZPLC", length = 13)
    private String repNaBzplc;

    public String getNaBzplc() {
        return naBzplc;
    }

    public void setNaBzplc(String naBzplc) {
        this.naBzplc = naBzplc;
    }

    public String getNaBzTpc() {
        return naBzTpc;
    }

    public void setNaBzTpc(String naBzTpc) {
        this.naBzTpc = naBzTpc;
    }

    public String getBzplTpc() {
        return bzplTpc;
    }

    public void setBzplTpc(String bzplTpc) {
        this.bzplTpc = bzplTpc;
    }

    public String getBzplDtiTpc() {
        return bzplDtiTpc;
    }

    public void setBzplDtiTpc(String bzplDtiTpc) {
        this.bzplDtiTpc = bzplDtiTpc;
    }

    public String getShrtBzplnm() {
        return shrtBzplnm;
    }

    public void setShrtBzplnm(String shrtBzplnm) {
        this.shrtBzplnm = shrtBzplnm;
    }

    public Character getPrgrDsc() {
        return prgrDsc;
    }

    public void setPrgrDsc(Character prgrDsc) {
        this.prgrDsc = prgrDsc;
    }

    public String getDstrBsnDsc() {
        return dstrBsnDsc;
    }

    public void setDstrBsnDsc(String dstrBsnDsc) {
        this.dstrBsnDsc = dstrBsnDsc;
    }

    public LocalDate getDelDtm() {
        return delDtm;
    }

    public void setDelDtm(LocalDate delDtm) {
        this.delDtm = delDtm;
    }

    public String getAmnNaBzplc() {
        return amnNaBzplc;
    }

    public void setAmnNaBzplc(String amnNaBzplc) {
        this.amnNaBzplc = amnNaBzplc;
    }

    public Character getPhdctUzDsc() {
        return phdctUzDsc;
    }

    public void setPhdctUzDsc(Character phdctUzDsc) {
        this.phdctUzDsc = phdctUzDsc;
    }

    public String getRepNaBzplc() {
        return repNaBzplc;
    }

    public void setRepNaBzplc(String repNaBzplc) {
        this.repNaBzplc = repNaBzplc;
    }

}