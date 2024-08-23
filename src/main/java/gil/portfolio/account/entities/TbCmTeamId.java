package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

//@Embeddable
public class TbCmTeamId implements Serializable {
    private static final long serialVersionUID = -5980231593014578919L;
    @Column(name = "NA_BZPLC", nullable = false, length = 13)
    private String naBzplc;

    @Column(name = "NA_TEAM_C", nullable = false, length = 2)
    private String naTeamC;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TbCmTeamId entity = (TbCmTeamId) o;
        return Objects.equals(this.naTeamC, entity.naTeamC) &&
                Objects.equals(this.naBzplc, entity.naBzplc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naTeamC, naBzplc);
    }

}