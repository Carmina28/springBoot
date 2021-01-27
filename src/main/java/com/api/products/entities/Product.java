package com.api.products.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

//POJO: Plain object, which contains the properties, and access methods, set and get

@Entity // Object that could be sent and retrieved to the DB
@Table(name="products")
public class Product {
	
	//SpringBoot will use this anotations to generate the table automatically
	//Just create the DB
	
	@Column(name="id")
	//Autoincremental
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Long id;
	
	@Column(name="name", nullable=false, length=30)
	private String name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
