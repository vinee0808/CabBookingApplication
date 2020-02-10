package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.entity.Product;
import com.cg.exception.ProductNotFoundException;
import com.cg.repo.ProductRepo;

@Service
@Transactional(rollbackFor = ProductNotFoundException.class)
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo repo;
	
	@Override
	public Product addProduct(Product product) {
		return repo.save(product);
	}

	@Override
	public Product fetchById(int id) throws ProductNotFoundException {
		return repo.findById(id).get();
	}

	@Override
	public List<Product> fetchByCategory(String category) throws ProductNotFoundException {
		return repo.getByCategory(category);
	}

	@Override
	public List<Product> fetchByPriceRange(double min, double max) throws ProductNotFoundException {
		return repo.getByPriceRange(min, max);
	}

	@Override
	public List<Product> fetchAll() throws ProductNotFoundException {
		return repo.findAll();
	}

	@Override
	public Product updateProduct(Product product) {
		return repo.save(product);
	}

	@Override
	public Boolean deleteProduct(int id) throws ProductNotFoundException {
		try {
			repo.deleteById(id);
			return true;
		} catch (Exception e) {
			throw new ProductNotFoundException("No product found with id "+id);
		}
	}

}
