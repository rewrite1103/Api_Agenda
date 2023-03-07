package com.xcode.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins= "http://localhost:4200")

public class HelloWorldController {

	@GetMapping(path = "/hello-world")
	public String helloWord() {
		return "Hola Mundo";
	}
	
	@GetMapping(path = "/hello-beans")
	public HelloWorldBean helloBean() {
	//	throw new RuntimeException("Este es un eror aqui nada funciona") ;
		return new HelloWorldBean("Hello MUNdo");
	}
	
	@GetMapping(path = "/hello-beans/{name}")
	public HelloWorldBean helloBeanPath(@PathVariable String name) {
		return new HelloWorldBean( String.format("Hola mi Nombre es:, %s", name));
	}
	
}
