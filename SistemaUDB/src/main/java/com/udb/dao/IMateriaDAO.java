package com.udb.dao;

import java.util.List;

import com.udb.entity.Materia;

public interface IMateriaDAO {
	public Materia addMateria(Materia materia);
	public Materia updateMateria(Materia materia);
	public Materia getMateria(long id);
	public void deleteMateria(long id);
	public List<Materia> getMaterias();
}
