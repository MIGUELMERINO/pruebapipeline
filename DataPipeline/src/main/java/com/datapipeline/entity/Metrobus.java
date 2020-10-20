package com.datapipeline.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "metrobus")
public class Metrobus implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idmetrobus;
	private Float lat;
	private Float lon;
	private String name;
	private String line;

	public Integer getIdmetrobus() {
		return idmetrobus;
	}

	public void setIdmetrobus(Integer idmetrobus) {
		this.idmetrobus = idmetrobus;
	}

	public Float getLat() {
		return lat;
	}

	public void setLat(Float lat) {
		this.lat = lat;
	}

	public Float getLon() {
		return lon;
	}

	public void setLon(Float lon) {
		this.lon = lon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	@Override
	public String toString() {
		return "Metrobus [idmetrobus=" + idmetrobus + ", lat=" + lat + ", lon=" + lon + ", name=" + name + ", line="
				+ line + "]";
	}

}
