package com.cg.dao;

import java.util.*;

import com.cg.bean.Product;
import com.cg.exception.ProductException;

public interface ProductDao 
{
	public int addProduct(Product product) throws ProductException;
	public Product findProductById(int productId) throws ProductException;
	public Product deleteProductById(int productId) throws ProductException;
	public List<Product> findAllProducts() throws ProductException;
}
