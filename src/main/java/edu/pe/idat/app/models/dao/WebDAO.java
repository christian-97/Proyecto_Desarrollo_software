package edu.pe.idat.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.models.entities.Web;

@Repository
public class WebDAO implements IWeb{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional(readOnly=true)
	public List<Web>mostrarTodo(){
	// TODO Auto-generated method stub
	return entityManager.createQuery("from Web",Web.class).getResultList();
	
	}
}
