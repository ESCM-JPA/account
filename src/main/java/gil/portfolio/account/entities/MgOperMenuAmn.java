package gil.portfolio.account.entities;

import jakarta.persistence.*;

import java.time.Instant;

//@Entity
//@Table(name = "mg_oper_menu_amn", schema = "escm", indexes = {
//        @Index(name = "IDX_MG_OPER_MENU_AMN_1", columnList = "UP_MENU_ID")
//})
public class MgOperMenuAmn {
    @Id
    @Column(name = "MENU_ID", nullable = false, length = 8)
    private String menuId;

    @Column(name = "MENU_LVL")
    private Character menuLvl;

    @Column(name = "MENU_NM", length = 100)
    private String menuNm;

    @Column(name = "MENU_PATH", length = 100)
    private String menuPath;

    @Column(name = "UP_MENU_ID", length = 8)
    private String upMenuId;

    @Column(name = "SVC_GRPNM", length = 250)
    private String svcGrpnm;

    @Column(name = "FLNM", length = 250)
    private String flnm;

    @Column(name = "FL_KD", length = 15)
    private String flKd;

    @Column(name = "SCRN_MRK_YN", length = 1)
    private String scrnMrkYn;

    @Column(name = "UYN")
    private Character uyn;

    @Column(name = "USR_AUTH_DSC", length = 3)
    private String usrAuthDsc;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "FS_RGM", length = 9)
    private String fsRgm;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CHGM", length = 9)
    private String lsChgm;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public Character getMenuLvl() {
        return menuLvl;
    }

    public void setMenuLvl(Character menuLvl) {
        this.menuLvl = menuLvl;
    }

    public String getMenuNm() {
        return menuNm;
    }

    public void setMenuNm(String menuNm) {
        this.menuNm = menuNm;
    }

    public String getMenuPath() {
        return menuPath;
    }

    public void setMenuPath(String menuPath) {
        this.menuPath = menuPath;
    }

    public String getUpMenuId() {
        return upMenuId;
    }

    public void setUpMenuId(String upMenuId) {
        this.upMenuId = upMenuId;
    }

    public String getSvcGrpnm() {
        return svcGrpnm;
    }

    public void setSvcGrpnm(String svcGrpnm) {
        this.svcGrpnm = svcGrpnm;
    }

    public String getFlnm() {
        return flnm;
    }

    public void setFlnm(String flnm) {
        this.flnm = flnm;
    }

    public String getFlKd() {
        return flKd;
    }

    public void setFlKd(String flKd) {
        this.flKd = flKd;
    }

    public String getScrnMrkYn() {
        return scrnMrkYn;
    }

    public void setScrnMrkYn(String scrnMrkYn) {
        this.scrnMrkYn = scrnMrkYn;
    }

    public Character getUyn() {
        return uyn;
    }

    public void setUyn(Character uyn) {
        this.uyn = uyn;
    }

    public String getUsrAuthDsc() {
        return usrAuthDsc;
    }

    public void setUsrAuthDsc(String usrAuthDsc) {
        this.usrAuthDsc = usrAuthDsc;
    }

    public Instant getFsrgDtm() {
        return fsrgDtm;
    }

    public void setFsrgDtm(Instant fsrgDtm) {
        this.fsrgDtm = fsrgDtm;
    }

    public String getFsRgm() {
        return fsRgm;
    }

    public void setFsRgm(String fsRgm) {
        this.fsRgm = fsRgm;
    }

    public Instant getLschgDtm() {
        return lschgDtm;
    }

    public void setLschgDtm(Instant lschgDtm) {
        this.lschgDtm = lschgDtm;
    }

    public String getLsChgm() {
        return lsChgm;
    }

    public void setLsChgm(String lsChgm) {
        this.lsChgm = lsChgm;
    }

}