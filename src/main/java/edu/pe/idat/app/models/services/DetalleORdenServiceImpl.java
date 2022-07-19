package edu.pe.idat.app.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.idat.app.models.DAO.IDetalleOrdenDao;
import edu.pe.idat.app.models.entities.DetalleOrden;


@Service
public class DetalleORdenServiceImpl implements IDetalleOrdenService{

	@Autowired
	private IDetalleOrdenDao detalleOrdenDao;
	
	@Override
	public DetalleOrden save(DetalleOrden detalleOrden) {
		// TODO Auto-generated method stub
		return detalleOrdenDao.save(detalleOrden);
	}


}
