package edu.pe.idat.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.pe.idat.app.models.entities.Cliente;

@Repository
public class ClienteDAO implements ICliente {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> listarTodo(){
		//Todo Auto-generated method stub
		return entityManager.createQuery("from Cliente", Cliente.class).getResultList();
	}
}
