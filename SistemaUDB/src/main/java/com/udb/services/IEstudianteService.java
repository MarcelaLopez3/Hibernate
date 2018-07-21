package com.udb.services;

import java.util.Date;
import java.util.List;

import com.udb.entity.Estudiante;

public interface IEstudianteService {

	public Estudiante addEstudiante(String nombres, String apellidos,String carnet, String edad);
	public Estudiante updateEstudiante(long id,String nombres, String apellidos,String carnet, String edad);
	public Estudiante getCliente(long id);
	public void deleteEstudiante(long id);
	public List<Estudiante> getEstudiantes();
}
