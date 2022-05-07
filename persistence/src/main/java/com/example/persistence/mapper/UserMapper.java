package com.example.persistence.mapper;

import com.example.persistence.dto.UserDto;
import com.example.persistence.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserEntity mapToUserEntity(UserDto userDto){
        UserEntity userEntity = new UserEntity();

        userEntity.setId(userDto.getId());
        userEntity.setFirstName(userDto.getFirstName());
        userEntity.setLastName(userDto.getLastName());
        userEntity.setEmail(userDto.getEmail());
        userEntity.setPassword(userDto.getPassword());
        userEntity.setPhoneNumber(userDto.getTel());

        return userEntity;
    }


    public UserDto mapToUserDto(UserEntity userEntity ){
        UserDto userDto  = new UserDto();

        userDto.setId(userEntity.getId());
        userDto.setFirstName(userEntity.getFirstName());
        userDto.setLastName(userEntity.getLastName());
        userDto.setEmail(userEntity.getEmail());
        userDto.setPassword(userEntity.getPassword());
        userDto.setTel(userEntity.getPhoneNumber());

        return userDto;
    }


}
