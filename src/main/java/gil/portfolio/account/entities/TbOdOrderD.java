package gil.portfolio.account.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "tb_od_order_d", schema = "escm", indexes = {
        @Index(name = "IDX_OD_ORDER_D_01", columnList = "NA_DVY_PLASH_SLPNO, NA_WRS_C")
})
public class TbOdOrderD {
    @EmbeddedId
    private TbOdOrderDId id;

    @Column(name = "VAN_SEQ", nullable = false, length = 16)
    private String vanSeq;

    @Column(name = "NA_WRS_C", length = 25)
    private String naWrsC;

    @Column(name = "CHAF_NA_WRS_C", length = 25)
    private String chafNaWrsC;

    @Column(name = "TXT_DSC")
    private Character txtDsc;

    @Column(name = "VCBT_NA_WRS_C", length = 25)
    private String vcbtNaWrsC;

    @Column(name = "VCBT_AM", precision = 18)
    private BigDecimal vcbtAm;

    @Column(name = "VCBX_AM", precision = 18)
    private BigDecimal vcbxAm;

    @Column(name = "ODR_PCS", precision = 18, scale = 3)
    private BigDecimal odrPcs;

    @Column(name = "ODR_QT", precision = 18, scale = 3)
    private BigDecimal odrQt;

    @Column(name = "ODR_VAT", precision = 18)
    private BigDecimal odrVat;

    @Column(name = "ODR_AM", precision = 18)
    private BigDecimal odrAm;

    @Column(name = "ACTL_SPYPL_NA_TRPL_C", length = 13)
    private String actlSpyplNaTrplC;

    @Column(name = "BYNG_QT", precision = 15, scale = 2)
    private BigDecimal byngQt;

    @Column(name = "NA_ODR_STS_DSC", length = 2)
    private String naOdrStsDsc;

    @Column(name = "RMK_CNTN", length = 4000)
    private String rmkCntn;

    @Column(name = "NA_DVY_PLASH_SLPNO", length = 17)
    private String naDvyPlashSlpno;

    @Column(name = "DVY_PLA_SQNO")
    private Integer dvyPlaSqno;

    @Column(name = "AUT_ODR_KDC")
    private Character autOdrKdc;

    @Column(name = "BOXPE_AQZ")
    private Integer boxpeAqz;

    @Column(name = "DEL_DTM")
    private Instant delDtm;

    @Column(name = "FSRGMN_ENO", length = 9)
    private String fsrgmnEno;

    @Column(name = "LS_CMENO", length = 9)
    private String lsCmeno;

    @Column(name = "DDLY_YN")
    private Character ddlyYn;

    @Column(name = "NA_WRS_LCLC", length = 3)
    private String naWrsLclc;

    @Column(name = "NA_WRS_MCLC", length = 3)
    private String naWrsMclc;

    @Column(name = "NA_WRS_SCLC", length = 3)
    private String naWrsSclc;

    @Column(name = "NA_WRS_DTCF_C", length = 3)
    private String naWrsDtcfC;

    @Column(name = "NA_WRS_UNIT_C", length = 3)
    private String naWrsUnitC;

    @Column(name = "OGN_ODRPL_NA_TRPL_C", length = 13)
    private String ognOdrplNaTrplC;

    @Column(name = "OGN_ODRPL_NA_TEAM_C", length = 2)
    private String ognOdrplNaTeamC;

    @Column(name = "OGN_ODR_DT", length = 8)
    private String ognOdrDt;

    @Column(name = "OGN_ODR_SLPNO", length = 16)
    private String ognOdrSlpno;

    @Column(name = "OGN_ODR_DSQNO")
    private Integer ognOdrDsqno;

    @Column(name = "PHD_FCLT_DTL_C", length = 2)
    private String phdFcltDtlC;

    @Column(name = "DEL_YN")
    private Character delYn;

    public TbOdOrderDId getId() {
        return id;
    }

    public void setId(TbOdOrderDId id) {
        this.id = id;
    }

    public String getVanSeq() {
        return vanSeq;
    }

    public void setVanSeq(String vanSeq) {
        this.vanSeq = vanSeq;
    }

    public String getNaWrsC() {
        return naWrsC;
    }

    public void setNaWrsC(String naWrsC) {
        this.naWrsC = naWrsC;
    }

    public String getChafNaWrsC() {
        return chafNaWrsC;
    }

    public void setChafNaWrsC(String chafNaWrsC) {
        this.chafNaWrsC = chafNaWrsC;
    }

    public Character getTxtDsc() {
        return txtDsc;
    }

    public void setTxtDsc(Character txtDsc) {
        this.txtDsc = txtDsc;
    }

    public String getVcbtNaWrsC() {
        return vcbtNaWrsC;
    }

    public void setVcbtNaWrsC(String vcbtNaWrsC) {
        this.vcbtNaWrsC = vcbtNaWrsC;
    }

    public BigDecimal getVcbtAm() {
        return vcbtAm;
    }

    public void setVcbtAm(BigDecimal vcbtAm) {
        this.vcbtAm = vcbtAm;
    }

    public BigDecimal getVcbxAm() {
        return vcbxAm;
    }

    public void setVcbxAm(BigDecimal vcbxAm) {
        this.vcbxAm = vcbxAm;
    }

    public BigDecimal getOdrPcs() {
        return odrPcs;
    }

    public void setOdrPcs(BigDecimal odrPcs) {
        this.odrPcs = odrPcs;
    }

    public BigDecimal getOdrQt() {
        return odrQt;
    }

    public void setOdrQt(BigDecimal odrQt) {
        this.odrQt = odrQt;
    }

    public BigDecimal getOdrVat() {
        return odrVat;
    }

    public void setOdrVat(BigDecimal odrVat) {
        this.odrVat = odrVat;
    }

    public BigDecimal getOdrAm() {
        return odrAm;
    }

    public void setOdrAm(BigDecimal odrAm) {
        this.odrAm = odrAm;
    }

    public String getActlSpyplNaTrplC() {
        return actlSpyplNaTrplC;
    }

    public void setActlSpyplNaTrplC(String actlSpyplNaTrplC) {
        this.actlSpyplNaTrplC = actlSpyplNaTrplC;
    }

    public BigDecimal getByngQt() {
        return byngQt;
    }

    public void setByngQt(BigDecimal byngQt) {
        this.byngQt = byngQt;
    }

    public String getNaOdrStsDsc() {
        return naOdrStsDsc;
    }

    public void setNaOdrStsDsc(String naOdrStsDsc) {
        this.naOdrStsDsc = naOdrStsDsc;
    }

    public String getRmkCntn() {
        return rmkCntn;
    }

    public void setRmkCntn(String rmkCntn) {
        this.rmkCntn = rmkCntn;
    }

    public String getNaDvyPlashSlpno() {
        return naDvyPlashSlpno;
    }

    public void setNaDvyPlashSlpno(String naDvyPlashSlpno) {
        this.naDvyPlashSlpno = naDvyPlashSlpno;
    }

    public Integer getDvyPlaSqno() {
        return dvyPlaSqno;
    }

    public void setDvyPlaSqno(Integer dvyPlaSqno) {
        this.dvyPlaSqno = dvyPlaSqno;
    }

    public Character getAutOdrKdc() {
        return autOdrKdc;
    }

    public void setAutOdrKdc(Character autOdrKdc) {
        this.autOdrKdc = autOdrKdc;
    }

    public Integer getBoxpeAqz() {
        return boxpeAqz;
    }

    public void setBoxpeAqz(Integer boxpeAqz) {
        this.boxpeAqz = boxpeAqz;
    }

    public Instant getDelDtm() {
        return delDtm;
    }

    public void setDelDtm(Instant delDtm) {
        this.delDtm = delDtm;
    }

    public String getFsrgmnEno() {
        return fsrgmnEno;
    }

    public void setFsrgmnEno(String fsrgmnEno) {
        this.fsrgmnEno = fsrgmnEno;
    }

    public String getLsCmeno() {
        return lsCmeno;
    }

    public void setLsCmeno(String lsCmeno) {
        this.lsCmeno = lsCmeno;
    }

    public Character getDdlyYn() {
        return ddlyYn;
    }

    public void setDdlyYn(Character ddlyYn) {
        this.ddlyYn = ddlyYn;
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

    public String getNaWrsUnitC() {
        return naWrsUnitC;
    }

    public void setNaWrsUnitC(String naWrsUnitC) {
        this.naWrsUnitC = naWrsUnitC;
    }

    public String getOgnOdrplNaTrplC() {
        return ognOdrplNaTrplC;
    }

    public void setOgnOdrplNaTrplC(String ognOdrplNaTrplC) {
        this.ognOdrplNaTrplC = ognOdrplNaTrplC;
    }

    public String getOgnOdrplNaTeamC() {
        return ognOdrplNaTeamC;
    }

    public void setOgnOdrplNaTeamC(String ognOdrplNaTeamC) {
        this.ognOdrplNaTeamC = ognOdrplNaTeamC;
    }

    public String getOgnOdrDt() {
        return ognOdrDt;
    }

    public void setOgnOdrDt(String ognOdrDt) {
        this.ognOdrDt = ognOdrDt;
    }

    public String getOgnOdrSlpno() {
        return ognOdrSlpno;
    }

    public void setOgnOdrSlpno(String ognOdrSlpno) {
        this.ognOdrSlpno = ognOdrSlpno;
    }

    public Integer getOgnOdrDsqno() {
        return ognOdrDsqno;
    }

    public void setOgnOdrDsqno(Integer ognOdrDsqno) {
        this.ognOdrDsqno = ognOdrDsqno;
    }

    public String getPhdFcltDtlC() {
        return phdFcltDtlC;
    }

    public void setPhdFcltDtlC(String phdFcltDtlC) {
        this.phdFcltDtlC = phdFcltDtlC;
    }

    public Character getDelYn() {
        return delYn;
    }

    public void setDelYn(Character delYn) {
        this.delYn = delYn;
    }

}