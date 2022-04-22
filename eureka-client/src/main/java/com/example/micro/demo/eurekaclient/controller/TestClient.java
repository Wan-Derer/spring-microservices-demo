package com.example.micro.demo.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestClient {

  @GetMapping("/test")
  public String test(){
    return "Test Тест";
  }





}
