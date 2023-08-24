package com.cakmak.eng.deneme.model.request;

import jakarta.validation.constraints.NotNull;

public class
SignUpRequest {


    @NotNull(message = "id Boş Olamaz")
    private String my;

    @NotNull(message = "Name Boş Olamaz")
    private String name;
    private String surname;

    @NotNull(message = "Username Boş Olamaz")
    private String username;
    @NotNull(message = "Gsm Boş Olamaz")
    private String gsm;

    @NotNull(message = "Email Boş Olamaz")
    private String email;

    @NotNull(message = "Password Boş Olamaz")
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
