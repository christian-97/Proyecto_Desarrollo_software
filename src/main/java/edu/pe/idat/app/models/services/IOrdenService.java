package edu.pe.idat.app.models.services;

import java.util.List;
import java.util.Optional;

import edu.pe.idat.app.models.entities.Orden;
import edu.pe.idat.app.models.entities.Usuario;

public interface IOrdenService {
	List<Orden> findAll();
	Optional<Orden> findById(Integer id);
	Orden save (Orden orden);
	String generarNumeroOrden();
	List<Orden> findByUsuario(Usuario usuario);

}
