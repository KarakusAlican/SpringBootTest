package com.cakmak.eng.deneme.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "profile",schema = "eng")
@Setter
@Getter
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

}
