package com.kara.hibernateAndJpa.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kara.hibernateAndJpa.DataAccess.ICityDal;
import com.kara.hibernateAndJpa.Entities.City;

@Service
public class CityManager implements ICityService {

	private ICityDal cityDal ;
	
	@Autowired
	public CityManager(ICityDal cityDal) {
		
		this.cityDal = cityDal;
	}

	@Override
	@Transactional
	public List<City> getAll() {
		// TODO Auto-generated method stub
		return this.cityDal.getAll();
	}

	@Override
	@Transactional
	public void add(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void update(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void delete(City city) {
		// TODO Auto-generated method stub
		
	}

}
