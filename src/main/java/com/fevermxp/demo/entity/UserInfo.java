package com.fevermxp.demo.entity;

import java.util.Date;

public class UserInfo extends BaseModel {
	
	private static final long serialVersionUID = 3962796979683439477L;

	private Integer usid;

    private String login;

    private String pass;

    private String realname;

    private String tel;

    private String workcode;

    private Date crdt;

    private Date lndt;

    private Date updt;

    private Long rights;

    public Integer getUsid() {
        return usid;
    }

    public void setUsid(Integer usid) {
        this.usid = usid;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login == null ? null : login.trim();
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass == null ? null : pass.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getWorkcode() {
        return workcode;
    }

    public void setWorkcode(String workcode) {
        this.workcode = workcode == null ? null : workcode.trim();
    }

    public Date getCrdt() {
        return crdt;
    }

    public void setCrdt(Date crdt) {
        this.crdt = crdt;
    }

    public Date getLndt() {
        return lndt;
    }

    public void setLndt(Date lndt) {
        this.lndt = lndt;
    }

    public Date getUpdt() {
        return updt;
    }

    public void setUpdt(Date updt) {
        this.updt = updt;
    }

    public Long getRights() {
        return rights;
    }

    public void setRights(Long rights) {
        this.rights = rights;
    }
}