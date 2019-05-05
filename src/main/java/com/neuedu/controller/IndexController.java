package com.neuedu.controller;

import com.neuedu.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class IndexController {
    @GetMapping("/index")
    public List<User> getUser(){
        List<User> list = new ArrayList<>();
        User user=new User();
        user.setId(1);
        user.setName("张三");
        user.setPassword("123456");
        list.add(user);

        return list;
    }
}
