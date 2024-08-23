package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

//@Entity
//@Table(name = "tb_tr_rgn", schema = "escm")
public class TbTrRgn {
    @Id
    @Column(name = "NA_RGN_C", nullable = false, length = 4)
    private String naRgnC;

    @Column(name = "UP_NA_RGN_C", length = 4)
    private String upNaRgnC;

    @Column(name = "RGN_CNM", length = 50)
    private String rgnCnm;

    @Column(name = "RGN_LVL_C")
    private Character rgnLvlC;

    @Column(name = "RGN_FZIP", length = 3)
    private String rgnFzip;

    @ColumnDefault("'0'")
    @Column(name = "DEL_YN", nullable = false)
    private Character delYn;

    public String getNaRgnC() {
        return naRgnC;
    }

    public void setNaRgnC(String naRgnC) {
        this.naRgnC = naRgnC;
    }

    public String getUpNaRgnC() {
        return upNaRgnC;
    }

    public void setUpNaRgnC(String upNaRgnC) {
        this.upNaRgnC = upNaRgnC;
    }

    public String getRgnCnm() {
        return rgnCnm;
    }

    public void setRgnCnm(String rgnCnm) {
        this.rgnCnm = rgnCnm;
    }

    public Character getRgnLvlC() {
        return rgnLvlC;
    }

    public void setRgnLvlC(Character rgnLvlC) {
        this.rgnLvlC = rgnLvlC;
    }

    public String getRgnFzip() {
        return rgnFzip;
    }

    public void setRgnFzip(String rgnFzip) {
        this.rgnFzip = rgnFzip;
    }

    public Character getDelYn() {
        return delYn;
    }

    public void setDelYn(Character delYn) {
        this.delYn = delYn;
    }

}