package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Person;

@Controller
@RequestMapping("/banhang")
public class MainController {
	private static List<Person> list = new ArrayList<Person>();

}
