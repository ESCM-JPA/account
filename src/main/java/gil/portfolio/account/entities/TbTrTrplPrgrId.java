package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

//@Embeddable
public class TbTrTrplPrgrId implements Serializable {
    private static final long serialVersionUID = -1074094382568162013L;
    @Column(name = "NA_TRPL_C", nullable = false, length = 13)
    private String naTrplC;

    @Column(name = "NA_BYNG_SLPL_DSC", nullable = false)
    private Character naByngSlplDsc;

    @Column(name = "NA_BZ_TPC", nullable = false, length = 2)
    private String naBzTpc;

    public String getNaTrplC() {
        return naTrplC;
    }

    public void setNaTrplC(String naTrplC) {
        this.naTrplC = naTrplC;
    }

    public Character getNaByngSlplDsc() {
        return naByngSlplDsc;
    }

    public void setNaByngSlplDsc(Character naByngSlplDsc) {
        this.naByngSlplDsc = naByngSlplDsc;
    }

    public String getNaBzTpc() {
        return naBzTpc;
    }

    public void setNaBzTpc(String naBzTpc) {
        this.naBzTpc = naBzTpc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TbTrTrplPrgrId entity = (TbTrTrplPrgrId) o;
        return Objects.equals(this.naBzTpc, entity.naBzTpc) &&
                Objects.equals(this.naByngSlplDsc, entity.naByngSlplDsc) &&
                Objects.equals(this.naTrplC, entity.naTrplC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naBzTpc, naByngSlplDsc, naTrplC);
    }

}