package com.eg.testspringcloudalibaba.userservice;

import com.eg.testspringcloudalibaba.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class UserController {
    @RequestMapping("getUser")
    public User getUser() {
        User user = new User();
        user.setUserId("username" + System.currentTimeMillis());
        user.setUserName(UUID.randomUUID().toString());
        return user;
    }
}
