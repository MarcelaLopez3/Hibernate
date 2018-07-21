package com.udb.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.udb.dao.IMateriaDAO;
import com.udb.entity.Materia;

@Service("materiaService")
@Transactional
public class MateriaServiceImpl implements IMateriaService
{
	@Autowired
	@Qualifier("materiaDAO")
	private IMateriaDAO materiaDAO;

	@Transactional
	public Materia addMateria(String nombre, String descripcion, String horas, String uv) {
		Materia materia = new Materia();
		materia.setNombre(nombre);
		materia.setDescripcion(descripcion);
		materia.setHoras(horas);
		materia.setUv(uv);
		materia.setFechaCreacion(new Date());
		materia.setFechaModificacion(new Date());
		materia = materiaDAO.addMateria(materia);
		return materia;
	}

	@Transactional
	public Materia updateMateria(long id,String nombre, String descripcion, String horas, String uv) {
		Materia materia = new Materia();
		materia.setNombre(nombre);
		materia.setDescripcion(descripcion);
		materia.setHoras(horas);
		materia.setUv(uv);
		materia.setFechaCreacion(new Date());
		materia.setFechaModificacion(new Date());
		materia.setId(id);		
		materia = materiaDAO.updateMateria(materia);
		return materia;
	}

	@Override
	public Materia getMateria(long id) {
		// TODO Auto-generated method stub
		return materiaDAO.getMateria(id);
	}

	@Transactional
	public void deleteMateria(long id) {
		// TODO Auto-generated method stub
		materiaDAO.deleteMateria(id);
	}

	@Override
	public List<Materia> getMaterias() {
		// TODO Auto-generated method stub
		return materiaDAO.getMaterias();
	}
}
