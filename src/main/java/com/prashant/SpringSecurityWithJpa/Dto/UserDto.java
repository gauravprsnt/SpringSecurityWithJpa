package com.prashant.SpringSecurityWithJpa.Dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserDto  {
    private String userName;
    private String password;
    private List<String> roles;


}
