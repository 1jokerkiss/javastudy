package com.qdc.demoeurekaauth_server.controller;

import com.qdc.demoeurekaauth_server.service.UserService;

import com.qdc.demoeurekaauth_server.service.impl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

//    @Autowired
//    private UserDetailsServiceImpl userDetailsService;
//    @RequestMapping(value = "/oauth/token")
//    @ResponseBody
//    public UserDetails Login(@RequestParam String username){
//          UserDetails userDetails=  userDetailsService.loadUserByUsername(username);
//          return userDetails;
//    }
}
