package com.automaticamusements.app.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wahaba on 08/12/2017.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/getuser", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public User getUser() {
        User user = new User(1, "user");
        userRepository.save(user);
        return userRepository.findOne(1);
    }
}