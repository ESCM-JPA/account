package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.Instant;

//@Entity
//@Table(name = "tb_tr_trpl_prgr", schema = "escm")
public class TbTrTrplPrgr {
    @EmbeddedId
    private TbTrTrplPrgrId id;

    @Column(name = "PRGR_C", length = 4)
    private String prgrC;

    @Column(name = "JURD_PHDCT_NA_TRPL_C", length = 13)
    private String jurdPhdctNaTrplC;

    @Column(name = "ROTS_FLEX_PR_APL_YN")
    private Character rotsFlexPrAplYn;

    @Column(name = "ETMTR_BZ_YN")
    private Character etmtrBzYn;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "FSRGMN_ENO", length = 9)
    private String fsrgmnEno;

    @Column(name = "FSRGMN_NA_BZPLC", length = 13)
    private String fsrgmnNaBzplc;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CMENO", length = 9)
    private String lsCmeno;

    @Column(name = "LSCGMN_NA_BZPLC", length = 13)
    private String lscgmnNaBzplc;

    @Column(name = "DEL_DTM")
    private Instant delDtm;

    @Column(name = "DLMN_ENO", length = 9)
    private String dlmnEno;

    @Column(name = "DLMN_NA_BZPLC", length = 13)
    private String dlmnNaBzplc;

    @Column(name = "BYNG_UPR_MOD_YN")
    private Character byngUprModYn;

    @Column(name = "NODR_BYNG_PSB_YN")
    private Character nodrByngPsbYn;

    @Column(name = "GRS_SOJU_X_YN")
    private Character grsSojuXYn;

    @Column(name = "SELPR_INTG_AMN_YN")
    private Character selprIntgAmnYn;

    @Column(name = "SELPR_INTG_LSCHG_DTM")
    private Instant selprIntgLschgDtm;

    @Column(name = "SELPR_INTG_LS_CMENO", length = 9)
    private String selprIntgLsCmeno;

    @Column(name = "SELPR_INTG_LSCGMN_NA_BZPLC", length = 13)
    private String selprIntgLscgmnNaBzplc;

    @Column(name = "LIQ_INF_US_CNCL_DSC")
    private Character liqInfUsCnclDsc;

    @Column(name = "BEAR_TRT_C", length = 2)
    private String bearTrtC;

    @Column(name = "SOJU_TRT_C", length = 2)
    private String sojuTrtC;

    @Column(name = "YANGJU_TRT_C", length = 2)
    private String yangjuTrtC;

    @Column(name = "WINE_TRT_C", length = 2)
    private String wineTrtC;

    @Column(name = "MINSOK_TRT_C", length = 2)
    private String minsokTrtC;

    @Column(name = "ROGO_INTG_AMN_R1_YN")
    private Character rogoIntgAmnR1Yn;

    @Column(name = "ROGO_INTG_AMN_R2_YN")
    private Character rogoIntgAmnR2Yn;

    @Column(name = "SCTR_BYNG_AMN_YN")
    private Character sctrByngAmnYn;

    public TbTrTrplPrgrId getId() {
        return id;
    }

    public void setId(TbTrTrplPrgrId id) {
        this.id = id;
    }

    public String getPrgrC() {
        return prgrC;
    }

    public void setPrgrC(String prgrC) {
        this.prgrC = prgrC;
    }

    public String getJurdPhdctNaTrplC() {
        return jurdPhdctNaTrplC;
    }

    public void setJurdPhdctNaTrplC(String jurdPhdctNaTrplC) {
        this.jurdPhdctNaTrplC = jurdPhdctNaTrplC;
    }

    public Character getRotsFlexPrAplYn() {
        return rotsFlexPrAplYn;
    }

    public void setRotsFlexPrAplYn(Character rotsFlexPrAplYn) {
        this.rotsFlexPrAplYn = rotsFlexPrAplYn;
    }

    public Character getEtmtrBzYn() {
        return etmtrBzYn;
    }

    public void setEtmtrBzYn(Character etmtrBzYn) {
        this.etmtrBzYn = etmtrBzYn;
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

    public String getFsrgmnNaBzplc() {
        return fsrgmnNaBzplc;
    }

    public void setFsrgmnNaBzplc(String fsrgmnNaBzplc) {
        this.fsrgmnNaBzplc = fsrgmnNaBzplc;
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

    public String getLscgmnNaBzplc() {
        return lscgmnNaBzplc;
    }

    public void setLscgmnNaBzplc(String lscgmnNaBzplc) {
        this.lscgmnNaBzplc = lscgmnNaBzplc;
    }

    public Instant getDelDtm() {
        return delDtm;
    }

    public void setDelDtm(Instant delDtm) {
        this.delDtm = delDtm;
    }

    public String getDlmnEno() {
        return dlmnEno;
    }

    public void setDlmnEno(String dlmnEno) {
        this.dlmnEno = dlmnEno;
    }

    public String getDlmnNaBzplc() {
        return dlmnNaBzplc;
    }

    public void setDlmnNaBzplc(String dlmnNaBzplc) {
        this.dlmnNaBzplc = dlmnNaBzplc;
    }

    public Character getByngUprModYn() {
        return byngUprModYn;
    }

    public void setByngUprModYn(Character byngUprModYn) {
        this.byngUprModYn = byngUprModYn;
    }

    public Character getNodrByngPsbYn() {
        return nodrByngPsbYn;
    }

    public void setNodrByngPsbYn(Character nodrByngPsbYn) {
        this.nodrByngPsbYn = nodrByngPsbYn;
    }

    public Character getGrsSojuXYn() {
        return grsSojuXYn;
    }

    public void setGrsSojuXYn(Character grsSojuXYn) {
        this.grsSojuXYn = grsSojuXYn;
    }

    public Character getSelprIntgAmnYn() {
        return selprIntgAmnYn;
    }

    public void setSelprIntgAmnYn(Character selprIntgAmnYn) {
        this.selprIntgAmnYn = selprIntgAmnYn;
    }

    public Instant getSelprIntgLschgDtm() {
        return selprIntgLschgDtm;
    }

    public void setSelprIntgLschgDtm(Instant selprIntgLschgDtm) {
        this.selprIntgLschgDtm = selprIntgLschgDtm;
    }

    public String getSelprIntgLsCmeno() {
        return selprIntgLsCmeno;
    }

    public void setSelprIntgLsCmeno(String selprIntgLsCmeno) {
        this.selprIntgLsCmeno = selprIntgLsCmeno;
    }

    public String getSelprIntgLscgmnNaBzplc() {
        return selprIntgLscgmnNaBzplc;
    }

    public void setSelprIntgLscgmnNaBzplc(String selprIntgLscgmnNaBzplc) {
        this.selprIntgLscgmnNaBzplc = selprIntgLscgmnNaBzplc;
    }

    public Character getLiqInfUsCnclDsc() {
        return liqInfUsCnclDsc;
    }

    public void setLiqInfUsCnclDsc(Character liqInfUsCnclDsc) {
        this.liqInfUsCnclDsc = liqInfUsCnclDsc;
    }

    public String getBearTrtC() {
        return bearTrtC;
    }

    public void setBearTrtC(String bearTrtC) {
        this.bearTrtC = bearTrtC;
    }

    public String getSojuTrtC() {
        return sojuTrtC;
    }

    public void setSojuTrtC(String sojuTrtC) {
        this.sojuTrtC = sojuTrtC;
    }

    public String getYangjuTrtC() {
        return yangjuTrtC;
    }

    public void setYangjuTrtC(String yangjuTrtC) {
        this.yangjuTrtC = yangjuTrtC;
    }

    public String getWineTrtC() {
        return wineTrtC;
    }

    public void setWineTrtC(String wineTrtC) {
        this.wineTrtC = wineTrtC;
    }

    public String getMinsokTrtC() {
        return minsokTrtC;
    }

    public void setMinsokTrtC(String minsokTrtC) {
        this.minsokTrtC = minsokTrtC;
    }

    public Character getRogoIntgAmnR1Yn() {
        return rogoIntgAmnR1Yn;
    }

    public void setRogoIntgAmnR1Yn(Character rogoIntgAmnR1Yn) {
        this.rogoIntgAmnR1Yn = rogoIntgAmnR1Yn;
    }

    public Character getRogoIntgAmnR2Yn() {
        return rogoIntgAmnR2Yn;
    }

    public void setRogoIntgAmnR2Yn(Character rogoIntgAmnR2Yn) {
        this.rogoIntgAmnR2Yn = rogoIntgAmnR2Yn;
    }

    public Character getSctrByngAmnYn() {
        return sctrByngAmnYn;
    }

    public void setSctrByngAmnYn(Character sctrByngAmnYn) {
        this.sctrByngAmnYn = sctrByngAmnYn;
    }

}