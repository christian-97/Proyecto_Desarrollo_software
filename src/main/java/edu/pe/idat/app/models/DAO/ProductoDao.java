package edu.pe.idat.app.models.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.pe.idat.app.models.entities.Producto;


//el puente entre la lógica y no se que mas V,:
@Repository
public interface ProductoDao extends JpaRepository<Producto,Integer>{
	
}
