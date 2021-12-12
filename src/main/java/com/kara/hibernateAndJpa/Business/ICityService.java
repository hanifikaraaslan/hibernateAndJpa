package com.kara.hibernateAndJpa.Business;

import java.util.List;

import com.kara.hibernateAndJpa.Entities.City;

public interface ICityService {
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete (City city);
}
