package com.lawrencejews.springbootrestfulwebservices.service;

import com.lawrencejews.springbootrestfulwebservices.dto.UserDto;
import com.lawrencejews.springbootrestfulwebservices.entity.User;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto user);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

    UserDto updateUser(UserDto user);

    void deleteUser(Long userId);
}
