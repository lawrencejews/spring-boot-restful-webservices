package com.lawrencejews.springbootrestfulwebservices.service.impl;

import com.lawrencejews.springbootrestfulwebservices.dto.UserDto;
import com.lawrencejews.springbootrestfulwebservices.entity.User;
import com.lawrencejews.springbootrestfulwebservices.exception.EmailAlreadyExistsException;
import com.lawrencejews.springbootrestfulwebservices.exception.ResourceNotFoundException;
import com.lawrencejews.springbootrestfulwebservices.mapper.UserMapper;
import com.lawrencejews.springbootrestfulwebservices.repository.UserRepository;
import com.lawrencejews.springbootrestfulwebservices.service.UserService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private ModelMapper modelMapper;


    @Override
    public UserDto createUser(UserDto userDto) {
        // Convert UserDto into User JPA Entity

        // User user = UserMapper.mapToUser(userDto);
        User user = modelMapper.map(userDto, User.class);
        Optional<User> optionalUser = userRepository.findByEmail(userDto.getEmail());

        if(optionalUser.isPresent()){
            throw new EmailAlreadyExistsException("Email Already Exists for User");
        }

        User savedUser = userRepository.save(user);

        // Convert User JPA entity to UserDto
        // UserDto savedUserDto = UserMapper.mapToUserDto(savedUser);
        UserDto savedUserDto = modelMapper.map(savedUser, UserDto.class);

        return savedUserDto;

    }

    @Override
    public UserDto getUserById(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        User user =  optionalUser.get();
        //return UserMapper.mapToUserDto(user);
        return modelMapper.map(user, UserDto.class);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        //return users.stream().map(UserMapper::mapToUserDto)
                //.collect(Collectors.toList());
        return users.stream().map((user) -> modelMapper.map(user, UserDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public UserDto updateUser(UserDto user) {
        User existingUser = userRepository.findById(user.getId()).get();
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        User updatedUser = userRepository.save(existingUser);
        //return UserMapper.mapToUserDto(updatedUser);
        return modelMapper.map(updatedUser, UserDto.class);
    }

    @Override
    public void deleteUser(Long userId) {

        User existingUser = userRepository.findById(userId).orElseThrow(
        () -> new ResourceNotFoundException("User", "id", userId));
        userRepository.deleteById(userId);
    }


}
