package br.com.franca.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeuController {

	@GetMapping(path = "/")
	public String helloWorld() {
		return "Hello World";
	}
}
