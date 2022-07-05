package edu.pe.idat.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/administrador")
public class AdminController {
	
	@GetMapping("")
	public String home() { //cambié el home() a show()
		return"administrador/home";
	}

}
