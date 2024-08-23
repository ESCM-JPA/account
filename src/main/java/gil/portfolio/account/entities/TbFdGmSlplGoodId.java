package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

//@Embeddable
public class TbFdGmSlplGoodId implements Serializable {
    private static final long serialVersionUID = 1206703544726832942L;
    @Column(name = "NA_BZPLC", nullable = false, length = 13)
    private String naBzplc;

    @Column(name = "NA_TEAM_C", nullable = false, length = 2)
    private String naTeamC;

    @Column(name = "MBR_NA_TRPL_C", nullable = false, length = 13)
    private String mbrNaTrplC;

    @Column(name = "COMP_NA_WRS_C", nullable = false, length = 25)
    private String compNaWrsC;

    public String getNaBzplc() {
        return naBzplc;
    }

    public void setNaBzplc(String naBzplc) {
        this.naBzplc = naBzplc;
    }

    public String getNaTeamC() {
        return naTeamC;
    }

    public void setNaTeamC(String naTeamC) {
        this.naTeamC = naTeamC;
    }

    public String getMbrNaTrplC() {
        return mbrNaTrplC;
    }

    public void setMbrNaTrplC(String mbrNaTrplC) {
        this.mbrNaTrplC = mbrNaTrplC;
    }

    public String getCompNaWrsC() {
        return compNaWrsC;
    }

    public void setCompNaWrsC(String compNaWrsC) {
        this.compNaWrsC = compNaWrsC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TbFdGmSlplGoodId entity = (TbFdGmSlplGoodId) o;
        return Objects.equals(this.naTeamC, entity.naTeamC) &&
                Objects.equals(this.naBzplc, entity.naBzplc) &&
                Objects.equals(this.mbrNaTrplC, entity.mbrNaTrplC) &&
                Objects.equals(this.compNaWrsC, entity.compNaWrsC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naTeamC, naBzplc, mbrNaTrplC, compNaWrsC);
    }

}