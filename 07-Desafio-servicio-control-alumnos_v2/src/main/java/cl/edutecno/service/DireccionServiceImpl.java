package cl.edutecno.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.edutecno.model.Direccion;
import cl.edutecno.repository.DireccionRepository;

@Service
public class DireccionServiceImpl implements DireccionService {
	
	@Autowired
	private DireccionRepository direccionRepository;
	
	@Override
	public List<Direccion> findAll() {
		return direccionRepository.findAll();
	}

	@Override
	public void save(Direccion direccion) {
		direccionRepository.save(direccion);
		
	}

}
