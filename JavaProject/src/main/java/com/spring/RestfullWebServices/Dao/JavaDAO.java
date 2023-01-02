package com.spring.RestfullWebServices.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.RestfullWebServices.entity.buildingMaster;

public interface JavaDAO extends JpaRepository<buildingMaster,Integer> {

}
