package edu.pe.idat.app.controllers;

import java.util.Optional;

import org.slf4j.*; //importa todo lo que tiene el paquete de Logger
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.pe.idat.app.models.entities.Producto;
import edu.pe.idat.app.models.entities.Usuario;
import edu.pe.idat.app.services.ProductoService;


@Controller
@RequestMapping("/productos")
public class ProductoController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(ProductoController.class); //variable tipo logger q va haciendo un Log(registro) de lo que se ejecuta dentro del programa
				//variable LOGGER	//clase LoggerFactory//getLogger es una método q recibe un parámetro(en este caso el nombre de la clase)
	@Autowired //crea objetos el mismo spring
	private ProductoService productoService; //objeto productoService
	
	@GetMapping("")
	public String show(Model model) { //parámetro de tipo model,lleva información desde backend hacia la vista Show
		model.addAttribute("productos", productoService.findAll()); // se usa el objeto model, y se invoca addAtribute con 2 parámetros, objeto productoService en donde están todos los métodos.
		return "productos/show";
	}
	@GetMapping("/create")		//comentarios de Argumedo
	public String create() {
		return "productos/create";
	}
	@PostMapping("/save")						 // responde a una peticion tipo postmapping, mapeado con /save
	public String save(Producto producto) {			//importamos producto y --> //recibe parámetro en el objeto producto
		LOGGER.info("Este es el objeto producto {}", producto);
		Usuario u = new Usuario(1,"","","","","","",""); //crear usuario en la base de datos
		producto.setUsuario(u);						//se añade el usuario a producto 
		
		productoService.save(producto);
		return "redirect:/productos";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Integer id,Model model) {
		
		Producto producto = new Producto();
		Optional<Producto> optionalProducto=productoService.get(id);
 		producto=optionalProducto.get();
 		LOGGER.info("busacado : {}",producto);
		model.addAttribute("producto",producto);
 		return "productos/edit";
	}
	
	@PostMapping("/update")
	public String update(Producto producto) {
		productoService.update(producto);
		return "redirect:/productos";
	}
}
