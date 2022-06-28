package edu.pe.idat.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.pe.idat.app.models.entities.PaginaWebPrincipalModel;

@Controller
public class WebController {
	
	@GetMapping("/index")
	public String listar(Model model) {
		PaginaWebPrincipalModel web = new PaginaWebPrincipalModel("alo");
		model.addAttribute("PaginaPrincipal",web);
		return "index";
	}

}
