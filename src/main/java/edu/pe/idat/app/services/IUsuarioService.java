package edu.pe.idat.app.services;

import java.util.Optional;

import edu.pe.idat.app.models.entities.Usuario;

public interface IUsuarioService {
	Optional <Usuario>findById(Integer id);

}
