package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

//@Entity
//@Table(name = "tb_cm_team", schema = "escm")
public class TbCmTeam {
    @EmbeddedId
    private TbCmTeamId id;

    @Column(name = "TEAMNM", length = 20)
    private String teamnm;

    @ColumnDefault("'0'")
    @Column(name = "DEL_YN")
    private Character delYn;

    public TbCmTeamId getId() {
        return id;
    }

    public void setId(TbCmTeamId id) {
        this.id = id;
    }

    public String getTeamnm() {
        return teamnm;
    }

    public void setTeamnm(String teamnm) {
        this.teamnm = teamnm;
    }

    public Character getDelYn() {
        return delYn;
    }

    public void setDelYn(Character delYn) {
        this.delYn = delYn;
    }

}