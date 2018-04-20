package com.prashant.SpringSecurityWithJpa.service;

import com.prashant.SpringSecurityWithJpa.Dto.UserDto;
import com.prashant.SpringSecurityWithJpa.domain.Users;

public interface UserService {
    Users addUser(UserDto userDto);
}
