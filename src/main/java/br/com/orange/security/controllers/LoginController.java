package br.com.orange.security.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.orange.security.config.AccountCredentials;

@RestController

public class LoginController {

    @RequestMapping("/login")	
	public String login(@RequestBody AccountCredentials credentials) {
		return "Hello World"; 
	}
	
	
}
