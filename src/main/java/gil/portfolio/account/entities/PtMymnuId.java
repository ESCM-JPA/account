package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

//@Embeddable
public class PtMymnuId implements Serializable {
    private static final long serialVersionUID = -9061747104068526244L;
    @Column(name = "MB_ID", nullable = false, length = 9)
    private String mbId;

    @Column(name = "MENU_ID", nullable = false, length = 8)
    private String menuId;

    public String getMbId() {
        return mbId;
    }

    public void setMbId(String mbId) {
        this.mbId = mbId;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PtMymnuId entity = (PtMymnuId) o;
        return Objects.equals(this.mbId, entity.mbId) &&
                Objects.equals(this.menuId, entity.menuId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mbId, menuId);
    }

}