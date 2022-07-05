package edu.pe.idat.app.services;

import java.util.Optional;

import edu.pe.idat.app.models.entities.Producto;

public interface ProductoService {
	public Producto save(Producto producto);
	public Optional<Producto> get(Integer id);
	public void update(Producto producto);
	public void delete(Integer id);

}
