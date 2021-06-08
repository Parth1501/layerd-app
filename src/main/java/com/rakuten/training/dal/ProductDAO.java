package com.rakuten.training.dal;

import java.util.List;

import com.rakuten.training.domain.Product;

public interface ProductDAO {
	public Product save(Product toBeSaved);
	public List<Product> findAll();
	public Product findById(int id);
	public void deleteById(int id);
}
