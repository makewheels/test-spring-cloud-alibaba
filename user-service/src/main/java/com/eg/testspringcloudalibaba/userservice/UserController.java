package com.eg.testspringcloudalibaba.userservice;

import com.eg.testspringcloudalibaba.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class UserController {
    @RequestMapping("getUser")
    public User getUser(@RequestParam String userId) {
        User user = new User();
        user.setUserId("userId=" + userId);
        user.setUserName(UUID.randomUUID().toString());
        return user;
    }
}
