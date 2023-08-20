package com.cakmak.eng.deneme.model.request;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpRequest {

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
}
