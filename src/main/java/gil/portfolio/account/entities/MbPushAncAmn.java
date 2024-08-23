package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//@Entity
//@Table(name = "mb_push_anc_amn", schema = "escm")
public class MbPushAncAmn {
    @Id
    @Column(name = "MB_ID", nullable = false, length = 13)
    private String mbId;

    @Column(name = "PUSH_STSC_A")
    private Character pushStscA;

    @Column(name = "PUSH_STSC_B")
    private Character pushStscB;

    @Column(name = "PUSH_STSC_C")
    private Character pushStscC;

    @Column(name = "PUSH_STSC_D")
    private Character pushStscD;

    @Column(name = "PUSH_STSC_E")
    private Character pushStscE;

    @Column(name = "PUSH_STSC_F")
    private Character pushStscF;

    public String getMbId() {
        return mbId;
    }

    public void setMbId(String mbId) {
        this.mbId = mbId;
    }

    public Character getPushStscA() {
        return pushStscA;
    }

    public void setPushStscA(Character pushStscA) {
        this.pushStscA = pushStscA;
    }

    public Character getPushStscB() {
        return pushStscB;
    }

    public void setPushStscB(Character pushStscB) {
        this.pushStscB = pushStscB;
    }

    public Character getPushStscC() {
        return pushStscC;
    }

    public void setPushStscC(Character pushStscC) {
        this.pushStscC = pushStscC;
    }

    public Character getPushStscD() {
        return pushStscD;
    }

    public void setPushStscD(Character pushStscD) {
        this.pushStscD = pushStscD;
    }

    public Character getPushStscE() {
        return pushStscE;
    }

    public void setPushStscE(Character pushStscE) {
        this.pushStscE = pushStscE;
    }

    public Character getPushStscF() {
        return pushStscF;
    }

    public void setPushStscF(Character pushStscF) {
        this.pushStscF = pushStscF;
    }

}