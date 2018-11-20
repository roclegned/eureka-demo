package com.hd123.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 2018-11-19 - lp
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SimpleUserApplication {
  public static void main(String[] args) {
    SpringApplication.run(SimpleUserApplication.class, args);
  }
}
