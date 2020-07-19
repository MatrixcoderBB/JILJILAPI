package com.api.jiljilapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @RequestMapping(value="/signin")
  public String signin() {
    return "Successfully signed in!!!!";
  }
  @RequestMapping(value="/signup")
  public String signup() {
	return "Welcome to jiljil Application..";
  }
}
