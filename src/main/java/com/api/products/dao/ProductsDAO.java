package com.api.products.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.products.entities.Product;


//Implement CRUD functions of an Entity

public interface ProductsDAO extends JpaRepository<Product, Long>{

}
