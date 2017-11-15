package com.miracle.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.miracle.model.Cars;


public interface CarRepository extends CrudRepository<Cars, Long> {
	

}
