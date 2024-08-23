package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.Instant;

//@Entity
//@Table(name = "tb_od_trtwrs", schema = "escm")
public class TbOdTrtwr {
    @EmbeddedId
    private TbOdTrtwrId id;

    @Column(name = "WRSNM", length = 100)
    private String wrsnm;

    @Column(name = "WRS_ABR_NM", length = 100)
    private String wrsAbrNm;

    @Column(name = "NA_WRS_LCLC", length = 3)
    private String naWrsLclc;

    @Column(name = "NA_WRS_MCLC", length = 3)
    private String naWrsMclc;

    @Column(name = "NA_WRS_SCLC", length = 3)
    private String naWrsSclc;

    @Column(name = "NA_WRS_DTCF_C", length = 3)
    private String naWrsDtcfC;

    @Column(name = "SL_UPR_TPC", length = 2)
    private String slUprTpc;

    @Column(name = "INPD_QT", precision = 18, scale = 3)
    private BigDecimal inpdQt;

    @Column(name = "MIN_ODR_QT", precision = 18, scale = 3)
    private BigDecimal minOdrQt;

    @Column(name = "MAX_ODR_QT", precision = 18, scale = 3)
    private BigDecimal maxOdrQt;

    @Column(name = "BYNG_UPR", precision = 18, scale = 3)
    private BigDecimal byngUpr;

    @Column(name = "SL_UPR", precision = 18, scale = 3)
    private BigDecimal slUpr;

    @Column(name = "VCBT_NA_WRS_C", length = 25)
    private String vcbtNaWrsC;

    @Column(name = "VCBT_UPR", precision = 18, scale = 3)
    private BigDecimal vcbtUpr;

    @Column(name = "VCBX_NA_WRS_C", length = 25)
    private String vcbxNaWrsC;

    @Column(name = "VCBX_UPR", precision = 7)
    private BigDecimal vcbxUpr;

    @Column(name = "SPYPL_NA_TRPL_C", length = 13)
    private String spyplNaTrplC;

    @Column(name = "SPYPL_NA_TEAM_C", length = 2)
    private String spyplNaTeamC;

    @Column(name = "CTR_TPC")
    private Character ctrTpc;

    @Column(name = "SPY_TPC", length = 2)
    private String spyTpc;

    @Column(name = "TXT_DSC")
    private Character txtDsc;

    @Column(name = "RVO_PSB_YN")
    private Character rvoPsbYn;

    @Column(name = "ODR_PSB_YN")
    private Character odrPsbYn;

    @Column(name = "DDLY_YN")
    private Character ddlyYn;

    @Column(name = "STPL_PD_VIAPD_DSC")
    private Character stplPdViapdDsc;

    @Column(name = "STPL_PD_GRD_DSC")
    private Character stplPdGrdDsc;

    @Column(name = "VIAPD_YN")
    private Character viapdYn;

    @Column(name = "SVS_YN")
    private Character svsYn;

    @Column(name = "SVS_UNT_QT")
    private Integer svsUntQt;

    @Column(name = "BOX_BULK", precision = 15, scale = 3)
    private BigDecimal boxBulk;

    @Column(name = "WRS_WDTH_LEN", precision = 12, scale = 2)
    private BigDecimal wrsWdthLen;

    @Column(name = "WRS_LEN_LEN", precision = 12, scale = 2)
    private BigDecimal wrsLenLen;

    @Column(name = "BOX_WRS_YN")
    private Character boxWrsYn;

    @Column(name = "DDLY_ST_DT", length = 8)
    private String ddlyStDt;

    @Column(name = "DDLY_ED_DT", length = 8)
    private String ddlyEdDt;

    @Column(name = "DDLY_BAS_QT", precision = 18, scale = 3)
    private BigDecimal ddlyBasQt;

    @Column(name = "MART_DIV_BKG_ODR_YN")
    private Character martDivBkgOdrYn;

    @Column(name = "SRA_WRS_DSC", length = 2)
    private String sraWrsDsc;

    @Column(name = "STPL_AMN_WRS_YN")
    private Character stplAmnWrsYn;

    @Column(name = "STPL_NA_WRS_C", length = 25)
    private String stplNaWrsC;

    @Column(name = "STPL_AMN_DSC")
    private Character stplAmnDsc;

    @Column(name = "PD_YY_AMN_YN")
    private Character pdYyAmnYn;

    @Column(name = "NA_ODR_FBID_RSNC", length = 2)
    private String naOdrFbidRsnc;

    @Column(name = "NA_RVO_FBID_RSNC", length = 2)
    private String naRvoFbidRsnc;

    @Column(name = "BOXPE_AQZ")
    private Integer boxpeAqz;

    @Column(name = "NA_USR_SYS_KDC", length = 2)
    private String naUsrSysKdc;

    @Column(name = "PHD_FCLT_C", length = 2)
    private String phdFcltC;

    @Column(name = "PPZ_ORR_DSC")
    private Character ppzOrrDsc;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "FSRGMN_ENO", length = 9)
    private String fsrgmnEno;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CMENO", length = 9)
    private String lsCmeno;

    @Column(name = "DEL_DTM")
    private Instant delDtm;

    @Column(name = "STCAST_DSC", length = 2)
    private String stcastDsc;

    @Column(name = "ABC_GRD_DSC")
    private Character abcGrdDsc;

    @Column(name = "PLTT_LOAD_C", length = 20)
    private String plttLoadC;

    public TbOdTrtwrId getId() {
        return id;
    }

    public void setId(TbOdTrtwrId id) {
        this.id = id;
    }

    public String getWrsnm() {
        return wrsnm;
    }

    public void setWrsnm(String wrsnm) {
        this.wrsnm = wrsnm;
    }

    public String getWrsAbrNm() {
        return wrsAbrNm;
    }

    public void setWrsAbrNm(String wrsAbrNm) {
        this.wrsAbrNm = wrsAbrNm;
    }

    public String getNaWrsLclc() {
        return naWrsLclc;
    }

    public void setNaWrsLclc(String naWrsLclc) {
        this.naWrsLclc = naWrsLclc;
    }

    public String getNaWrsMclc() {
        return naWrsMclc;
    }

    public void setNaWrsMclc(String naWrsMclc) {
        this.naWrsMclc = naWrsMclc;
    }

    public String getNaWrsSclc() {
        return naWrsSclc;
    }

    public void setNaWrsSclc(String naWrsSclc) {
        this.naWrsSclc = naWrsSclc;
    }

    public String getNaWrsDtcfC() {
        return naWrsDtcfC;
    }

    public void setNaWrsDtcfC(String naWrsDtcfC) {
        this.naWrsDtcfC = naWrsDtcfC;
    }

    public String getSlUprTpc() {
        return slUprTpc;
    }

    public void setSlUprTpc(String slUprTpc) {
        this.slUprTpc = slUprTpc;
    }

    public BigDecimal getInpdQt() {
        return inpdQt;
    }

    public void setInpdQt(BigDecimal inpdQt) {
        this.inpdQt = inpdQt;
    }

    public BigDecimal getMinOdrQt() {
        return minOdrQt;
    }

    public void setMinOdrQt(BigDecimal minOdrQt) {
        this.minOdrQt = minOdrQt;
    }

    public BigDecimal getMaxOdrQt() {
        return maxOdrQt;
    }

    public void setMaxOdrQt(BigDecimal maxOdrQt) {
        this.maxOdrQt = maxOdrQt;
    }

    public BigDecimal getByngUpr() {
        return byngUpr;
    }

    public void setByngUpr(BigDecimal byngUpr) {
        this.byngUpr = byngUpr;
    }

    public BigDecimal getSlUpr() {
        return slUpr;
    }

    public void setSlUpr(BigDecimal slUpr) {
        this.slUpr = slUpr;
    }

    public String getVcbtNaWrsC() {
        return vcbtNaWrsC;
    }

    public void setVcbtNaWrsC(String vcbtNaWrsC) {
        this.vcbtNaWrsC = vcbtNaWrsC;
    }

    public BigDecimal getVcbtUpr() {
        return vcbtUpr;
    }

    public void setVcbtUpr(BigDecimal vcbtUpr) {
        this.vcbtUpr = vcbtUpr;
    }

    public String getVcbxNaWrsC() {
        return vcbxNaWrsC;
    }

    public void setVcbxNaWrsC(String vcbxNaWrsC) {
        this.vcbxNaWrsC = vcbxNaWrsC;
    }

    public BigDecimal getVcbxUpr() {
        return vcbxUpr;
    }

    public void setVcbxUpr(BigDecimal vcbxUpr) {
        this.vcbxUpr = vcbxUpr;
    }

    public String getSpyplNaTrplC() {
        return spyplNaTrplC;
    }

    public void setSpyplNaTrplC(String spyplNaTrplC) {
        this.spyplNaTrplC = spyplNaTrplC;
    }

    public String getSpyplNaTeamC() {
        return spyplNaTeamC;
    }

    public void setSpyplNaTeamC(String spyplNaTeamC) {
        this.spyplNaTeamC = spyplNaTeamC;
    }

    public Character getCtrTpc() {
        return ctrTpc;
    }

    public void setCtrTpc(Character ctrTpc) {
        this.ctrTpc = ctrTpc;
    }

    public String getSpyTpc() {
        return spyTpc;
    }

    public void setSpyTpc(String spyTpc) {
        this.spyTpc = spyTpc;
    }

    public Character getTxtDsc() {
        return txtDsc;
    }

    public void setTxtDsc(Character txtDsc) {
        this.txtDsc = txtDsc;
    }

    public Character getRvoPsbYn() {
        return rvoPsbYn;
    }

    public void setRvoPsbYn(Character rvoPsbYn) {
        this.rvoPsbYn = rvoPsbYn;
    }

    public Character getOdrPsbYn() {
        return odrPsbYn;
    }

    public void setOdrPsbYn(Character odrPsbYn) {
        this.odrPsbYn = odrPsbYn;
    }

    public Character getDdlyYn() {
        return ddlyYn;
    }

    public void setDdlyYn(Character ddlyYn) {
        this.ddlyYn = ddlyYn;
    }

    public Character getStplPdViapdDsc() {
        return stplPdViapdDsc;
    }

    public void setStplPdViapdDsc(Character stplPdViapdDsc) {
        this.stplPdViapdDsc = stplPdViapdDsc;
    }

    public Character getStplPdGrdDsc() {
        return stplPdGrdDsc;
    }

    public void setStplPdGrdDsc(Character stplPdGrdDsc) {
        this.stplPdGrdDsc = stplPdGrdDsc;
    }

    public Character getViapdYn() {
        return viapdYn;
    }

    public void setViapdYn(Character viapdYn) {
        this.viapdYn = viapdYn;
    }

    public Character getSvsYn() {
        return svsYn;
    }

    public void setSvsYn(Character svsYn) {
        this.svsYn = svsYn;
    }

    public Integer getSvsUntQt() {
        return svsUntQt;
    }

    public void setSvsUntQt(Integer svsUntQt) {
        this.svsUntQt = svsUntQt;
    }

    public BigDecimal getBoxBulk() {
        return boxBulk;
    }

    public void setBoxBulk(BigDecimal boxBulk) {
        this.boxBulk = boxBulk;
    }

    public BigDecimal getWrsWdthLen() {
        return wrsWdthLen;
    }

    public void setWrsWdthLen(BigDecimal wrsWdthLen) {
        this.wrsWdthLen = wrsWdthLen;
    }

    public BigDecimal getWrsLenLen() {
        return wrsLenLen;
    }

    public void setWrsLenLen(BigDecimal wrsLenLen) {
        this.wrsLenLen = wrsLenLen;
    }

    public Character getBoxWrsYn() {
        return boxWrsYn;
    }

    public void setBoxWrsYn(Character boxWrsYn) {
        this.boxWrsYn = boxWrsYn;
    }

    public String getDdlyStDt() {
        return ddlyStDt;
    }

    public void setDdlyStDt(String ddlyStDt) {
        this.ddlyStDt = ddlyStDt;
    }

    public String getDdlyEdDt() {
        return ddlyEdDt;
    }

    public void setDdlyEdDt(String ddlyEdDt) {
        this.ddlyEdDt = ddlyEdDt;
    }

    public BigDecimal getDdlyBasQt() {
        return ddlyBasQt;
    }

    public void setDdlyBasQt(BigDecimal ddlyBasQt) {
        this.ddlyBasQt = ddlyBasQt;
    }

    public Character getMartDivBkgOdrYn() {
        return martDivBkgOdrYn;
    }

    public void setMartDivBkgOdrYn(Character martDivBkgOdrYn) {
        this.martDivBkgOdrYn = martDivBkgOdrYn;
    }

    public String getSraWrsDsc() {
        return sraWrsDsc;
    }

    public void setSraWrsDsc(String sraWrsDsc) {
        this.sraWrsDsc = sraWrsDsc;
    }

    public Character getStplAmnWrsYn() {
        return stplAmnWrsYn;
    }

    public void setStplAmnWrsYn(Character stplAmnWrsYn) {
        this.stplAmnWrsYn = stplAmnWrsYn;
    }

    public String getStplNaWrsC() {
        return stplNaWrsC;
    }

    public void setStplNaWrsC(String stplNaWrsC) {
        this.stplNaWrsC = stplNaWrsC;
    }

    public Character getStplAmnDsc() {
        return stplAmnDsc;
    }

    public void setStplAmnDsc(Character stplAmnDsc) {
        this.stplAmnDsc = stplAmnDsc;
    }

    public Character getPdYyAmnYn() {
        return pdYyAmnYn;
    }

    public void setPdYyAmnYn(Character pdYyAmnYn) {
        this.pdYyAmnYn = pdYyAmnYn;
    }

    public String getNaOdrFbidRsnc() {
        return naOdrFbidRsnc;
    }

    public void setNaOdrFbidRsnc(String naOdrFbidRsnc) {
        this.naOdrFbidRsnc = naOdrFbidRsnc;
    }

    public String getNaRvoFbidRsnc() {
        return naRvoFbidRsnc;
    }

    public void setNaRvoFbidRsnc(String naRvoFbidRsnc) {
        this.naRvoFbidRsnc = naRvoFbidRsnc;
    }

    public Integer getBoxpeAqz() {
        return boxpeAqz;
    }

    public void setBoxpeAqz(Integer boxpeAqz) {
        this.boxpeAqz = boxpeAqz;
    }

    public String getNaUsrSysKdc() {
        return naUsrSysKdc;
    }

    public void setNaUsrSysKdc(String naUsrSysKdc) {
        this.naUsrSysKdc = naUsrSysKdc;
    }

    public String getPhdFcltC() {
        return phdFcltC;
    }

    public void setPhdFcltC(String phdFcltC) {
        this.phdFcltC = phdFcltC;
    }

    public Character getPpzOrrDsc() {
        return ppzOrrDsc;
    }

    public void setPpzOrrDsc(Character ppzOrrDsc) {
        this.ppzOrrDsc = ppzOrrDsc;
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

    public Instant getDelDtm() {
        return delDtm;
    }

    public void setDelDtm(Instant delDtm) {
        this.delDtm = delDtm;
    }

    public String getStcastDsc() {
        return stcastDsc;
    }

    public void setStcastDsc(String stcastDsc) {
        this.stcastDsc = stcastDsc;
    }

    public Character getAbcGrdDsc() {
        return abcGrdDsc;
    }

    public void setAbcGrdDsc(Character abcGrdDsc) {
        this.abcGrdDsc = abcGrdDsc;
    }

    public String getPlttLoadC() {
        return plttLoadC;
    }

    public void setPlttLoadC(String plttLoadC) {
        this.plttLoadC = plttLoadC;
    }

}