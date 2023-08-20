package com.cakmak.eng.deneme.model.mapper;

import com.cakmak.eng.deneme.entity.Profile;
import com.cakmak.eng.deneme.model.dto.SignUpRequestDto;
import com.cakmak.eng.deneme.model.dto.SignUpResponseDto;
import com.cakmak.eng.deneme.model.request.SignUpRequest;
import com.cakmak.eng.deneme.model.response.SignUpResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SignUpMapper {


    SignUpRequestDto toSignUpRequestDto(SignUpRequest request);
    SignUpResponse toSignUpResponse(SignUpResponseDto responseDto);

    Profile toProfile(SignUpRequestDto requestDto);
}
