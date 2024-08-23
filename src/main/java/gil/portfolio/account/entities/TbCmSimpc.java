package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;

//@Entity
//@Table(name = "tb_cm_simpc", schema = "escm")
public class TbCmSimpc {
    @EmbeddedId
    private TbCmSimpcId id;

    @Column(name = "SIMP_CNM", nullable = false, length = 300)
    private String simpCnm;

    @Column(name = "SIMP_C_EXPL", length = 2000)
    private String simpCExpl;

    @Column(name = "SIMP_C_SORT_SQ", precision = 18, scale = 3)
    private BigDecimal simpCSortSq;

    @Column(name = "BIZ_TYPE", length = 50)
    private String bizType;

    @ColumnDefault("'Y'")
    @Column(name = "USE_YN", nullable = false)
    private Character useYn;

    @ColumnDefault("'0'")
    @Column(name = "DEL_YN", nullable = false)
    private Character delYn;

    public TbCmSimpcId getId() {
        return id;
    }

    public void setId(TbCmSimpcId id) {
        this.id = id;
    }

    public String getSimpCnm() {
        return simpCnm;
    }

    public void setSimpCnm(String simpCnm) {
        this.simpCnm = simpCnm;
    }

    public String getSimpCExpl() {
        return simpCExpl;
    }

    public void setSimpCExpl(String simpCExpl) {
        this.simpCExpl = simpCExpl;
    }

    public BigDecimal getSimpCSortSq() {
        return simpCSortSq;
    }

    public void setSimpCSortSq(BigDecimal simpCSortSq) {
        this.simpCSortSq = simpCSortSq;
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public Character getUseYn() {
        return useYn;
    }

    public void setUseYn(Character useYn) {
        this.useYn = useYn;
    }

    public Character getDelYn() {
        return delYn;
    }

    public void setDelYn(Character delYn) {
        this.delYn = delYn;
    }

}