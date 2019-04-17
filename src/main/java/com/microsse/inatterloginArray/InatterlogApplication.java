package com.microsse.inatterloginArray;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class InatterlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(InatterlogApplication.class, args);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/login")
	public boolean login(@PathVariable String username, @PathVariable String passwd) {
		if(username.equalsIgnoreCase("amicrosse") && passwd.equals("letmein"))
			return true;
		else return false;
	}	
}
