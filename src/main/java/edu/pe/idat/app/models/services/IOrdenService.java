package edu.pe.idat.app.models.services;

import java.util.List;

import edu.pe.idat.app.models.entities.Orden;

public interface IOrdenService {
	List<Orden> findAll();
	Orden save (Orden orden);
	String generarNumeroOrden();

}
