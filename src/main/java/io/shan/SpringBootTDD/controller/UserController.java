package io.shan.SpringBootTDD.controller;


import io.shan.SpringBootTDD.entity.User;
import io.shan.SpringBootTDD.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/v1/users")
    public ResponseEntity<List<User>> getUsers(){
        return null;
    }


}
