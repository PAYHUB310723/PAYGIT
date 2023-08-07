package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Component @Controller (WebApplication)  @RestController , @Service, @Repository
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
//    @GET
//    @Path("/all")
    @RequestMapping(value="/all", method= RequestMethod.GET)
    public List<User> getAllUsers() {
        return this.userService.getAllUsers();
    }
}
