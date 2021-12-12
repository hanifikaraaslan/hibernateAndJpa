package com.kara.hibernateAndJpa.Entities;

import javax.persistence.*;


@Entity
@Table(name="City")
public class City {
	@Id
	@Column(name="Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="Names")
	private String name;
	@Column(name="CountryCode")
	private String countryCode;
	@Column(name="District")
	private String district;
	@Column(name="Population")
	private String population;
	
	public City() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	
	public City(int id, String name, String countryCode, String district, String population) {
		super();
		this.id = id;
		this.name = name;
		this.countryCode = countryCode;
		this.district = district;
		this.population = population;
	}

}
