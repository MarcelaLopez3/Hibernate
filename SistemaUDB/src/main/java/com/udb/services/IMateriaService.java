package com.udb.services;

import java.util.List;
import com.udb.entity.Materia;

public interface IMateriaService
{
	public Materia addMateria(String nombre, String descripcion,String horas, String uv);
	public Materia updateMateria(long id,String nombre, String descripcion,String horas, String uv);
	public Materia getMateria(long id);
	public void deleteMateria(long id);
	public List<Materia> getMaterias();

}
