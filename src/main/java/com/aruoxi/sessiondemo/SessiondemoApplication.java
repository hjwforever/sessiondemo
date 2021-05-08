package com.aruoxi.sessiondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SessiondemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(SessiondemoApplication.class, args);
  }

}

