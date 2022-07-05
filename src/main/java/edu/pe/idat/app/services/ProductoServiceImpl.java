package edu.pe.idat.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.idat.app.models.DAO.ProductoDao;
import edu.pe.idat.app.models.entities.Producto;

//se crea un ProductoServiceImpl que 
//implemta a ProductoService para poder usar
//las funciones de ProductoService

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoDao productoRepository;

	@Override
	public Producto save(Producto producto) {
		// save = guardar
		return productoRepository.save(producto);
	}

	@Override
	public Optional<Producto> get(Integer id) {
		// findById = buscar por Id
		return productoRepository.findById(id);
	}

	@Override
	public void update(Producto producto) {
		// TODO Auto-generated method stub
		productoRepository.save(producto);
	}

	@Override
	public void delete(Integer id) {
		// deleteById = eliminar por Id
		productoRepository.deleteById(id);
	}

	@Override
	public List<Producto> findAll() {  //lista los productos
		// TODO Auto-generated method stub
		return productoRepository.findAll(); //utilizamos el objeto producto repositori, con le método findAll
	}

}
