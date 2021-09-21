package com.eg.testspringcloudalibaba.shopservice;

import com.eg.testspringcloudalibaba.bean.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "user-service")
public interface UserService {

    @RequestMapping("getUser")
    User getUserById(@RequestParam String userId);
}
