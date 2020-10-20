package com.datapipeline.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "towhalls")
public class TownHall implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idtownhall;
	private String nomgeo;
	private String municipality;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Poligono> poligono = new ArrayList<>();

	public Integer getIdtownhall() {
		return idtownhall;
	}

	public void setIdtownhall(Integer idtownhall) {
		this.idtownhall = idtownhall;
	}

	public String getNomgeo() {
		return nomgeo;
	}

	public void setNomgeo(String nomgeo) {
		this.nomgeo = nomgeo;
	}

	public String getMunicipality() {
		return municipality;
	}

	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

	public List<Poligono> getPoligono() {
		return poligono;
	}

	public void setPoligono(List<Poligono> poligono) {
		this.poligono = poligono;
	}

	@Override
	public String toString() {
		return "TownHall [idtownhall=" + idtownhall + ", nomgeo=" + nomgeo + ", municipality=" + municipality
				+ ", poligono=" + poligono + "]";
	}

	

}
