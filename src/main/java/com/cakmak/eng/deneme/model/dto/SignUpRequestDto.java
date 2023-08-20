package com.cakmak.eng.deneme.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpRequestDto {

    private String name;
    private String surname;

    private String username;

    private String gsm;

    private String email;

    private String pswd;

    private String trafficCode;
}
