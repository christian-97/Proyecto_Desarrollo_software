package edu.pe.idat.app.services;

import java.util.Optional;

import edu.pe.idat.app.models.entities.Producto;

// se crea un ProductoService que importa los modelos de
//models.entites para crearles funciones CRUD 
// cada una de ellas recive parámetros

public interface ProductoService {
	// por ejemplo save(guardar) recive como parámetro
	// a una clase producto
	public Producto save(Producto producto);

	// Optional verifica que Producto estee creado en la base de datos
	// esto recive como parametro un id para poder buscarlo
	public Optional<Producto> get(Integer id);

	// update recive a una clase producto para buscar
	// su id y actualizar sus datos
	public void update(Producto producto);
	
	//delete recive como parámetro un id 
	//para buscar y eliminar un producto
	public void delete(Integer id);

}
