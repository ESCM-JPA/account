package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//@Entity
//@Table(name = "pt_ofanc_mst", schema = "escm")
public class PtOfancMst {
    @Id
    @Column(name = "BBRD_SQNO", nullable = false, length = 10)
    private String bbrdSqno;

    @Column(name = "BLTN_ST_DTM", length = 14)
    private String bltnStDtm;

    @Column(name = "BLTN_ED_DTM", length = 14)
    private String bltnEdDtm;

    @Column(name = "OFANC_TINM", length = 200)
    private String ofancTinm;

    @Column(name = "OFANC_CNTN", length = 4000)
    private String ofancCntn;

    @Column(name = "OFANC_PRU_NT")
    private Integer ofancPruNt;

    @Column(name = "BBRD_DEL_YN", length = 1)
    private String bbrdDelYn;

    @Column(name = "CKNL_DSC", length = 1)
    private String cknlDsc;

    @Column(name = "FSRGMN_BZPLC", length = 13)
    private String fsrgmnBzplc;

    @Column(name = "BBRD_PUP_ST_DT", length = 8)
    private String bbrdPupStDt;

    @Column(name = "BBRD_PUP_ED_DT", length = 8)
    private String bbrdPupEdDt;

    @Column(name = "BBRD_PUP_YN", length = 1)
    private String bbrdPupYn;

    @Column(name = "LS_CHGM", length = 9)
    private String lsChgm;

    @Column(name = "LSCHG_DTM", length = 14)
    private String lschgDtm;

    @Column(name = "FSRG_DTM", length = 14)
    private String fsrgDtm;

    @Column(name = "FS_RGM", length = 9)
    private String fsRgm;

    public String getBbrdSqno() {
        return bbrdSqno;
    }

    public void setBbrdSqno(String bbrdSqno) {
        this.bbrdSqno = bbrdSqno;
    }

    public String getBltnStDtm() {
        return bltnStDtm;
    }

    public void setBltnStDtm(String bltnStDtm) {
        this.bltnStDtm = bltnStDtm;
    }

    public String getBltnEdDtm() {
        return bltnEdDtm;
    }

    public void setBltnEdDtm(String bltnEdDtm) {
        this.bltnEdDtm = bltnEdDtm;
    }

    public String getOfancTinm() {
        return ofancTinm;
    }

    public void setOfancTinm(String ofancTinm) {
        this.ofancTinm = ofancTinm;
    }

    public String getOfancCntn() {
        return ofancCntn;
    }

    public void setOfancCntn(String ofancCntn) {
        this.ofancCntn = ofancCntn;
    }

    public Integer getOfancPruNt() {
        return ofancPruNt;
    }

    public void setOfancPruNt(Integer ofancPruNt) {
        this.ofancPruNt = ofancPruNt;
    }

    public String getBbrdDelYn() {
        return bbrdDelYn;
    }

    public void setBbrdDelYn(String bbrdDelYn) {
        this.bbrdDelYn = bbrdDelYn;
    }

    public String getCknlDsc() {
        return cknlDsc;
    }

    public void setCknlDsc(String cknlDsc) {
        this.cknlDsc = cknlDsc;
    }

    public String getFsrgmnBzplc() {
        return fsrgmnBzplc;
    }

    public void setFsrgmnBzplc(String fsrgmnBzplc) {
        this.fsrgmnBzplc = fsrgmnBzplc;
    }

    public String getBbrdPupStDt() {
        return bbrdPupStDt;
    }

    public void setBbrdPupStDt(String bbrdPupStDt) {
        this.bbrdPupStDt = bbrdPupStDt;
    }

    public String getBbrdPupEdDt() {
        return bbrdPupEdDt;
    }

    public void setBbrdPupEdDt(String bbrdPupEdDt) {
        this.bbrdPupEdDt = bbrdPupEdDt;
    }

    public String getBbrdPupYn() {
        return bbrdPupYn;
    }

    public void setBbrdPupYn(String bbrdPupYn) {
        this.bbrdPupYn = bbrdPupYn;
    }

    public String getLsChgm() {
        return lsChgm;
    }

    public void setLsChgm(String lsChgm) {
        this.lsChgm = lsChgm;
    }

    public String getLschgDtm() {
        return lschgDtm;
    }

    public void setLschgDtm(String lschgDtm) {
        this.lschgDtm = lschgDtm;
    }

    public String getFsrgDtm() {
        return fsrgDtm;
    }

    public void setFsrgDtm(String fsrgDtm) {
        this.fsrgDtm = fsrgDtm;
    }

    public String getFsRgm() {
        return fsRgm;
    }

    public void setFsRgm(String fsRgm) {
        this.fsRgm = fsRgm;
    }

}