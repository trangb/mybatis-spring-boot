package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dao.BookMapper;
import com.example.model.Book;

@Controller
public class HomeController {

 
  @RequestMapping("/")
  public String greeting() {
      return "index";
  }
}
