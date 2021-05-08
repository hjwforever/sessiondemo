package com.aruoxi.sessiondemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author hjwforever
 * @version 0.1
 * @since 2021/04/28 17:49
 */
@RestController
@RequestMapping("/")
public class TestController {
  private static final Logger log = LoggerFactory.getLogger(TestController.class);

  @GetMapping("/test1")
  public ResponseEntity test1(HttpServletRequest request) {
    HttpSession session = request.getSession();
    session.setAttribute("test", "test");
    log.info("sessionAttribute = " + session);
    return ResponseEntity.ok("oook");
  }

  @GetMapping("/test2")
  public ResponseEntity test2(HttpServletRequest request) {
    HttpSession session = request.getSession();
    Object sessionAttribute = session.getAttribute("test");
    log.info("sessionAttribute = " + session);
    log.info("sessionAttribute = " + sessionAttribute);
    return ResponseEntity.ok("session of test: " + sessionAttribute);
  }

}
