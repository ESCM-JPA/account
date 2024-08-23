package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

//@Embeddable
public class TbOdDlvpnshtDId implements Serializable {
    private static final long serialVersionUID = -8986613815959511347L;
    @Column(name = "SPYPL_NA_TRPL_C", nullable = false, length = 13)
    private String spyplNaTrplC;

    @Column(name = "DVYAA_NA_TRPL_C", nullable = false, length = 13)
    private String dvyaaNaTrplC;

    @Column(name = "NA_DVY_PLASH_SLPNO", nullable = false, length = 17)
    private String naDvyPlashSlpno;

    @Column(name = "DVY_PLA_SQNO", nullable = false)
    private Integer dvyPlaSqno;

    @Column(name = "DVY_PLA_DT", nullable = false, length = 8)
    private String dvyPlaDt;

    public String getSpyplNaTrplC() {
        return spyplNaTrplC;
    }

    public void setSpyplNaTrplC(String spyplNaTrplC) {
        this.spyplNaTrplC = spyplNaTrplC;
    }

    public String getDvyaaNaTrplC() {
        return dvyaaNaTrplC;
    }

    public void setDvyaaNaTrplC(String dvyaaNaTrplC) {
        this.dvyaaNaTrplC = dvyaaNaTrplC;
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

    public String getDvyPlaDt() {
        return dvyPlaDt;
    }

    public void setDvyPlaDt(String dvyPlaDt) {
        this.dvyPlaDt = dvyPlaDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TbOdDlvpnshtDId entity = (TbOdDlvpnshtDId) o;
        return Objects.equals(this.naDvyPlashSlpno, entity.naDvyPlashSlpno) &&
                Objects.equals(this.dvyPlaDt, entity.dvyPlaDt) &&
                Objects.equals(this.dvyPlaSqno, entity.dvyPlaSqno) &&
                Objects.equals(this.dvyaaNaTrplC, entity.dvyaaNaTrplC) &&
                Objects.equals(this.spyplNaTrplC, entity.spyplNaTrplC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naDvyPlashSlpno, dvyPlaDt, dvyPlaSqno, dvyaaNaTrplC, spyplNaTrplC);
    }

}