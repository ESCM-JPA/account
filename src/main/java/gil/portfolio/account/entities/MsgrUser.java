package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//@Entity
//@Table(name = "msgr_user", schema = "escm")
public class MsgrUser {
    @Id
    @Column(name = "USER_ID", nullable = false, length = 64)
    private String userId;

    @Column(name = "DEPT_ID", length = 64)
    private String deptId;

    @Column(name = "USER_NAME", length = 64)
    private String userName;

    @Column(name = "DEPT_NAME", length = 128)
    private String deptName;

    @Column(name = "POS", length = 128)
    private String pos;

    @Column(name = "GRADE", length = 128)
    private String grade;

    @Column(name = "JOB", length = 512)
    private String job;

    @Column(name = "PHONE", length = 128)
    private String phone;

    @Column(name = "MOBILE", length = 128)
    private String mobile;

    @Column(name = "EMAIL", length = 128)
    private String email;

    @Column(name = "USER_SORT", length = 32)
    private String userSort;

    @Column(name = "PIC_FL_NM", length = 100)
    private String picFlNm;

    @Column(name = "PIC_FL_TMP_NM", length = 50)
    private String picFlTmpNm;

    @Column(name = "AUTH_TYPE_CD", length = 10)
    private String authTypeCd;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserSort() {
        return userSort;
    }

    public void setUserSort(String userSort) {
        this.userSort = userSort;
    }

    public String getPicFlNm() {
        return picFlNm;
    }

    public void setPicFlNm(String picFlNm) {
        this.picFlNm = picFlNm;
    }

    public String getPicFlTmpNm() {
        return picFlTmpNm;
    }

    public void setPicFlTmpNm(String picFlTmpNm) {
        this.picFlTmpNm = picFlTmpNm;
    }

    public String getAuthTypeCd() {
        return authTypeCd;
    }

    public void setAuthTypeCd(String authTypeCd) {
        this.authTypeCd = authTypeCd;
    }

}