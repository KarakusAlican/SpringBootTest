package com.cakmak.eng.deneme.controller;

import com.cakmak.eng.deneme.model.ProfileRequest;
import com.cakmak.eng.deneme.model.ProfileResponse;
import com.cakmak.eng.deneme.model.dto.SignUpRequestDto;
import com.cakmak.eng.deneme.model.dto.SignUpResponseDto;
import com.cakmak.eng.deneme.model.mapper.SignUpMapper;
import com.cakmak.eng.deneme.model.request.SignUpRequest;
import com.cakmak.eng.deneme.model.response.SignUpResponse;
import com.cakmak.eng.deneme.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping(value = "/user")
public class UserController {

    private final UserService userService;
    private final SignUpMapper signUpMapper;
    public UserController(UserService userService, SignUpMapper signUpMapper) {
        this.userService = userService;
        this.signUpMapper = signUpMapper;
    }

    @RequestMapping(value = "/profile/{key1}",method = RequestMethod.GET)
    public String getProfile(@PathVariable(name = "key1") String key1){
        String bilgiler = userService.getDetailProfileInformation(key1);
        return bilgiler;
    }


    @RequestMapping(value = "/profile/yas",method = RequestMethod.POST)
    public ProfileResponse getYas(@RequestBody ProfileRequest profileRequest){
        ProfileResponse xx = userService.getDetailYas(profileRequest.getUsername());
        return xx;
    }


    @RequestMapping(value = "/registration",method = RequestMethod.POST)
    @ResponseBody
    public SignUpResponse getRegistration(@Valid @RequestBody SignUpRequest request){

        /*if(request==null){
            throw new Exception("Request null olamaz");
        }

        if(request.getEmail()==null){
            System.out.println("eposta boş olamaz");
        }

        if(request.getGsm()==null){
            System.out.println("gsm boş olamaz");
        }*/
        SignUpRequestDto requestDto = signUpMapper.toSignUpRequestDto(request);
        SignUpResponseDto signUpResponseDto = userService.registration(requestDto);
        SignUpResponse response = signUpMapper.toSignUpResponse(signUpResponseDto);
        return response;
    }

}
