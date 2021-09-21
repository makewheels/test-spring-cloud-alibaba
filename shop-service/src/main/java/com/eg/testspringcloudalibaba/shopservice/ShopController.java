package com.eg.testspringcloudalibaba.shopservice;

import com.eg.testspringcloudalibaba.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ShopController {
    @Autowired
    private UserService userService;

    @RequestMapping("getUserInShopServiceByUserService")
    public User getUserInShopServiceByUserService(@RequestParam String userId) {
        return userService.getUserById(userId);
    }
}
