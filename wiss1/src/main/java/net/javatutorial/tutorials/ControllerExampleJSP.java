package net.javatutorial.tutorials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class ControllerExampleJSP {

	@RequestMapping("/hellojsp")
	String helloJSP() {
		return("index");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(ControllerExampleJSP.class, args);
	}

}
