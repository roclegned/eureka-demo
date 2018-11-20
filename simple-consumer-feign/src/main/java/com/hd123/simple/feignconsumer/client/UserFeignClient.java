package com.hd123.simple.feignconsumer.client;

import com.hd123.simple.feignconsumer.config.FeignConfig;
import com.hd123.simple.feignconsumer.entiry.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * 2018-11-21 - lp
 */
@FeignClient(name = "simple-user-provider", configuration = FeignConfig.class)
public interface UserFeignClient {
//  @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
  @RequestLine("GET /user/{id}")
  User findById(@Param("id") Long id);

}
