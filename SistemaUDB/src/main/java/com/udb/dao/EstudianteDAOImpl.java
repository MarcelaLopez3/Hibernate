package com.udb.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.udb.entity.Estudiante;

@Repository("estudianteDAO")
@Transactional
public class EstudianteDAOImpl implements IEstudianteDAO {

	@PersistenceContext
	public EntityManager entityManager;
	
	@Transactional(readOnly=false)
	public Estudiante addEstudiante(Estudiante estudiante) {
		entityManager.persist(estudiante);
		return estudiante;
	}

	@Transactional(readOnly=false)
	public Estudiante updateEstudiante(Estudiante estudiante) {
		entityManager.merge(estudiante);
		return estudiante;
	}

	@Override
	public Estudiante getCliente(long id) {
		String sql = "select estudiante from Estudiante estudiante where estudiante.id=" + id;
		try{
			return (Estudiante) entityManager.createQuery(sql).getSingleResult();
		}catch(Exception e){
			e.printStackTrace();
		}
	    return null;
	}

	@Transactional(readOnly=false)
	public void deleteEstudiante(long id) {
		Estudiante estudiante= entityManager.find(Estudiante.class,id);
		if(estudiante!=null) {
			entityManager.remove(estudiante);
		}
	}

	@Override
	public List<Estudiante> getEstudiantes() {
		return entityManager.createQuery("select estudiante from Estudiante estudiante").getResultList();
	}

}
