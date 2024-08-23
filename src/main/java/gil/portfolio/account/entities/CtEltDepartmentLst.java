package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;

//@Entity
//@Table(name = "ct_elt_department_lst", schema = "escm")
public class CtEltDepartmentLst {
    @Id
    @Column(name = "NA_TRPL_C", nullable = false, length = 13)
    private String naTrplC;

    @Column(name = "CLNTNM", length = 200)
    private String clntnm;

    @Column(name = "ELT_DEPT_DSC")
    private Character eltDeptDsc;

    @Column(name = "USR_TPC", length = 2)
    private String usrTpc;

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

    public String getClntnm() {
        return clntnm;
    }

    public void setClntnm(String clntnm) {
        this.clntnm = clntnm;
    }

    public Character getEltDeptDsc() {
        return eltDeptDsc;
    }

    public void setEltDeptDsc(Character eltDeptDsc) {
        this.eltDeptDsc = eltDeptDsc;
    }

    public String getUsrTpc() {
        return usrTpc;
    }

    public void setUsrTpc(String usrTpc) {
        this.usrTpc = usrTpc;
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