package edu.pe.idat.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.pe.idat.app.models.entities.Orden;
import edu.pe.idat.app.models.entities.Producto;
import edu.pe.idat.app.models.services.IUsuarioService;
import edu.pe.idat.app.models.services.ProductoService;

@Controller
@RequestMapping("/administrador")
public class AdminController {
	
	@Autowired
	private ProductoService productoService;
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("")
	public String home(Model model) { //cambié el home() a show()
		List<Producto> productos=productoService.findAll();
		model.addAttribute("productos",productos);
		return"administrador/home";
	}
	
	@GetMapping("/usuarios")
	public String usuarios(Model model) {
		model.addAttribute("usuarios", usuarioService.findAll());
		return "administrador/usuarios";
	}
	
	@GetMapping("/ordenes")
	public String ordenes(Model model) {
		//model.addAttribute("ordenes", ordensService.findAll());
		return "administrador/ordenes";
	}
	
	@GetMapping("/detalle/{id}")
	public String detalle(Model model, @PathVariable Integer id) {
		//logg.info("Id de la orden {}",id);
		//Orden orden= ordensService.findById(id).get();
		
		//model.addAttribute("detalles", orden.getDetalle());
		
		return "administrador/detalleorden";
	}

}
