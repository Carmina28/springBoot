package com.api.products.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.products.dao.ProductsDAO;
import com.api.products.entities.Product;


//GET method by default

@RestController
//All methods will be available in products

@RequestMapping("products")
public class ProductsREST {

	//Inject an object, since the interface cannot be instantiated,
	//SpringBoot will create a class 
	@Autowired
	private ProductsDAO productDAO;
	
	//It will be a common method until we specify the @GetMapping
//	@GetMapping
//	public ResponseEntity<Product> getProduct(){
//		Product product = new Product();
//		product.setId(1L);
//		product.setName("Producto 1");
//		return ResponseEntity.ok(product);
//		
//	}
	//Class that will allow you to connect to the Database
	//Import Database driver 
	//SpringDataJPA, JPA is a library, relational object which allows you to convert
	//classes to SQL instructions
	//Then the resultSet will be converted to objects
	@GetMapping
//	@RequestMapping(value ="products", method=RequestMethod.GET)
	public ResponseEntity<List<Product>> getProduct(){
		List<Product> products = productDAO.findAll();
		return ResponseEntity.ok(products);
	}
	
	
	
	//Find pid of specific port
	//netstat -a -n -o | grep "8080"
	
	
	//They're similar, but GetMappping doesn't define  a URL
	//@GetMapping //localhost:8080
	//Personalize the URL
	//@RequestMapping(value ="hello", method=RequestMethod.GET)
	public String hello() {
		return "Hello world";
	}


	
}
