package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

//@Embeddable
public class PtNaBzplAmnId implements Serializable {
    private static final long serialVersionUID = 3677447578409170559L;
    @Column(name = "USRID", nullable = false, length = 9)
    private String usrid;

    @Column(name = "NA_BZPLC", nullable = false, length = 13)
    private String naBzplc;

    @Column(name = "NA_BZ_TPC", nullable = false, length = 2)
    private String naBzTpc;

    @Column(name = "NA_TEAM_C", nullable = false, length = 2)
    private String naTeamC;

    public String getUsrid() {
        return usrid;
    }

    public void setUsrid(String usrid) {
        this.usrid = usrid;
    }

    public String getNaBzplc() {
        return naBzplc;
    }

    public void setNaBzplc(String naBzplc) {
        this.naBzplc = naBzplc;
    }

    public String getNaBzTpc() {
        return naBzTpc;
    }

    public void setNaBzTpc(String naBzTpc) {
        this.naBzTpc = naBzTpc;
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
        PtNaBzplAmnId entity = (PtNaBzplAmnId) o;
        return Objects.equals(this.naTeamC, entity.naTeamC) &&
                Objects.equals(this.naBzplc, entity.naBzplc) &&
                Objects.equals(this.naBzTpc, entity.naBzTpc) &&
                Objects.equals(this.usrid, entity.usrid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naTeamC, naBzplc, naBzTpc, usrid);
    }

}