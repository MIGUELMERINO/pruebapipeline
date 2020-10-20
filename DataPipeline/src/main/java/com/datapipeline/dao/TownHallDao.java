package com.datapipeline.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.datapipeline.entity.TownHall;


public interface TownHallDao extends JpaRepository<TownHall, Integer> {

}
