package org.studyeasy.showroom.services;

import java.util.List;

import org.studyeasy.showroom.hibernate.DAO.BrandsDAO;
import org.studyeasy.showroom.model.Brand;
import org.studyeasy.showroom.resources.BrandsResource;

public class BrandService {
	BrandsDAO DAO=new BrandsDAO();

	public List<Brand> getBrands() {
		List<Brand> list=DAO.getBrands();
		return list;
	}

	public void addBrand(Brand brand) {
		DAO.addBrand(brand);
		
	}

	public void updateBrand(Brand updatedBrand) {
		DAO.updateBrand(updatedBrand);
		
	}

	public void deleteBrand(int brandId) {
		// TODO Auto-generated method stub
		DAO.deleteBrand(brandId);
		
	}

	/*
	public List<BrandEntity> getBrandsById(int brandId) {
		List<BrandEntity> list=DAO.getBrandsById(brandId);
		return list;
	}
	*/

	public Brand getBrandById(int brandId) {
		return DAO.getBrandById(brandId);
		
	}

}
