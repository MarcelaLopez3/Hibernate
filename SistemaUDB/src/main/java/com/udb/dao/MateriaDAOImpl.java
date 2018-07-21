package com.udb.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.udb.entity.Materia;

@Repository("materiaDAO")
@Transactional

public class MateriaDAOImpl implements IMateriaDAO {

	@PersistenceContext
	public EntityManager entityManager;
	
	@Transactional(readOnly=false)
	public Materia addMateria(Materia materia) {
		entityManager.persist(materia);
		return materia;
	}

	@Transactional(readOnly=false)
	public Materia updateMateria(Materia materia) {
		entityManager.merge(materia);
		return materia;
	}

	@Override
	public Materia getMateria(long id) {
		String sql = "select materia from Materia materia where materia.id=" + id;
		try{
			return (Materia) entityManager.createQuery(sql).getSingleResult();
		}catch(Exception e){
			e.printStackTrace();
		}
	    return null;
	}

	@Transactional(readOnly=false)
	public void deleteMateria(long id) {
		// TODO Auto-generated method stub
		Materia materia = entityManager.find(Materia.class,id);
		if (materia !=null) {
			entityManager.remove(materia);
		}
	}

	@Override
	public List<Materia> getMaterias() {
		return entityManager.createQuery("select materia from Materia materia").getResultList();
	}

}
