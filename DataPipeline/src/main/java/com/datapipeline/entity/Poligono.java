package com.datapipeline.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "poligonos")
public class Poligono implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idpoligono;
	private String lat;
	private String log;

	public Integer getIdpoligono() {
		return idpoligono;
	}

	public void setIdpoligono(Integer idpoligono) {
		this.idpoligono = idpoligono;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	@Override
	public String toString() {
		return "Poligono [idpoligono=" + idpoligono + ", lat=" + lat + ", log=" + log + "]";
	}

}
