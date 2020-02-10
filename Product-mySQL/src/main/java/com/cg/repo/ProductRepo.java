package com.cg.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.entity.Product;

public interface ProductRepo extends JpaRepository<Product , Integer>{

	@Query("SELECT p FROM Product p WHERE p.category=:cat")
	List<Product> getByCategory(String cat);
	
	@Query("SELECT p FROM Product p WHERE p.price BETWEEN :min and :max")
	List<Product> getByPriceRange(double min,double max);
	
	@Query("SELECT p FROM Product p WHERE p.rating=:rat")
	List<Product> getByRating(int rat);
	
	@Query("SELECT p FROM Product p ORDER BY p.price")
	List<Product> orderBy();
	
	@Query("SELECT p FROM Product p")
	List<Product> getAll();
}
