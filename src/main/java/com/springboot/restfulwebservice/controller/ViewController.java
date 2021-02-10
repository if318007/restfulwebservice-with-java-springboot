package com.springboot.restfulwebservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
@Controller
public class ViewController {
 @RequestMapping("/view-users")
 public String viewUsers() {
 return "view-users";
 }
 @RequestMapping("/add-users")
 public String addUsers() {
 return "add-users";
 }
}
