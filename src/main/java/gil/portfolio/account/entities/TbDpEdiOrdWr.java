package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.Instant;

//@Entity
//@Table(name = "tb_dp_edi_ord_wrs", schema = "escm")
public class TbDpEdiOrdWr {
    @EmbeddedId
    private TbDpEdiOrdWrId id;

    @Column(name = "WRS_NM", length = 200)
    private String wrsNm;

    @Column(name = "RMK_CNTN", length = 200)
    private String rmkCntn;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "FSRGMN_ENO", length = 9)
    private String fsrgmnEno;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CMENO", length = 9)
    private String lsCmeno;

    @Column(name = "DEL_YN")
    private Character delYn;

    public TbDpEdiOrdWrId getId() {
        return id;
    }

    public void setId(TbDpEdiOrdWrId id) {
        this.id = id;
    }

    public String getWrsNm() {
        return wrsNm;
    }

    public void setWrsNm(String wrsNm) {
        this.wrsNm = wrsNm;
    }

    public String getRmkCntn() {
        return rmkCntn;
    }

    public void setRmkCntn(String rmkCntn) {
        this.rmkCntn = rmkCntn;
    }

    public Instant getFsrgDtm() {
        return fsrgDtm;
    }

    public void setFsrgDtm(Instant fsrgDtm) {
        this.fsrgDtm = fsrgDtm;
    }

    public String getFsrgmnEno() {
        return fsrgmnEno;
    }

    public void setFsrgmnEno(String fsrgmnEno) {
        this.fsrgmnEno = fsrgmnEno;
    }

    public Instant getLschgDtm() {
        return lschgDtm;
    }

    public void setLschgDtm(Instant lschgDtm) {
        this.lschgDtm = lschgDtm;
    }

    public String getLsCmeno() {
        return lsCmeno;
    }

    public void setLsCmeno(String lsCmeno) {
        this.lsCmeno = lsCmeno;
    }

    public Character getDelYn() {
        return delYn;
    }

    public void setDelYn(Character delYn) {
        this.delYn = delYn;
    }

}