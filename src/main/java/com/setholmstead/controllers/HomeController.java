package com.setholmstead.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String hello() {
		System.out.println("Main route");
		return "index.html";
	}
	@RequestMapping("/me")
    public String aboutMe() {
            return "about.html";
    }
	@RequestMapping("/projects")
    public String projects() {
            return "projects.html";
    }
}
