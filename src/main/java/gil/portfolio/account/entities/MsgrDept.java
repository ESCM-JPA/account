package gil.portfolio.account.entities;

import jakarta.persistence.*;

//@Entity
//@Table(name = "msgr_dept", schema = "escm", uniqueConstraints = {
//        @UniqueConstraint(name = "PK_MSGR_DEPT", columnNames = {"DEPT_ID"})
//})
public class MsgrDept {
    @Id
    @Column(name = "DEPT_ID", nullable = false, length = 64)
    private String deptId;

    @Column(name = "DEPT_HIGH", length = 64)
    private String deptHigh;

    @Column(name = "DEPT_NAME", length = 128)
    private String deptName;

    @Column(name = "DEPT_SORT", length = 32)
    private String deptSort;

    @Column(name = "NA_BZPLC", length = 13)
    private String naBzplc;

    @Column(name = "DEPT_LEVEL")
    private Character deptLevel;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptHigh() {
        return deptHigh;
    }

    public void setDeptHigh(String deptHigh) {
        this.deptHigh = deptHigh;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptSort() {
        return deptSort;
    }

    public void setDeptSort(String deptSort) {
        this.deptSort = deptSort;
    }

    public String getNaBzplc() {
        return naBzplc;
    }

    public void setNaBzplc(String naBzplc) {
        this.naBzplc = naBzplc;
    }

    public Character getDeptLevel() {
        return deptLevel;
    }

    public void setDeptLevel(Character deptLevel) {
        this.deptLevel = deptLevel;
    }

}