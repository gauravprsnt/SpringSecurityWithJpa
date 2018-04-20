package com.prashant.SpringSecurityWithJpa.service;

import com.prashant.SpringSecurityWithJpa.Dto.UserDto;
import com.prashant.SpringSecurityWithJpa.domain.Role;
import com.prashant.SpringSecurityWithJpa.domain.Users;
import com.prashant.SpringSecurityWithJpa.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Users addUser(UserDto userDto) {
        Users users=new Users();
        users.setUserName(userDto.getUserName());
        users.setPassword(userDto.getPassword());
        users.setRole(convertRole(userDto.getRoles()));
         return userRepository.save(users);

    }

    private String convertRole(List<String> roles) {
        String result=",";
        for(String i:roles) {
            for(Role role:Role.values()){
                if(i.equalsIgnoreCase(role.name())){
                   String out=role.ordinal()+",";
                    result=result+out;
                }
            }
        }
        return result;
    }
}
