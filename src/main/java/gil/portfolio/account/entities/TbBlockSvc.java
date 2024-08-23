package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.Instant;

//@Entity
//@Table(name = "tb_block_svc", schema = "escm")
public class TbBlockSvc {
    @Column(name = "BLOCK_SQNO", nullable = false, length = 12)
    private String blockSqno;

    @Column(name = "BLOCK_TI", nullable = false, length = 250)
    private String blockTi;

    @Column(name = "BLOCK_ST_DTM", nullable = false)
    private Instant blockStDtm;

    @Column(name = "BLOCK_ED_DTM", nullable = false)
    private Instant blockEdDtm;

    @Column(name = "BLOCK_CNTN", length = 250)
    private String blockCntn;

    @Column(name = "BLOCK_PGM", length = 20)
    private String blockPgm;

    @Column(name = "BSN_DSC", nullable = false, length = 16)
    private String bsnDsc;

    @Column(name = "UYN")
    private Character uyn;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "FS_RGM", length = 9)
    private String fsRgm;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CHGM", length = 9)
    private String lsChgm;

    public String getBlockSqno() {
        return blockSqno;
    }

    public void setBlockSqno(String blockSqno) {
        this.blockSqno = blockSqno;
    }

    public String getBlockTi() {
        return blockTi;
    }

    public void setBlockTi(String blockTi) {
        this.blockTi = blockTi;
    }

    public Instant getBlockStDtm() {
        return blockStDtm;
    }

    public void setBlockStDtm(Instant blockStDtm) {
        this.blockStDtm = blockStDtm;
    }

    public Instant getBlockEdDtm() {
        return blockEdDtm;
    }

    public void setBlockEdDtm(Instant blockEdDtm) {
        this.blockEdDtm = blockEdDtm;
    }

    public String getBlockCntn() {
        return blockCntn;
    }

    public void setBlockCntn(String blockCntn) {
        this.blockCntn = blockCntn;
    }

    public String getBlockPgm() {
        return blockPgm;
    }

    public void setBlockPgm(String blockPgm) {
        this.blockPgm = blockPgm;
    }

    public String getBsnDsc() {
        return bsnDsc;
    }

    public void setBsnDsc(String bsnDsc) {
        this.bsnDsc = bsnDsc;
    }

    public Character getUyn() {
        return uyn;
    }

    public void setUyn(Character uyn) {
        this.uyn = uyn;
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