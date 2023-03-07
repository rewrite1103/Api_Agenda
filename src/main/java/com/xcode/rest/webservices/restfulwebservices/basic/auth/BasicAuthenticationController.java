package com.xcode.rest.webservices.restfulwebservices.basic.auth;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


//especificando el origen de la peticiones que se deben de aceptar

@CrossOrigin(origins="http://localhost:4200")
//controller
@RestController
public class BasicAuthenticationController {
	
	@GetMapping( path = "/BasicAuth")
	public AuthenticationBean  helloWorldBean() {
		//throw new RuntimeException("Some Error has Happened! Contac Support at ***_***")
		return new AuthenticationBean("You are authenticate");
	}
	


}
