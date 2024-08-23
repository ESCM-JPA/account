package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

//@Entity
//@Table(name = "tb_dp_edi_orders_m", schema = "escm")
public class TbDpEdiOrdersM {
    @EmbeddedId
    private TbDpEdiOrdersMId id;

    @Column(name = "MESG_CODE", length = 3)
    private String mesgCode;

    @Column(name = "MESG_FUNC_CODE", length = 3)
    private String mesgFuncCode;

    @Column(name = "RESP_TYPE_CODE", length = 3)
    private String respTypeCode;

    @Column(name = "DELV_DUE_DATE", length = 35)
    private String delvDueDate;

    @Column(name = "PROC_DATE", length = 35)
    private String procDate;

    @Column(name = "RESP_DUE_DATE", length = 35)
    private String respDueDate;

    @Column(name = "DELV_PRMI_DATE", length = 35)
    private String delvPrmiDate;

    @Column(name = "PMENT_CODE", length = 4)
    private String pmentCode;

    @Column(name = "PMENT_NAME", length = 35)
    private String pmentName;

    @Column(name = "PROD_CLAS_CODE", length = 35)
    private String prodClasCode;

    @Column(name = "PROD_CLAS_NAME", length = 120)
    private String prodClasName;

    @Column(name = "PURC_TYPE", length = 10)
    private String purcType;

    @Column(name = "GEN_INFO", length = 70)
    private String genInfo;

    @Column(name = "PRCE_COND", length = 35)
    private String prceCond;

    @Column(name = "ADDI_INFO", length = 35)
    private String addiInfo;

    @Column(name = "REMARK1", length = 70)
    private String remark1;

    @Column(name = "REMARK2", length = 70)
    private String remark2;

    @Column(name = "REMARK3", length = 70)
    private String remark3;

    @Column(name = "SPLY_ORDR_NO", length = 35)
    private String splyOrdrNo;

    @Column(name = "ORDR_BINS_NO", length = 35)
    private String ordrBinsNo;

    @Column(name = "ORDR_REF_NAME", length = 35)
    private String ordrRefName;

    @Column(name = "ORDR_COND", length = 35)
    private String ordrCond;

    @Column(name = "ORDR_BINS_TYPE", length = 35)
    private String ordrBinsType;

    @Column(name = "ORDR_ETC", length = 150)
    private String ordrEtc;

    @Column(name = "ORDR_MP_CODE", length = 35)
    private String ordrMpCode;

    @Column(name = "ORDR_MP_NAME", length = 100)
    private String ordrMpName;

    @Column(name = "ORDR_MP_CODE_MAP", length = 35)
    private String ordrMpCodeMap;

    @Column(name = "ORDR_LOC_NO", length = 35)
    private String ordrLocNo;

    @Column(name = "ORDR_CHAR", length = 120)
    private String ordrChar;

    @Column(name = "ORDR_CHAR_DEPT", length = 17)
    private String ordrCharDept;

    @Column(name = "ORDR_TEL_NO", length = 25)
    private String ordrTelNo;

    @Column(name = "DELV_BINS_NO", length = 35)
    private String delvBinsNo;

    @Column(name = "DELV_ETC", length = 90)
    private String delvEtc;

    @Column(name = "DELV_MP_CODE", length = 35)
    private String delvMpCode;

    @Column(name = "DELV_MP_NAME", length = 100)
    private String delvMpName;

    @Column(name = "DELV_MP_CODE_MAP", length = 35)
    private String delvMpCodeMap;

    @Column(name = "DELV_LOC_NO", length = 35)
    private String delvLocNo;

    @Column(name = "DELV_CHAR", length = 35)
    private String delvChar;

    @Column(name = "DELV_CHAR_DEPT", length = 17)
    private String delvCharDept;

    @Column(name = "SUPL_BINS_NO", length = 35)
    private String suplBinsNo;

    @Column(name = "SUPL_REF_NAME", length = 35)
    private String suplRefName;

    @Column(name = "SUPL_COND", length = 35)
    private String suplCond;

    @Column(name = "SUPL_BINS_TYPE", length = 35)
    private String suplBinsType;

    @Column(name = "SUPL_ETC", length = 35)
    private String suplEtc;

    @Column(name = "SUPL_MP_CODE", length = 35)
    private String suplMpCode;

    @Column(name = "SUPL_MP_NAME", length = 35)
    private String suplMpName;

    @Column(name = "SUPL_CHAR", length = 35)
    private String suplChar;

    @Column(name = "SUPL_CHAR_DEPT", length = 17)
    private String suplCharDept;

    @Column(name = "SUPL_LOC_NO", length = 35)
    private String suplLocNo;

    @Column(name = "TAX_TYPE", length = 35)
    private String taxType;

    @Column(name = "TAX_BASIS", length = 15)
    private String taxBasis;

    @Column(name = "TAX_RATE", length = 17)
    private String taxRate;

    @Column(name = "PMENT_REF_CODE", length = 3)
    private String pmentRefCode;

    @Column(name = "PMENT_RELA_CODE", length = 3)
    private String pmentRelaCode;

    @Column(name = "DCNT_TYPE_CODE", length = 35)
    private String dcntTypeCode;

    @Column(name = "DCNT_START_DATE", length = 35)
    private String dcntStartDate;

    @Column(name = "DCNT_END_DATE", length = 35)
    private String dcntEndDate;

    @Column(name = "TOT_ORDR_AMNT", precision = 18, scale = 2)
    private BigDecimal totOrdrAmnt;

    @Column(name = "TOT_TAX_AMNT", precision = 18, scale = 2)
    private BigDecimal totTaxAmnt;

    @Column(name = "TOT_SALE_AMNT", precision = 18)
    private BigDecimal totSaleAmnt;

    @Column(name = "TOT_DCNT_AMNT", precision = 18)
    private BigDecimal totDcntAmnt;

    @Column(name = "ORDR_ADDR", length = 500)
    private String ordrAddr;

    @Column(name = "SUPL_ADDR", length = 500)
    private String suplAddr;

    @Column(name = "LINE_CNT")
    private Integer lineCnt;

    @Column(name = "SENDYN")
    private Character sendyn;

    @Column(name = "REG_DATE", length = 14)
    private String regDate;

    @Column(name = "UPD_DATE", length = 14)
    private String updDate;

    @Column(name = "IF_FILENM", length = 64)
    private String ifFilenm;

    @Column(name = "IF_FILELN")
    private Integer ifFileln;

    public TbDpEdiOrdersMId getId() {
        return id;
    }

    public void setId(TbDpEdiOrdersMId id) {
        this.id = id;
    }

    public String getMesgCode() {
        return mesgCode;
    }

    public void setMesgCode(String mesgCode) {
        this.mesgCode = mesgCode;
    }

    public String getMesgFuncCode() {
        return mesgFuncCode;
    }

    public void setMesgFuncCode(String mesgFuncCode) {
        this.mesgFuncCode = mesgFuncCode;
    }

    public String getRespTypeCode() {
        return respTypeCode;
    }

    public void setRespTypeCode(String respTypeCode) {
        this.respTypeCode = respTypeCode;
    }

    public String getDelvDueDate() {
        return delvDueDate;
    }

    public void setDelvDueDate(String delvDueDate) {
        this.delvDueDate = delvDueDate;
    }

    public String getProcDate() {
        return procDate;
    }

    public void setProcDate(String procDate) {
        this.procDate = procDate;
    }

    public String getRespDueDate() {
        return respDueDate;
    }

    public void setRespDueDate(String respDueDate) {
        this.respDueDate = respDueDate;
    }

    public String getDelvPrmiDate() {
        return delvPrmiDate;
    }

    public void setDelvPrmiDate(String delvPrmiDate) {
        this.delvPrmiDate = delvPrmiDate;
    }

    public String getPmentCode() {
        return pmentCode;
    }

    public void setPmentCode(String pmentCode) {
        this.pmentCode = pmentCode;
    }

    public String getPmentName() {
        return pmentName;
    }

    public void setPmentName(String pmentName) {
        this.pmentName = pmentName;
    }

    public String getProdClasCode() {
        return prodClasCode;
    }

    public void setProdClasCode(String prodClasCode) {
        this.prodClasCode = prodClasCode;
    }

    public String getProdClasName() {
        return prodClasName;
    }

    public void setProdClasName(String prodClasName) {
        this.prodClasName = prodClasName;
    }

    public String getPurcType() {
        return purcType;
    }

    public void setPurcType(String purcType) {
        this.purcType = purcType;
    }

    public String getGenInfo() {
        return genInfo;
    }

    public void setGenInfo(String genInfo) {
        this.genInfo = genInfo;
    }

    public String getPrceCond() {
        return prceCond;
    }

    public void setPrceCond(String prceCond) {
        this.prceCond = prceCond;
    }

    public String getAddiInfo() {
        return addiInfo;
    }

    public void setAddiInfo(String addiInfo) {
        this.addiInfo = addiInfo;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

    public String getRemark3() {
        return remark3;
    }

    public void setRemark3(String remark3) {
        this.remark3 = remark3;
    }

    public String getSplyOrdrNo() {
        return splyOrdrNo;
    }

    public void setSplyOrdrNo(String splyOrdrNo) {
        this.splyOrdrNo = splyOrdrNo;
    }

    public String getOrdrBinsNo() {
        return ordrBinsNo;
    }

    public void setOrdrBinsNo(String ordrBinsNo) {
        this.ordrBinsNo = ordrBinsNo;
    }

    public String getOrdrRefName() {
        return ordrRefName;
    }

    public void setOrdrRefName(String ordrRefName) {
        this.ordrRefName = ordrRefName;
    }

    public String getOrdrCond() {
        return ordrCond;
    }

    public void setOrdrCond(String ordrCond) {
        this.ordrCond = ordrCond;
    }

    public String getOrdrBinsType() {
        return ordrBinsType;
    }

    public void setOrdrBinsType(String ordrBinsType) {
        this.ordrBinsType = ordrBinsType;
    }

    public String getOrdrEtc() {
        return ordrEtc;
    }

    public void setOrdrEtc(String ordrEtc) {
        this.ordrEtc = ordrEtc;
    }

    public String getOrdrMpCode() {
        return ordrMpCode;
    }

    public void setOrdrMpCode(String ordrMpCode) {
        this.ordrMpCode = ordrMpCode;
    }

    public String getOrdrMpName() {
        return ordrMpName;
    }

    public void setOrdrMpName(String ordrMpName) {
        this.ordrMpName = ordrMpName;
    }

    public String getOrdrMpCodeMap() {
        return ordrMpCodeMap;
    }

    public void setOrdrMpCodeMap(String ordrMpCodeMap) {
        this.ordrMpCodeMap = ordrMpCodeMap;
    }

    public String getOrdrLocNo() {
        return ordrLocNo;
    }

    public void setOrdrLocNo(String ordrLocNo) {
        this.ordrLocNo = ordrLocNo;
    }

    public String getOrdrChar() {
        return ordrChar;
    }

    public void setOrdrChar(String ordrChar) {
        this.ordrChar = ordrChar;
    }

    public String getOrdrCharDept() {
        return ordrCharDept;
    }

    public void setOrdrCharDept(String ordrCharDept) {
        this.ordrCharDept = ordrCharDept;
    }

    public String getOrdrTelNo() {
        return ordrTelNo;
    }

    public void setOrdrTelNo(String ordrTelNo) {
        this.ordrTelNo = ordrTelNo;
    }

    public String getDelvBinsNo() {
        return delvBinsNo;
    }

    public void setDelvBinsNo(String delvBinsNo) {
        this.delvBinsNo = delvBinsNo;
    }

    public String getDelvEtc() {
        return delvEtc;
    }

    public void setDelvEtc(String delvEtc) {
        this.delvEtc = delvEtc;
    }

    public String getDelvMpCode() {
        return delvMpCode;
    }

    public void setDelvMpCode(String delvMpCode) {
        this.delvMpCode = delvMpCode;
    }

    public String getDelvMpName() {
        return delvMpName;
    }

    public void setDelvMpName(String delvMpName) {
        this.delvMpName = delvMpName;
    }

    public String getDelvMpCodeMap() {
        return delvMpCodeMap;
    }

    public void setDelvMpCodeMap(String delvMpCodeMap) {
        this.delvMpCodeMap = delvMpCodeMap;
    }

    public String getDelvLocNo() {
        return delvLocNo;
    }

    public void setDelvLocNo(String delvLocNo) {
        this.delvLocNo = delvLocNo;
    }

    public String getDelvChar() {
        return delvChar;
    }

    public void setDelvChar(String delvChar) {
        this.delvChar = delvChar;
    }

    public String getDelvCharDept() {
        return delvCharDept;
    }

    public void setDelvCharDept(String delvCharDept) {
        this.delvCharDept = delvCharDept;
    }

    public String getSuplBinsNo() {
        return suplBinsNo;
    }

    public void setSuplBinsNo(String suplBinsNo) {
        this.suplBinsNo = suplBinsNo;
    }

    public String getSuplRefName() {
        return suplRefName;
    }

    public void setSuplRefName(String suplRefName) {
        this.suplRefName = suplRefName;
    }

    public String getSuplCond() {
        return suplCond;
    }

    public void setSuplCond(String suplCond) {
        this.suplCond = suplCond;
    }

    public String getSuplBinsType() {
        return suplBinsType;
    }

    public void setSuplBinsType(String suplBinsType) {
        this.suplBinsType = suplBinsType;
    }

    public String getSuplEtc() {
        return suplEtc;
    }

    public void setSuplEtc(String suplEtc) {
        this.suplEtc = suplEtc;
    }

    public String getSuplMpCode() {
        return suplMpCode;
    }

    public void setSuplMpCode(String suplMpCode) {
        this.suplMpCode = suplMpCode;
    }

    public String getSuplMpName() {
        return suplMpName;
    }

    public void setSuplMpName(String suplMpName) {
        this.suplMpName = suplMpName;
    }

    public String getSuplChar() {
        return suplChar;
    }

    public void setSuplChar(String suplChar) {
        this.suplChar = suplChar;
    }

    public String getSuplCharDept() {
        return suplCharDept;
    }

    public void setSuplCharDept(String suplCharDept) {
        this.suplCharDept = suplCharDept;
    }

    public String getSuplLocNo() {
        return suplLocNo;
    }

    public void setSuplLocNo(String suplLocNo) {
        this.suplLocNo = suplLocNo;
    }

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public String getTaxBasis() {
        return taxBasis;
    }

    public void setTaxBasis(String taxBasis) {
        this.taxBasis = taxBasis;
    }

    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    public String getPmentRefCode() {
        return pmentRefCode;
    }

    public void setPmentRefCode(String pmentRefCode) {
        this.pmentRefCode = pmentRefCode;
    }

    public String getPmentRelaCode() {
        return pmentRelaCode;
    }

    public void setPmentRelaCode(String pmentRelaCode) {
        this.pmentRelaCode = pmentRelaCode;
    }

    public String getDcntTypeCode() {
        return dcntTypeCode;
    }

    public void setDcntTypeCode(String dcntTypeCode) {
        this.dcntTypeCode = dcntTypeCode;
    }

    public String getDcntStartDate() {
        return dcntStartDate;
    }

    public void setDcntStartDate(String dcntStartDate) {
        this.dcntStartDate = dcntStartDate;
    }

    public String getDcntEndDate() {
        return dcntEndDate;
    }

    public void setDcntEndDate(String dcntEndDate) {
        this.dcntEndDate = dcntEndDate;
    }

    public BigDecimal getTotOrdrAmnt() {
        return totOrdrAmnt;
    }

    public void setTotOrdrAmnt(BigDecimal totOrdrAmnt) {
        this.totOrdrAmnt = totOrdrAmnt;
    }

    public BigDecimal getTotTaxAmnt() {
        return totTaxAmnt;
    }

    public void setTotTaxAmnt(BigDecimal totTaxAmnt) {
        this.totTaxAmnt = totTaxAmnt;
    }

    public BigDecimal getTotSaleAmnt() {
        return totSaleAmnt;
    }

    public void setTotSaleAmnt(BigDecimal totSaleAmnt) {
        this.totSaleAmnt = totSaleAmnt;
    }

    public BigDecimal getTotDcntAmnt() {
        return totDcntAmnt;
    }

    public void setTotDcntAmnt(BigDecimal totDcntAmnt) {
        this.totDcntAmnt = totDcntAmnt;
    }

    public String getOrdrAddr() {
        return ordrAddr;
    }

    public void setOrdrAddr(String ordrAddr) {
        this.ordrAddr = ordrAddr;
    }

    public String getSuplAddr() {
        return suplAddr;
    }

    public void setSuplAddr(String suplAddr) {
        this.suplAddr = suplAddr;
    }

    public Integer getLineCnt() {
        return lineCnt;
    }

    public void setLineCnt(Integer lineCnt) {
        this.lineCnt = lineCnt;
    }

    public Character getSendyn() {
        return sendyn;
    }

    public void setSendyn(Character sendyn) {
        this.sendyn = sendyn;
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

    public String getIfFilenm() {
        return ifFilenm;
    }

    public void setIfFilenm(String ifFilenm) {
        this.ifFilenm = ifFilenm;
    }

    public Integer getIfFileln() {
        return ifFileln;
    }

    public void setIfFileln(Integer ifFileln) {
        this.ifFileln = ifFileln;
    }

}