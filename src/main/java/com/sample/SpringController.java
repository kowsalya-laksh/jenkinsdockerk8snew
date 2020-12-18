package com.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
	
    @RequestMapping("/getmessage")
	public String getMessage() {
    	return "Welcome to spring Boot Application!!";

	}

}
