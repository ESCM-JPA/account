package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

//@Embeddable
public class TbDpEdiOrdWrId implements Serializable {
    private static final long serialVersionUID = 8523117083141579545L;
    @Column(name = "MBR_NA_TRPL_C", nullable = false, length = 20)
    private String mbrNaTrplC;

    @Column(name = "NA_BZPLC", nullable = false, length = 13)
    private String naBzplc;

    @Column(name = "USER_ID", nullable = false, length = 9)
    private String userId;

    @Column(name = "WRS_C", nullable = false, length = 25)
    private String wrsC;

    public String getMbrNaTrplC() {
        return mbrNaTrplC;
    }

    public void setMbrNaTrplC(String mbrNaTrplC) {
        this.mbrNaTrplC = mbrNaTrplC;
    }

    public String getNaBzplc() {
        return naBzplc;
    }

    public void setNaBzplc(String naBzplc) {
        this.naBzplc = naBzplc;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getWrsC() {
        return wrsC;
    }

    public void setWrsC(String wrsC) {
        this.wrsC = wrsC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TbDpEdiOrdWrId entity = (TbDpEdiOrdWrId) o;
        return Objects.equals(this.naBzplc, entity.naBzplc) &&
                Objects.equals(this.mbrNaTrplC, entity.mbrNaTrplC) &&
                Objects.equals(this.wrsC, entity.wrsC) &&
                Objects.equals(this.userId, entity.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naBzplc, mbrNaTrplC, wrsC, userId);
    }

}