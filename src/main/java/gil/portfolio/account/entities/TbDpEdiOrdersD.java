package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

//@Entity
//@Table(name = "tb_dp_edi_orders_d", schema = "escm")
public class TbDpEdiOrdersD {
    @EmbeddedId
    private TbDpEdiOrdersDId id;

    @Column(name = "ACT_CODE", length = 3)
    private String actCode;

    @Column(name = "PROD_CODE", length = 35)
    private String prodCode;

    @Column(name = "INTL_CODE", length = 35)
    private String intlCode;

    @Column(name = "PROD_CODE_MAP", length = 35)
    private String prodCodeMap;

    @Column(name = "PROD_NAME", length = 200)
    private String prodName;

    @Column(name = "STND", length = 35)
    private String stnd;

    @Column(name = "PROD_COLOR", length = 35)
    private String prodColor;

    @Column(name = "ORG_ORDR_QTY", precision = 15, scale = 3)
    private BigDecimal orgOrdrQty;

    @Column(name = "ORDR_QTY", precision = 15, scale = 3)
    private BigDecimal ordrQty;

    @Column(name = "ORDR_UNIT", length = 16)
    private String ordrUnit;

    @Column(name = "FREE_ITM_QTY", precision = 15)
    private BigDecimal freeItmQty;

    @Column(name = "FREE_ITM_UNIT", length = 3)
    private String freeItmUnit;

    @Column(name = "EVNT_ITM_QTY", precision = 15)
    private BigDecimal evntItmQty;

    @Column(name = "EVNT_ITM_UNIT", length = 3)
    private String evntItmUnit;

    @Column(name = "RPCE_ITM_QTY", precision = 15, scale = 2)
    private BigDecimal rpceItmQty;

    @Column(name = "RPCE_ITM_UNIT", length = 3)
    private String rpceItmUnit;

    @Column(name = "COST_PRICE", precision = 18, scale = 2)
    private BigDecimal costPrice;

    @Column(name = "COST_UNIT_PRICE", precision = 15, scale = 2)
    private BigDecimal costUnitPrice;

    @Column(name = "SALE_PRICE", precision = 18, scale = 2)
    private BigDecimal salePrice;

    @Column(name = "SALE_UNIT_PRICE", precision = 15, scale = 2)
    private BigDecimal saleUnitPrice;

    @Column(name = "PRCE_APY_DCODE", length = 3)
    private String prceApyDcode;

    @Column(name = "PRCE_TYPE_CODE", length = 3)
    private String prceTypeCode;

    @Column(name = "PRCE_DIV_CODE", length = 3)
    private String prceDivCode;

    @Column(name = "PRCE_STND", precision = 9)
    private BigDecimal prceStnd;

    @Column(name = "EXPORT_NO", length = 35)
    private String exportNo;

    @Column(name = "EVENT_MAN_NO", length = 35)
    private String eventManNo;

    @Column(name = "EVNT_START_DATE", length = 35)
    private String evntStartDate;

    @Column(name = "EVNT_END_DATE", length = 35)
    private String evntEndDate;

    @Column(name = "REF_DATE", length = 35)
    private String refDate;

    @Column(name = "EVENT_PERD", length = 35)
    private String eventPerd;

    @Column(name = "PACK_QTY", precision = 15, scale = 3)
    private BigDecimal packQty;

    @Column(name = "PACK_LEVEL", length = 3)
    private String packLevel;

    @Column(name = "CASE_CNT", precision = 8)
    private BigDecimal caseCnt;

    @Column(name = "ORDR_PCB", precision = 15, scale = 3)
    private BigDecimal ordrPcb;

    @Column(name = "ORDR_PCB_UNIT", length = 20)
    private String ordrPcbUnit;

    @Column(name = "DELV_LOC_CODE", length = 25)
    private String delvLocCode;

    @Column(name = "DELV_LOC_NAME", length = 70)
    private String delvLocName;

    @Column(name = "LDELV_DUE_DATE", length = 35)
    private String ldelvDueDate;

    @Column(name = "LTAX_TYPE_CODE", length = 3)
    private String ltaxTypeCode;

    @Column(name = "LTAX_BASIS", length = 15)
    private String ltaxBasis;

    @Column(name = "LTAX_RATE", length = 17)
    private String ltaxRate;

    @Column(name = "LTAX_AMNT", precision = 18)
    private BigDecimal ltaxAmnt;

    @Column(name = "LDCNT_TYPE_CODE", length = 3)
    private String ldcntTypeCode;

    @Column(name = "LDCNT_START_DATE", length = 35)
    private String ldcntStartDate;

    @Column(name = "LDCNT_END_DATE", length = 35)
    private String ldcntEndDate;

    @Column(name = "TAG_INFO1", length = 70)
    private String tagInfo1;

    @Column(name = "TAG_INFO2", length = 35)
    private String tagInfo2;

    @Column(name = "REG_DATE", length = 14)
    private String regDate;

    @Column(name = "UPD_DATE", length = 14)
    private String updDate;

    @Column(name = "SOG_TRPL_C", length = 35)
    private String sogTrplC;

    @Column(name = "ADJ_TRPL_C", length = 35)
    private String adjTrplC;

    public TbDpEdiOrdersDId getId() {
        return id;
    }

    public void setId(TbDpEdiOrdersDId id) {
        this.id = id;
    }

    public String getActCode() {
        return actCode;
    }

    public void setActCode(String actCode) {
        this.actCode = actCode;
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    public String getIntlCode() {
        return intlCode;
    }

    public void setIntlCode(String intlCode) {
        this.intlCode = intlCode;
    }

    public String getProdCodeMap() {
        return prodCodeMap;
    }

    public void setProdCodeMap(String prodCodeMap) {
        this.prodCodeMap = prodCodeMap;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getStnd() {
        return stnd;
    }

    public void setStnd(String stnd) {
        this.stnd = stnd;
    }

    public String getProdColor() {
        return prodColor;
    }

    public void setProdColor(String prodColor) {
        this.prodColor = prodColor;
    }

    public BigDecimal getOrgOrdrQty() {
        return orgOrdrQty;
    }

    public void setOrgOrdrQty(BigDecimal orgOrdrQty) {
        this.orgOrdrQty = orgOrdrQty;
    }

    public BigDecimal getOrdrQty() {
        return ordrQty;
    }

    public void setOrdrQty(BigDecimal ordrQty) {
        this.ordrQty = ordrQty;
    }

    public String getOrdrUnit() {
        return ordrUnit;
    }

    public void setOrdrUnit(String ordrUnit) {
        this.ordrUnit = ordrUnit;
    }

    public BigDecimal getFreeItmQty() {
        return freeItmQty;
    }

    public void setFreeItmQty(BigDecimal freeItmQty) {
        this.freeItmQty = freeItmQty;
    }

    public String getFreeItmUnit() {
        return freeItmUnit;
    }

    public void setFreeItmUnit(String freeItmUnit) {
        this.freeItmUnit = freeItmUnit;
    }

    public BigDecimal getEvntItmQty() {
        return evntItmQty;
    }

    public void setEvntItmQty(BigDecimal evntItmQty) {
        this.evntItmQty = evntItmQty;
    }

    public String getEvntItmUnit() {
        return evntItmUnit;
    }

    public void setEvntItmUnit(String evntItmUnit) {
        this.evntItmUnit = evntItmUnit;
    }

    public BigDecimal getRpceItmQty() {
        return rpceItmQty;
    }

    public void setRpceItmQty(BigDecimal rpceItmQty) {
        this.rpceItmQty = rpceItmQty;
    }

    public String getRpceItmUnit() {
        return rpceItmUnit;
    }

    public void setRpceItmUnit(String rpceItmUnit) {
        this.rpceItmUnit = rpceItmUnit;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public BigDecimal getCostUnitPrice() {
        return costUnitPrice;
    }

    public void setCostUnitPrice(BigDecimal costUnitPrice) {
        this.costUnitPrice = costUnitPrice;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public BigDecimal getSaleUnitPrice() {
        return saleUnitPrice;
    }

    public void setSaleUnitPrice(BigDecimal saleUnitPrice) {
        this.saleUnitPrice = saleUnitPrice;
    }

    public String getPrceApyDcode() {
        return prceApyDcode;
    }

    public void setPrceApyDcode(String prceApyDcode) {
        this.prceApyDcode = prceApyDcode;
    }

    public String getPrceTypeCode() {
        return prceTypeCode;
    }

    public void setPrceTypeCode(String prceTypeCode) {
        this.prceTypeCode = prceTypeCode;
    }

    public String getPrceDivCode() {
        return prceDivCode;
    }

    public void setPrceDivCode(String prceDivCode) {
        this.prceDivCode = prceDivCode;
    }

    public BigDecimal getPrceStnd() {
        return prceStnd;
    }

    public void setPrceStnd(BigDecimal prceStnd) {
        this.prceStnd = prceStnd;
    }

    public String getExportNo() {
        return exportNo;
    }

    public void setExportNo(String exportNo) {
        this.exportNo = exportNo;
    }

    public String getEventManNo() {
        return eventManNo;
    }

    public void setEventManNo(String eventManNo) {
        this.eventManNo = eventManNo;
    }

    public String getEvntStartDate() {
        return evntStartDate;
    }

    public void setEvntStartDate(String evntStartDate) {
        this.evntStartDate = evntStartDate;
    }

    public String getEvntEndDate() {
        return evntEndDate;
    }

    public void setEvntEndDate(String evntEndDate) {
        this.evntEndDate = evntEndDate;
    }

    public String getRefDate() {
        return refDate;
    }

    public void setRefDate(String refDate) {
        this.refDate = refDate;
    }

    public String getEventPerd() {
        return eventPerd;
    }

    public void setEventPerd(String eventPerd) {
        this.eventPerd = eventPerd;
    }

    public BigDecimal getPackQty() {
        return packQty;
    }

    public void setPackQty(BigDecimal packQty) {
        this.packQty = packQty;
    }

    public String getPackLevel() {
        return packLevel;
    }

    public void setPackLevel(String packLevel) {
        this.packLevel = packLevel;
    }

    public BigDecimal getCaseCnt() {
        return caseCnt;
    }

    public void setCaseCnt(BigDecimal caseCnt) {
        this.caseCnt = caseCnt;
    }

    public BigDecimal getOrdrPcb() {
        return ordrPcb;
    }

    public void setOrdrPcb(BigDecimal ordrPcb) {
        this.ordrPcb = ordrPcb;
    }

    public String getOrdrPcbUnit() {
        return ordrPcbUnit;
    }

    public void setOrdrPcbUnit(String ordrPcbUnit) {
        this.ordrPcbUnit = ordrPcbUnit;
    }

    public String getDelvLocCode() {
        return delvLocCode;
    }

    public void setDelvLocCode(String delvLocCode) {
        this.delvLocCode = delvLocCode;
    }

    public String getDelvLocName() {
        return delvLocName;
    }

    public void setDelvLocName(String delvLocName) {
        this.delvLocName = delvLocName;
    }

    public String getLdelvDueDate() {
        return ldelvDueDate;
    }

    public void setLdelvDueDate(String ldelvDueDate) {
        this.ldelvDueDate = ldelvDueDate;
    }

    public String getLtaxTypeCode() {
        return ltaxTypeCode;
    }

    public void setLtaxTypeCode(String ltaxTypeCode) {
        this.ltaxTypeCode = ltaxTypeCode;
    }

    public String getLtaxBasis() {
        return ltaxBasis;
    }

    public void setLtaxBasis(String ltaxBasis) {
        this.ltaxBasis = ltaxBasis;
    }

    public String getLtaxRate() {
        return ltaxRate;
    }

    public void setLtaxRate(String ltaxRate) {
        this.ltaxRate = ltaxRate;
    }

    public BigDecimal getLtaxAmnt() {
        return ltaxAmnt;
    }

    public void setLtaxAmnt(BigDecimal ltaxAmnt) {
        this.ltaxAmnt = ltaxAmnt;
    }

    public String getLdcntTypeCode() {
        return ldcntTypeCode;
    }

    public void setLdcntTypeCode(String ldcntTypeCode) {
        this.ldcntTypeCode = ldcntTypeCode;
    }

    public String getLdcntStartDate() {
        return ldcntStartDate;
    }

    public void setLdcntStartDate(String ldcntStartDate) {
        this.ldcntStartDate = ldcntStartDate;
    }

    public String getLdcntEndDate() {
        return ldcntEndDate;
    }

    public void setLdcntEndDate(String ldcntEndDate) {
        this.ldcntEndDate = ldcntEndDate;
    }

    public String getTagInfo1() {
        return tagInfo1;
    }

    public void setTagInfo1(String tagInfo1) {
        this.tagInfo1 = tagInfo1;
    }

    public String getTagInfo2() {
        return tagInfo2;
    }

    public void setTagInfo2(String tagInfo2) {
        this.tagInfo2 = tagInfo2;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getUpdDate() {
        return updDate;
    }

    public void setUpdDate(String updDate) {
        this.updDate = updDate;
    }

    public String getSogTrplC() {
        return sogTrplC;
    }

    public void setSogTrplC(String sogTrplC) {
        this.sogTrplC = sogTrplC;
    }

    public String getAdjTrplC() {
        return adjTrplC;
    }

    public void setAdjTrplC(String adjTrplC) {
        this.adjTrplC = adjTrplC;
    }

}