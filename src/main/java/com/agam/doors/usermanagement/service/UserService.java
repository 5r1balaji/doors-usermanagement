package com.agam.doors.usermanagement.service;

import com.agam.doors.usermanagement.model.User;
import com.agam.doors.usermanagement.model.UserDto;

import java.util.List;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(int id);

    UserDto findOne(String username);

    User findById(int id);

    UserDto update(UserDto userDto);
}
