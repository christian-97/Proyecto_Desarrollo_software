package edu.pe.idat.app.models.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.pe.idat.app.models.entities.Orden;


@Repository
public interface IOrdenDao extends JpaRepository<Orden,Integer>{

}
