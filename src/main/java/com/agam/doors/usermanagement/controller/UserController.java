package com.agam.doors.usermanagement.controller;
import com.agam.doors.usermanagement.model.User;
import com.agam.doors.usermanagement.model.UserDto;
import com.agam.doors.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{name}")
    public UserDto getOne(@PathVariable String name){
        return userService.findOne(name);
    }


    @PostMapping("/signup")
    public User saveUser(@RequestBody UserDto user){
        return userService.save(user);
    }

    @GetMapping
    public List<User> listUser( String token){
        return userService.findAll();
    }



    @PutMapping("/{id}")
    public UserDto update(@RequestBody UserDto userDto) {
        return userService.update(userDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        userService.delete(id);
    }




}
