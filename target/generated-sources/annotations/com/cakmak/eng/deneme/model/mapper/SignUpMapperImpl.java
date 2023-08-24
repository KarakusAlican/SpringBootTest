package com.cakmak.eng.deneme.model.mapper;

import com.cakmak.eng.deneme.entity.Profile;
import com.cakmak.eng.deneme.model.dto.SignUpRequestDto;
import com.cakmak.eng.deneme.model.dto.SignUpResponseDto;
import com.cakmak.eng.deneme.model.request.SignUpRequest;
import com.cakmak.eng.deneme.model.response.SignUpResponse;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-20T22:16:54+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.7 (Amazon.com Inc.)"
)
@Component
public class SignUpMapperImpl implements SignUpMapper {

    @Override
    public SignUpRequestDto toSignUpRequestDto(SignUpRequest request) {
        if ( request == null ) {
            return null;
        }

        SignUpRequestDto signUpRequestDto = new SignUpRequestDto();

        signUpRequestDto.setMy( request.getMy() );
        signUpRequestDto.setName( request.getName() );
        signUpRequestDto.setSurname( request.getSurname() );
        signUpRequestDto.setUsername( request.getUsername() );
        signUpRequestDto.setGsm( request.getGsm() );
        signUpRequestDto.setEmail( request.getEmail() );
        signUpRequestDto.setPswd( request.getPswd() );
        signUpRequestDto.setTrafficCode( request.getTrafficCode() );

        return signUpRequestDto;
    }

    @Override
    public SignUpResponse toSignUpResponse(SignUpResponseDto responseDto) {
        if ( responseDto == null ) {
            return null;
        }

        SignUpResponse signUpResponse = new SignUpResponse();

        signUpResponse.setMessage( responseDto.getMessage() );

        return signUpResponse;
    }

    @Override
    public Profile toProfile(SignUpRequestDto requestDto) {
        if ( requestDto == null ) {
            return null;
        }

        Profile profile = new Profile();

        profile.setName( requestDto.getName() );
        profile.setSurname( requestDto.getSurname() );
        profile.setUsername( requestDto.getUsername() );
        profile.setEmail( requestDto.getEmail() );
        profile.setGsm( requestDto.getGsm() );
        profile.setPswd( requestDto.getPswd() );
        profile.setTrafficCode( requestDto.getTrafficCode() );

        return profile;
    }
}
