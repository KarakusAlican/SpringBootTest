package com.cakmak.eng.deneme.model.dto;


public class SignUpRequestDto {

    private String my;

    private String name;
    private String surname;

    private String username;

    private String gsm;

    private String email;

    private String pswd;

    private String trafficCode;


    public String getMy() {
        return my;
    }

    public void setMy(String my) {
        this.my = my;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGsm() {
        return gsm;
    }

    public void setGsm(String gsm) {
        this.gsm = gsm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public String getTrafficCode() {
        return trafficCode;
    }

    public void setTrafficCode(String trafficCode) {
        this.trafficCode = trafficCode;
    }
}
