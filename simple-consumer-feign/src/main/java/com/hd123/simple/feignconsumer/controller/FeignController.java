package com.hd123.simple.feignconsumer.controller;

import com.hd123.simple.feignconsumer.client.UserFeignClient;
import com.hd123.simple.feignconsumer.entiry.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2018-11-21 - lp
 */
@RestController
@Slf4j
public class FeignController {
  @Autowired
  private UserFeignClient userFeignClient;

  @GetMapping("/user/{id}")
  public User findById(@PathVariable Long id) {
    return this.userFeignClient.findById(id);
  }
}
