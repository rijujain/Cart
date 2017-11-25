package dao;

import java.util.List;

import model.Product;

public interface ProductDAO {
	public String insertDetails(List<Product> data);
	public List<Product> getAllProducts();

}
