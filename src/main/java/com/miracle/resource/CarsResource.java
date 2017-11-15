package com.miracle.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miracle.dao.CarRepository;
import com.miracle.model.Cars;
import com.miracle.model.Customer;


@RestController
@RequestMapping("/rest/cars")
public class CarsResource {
	@Autowired
	CarRepository carRepository;
	 @GetMapping("/all")
	    public List<Cars> getAll() {
	        return (List<Cars>) carRepository.findAll();
	    }
	 @GetMapping("/id/{id}")
	    public Cars getId(@PathVariable("id") final Long id) {
	        return carRepository.findOne(id);
	    }

}
