package com.example.business;



import com.example.persistence.dto.UserDto;

import java.util.List;

public interface IUserService {
    UserDto addUser(UserDto userDto);
    List<UserDto> getAllUsers();
    UserDto getUserByEmail(String email);
    void removeUserByEmail(String email);
    void updateUser(UserDto userDto);

}
