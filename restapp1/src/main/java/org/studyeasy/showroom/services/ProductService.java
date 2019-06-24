package org.studyeasy.showroom.services;

import java.util.List;

import org.studyeasy.showroom.hibernate.DAO.ProductsDAO;
import org.studyeasy.showroom.model.Product;

public class ProductService {
	ProductsDAO DAO=new ProductsDAO();

	public List<Product> getProductByBrand(int brandId) {
		List<Product> Productlist=DAO.getProductByBrand(brandId);
		return Productlist;
	}

	public List<Product> getProductByBrandAndCategory(int brandId,
			String category) {
		List<Product> Productlist=DAO.getProductByBrandAndCategory(brandId,category);
		return Productlist;
		
	}

}
