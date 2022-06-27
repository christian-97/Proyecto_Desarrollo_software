package edu.pe.idat.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.pe.idat.app.models.dao.ICliente;

@Controller
public class ClienteController {
	
	@Autowired
	private ICliente iCliente;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("clientes", iCliente.listarTodo());
		return "listar";
	}
}
