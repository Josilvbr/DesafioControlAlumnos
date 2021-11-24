package cl.edutecno.service;

import java.util.List;

import cl.edutecno.model.Direccion;

public interface DireccionService {
	
	List <Direccion> findAll();
	void save(Direccion direccion);
}
