package com.prashant.SpringSecurityWithJpa.controller;

import com.prashant.SpringSecurityWithJpa.Dto.UserDto;
import com.prashant.SpringSecurityWithJpa.domain.Users;
import com.prashant.SpringSecurityWithJpa.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping(value = "/insert")
    public Users addData(@RequestBody UserDto userDto){
        return userService.addUser(userDto);
    }
}
