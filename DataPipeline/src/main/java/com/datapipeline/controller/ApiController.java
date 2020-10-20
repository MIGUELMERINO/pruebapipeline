package com.datapipeline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datapipeline.dao.MetrobusDao;
import com.datapipeline.dao.TownHallDao;
import com.datapipeline.entity.Metrobus;
import com.datapipeline.entity.TownHall;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class ApiController {
	
	@Autowired
	private MetrobusDao metroDao;
	
	@Autowired
	private TownHallDao townHallDao;
	
	@PostMapping("/metrobus")
	public Metrobus save(@RequestBody Metrobus metrobus) {
		return metroDao.save(metrobus);
	}
	
	@GetMapping("/metrobus")
	public List<Metrobus> allMetrobus(){
		return metroDao.findAll();
	}
	
	@GetMapping("/metrosbus/idmetrobus")
	public List<Metrobus> getMetrobusId(@PathVariable("idmetrobus") Integer idmetrobus){
		return metroDao.getListMetrobus(idmetrobus);
	}
	
	@PostMapping("/town")
	public TownHall save(@RequestBody TownHall townHall) {
		return townHallDao.save(townHall);
	}
	
	@GetMapping("/town")
	public List<TownHall> getTownHall(){
		return townHallDao.findAll();
	}
	
	

}
