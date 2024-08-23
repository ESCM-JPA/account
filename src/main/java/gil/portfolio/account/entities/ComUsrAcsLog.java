package gil.portfolio.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Index;
import jakarta.persistence.Table;

import java.time.Instant;

//@Entity
//@Table(name = "com_usr_acs_log", schema = "escm", indexes = {
//        @Index(name = "COM_USR_ACS_LOG_IDX01", columnList = "RG_DTM")
//})
public class ComUsrAcsLog {
    @Column(name = "MB_ID", length = 9)
    private String mbId;

    @Column(name = "LGIN_IDADR", length = 50)
    private String lginIdadr;

    @Column(name = "SVC_URL", length = 200)
    private String svcUrl;

    @Column(name = "RG_DTM")
    private Instant rgDtm;

    @Column(name = "ETC_1", length = 200)
    private String etc1;

    @Column(name = "ETC_2", length = 200)
    private String etc2;

    @Column(name = "ETC_3", length = 200)
    private String etc3;

    @Column(name = "ETC_4", length = 200)
    private String etc4;

    @Column(name = "ETC_5", length = 200)
    private String etc5;

    public String getMbId() {
        return mbId;
    }

    public void setMbId(String mbId) {
        this.mbId = mbId;
    }

    public String getLginIdadr() {
        return lginIdadr;
    }

    public void setLginIdadr(String lginIdadr) {
        this.lginIdadr = lginIdadr;
    }

    public String getSvcUrl() {
        return svcUrl;
    }

    public void setSvcUrl(String svcUrl) {
        this.svcUrl = svcUrl;
    }

    public Instant getRgDtm() {
        return rgDtm;
    }

    public void setRgDtm(Instant rgDtm) {
        this.rgDtm = rgDtm;
    }

    public String getEtc1() {
        return etc1;
    }

    public void setEtc1(String etc1) {
        this.etc1 = etc1;
    }

    public String getEtc2() {
        return etc2;
    }

    public void setEtc2(String etc2) {
        this.etc2 = etc2;
    }

    public String getEtc3() {
        return etc3;
    }

    public void setEtc3(String etc3) {
        this.etc3 = etc3;
    }

    public String getEtc4() {
        return etc4;
    }

    public void setEtc4(String etc4) {
        this.etc4 = etc4;
    }

    public String getEtc5() {
        return etc5;
    }

    public void setEtc5(String etc5) {
        this.etc5 = etc5;
    }

}