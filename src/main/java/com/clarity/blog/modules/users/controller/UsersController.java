package com.clarity.blog.modules.users.controller;


import com.clarity.blog.modules.users.entity.Users;
import com.clarity.blog.modules.users.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    private UsersService usersService;

    @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @RequestMapping(value = {"/", ""}, method = RequestMethod.GET)
    public List<Users> getUsers(){
        return usersService.findAllUsers();
    }

    @RequestMapping(value = {"/", ""}, method = RequestMethod.POST)
    public Users registerUser(@RequestBody Users users){
        return  usersService.registerUser(users);
    }

}
