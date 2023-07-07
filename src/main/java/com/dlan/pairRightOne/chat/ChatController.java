package com.dlan.pairRightOne.chat;

import com.dlan.pairRightOne.authenticate.User;
import com.dlan.pairRightOne.authenticate.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChatController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public List<User> test() {
        return userService.getUserByStatus(User.UserStatus.SEEKING);
    }
}
