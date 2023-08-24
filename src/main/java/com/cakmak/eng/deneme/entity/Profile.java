package com.cakmak.eng.deneme.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "profile",schema = "eng")
public class Profile {

    @Id
    @Column(name = "id")
    private Long id;

    private String name;
    private String surname;
    private String username;
    private String email;
    private String gsm;
    private String pswd;

    @Column(name = "traffic_code")
    private String trafficCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGsm() {
        return gsm;
    }

    public void setGsm(String gsm) {
        this.gsm = gsm;
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
