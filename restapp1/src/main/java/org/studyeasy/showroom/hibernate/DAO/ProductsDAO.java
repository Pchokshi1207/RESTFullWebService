package org.studyeasy.showroom.hibernate.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.studyeasy.showroom.model.Brand;
import org.studyeasy.showroom.model.Product;

public class ProductsDAO {
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Product.class).addAnnotatedClass(Brand.class).buildSessionFactory();

	public List<Product> getProductByBrand(int brandId) {
		Session session=factory.getCurrentSession();
		session.beginTransaction();
		List<Product> Productlist;
		String hql="from products where brandId='"+brandId+"'";
		Productlist=session.createQuery(hql).getResultList();
		return Productlist;
	}

	public List<Product> getProductByBrandAndCategory(int brandId,
			String category) {
		
		Session session=factory.getCurrentSession();
		session.beginTransaction();
		List<Product> Productlist;
		String hql="from products where brandId='"+brandId+"' and category='"+category+"'";
		Productlist=session.createQuery(hql).getResultList();
		return Productlist;
	}
	

}
