package com.miracle.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cars {
	@Id
	Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	String year,make,model,vin;

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public Cars(Long id,String year, String make, String model, String vin) {
		super();
		this.id=id;
		this.year = year;
		this.make = make;
		this.model = model;
		this.vin = vin;
	}
	
public Cars() {}
}
