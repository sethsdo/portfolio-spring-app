package com.setholmstead.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@SpringBootApplication
public class PortfolioAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioAppApplication.class, args);
	}
	@RequestMapping("/")
	public String hello() {
		System.out.println("Main route");
		return "index.html";
	}
	@RequestMapping("/me")
    public String aboutMe() {
            return "about.html";
    }
	@RequestMapping("/project")
    public String projects() {
            return "projects.html";
    }
}
