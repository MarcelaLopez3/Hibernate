package com.udb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="materiaInscrita")
public class MateriaInscrita 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_mi;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_estudiante", nullable = false)
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    private Estudiante estudiante;
	
	@ManyToMany(cascade = { 
        CascadeType.PERSIST, 
        CascadeType.MERGE
    })
    @JoinTable(name = "materiaInscrita_materia",
        joinColumns = @JoinColumn(name = "materiaInscrita_id"),
        inverseJoinColumns = @JoinColumn(name = "materia_id")
    )
    private List<Materia> tags = new ArrayList<>();

	public long getId_mi() {
		return id_mi;
	}

	public void setId_mi(long id_mi) {
		this.id_mi = id_mi;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public List<Materia> getTags() {
		return tags;
	}

	public void setTags(List<Materia> tags) {
		this.tags = tags;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estudiante == null) ? 0 : estudiante.hashCode());
		result = prime * result + ((fechaCreacion == null) ? 0 : fechaCreacion.hashCode());
		result = prime * result + (int) (id_mi ^ (id_mi >>> 32));
		result = prime * result + ((tags == null) ? 0 : tags.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MateriaInscrita other = (MateriaInscrita) obj;
		if (estudiante == null) {
			if (other.estudiante != null)
				return false;
		} else if (!estudiante.equals(other.estudiante))
			return false;
		if (fechaCreacion == null) {
			if (other.fechaCreacion != null)
				return false;
		} else if (!fechaCreacion.equals(other.fechaCreacion))
			return false;
		if (id_mi != other.id_mi)
			return false;
		if (tags == null) {
			if (other.tags != null)
				return false;
		} else if (!tags.equals(other.tags))
			return false;
		return true;
	}
}
