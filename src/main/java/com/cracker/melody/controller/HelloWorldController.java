package com.cracker.melody.controller;

import com.cracker.melody.model.User;
import com.cracker.melody.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * controller Test
 */
@RestController
    public class HelloWorldController {
      @Autowired
      private UserService userServiceImplment;
        @RequestMapping("/hello")
        public List<User> index() {
            return userServiceImplment.getAll();
        }
    }

