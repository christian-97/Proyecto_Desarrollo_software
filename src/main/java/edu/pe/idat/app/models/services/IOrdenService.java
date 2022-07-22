package edu.pe.idat.app.models.services;

import java.util.List;

import edu.pe.idat.app.models.entities.Orden;
import edu.pe.idat.app.models.entities.Usuario;

public interface IOrdenService {
	List<Orden> findAll();
	Orden save (Orden orden);
	String generarNumeroOrden();
	List<Orden> findByUsuario(Usuario usuario);

}
