package com.datapipeline.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.datapipeline.entity.Metrobus;

public interface MetrobusDao extends JpaRepository<Metrobus, Integer> {
	
	@Query("Select m from Metrobus m where m.idmetrobus=:idmetro")
	public List<Metrobus> getListMetrobus(@Param("idmetro") Integer idmetro);

}
