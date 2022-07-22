package edu.pe.idat.app.models.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.pe.idat.app.models.entities.Orden;
import edu.pe.idat.app.models.entities.Usuario;


@Repository
public interface IOrdenDao extends JpaRepository<Orden,Integer>{
	List<Orden> findByUsuario(Usuario usuario);

}
