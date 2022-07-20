package edu.pe.idat.app.models.DAO;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.pe.idat.app.models.entities.Usuario;

@Repository
public interface UsuarioDao extends JpaRepository <Usuario,Integer>{
	Optional <Usuario> findByEmail(String email);
}