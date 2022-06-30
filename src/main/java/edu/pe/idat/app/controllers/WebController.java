package edu.pe.idat.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.models.dao.IWeb;

@Controller
public class WebController {
	
	@Autowired
	private IWeb iWeb;
	
	@GetMapping("/home")
	public String mostrar(Model model) {
		model.addAttribute("web",iWeb.mostrarTodo());
		return "home";
	}

}
