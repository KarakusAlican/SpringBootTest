package com.cakmak.eng.deneme.controller;

import com.cakmak.eng.deneme.model.ProfileRequest;
import com.cakmak.eng.deneme.model.ProfileResponse;
import com.cakmak.eng.deneme.service.UserService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping(value = "/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
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

}
