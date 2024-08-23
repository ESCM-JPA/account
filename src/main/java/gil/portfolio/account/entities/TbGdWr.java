package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

//@Entity
//@Table(name = "tb_gd_wrs", schema = "escm")
public class TbGdWr {
    @Id
    @Column(name = "NA_WRS_C", nullable = false, length = 25)
    private String naWrsC;

    @Column(name = "WRS_C_DSC", nullable = false)
    private Character wrsCDsc;

    @Column(name = "WRS_DSC")
    private Character wrsDsc;

    @Column(name = "WRSNM", nullable = false, length = 200)
    private String wrsnm;

    @Column(name = "WRS_ABR_NM", length = 100)
    private String wrsAbrNm;

    @Column(name = "WRS_ENM", length = 100)
    private String wrsEnm;

    @Column(name = "WRS_TPC", nullable = false)
    private Character wrsTpc;

    @Column(name = "NA_WRS_LCLC", nullable = false, length = 3)
    private String naWrsLclc;

    @Column(name = "NA_WRS_MCLC", nullable = false, length = 3)
    private String naWrsMclc;

    @Column(name = "NA_WRS_SCLC", nullable = false, length = 3)
    private String naWrsSclc;

    @Column(name = "NA_WRS_DTCF_C", nullable = false, length = 3)
    private String naWrsDtcfC;

    @Column(name = "WRS_STDNM", length = 100)
    private String wrsStdnm;

    @Column(name = "TXT_DSC", nullable = false)
    private Character txtDsc;

    @Column(name = "SMA_APL_TPC")
    private Character smaAplTpc;

    @Column(name = "LIQ_YN", nullable = false)
    private Character liqYn;

    @Column(name = "MFT_NA_TRPL_C", length = 13)
    private String mftNaTrplC;

    @Column(name = "WHT", nullable = false, precision = 15, scale = 4)
    private BigDecimal wht;

    @Column(name = "NA_WRS_UNT_C", nullable = false, length = 3)
    private String naWrsUntC;

    @Column(name = "NA_WRS_SZE_SEX_C", nullable = false, length = 3)
    private String naWrsSzeSexC;

    @Column(name = "NA_WRS_QLT_GRDC", nullable = false, length = 3)
    private String naWrsQltGrdc;

    @Column(name = "NA_WRS_BRAN_C", nullable = false, length = 6)
    private String naWrsBranC;

    @Column(name = "NA_WRS_PROENV_DSC", nullable = false, length = 3)
    private String naWrsProenvDsc;

    @Column(name = "GAP_ATTC_YN", nullable = false)
    private Character gapAttcYn;

    @Column(name = "NA_WRS_NACF_QLT_ATTC_C", nullable = false, length = 3)
    private String naWrsNacfQltAttcC;

    @Column(name = "NA_WRS_CSTD_METC", nullable = false, length = 3)
    private String naWrsCstdMetc;

    @Column(name = "NA_WRS_DSTR_STSC", nullable = false, length = 3)
    private String naWrsDstrStsc;

    @Column(name = "NA_WRS_UZC", nullable = false, length = 3)
    private String naWrsUzc;

    @Column(name = "NA_WRS_IPO_DSC", nullable = false)
    private Character naWrsIpoDsc;

    @Column(name = "NA_WRS_PDAA_C", nullable = false, length = 6)
    private String naWrsPdaaC;

    @Column(name = "VLD_PRD_CN", precision = 7)
    private BigDecimal vldPrdCn;

    @Column(name = "VLD_PRD_DSC")
    private Character vldPrdDsc;

    @Column(name = "NA_WRS_STD_UNT_C", length = 2)
    private String naWrsStdUntC;

    @Column(name = "WRS_HGHT", precision = 7)
    private BigDecimal wrsHght;

    @Column(name = "WRS_LEN_LEN", precision = 12, scale = 2)
    private BigDecimal wrsLenLen;

    @Column(name = "WRS_WDTH_LEN", precision = 12, scale = 2)
    private BigDecimal wrsWdthLen;

    @Column(name = "VCBT_NA_WRS_C", length = 25)
    private String vcbtNaWrsC;

    @Column(name = "VCBT_QT", precision = 7)
    private BigDecimal vcbtQt;

    @Column(name = "VCBX_NA_WRS_C", length = 25)
    private String vcbxNaWrsC;

    @Column(name = "CVS_QT", precision = 15, scale = 2)
    private BigDecimal cvsQt;

    @Column(name = "CVS_NA_WRS_UNT_C", length = 3)
    private String cvsNaWrsUntC;

    @Column(name = "WRS_DTL_EXPL", length = 4000)
    private String wrsDtlExpl;

    @Column(name = "BSC_UNT_DSC", nullable = false)
    private Character bscUntDsc;

    @Column(name = "BOXPE_AQZ", precision = 10)
    private BigDecimal boxpeAqz;

    @Column(name = "KNET_WRS_NO")
    private Integer knetWrsNo;

    @Column(name = "TR_STOP_YN", nullable = false)
    private Character trStopYn;

    @Column(name = "TR_STOP_RSNC", length = 2)
    private String trStopRsnc;

    @Column(name = "TR_STOP_DT", length = 8)
    private String trStopDt;

    @Column(name = "DEL_YN", nullable = false)
    private Character delYn;

    @Column(name = "FSRG_DTM")
    private LocalDate fsrgDtm;

    @Column(name = "FSRGMN_ENO", length = 9)
    private String fsrgmnEno;

    @Column(name = "FSRGMN_NA_BZPLC", length = 13)
    private String fsrgmnNaBzplc;

    @Column(name = "LSCHG_DTM")
    private LocalDate lschgDtm;

    @Column(name = "LS_CMENO", length = 11)
    private String lsCmeno;

    @Column(name = "LSCGMN_NA_BZPLC", length = 13)
    private String lscgmnNaBzplc;

    @Column(name = "DSTR_TER_MRK_DSC")
    private Character dstrTerMrkDsc;

    @Column(name = "DSTR_TER_AMN_YN")
    private Character dstrTerAmnYn;

    @Column(name = "LIQ_UZ_DSC", length = 2)
    private String liqUzDsc;

    @Column(name = "SNUM_CNTN", length = 20)
    private String snumCntn;

    @Column(name = "RFID_UYN")
    private Character rfidUyn;

    @Column(name = "WRS_BIZTP_DSC")
    private Character wrsBiztpDsc;

    @Column(name = "NACF_XUSE_WRS_YN")
    private Character nacfXuseWrsYn;

    @Column(name = "PLG_WRS_YN")
    private Character plgWrsYn;

    @Column(name = "FTS_SET_YN")
    private Character ftsSetYn;

    @Column(name = "LWCRBN_ATTC_YN")
    private Character lwcrbnAttcYn;

    @Column(name = "LIQ_DSC", length = 2)
    private String liqDsc;

    @Column(name = "PAK_METH_DSC", length = 2)
    private String pakMethDsc;

    @Column(name = "PAK_QLT_DSC", length = 2)
    private String pakQltDsc;

    @Column(name = "VCPBX_UPR", precision = 18, scale = 3)
    private BigDecimal vcpbxUpr;

    @Column(name = "VCBT_UPR", precision = 18, scale = 3)
    private BigDecimal vcbtUpr;

    @Column(name = "PLG_WRS_KD")
    private Character plgWrsKd;

    @Column(name = "WRS_ADD_TPC", length = 2)
    private String wrsAddTpc;

    @Column(name = "PLC_GRD_C")
    private Character plcGrdC;

    @Column(name = "ONL_OBJ_YN")
    private Character onlObjYn;

    @Column(name = "POG_OBJ_YN")
    private Character pogObjYn;

    @Column(name = "MN1_HSH_WRS_YN")
    private Character mn1HshWrsYn;

    @Column(name = "NEW_SEX_DSC")
    private Character newSexDsc;

    @Column(name = "CUS_AG_LRG_DSC", length = 2)
    private String cusAgLrgDsc;

    @Column(name = "HACCP_ATTC_YN")
    private Character haccpAttcYn;

    @Column(name = "NEW_SSN_DSC")
    private Character newSsnDsc;

    @Column(name = "KC_ATTC_ESS_YN")
    private Character kcAttcEssYn;

    @Column(name = "DEL_RSN_C", length = 2)
    private String delRsnC;

    @Column(name = "GENE_TFMT_FOOD_YN")
    private Character geneTfmtFoodYn;

    @Column(name = "DEL_DT", length = 8)
    private String delDt;

    @Column(name = "DEL_DTM")
    private LocalDate delDtm;

    @Column(name = "DLMN_NA_BZPLC", length = 13)
    private String dlmnNaBzplc;

    @Column(name = "SKU_GRD_C", length = 4)
    private String skuGrdC;

    @Column(name = "DLMN_ENO", length = 9)
    private String dlmnEno;

    public String getNaWrsC() {
        return naWrsC;
    }

    public void setNaWrsC(String naWrsC) {
        this.naWrsC = naWrsC;
    }

    public Character getWrsCDsc() {
        return wrsCDsc;
    }

    public void setWrsCDsc(Character wrsCDsc) {
        this.wrsCDsc = wrsCDsc;
    }

    public Character getWrsDsc() {
        return wrsDsc;
    }

    public void setWrsDsc(Character wrsDsc) {
        this.wrsDsc = wrsDsc;
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

    public String getWrsEnm() {
        return wrsEnm;
    }

    public void setWrsEnm(String wrsEnm) {
        this.wrsEnm = wrsEnm;
    }

    public Character getWrsTpc() {
        return wrsTpc;
    }

    public void setWrsTpc(Character wrsTpc) {
        this.wrsTpc = wrsTpc;
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

    public String getWrsStdnm() {
        return wrsStdnm;
    }

    public void setWrsStdnm(String wrsStdnm) {
        this.wrsStdnm = wrsStdnm;
    }

    public Character getTxtDsc() {
        return txtDsc;
    }

    public void setTxtDsc(Character txtDsc) {
        this.txtDsc = txtDsc;
    }

    public Character getSmaAplTpc() {
        return smaAplTpc;
    }

    public void setSmaAplTpc(Character smaAplTpc) {
        this.smaAplTpc = smaAplTpc;
    }

    public Character getLiqYn() {
        return liqYn;
    }

    public void setLiqYn(Character liqYn) {
        this.liqYn = liqYn;
    }

    public String getMftNaTrplC() {
        return mftNaTrplC;
    }

    public void setMftNaTrplC(String mftNaTrplC) {
        this.mftNaTrplC = mftNaTrplC;
    }

    public BigDecimal getWht() {
        return wht;
    }

    public void setWht(BigDecimal wht) {
        this.wht = wht;
    }

    public String getNaWrsUntC() {
        return naWrsUntC;
    }

    public void setNaWrsUntC(String naWrsUntC) {
        this.naWrsUntC = naWrsUntC;
    }

    public String getNaWrsSzeSexC() {
        return naWrsSzeSexC;
    }

    public void setNaWrsSzeSexC(String naWrsSzeSexC) {
        this.naWrsSzeSexC = naWrsSzeSexC;
    }

    public String getNaWrsQltGrdc() {
        return naWrsQltGrdc;
    }

    public void setNaWrsQltGrdc(String naWrsQltGrdc) {
        this.naWrsQltGrdc = naWrsQltGrdc;
    }

    public String getNaWrsBranC() {
        return naWrsBranC;
    }

    public void setNaWrsBranC(String naWrsBranC) {
        this.naWrsBranC = naWrsBranC;
    }

    public String getNaWrsProenvDsc() {
        return naWrsProenvDsc;
    }

    public void setNaWrsProenvDsc(String naWrsProenvDsc) {
        this.naWrsProenvDsc = naWrsProenvDsc;
    }

    public Character getGapAttcYn() {
        return gapAttcYn;
    }

    public void setGapAttcYn(Character gapAttcYn) {
        this.gapAttcYn = gapAttcYn;
    }

    public String getNaWrsNacfQltAttcC() {
        return naWrsNacfQltAttcC;
    }

    public void setNaWrsNacfQltAttcC(String naWrsNacfQltAttcC) {
        this.naWrsNacfQltAttcC = naWrsNacfQltAttcC;
    }

    public String getNaWrsCstdMetc() {
        return naWrsCstdMetc;
    }

    public void setNaWrsCstdMetc(String naWrsCstdMetc) {
        this.naWrsCstdMetc = naWrsCstdMetc;
    }

    public String getNaWrsDstrStsc() {
        return naWrsDstrStsc;
    }

    public void setNaWrsDstrStsc(String naWrsDstrStsc) {
        this.naWrsDstrStsc = naWrsDstrStsc;
    }

    public String getNaWrsUzc() {
        return naWrsUzc;
    }

    public void setNaWrsUzc(String naWrsUzc) {
        this.naWrsUzc = naWrsUzc;
    }

    public Character getNaWrsIpoDsc() {
        return naWrsIpoDsc;
    }

    public void setNaWrsIpoDsc(Character naWrsIpoDsc) {
        this.naWrsIpoDsc = naWrsIpoDsc;
    }

    public String getNaWrsPdaaC() {
        return naWrsPdaaC;
    }

    public void setNaWrsPdaaC(String naWrsPdaaC) {
        this.naWrsPdaaC = naWrsPdaaC;
    }

    public BigDecimal getVldPrdCn() {
        return vldPrdCn;
    }

    public void setVldPrdCn(BigDecimal vldPrdCn) {
        this.vldPrdCn = vldPrdCn;
    }

    public Character getVldPrdDsc() {
        return vldPrdDsc;
    }

    public void setVldPrdDsc(Character vldPrdDsc) {
        this.vldPrdDsc = vldPrdDsc;
    }

    public String getNaWrsStdUntC() {
        return naWrsStdUntC;
    }

    public void setNaWrsStdUntC(String naWrsStdUntC) {
        this.naWrsStdUntC = naWrsStdUntC;
    }

    public BigDecimal getWrsHght() {
        return wrsHght;
    }

    public void setWrsHght(BigDecimal wrsHght) {
        this.wrsHght = wrsHght;
    }

    public BigDecimal getWrsLenLen() {
        return wrsLenLen;
    }

    public void setWrsLenLen(BigDecimal wrsLenLen) {
        this.wrsLenLen = wrsLenLen;
    }

    public BigDecimal getWrsWdthLen() {
        return wrsWdthLen;
    }

    public void setWrsWdthLen(BigDecimal wrsWdthLen) {
        this.wrsWdthLen = wrsWdthLen;
    }

    public String getVcbtNaWrsC() {
        return vcbtNaWrsC;
    }

    public void setVcbtNaWrsC(String vcbtNaWrsC) {
        this.vcbtNaWrsC = vcbtNaWrsC;
    }

    public BigDecimal getVcbtQt() {
        return vcbtQt;
    }

    public void setVcbtQt(BigDecimal vcbtQt) {
        this.vcbtQt = vcbtQt;
    }

    public String getVcbxNaWrsC() {
        return vcbxNaWrsC;
    }

    public void setVcbxNaWrsC(String vcbxNaWrsC) {
        this.vcbxNaWrsC = vcbxNaWrsC;
    }

    public BigDecimal getCvsQt() {
        return cvsQt;
    }

    public void setCvsQt(BigDecimal cvsQt) {
        this.cvsQt = cvsQt;
    }

    public String getCvsNaWrsUntC() {
        return cvsNaWrsUntC;
    }

    public void setCvsNaWrsUntC(String cvsNaWrsUntC) {
        this.cvsNaWrsUntC = cvsNaWrsUntC;
    }

    public String getWrsDtlExpl() {
        return wrsDtlExpl;
    }

    public void setWrsDtlExpl(String wrsDtlExpl) {
        this.wrsDtlExpl = wrsDtlExpl;
    }

    public Character getBscUntDsc() {
        return bscUntDsc;
    }

    public void setBscUntDsc(Character bscUntDsc) {
        this.bscUntDsc = bscUntDsc;
    }

    public BigDecimal getBoxpeAqz() {
        return boxpeAqz;
    }

    public void setBoxpeAqz(BigDecimal boxpeAqz) {
        this.boxpeAqz = boxpeAqz;
    }

    public Integer getKnetWrsNo() {
        return knetWrsNo;
    }

    public void setKnetWrsNo(Integer knetWrsNo) {
        this.knetWrsNo = knetWrsNo;
    }

    public Character getTrStopYn() {
        return trStopYn;
    }

    public void setTrStopYn(Character trStopYn) {
        this.trStopYn = trStopYn;
    }

    public String getTrStopRsnc() {
        return trStopRsnc;
    }

    public void setTrStopRsnc(String trStopRsnc) {
        this.trStopRsnc = trStopRsnc;
    }

    public String getTrStopDt() {
        return trStopDt;
    }

    public void setTrStopDt(String trStopDt) {
        this.trStopDt = trStopDt;
    }

    public Character getDelYn() {
        return delYn;
    }

    public void setDelYn(Character delYn) {
        this.delYn = delYn;
    }

    public LocalDate getFsrgDtm() {
        return fsrgDtm;
    }

    public void setFsrgDtm(LocalDate fsrgDtm) {
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

    public LocalDate getLschgDtm() {
        return lschgDtm;
    }

    public void setLschgDtm(LocalDate lschgDtm) {
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

    public Character getDstrTerMrkDsc() {
        return dstrTerMrkDsc;
    }

    public void setDstrTerMrkDsc(Character dstrTerMrkDsc) {
        this.dstrTerMrkDsc = dstrTerMrkDsc;
    }

    public Character getDstrTerAmnYn() {
        return dstrTerAmnYn;
    }

    public void setDstrTerAmnYn(Character dstrTerAmnYn) {
        this.dstrTerAmnYn = dstrTerAmnYn;
    }

    public String getLiqUzDsc() {
        return liqUzDsc;
    }

    public void setLiqUzDsc(String liqUzDsc) {
        this.liqUzDsc = liqUzDsc;
    }

    public String getSnumCntn() {
        return snumCntn;
    }

    public void setSnumCntn(String snumCntn) {
        this.snumCntn = snumCntn;
    }

    public Character getRfidUyn() {
        return rfidUyn;
    }

    public void setRfidUyn(Character rfidUyn) {
        this.rfidUyn = rfidUyn;
    }

    public Character getWrsBiztpDsc() {
        return wrsBiztpDsc;
    }

    public void setWrsBiztpDsc(Character wrsBiztpDsc) {
        this.wrsBiztpDsc = wrsBiztpDsc;
    }

    public Character getNacfXuseWrsYn() {
        return nacfXuseWrsYn;
    }

    public void setNacfXuseWrsYn(Character nacfXuseWrsYn) {
        this.nacfXuseWrsYn = nacfXuseWrsYn;
    }

    public Character getPlgWrsYn() {
        return plgWrsYn;
    }

    public void setPlgWrsYn(Character plgWrsYn) {
        this.plgWrsYn = plgWrsYn;
    }

    public Character getFtsSetYn() {
        return ftsSetYn;
    }

    public void setFtsSetYn(Character ftsSetYn) {
        this.ftsSetYn = ftsSetYn;
    }

    public Character getLwcrbnAttcYn() {
        return lwcrbnAttcYn;
    }

    public void setLwcrbnAttcYn(Character lwcrbnAttcYn) {
        this.lwcrbnAttcYn = lwcrbnAttcYn;
    }

    public String getLiqDsc() {
        return liqDsc;
    }

    public void setLiqDsc(String liqDsc) {
        this.liqDsc = liqDsc;
    }

    public String getPakMethDsc() {
        return pakMethDsc;
    }

    public void setPakMethDsc(String pakMethDsc) {
        this.pakMethDsc = pakMethDsc;
    }

    public String getPakQltDsc() {
        return pakQltDsc;
    }

    public void setPakQltDsc(String pakQltDsc) {
        this.pakQltDsc = pakQltDsc;
    }

    public BigDecimal getVcpbxUpr() {
        return vcpbxUpr;
    }

    public void setVcpbxUpr(BigDecimal vcpbxUpr) {
        this.vcpbxUpr = vcpbxUpr;
    }

    public BigDecimal getVcbtUpr() {
        return vcbtUpr;
    }

    public void setVcbtUpr(BigDecimal vcbtUpr) {
        this.vcbtUpr = vcbtUpr;
    }

    public Character getPlgWrsKd() {
        return plgWrsKd;
    }

    public void setPlgWrsKd(Character plgWrsKd) {
        this.plgWrsKd = plgWrsKd;
    }

    public String getWrsAddTpc() {
        return wrsAddTpc;
    }

    public void setWrsAddTpc(String wrsAddTpc) {
        this.wrsAddTpc = wrsAddTpc;
    }

    public Character getPlcGrdC() {
        return plcGrdC;
    }

    public void setPlcGrdC(Character plcGrdC) {
        this.plcGrdC = plcGrdC;
    }

    public Character getOnlObjYn() {
        return onlObjYn;
    }

    public void setOnlObjYn(Character onlObjYn) {
        this.onlObjYn = onlObjYn;
    }

    public Character getPogObjYn() {
        return pogObjYn;
    }

    public void setPogObjYn(Character pogObjYn) {
        this.pogObjYn = pogObjYn;
    }

    public Character getMn1HshWrsYn() {
        return mn1HshWrsYn;
    }

    public void setMn1HshWrsYn(Character mn1HshWrsYn) {
        this.mn1HshWrsYn = mn1HshWrsYn;
    }

    public Character getNewSexDsc() {
        return newSexDsc;
    }

    public void setNewSexDsc(Character newSexDsc) {
        this.newSexDsc = newSexDsc;
    }

    public String getCusAgLrgDsc() {
        return cusAgLrgDsc;
    }

    public void setCusAgLrgDsc(String cusAgLrgDsc) {
        this.cusAgLrgDsc = cusAgLrgDsc;
    }

    public Character getHaccpAttcYn() {
        return haccpAttcYn;
    }

    public void setHaccpAttcYn(Character haccpAttcYn) {
        this.haccpAttcYn = haccpAttcYn;
    }

    public Character getNewSsnDsc() {
        return newSsnDsc;
    }

    public void setNewSsnDsc(Character newSsnDsc) {
        this.newSsnDsc = newSsnDsc;
    }

    public Character getKcAttcEssYn() {
        return kcAttcEssYn;
    }

    public void setKcAttcEssYn(Character kcAttcEssYn) {
        this.kcAttcEssYn = kcAttcEssYn;
    }

    public String getDelRsnC() {
        return delRsnC;
    }

    public void setDelRsnC(String delRsnC) {
        this.delRsnC = delRsnC;
    }

    public Character getGeneTfmtFoodYn() {
        return geneTfmtFoodYn;
    }

    public void setGeneTfmtFoodYn(Character geneTfmtFoodYn) {
        this.geneTfmtFoodYn = geneTfmtFoodYn;
    }

    public String getDelDt() {
        return delDt;
    }

    public void setDelDt(String delDt) {
        this.delDt = delDt;
    }

    public LocalDate getDelDtm() {
        return delDtm;
    }

    public void setDelDtm(LocalDate delDtm) {
        this.delDtm = delDtm;
    }

    public String getDlmnNaBzplc() {
        return dlmnNaBzplc;
    }

    public void setDlmnNaBzplc(String dlmnNaBzplc) {
        this.dlmnNaBzplc = dlmnNaBzplc;
    }

    public String getSkuGrdC() {
        return skuGrdC;
    }

    public void setSkuGrdC(String skuGrdC) {
        this.skuGrdC = skuGrdC;
    }

    public String getDlmnEno() {
        return dlmnEno;
    }

    public void setDlmnEno(String dlmnEno) {
        this.dlmnEno = dlmnEno;
    }

}