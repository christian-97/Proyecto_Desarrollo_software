package edu.pe.idat.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.pe.idat.app.models.entities.Producto;
import edu.pe.idat.app.services.ProductoService;

@Controller
@RequestMapping("/administrador")
public class AdminController {
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("")
	public String home(Model model) { //cambié el home() a show()
		List<Producto> productos=productoService.findAll();
		model.addAttribute("productos",productos);
		return"administrador/home";
	}

}
