package com.udb.dao;

import java.util.Date;
import java.util.List;

import com.udb.entity.Estudiante;

public interface IEstudianteDAO {

	public Estudiante addEstudiante(Estudiante estudiante);
	public Estudiante updateEstudiante(Estudiante estudiante);
	public Estudiante getCliente(long id);
	public void deleteEstudiante(long id);
	public List<Estudiante> getEstudiantes();
}
