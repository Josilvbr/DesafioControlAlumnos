package cl.edutecno.service;

import java.util.List;

import cl.edutecno.model.Alumno;

public interface AlumnoService {
	
	List <Alumno> findAll();
	void save(Alumno alumno);
	
}
