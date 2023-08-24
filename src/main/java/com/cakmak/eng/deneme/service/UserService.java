package com.cakmak.eng.deneme.service;

import com.cakmak.eng.deneme.entity.Account;
import com.cakmak.eng.deneme.entity.Profile;
import com.cakmak.eng.deneme.model.ProfileResponse;
import com.cakmak.eng.deneme.model.dto.SignUpRequestDto;
import com.cakmak.eng.deneme.model.dto.SignUpResponseDto;
import com.cakmak.eng.deneme.model.mapper.SignUpMapper;
import com.cakmak.eng.deneme.repository.AccountRepository;
import com.cakmak.eng.deneme.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class UserService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private ProfileRepository profileRepository;

    @Autowired
    private SignUpMapper signUpMapper;


    public String getDetailProfileInformation(String username){

        System.out.println("username : "+username);

        if(username.equals("Fatma")){

            Account a = new Account();
            a.setUserId(1);
            a.setEmail("aaaaa");
            a.setUsername("aaaaa");
            a.setPassword("aaaaa");
            a.setCreatedOn(new Timestamp(System.nanoTime()));

            accountRepository.save(a);

            return " Ben fatma tatbakta calisiyorum yeni telefon aldım hem de not 11 pro";
        }
        if(username.equals("Ali")){
            return " Ben Ali Karakuş istanbul a neden geldim. Açık liseye geçecekmiydim geçmez olaydım demiyorum.";
        }

        return "Hiç  kimse yok bilgim de yok...";
    }


    public ProfileResponse getDetailYas(String username){

        System.out.println("username : "+username);
        ProfileResponse profile = new ProfileResponse();
        if(username.equals("Fatma")){

            Account a = new Account();
            a.setUserId(1);
            a.setEmail("aaaaa");
            a.setUsername("aaaaa");
            a.setPassword("aaaaa");
            a.setCreatedOn(new Timestamp(System.nanoTime()));

            accountRepository.save(a);

            profile.setUsername("tc.fatmacakmak");
            profile.setEmail("tc.fatmacakmak@gmail.com");
            profile.setPhone("5431508563");
            profile.setImgUrl("http://fatma.com.tr/profile/fatma.jpg");
            return profile;
        }
        if(username.equals("Ali")){
            profile.setUsername("tc.alicankarakus");
            profile.setEmail("tc.alicankarakus@gmail.com");
            profile.setPhone("5442074302");
            profile.setImgUrl("http://alicankarakus.com.tr/profile/ali.jpg");
            return profile;
        }

        return null;
    }


    public SignUpResponseDto registration(SignUpRequestDto requestDto){

        SignUpResponseDto responseDto = new SignUpResponseDto();

        Profile profile = signUpMapper.toProfile(requestDto);

        profile.setId(Long.valueOf(requestDto.getMy()));

        profileRepository.save(profile);

        responseDto.setMessage("Profile başarılı bir şekilde database kaydedilmiştir.");

        return responseDto;
    }
}
