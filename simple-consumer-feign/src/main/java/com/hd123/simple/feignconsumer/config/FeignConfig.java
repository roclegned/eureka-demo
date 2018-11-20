package com.hd123.simple.feignconsumer.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 2018-11-21 - lp
 */
@Configuration
public class FeignConfig {
  @Bean
  public Contract feignContract() {
    return new Contract.Default();
  }
}
