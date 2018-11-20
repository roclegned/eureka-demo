package com.hd123.simple.provider.controller;

import com.hd123.simple.provider.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2018-11-19 - lp
 */
@RestController
public class UserController {

  @GetMapping("/user/{id}")
  public User findById(@PathVariable Long id){
    User user = new User();
    user.setName("user_" + id);
    user.setAge((int)(1 + id % 10));
    user.setSex(id % 2 == 0 ? "男" : "女");
    return user;
  }
}
