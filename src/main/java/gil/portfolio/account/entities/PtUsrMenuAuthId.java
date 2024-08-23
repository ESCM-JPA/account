package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

//@Embeddable
public class PtUsrMenuAuthId implements Serializable {
    private static final long serialVersionUID = 3159907611826808858L;
    @Column(name = "MB_ID", nullable = false, length = 9)
    private String mbId;

    @Column(name = "MENU_GROUP", nullable = false, length = 250)
    private String menuGroup;

    public String getMbId() {
        return mbId;
    }

    public void setMbId(String mbId) {
        this.mbId = mbId;
    }

    public String getMenuGroup() {
        return menuGroup;
    }

    public void setMenuGroup(String menuGroup) {
        this.menuGroup = menuGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PtUsrMenuAuthId entity = (PtUsrMenuAuthId) o;
        return Objects.equals(this.mbId, entity.mbId) &&
                Objects.equals(this.menuGroup, entity.menuGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mbId, menuGroup);
    }

}