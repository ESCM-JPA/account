package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;

//@Entity
//@Table(name = "tb_od_dlvpnsht_d", schema = "escm")
public class TbOdDlvpnshtD {
    @EmbeddedId
    private TbOdDlvpnshtDId id;

    @Column(name = "NA_WRS_C", length = 25)
    private String naWrsC;

    @Column(name = "VCBT_NA_WRS_C", length = 25)
    private String vcbtNaWrsC;

    @Column(name = "ODR_DT", length = 8)
    private String odrDt;

    @Column(name = "ODR_SLPNO", length = 16)
    private String odrSlpno;

    @Column(name = "ODR_DSQNO")
    private Integer odrDsqno;

    @Column(name = "TXT_DSC")
    private Character txtDsc;

    @Column(name = "DVY_WRS_UPR", precision = 19, scale = 3)
    private BigDecimal dvyWrsUpr;

    @Column(name = "DVY_PLA_QT", precision = 18, scale = 3)
    private BigDecimal dvyPlaQt;

    @Column(name = "DVY_AM", precision = 19, scale = 3)
    private BigDecimal dvyAm;

    @Column(name = "DVY_VAT", precision = 20, scale = 2)
    private BigDecimal dvyVat;

    @Column(name = "DVY_VCBT_AM", precision = 18, scale = 2)
    private BigDecimal dvyVcbtAm;

    @Column(name = "DVY_SSDY", precision = 18, scale = 2)
    private BigDecimal dvySsdy;

    @Column(name = "DVY_TROT_FEE", precision = 18, scale = 2)
    private BigDecimal dvyTrotFee;

    @Column(name = "DVY_PHD_FEE", precision = 18, scale = 2)
    private BigDecimal dvyPhdFee;

    @Column(name = "DVY_FAR_ASTCS", precision = 18, scale = 2)
    private BigDecimal dvyFarAstcs;

    @Column(name = "DQPD_RSNC", length = 2)
    private String dqpdRsnc;

    @Column(name = "DQPD_RSN_CNTN", length = 200)
    private String dqpdRsnCntn;

    @Column(name = "DVY_SSDYRT", precision = 18, scale = 2)
    private BigDecimal dvySsdyrt;

    @Column(name = "DVY_TROT_FEERT", precision = 18, scale = 2)
    private BigDecimal dvyTrotFeert;

    @Column(name = "LS_CMENO", length = 9)
    private String lsCmeno;

    @Column(name = "SPY_PSB_DT", length = 8)
    private String spyPsbDt;

    @ColumnDefault("'I'")
    @Column(name = "WK_DS")
    private Character wkDs;

    @Column(name = "CTR_UPR", precision = 17, scale = 2)
    private BigDecimal ctrUpr;

    @Column(name = "OGN_DVY_PLA_DSQNO")
    private Integer ognDvyPlaDsqno;

    @Column(name = "DSTR_TER_MRK_DSC")
    private Character dstrTerMrkDsc;

    @Column(name = "DSTR_TER_DT", length = 8)
    private String dstrTerDt;

    @Column(name = "BOX_QT", precision = 15, scale = 2)
    private BigDecimal boxQt;

    @Column(name = "INDV_ID_NO", length = 15)
    private String indvIdNo;

    @Column(name = "DVY_WT", precision = 15, scale = 3)
    private BigDecimal dvyWt;

    @Column(name = "WRS_PDAA_NM", length = 200)
    private String wrsPdaaNm;

    @Column(name = "LAY_DT", length = 8)
    private String layDt;

    @Column(name = "EGYN_DAGE", length = 4)
    private String egynDage;

    @Column(name = "WSH_NWSH_DSC", length = 200)
    private String wshNwshDsc;

    @Column(name = "BRD_ENV", length = 200)
    private String brdEnv;

    @Column(name = "PD_YY", length = 4)
    private String pdYy;

    @Column(name = "CNR_QT", length = 201)
    private String cnrQt;

    @Column(name = "DEL_YN")
    private Character delYn;

    public TbOdDlvpnshtDId getId() {
        return id;
    }

    public void setId(TbOdDlvpnshtDId id) {
        this.id = id;
    }

    public String getNaWrsC() {
        return naWrsC;
    }

    public void setNaWrsC(String naWrsC) {
        this.naWrsC = naWrsC;
    }

    public String getVcbtNaWrsC() {
        return vcbtNaWrsC;
    }

    public void setVcbtNaWrsC(String vcbtNaWrsC) {
        this.vcbtNaWrsC = vcbtNaWrsC;
    }

    public String getOdrDt() {
        return odrDt;
    }

    public void setOdrDt(String odrDt) {
        this.odrDt = odrDt;
    }

    public String getOdrSlpno() {
        return odrSlpno;
    }

    public void setOdrSlpno(String odrSlpno) {
        this.odrSlpno = odrSlpno;
    }

    public Integer getOdrDsqno() {
        return odrDsqno;
    }

    public void setOdrDsqno(Integer odrDsqno) {
        this.odrDsqno = odrDsqno;
    }

    public Character getTxtDsc() {
        return txtDsc;
    }

    public void setTxtDsc(Character txtDsc) {
        this.txtDsc = txtDsc;
    }

    public BigDecimal getDvyWrsUpr() {
        return dvyWrsUpr;
    }

    public void setDvyWrsUpr(BigDecimal dvyWrsUpr) {
        this.dvyWrsUpr = dvyWrsUpr;
    }

    public BigDecimal getDvyPlaQt() {
        return dvyPlaQt;
    }

    public void setDvyPlaQt(BigDecimal dvyPlaQt) {
        this.dvyPlaQt = dvyPlaQt;
    }

    public BigDecimal getDvyAm() {
        return dvyAm;
    }

    public void setDvyAm(BigDecimal dvyAm) {
        this.dvyAm = dvyAm;
    }

    public BigDecimal getDvyVat() {
        return dvyVat;
    }

    public void setDvyVat(BigDecimal dvyVat) {
        this.dvyVat = dvyVat;
    }

    public BigDecimal getDvyVcbtAm() {
        return dvyVcbtAm;
    }

    public void setDvyVcbtAm(BigDecimal dvyVcbtAm) {
        this.dvyVcbtAm = dvyVcbtAm;
    }

    public BigDecimal getDvySsdy() {
        return dvySsdy;
    }

    public void setDvySsdy(BigDecimal dvySsdy) {
        this.dvySsdy = dvySsdy;
    }

    public BigDecimal getDvyTrotFee() {
        return dvyTrotFee;
    }

    public void setDvyTrotFee(BigDecimal dvyTrotFee) {
        this.dvyTrotFee = dvyTrotFee;
    }

    public BigDecimal getDvyPhdFee() {
        return dvyPhdFee;
    }

    public void setDvyPhdFee(BigDecimal dvyPhdFee) {
        this.dvyPhdFee = dvyPhdFee;
    }

    public BigDecimal getDvyFarAstcs() {
        return dvyFarAstcs;
    }

    public void setDvyFarAstcs(BigDecimal dvyFarAstcs) {
        this.dvyFarAstcs = dvyFarAstcs;
    }

    public String getDqpdRsnc() {
        return dqpdRsnc;
    }

    public void setDqpdRsnc(String dqpdRsnc) {
        this.dqpdRsnc = dqpdRsnc;
    }

    public String getDqpdRsnCntn() {
        return dqpdRsnCntn;
    }

    public void setDqpdRsnCntn(String dqpdRsnCntn) {
        this.dqpdRsnCntn = dqpdRsnCntn;
    }

    public BigDecimal getDvySsdyrt() {
        return dvySsdyrt;
    }

    public void setDvySsdyrt(BigDecimal dvySsdyrt) {
        this.dvySsdyrt = dvySsdyrt;
    }

    public BigDecimal getDvyTrotFeert() {
        return dvyTrotFeert;
    }

    public void setDvyTrotFeert(BigDecimal dvyTrotFeert) {
        this.dvyTrotFeert = dvyTrotFeert;
    }

    public String getLsCmeno() {
        return lsCmeno;
    }

    public void setLsCmeno(String lsCmeno) {
        this.lsCmeno = lsCmeno;
    }

    public String getSpyPsbDt() {
        return spyPsbDt;
    }

    public void setSpyPsbDt(String spyPsbDt) {
        this.spyPsbDt = spyPsbDt;
    }

    public Character getWkDs() {
        return wkDs;
    }

    public void setWkDs(Character wkDs) {
        this.wkDs = wkDs;
    }

    public BigDecimal getCtrUpr() {
        return ctrUpr;
    }

    public void setCtrUpr(BigDecimal ctrUpr) {
        this.ctrUpr = ctrUpr;
    }

    public Integer getOgnDvyPlaDsqno() {
        return ognDvyPlaDsqno;
    }

    public void setOgnDvyPlaDsqno(Integer ognDvyPlaDsqno) {
        this.ognDvyPlaDsqno = ognDvyPlaDsqno;
    }

    public Character getDstrTerMrkDsc() {
        return dstrTerMrkDsc;
    }

    public void setDstrTerMrkDsc(Character dstrTerMrkDsc) {
        this.dstrTerMrkDsc = dstrTerMrkDsc;
    }

    public String getDstrTerDt() {
        return dstrTerDt;
    }

    public void setDstrTerDt(String dstrTerDt) {
        this.dstrTerDt = dstrTerDt;
    }

    public BigDecimal getBoxQt() {
        return boxQt;
    }

    public void setBoxQt(BigDecimal boxQt) {
        this.boxQt = boxQt;
    }

    public String getIndvIdNo() {
        return indvIdNo;
    }

    public void setIndvIdNo(String indvIdNo) {
        this.indvIdNo = indvIdNo;
    }

    public BigDecimal getDvyWt() {
        return dvyWt;
    }

    public void setDvyWt(BigDecimal dvyWt) {
        this.dvyWt = dvyWt;
    }

    public String getWrsPdaaNm() {
        return wrsPdaaNm;
    }

    public void setWrsPdaaNm(String wrsPdaaNm) {
        this.wrsPdaaNm = wrsPdaaNm;
    }

    public String getLayDt() {
        return layDt;
    }

    public void setLayDt(String layDt) {
        this.layDt = layDt;
    }

    public String getEgynDage() {
        return egynDage;
    }

    public void setEgynDage(String egynDage) {
        this.egynDage = egynDage;
    }

    public String getWshNwshDsc() {
        return wshNwshDsc;
    }

    public void setWshNwshDsc(String wshNwshDsc) {
        this.wshNwshDsc = wshNwshDsc;
    }

    public String getBrdEnv() {
        return brdEnv;
    }

    public void setBrdEnv(String brdEnv) {
        this.brdEnv = brdEnv;
    }

    public String getPdYy() {
        return pdYy;
    }

    public void setPdYy(String pdYy) {
        this.pdYy = pdYy;
    }

    public String getCnrQt() {
        return cnrQt;
    }

    public void setCnrQt(String cnrQt) {
        this.cnrQt = cnrQt;
    }

    public Character getDelYn() {
        return delYn;
    }

    public void setDelYn(Character delYn) {
        this.delYn = delYn;
    }

}