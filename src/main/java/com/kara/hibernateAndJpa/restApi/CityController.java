package com.kara.hibernateAndJpa.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kara.hibernateAndJpa.Business.ICityService;
import com.kara.hibernateAndJpa.Entities.*;


@RestController
@RequestMapping("/api")
public class CityController {
	ICityService cityService;

	@Autowired
	public CityController(ICityService cityService) {
		this.cityService = cityService;
	}
	@GetMapping("/cities")
	public List<City> get(){
		return cityService.getAll();
	}

}
