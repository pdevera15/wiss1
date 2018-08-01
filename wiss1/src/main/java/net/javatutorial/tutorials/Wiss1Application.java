package net.javatutorial.tutorials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Wiss1Application {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "index.jsp";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Wiss1Application.class, args);
	}
}
