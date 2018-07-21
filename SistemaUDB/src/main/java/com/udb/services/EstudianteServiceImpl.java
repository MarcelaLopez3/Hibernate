package com.udb.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.udb.dao.IEstudianteDAO;
import com.udb.entity.Estudiante;


@Service("estudianteService")
@Transactional
public class EstudianteServiceImpl implements IEstudianteService{

	@Autowired
	@Qualifier("estudianteDAO")
	private IEstudianteDAO estudianteDAO;

	@Transactional
	public Estudiante addEstudiante(String nombres, String apellidos, String carnet, String edad) {
		Estudiante estudiante = new Estudiante();
		estudiante.setNombres(nombres);
		estudiante.setApellidos(apellidos);
		estudiante.setCarnet(carnet);
		estudiante.setEdad(edad);
		estudiante.setFechaCreacion(new Date());
		estudiante.setFechaModificacion(new Date());
		estudiante = estudianteDAO.addEstudiante(estudiante);
		return estudiante;
	}

	@Transactional
	public Estudiante updateEstudiante(long id,String nombres, String apellidos, String carnet, String edad) {
		Estudiante estudiante = new Estudiante();
		estudiante.setNombres(nombres);
		estudiante.setApellidos(apellidos);
		estudiante.setCarnet(carnet);
		estudiante.setEdad(edad);
		estudiante.setFechaCreacion(new Date());
		estudiante.setFechaModificacion(new Date());
		estudiante.setId(id);		
		estudiante = estudianteDAO.updateEstudiante(estudiante);
		return estudiante;
	}

	@Override
	public Estudiante getCliente(long id) {
		// TODO Auto-generated method stub
		return estudianteDAO.getCliente(id);
	}

	@Transactional
	public void deleteEstudiante(long id) {
		// TODO Auto-generated method stub
		estudianteDAO.deleteEstudiante(id);
	}

	@Override
	public List<Estudiante> getEstudiantes() {
		// TODO Auto-generated method stub
		return estudianteDAO.getEstudiantes();
	}
}
