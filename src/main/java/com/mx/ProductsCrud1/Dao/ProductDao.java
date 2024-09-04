package com.mx.ProductsCrud1.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.ProductsCrud1.Model.Products;



public interface ProductDao extends JpaRepository<Products, Long>{

	public Products findByNameAndType(String name, String type);
	
}
