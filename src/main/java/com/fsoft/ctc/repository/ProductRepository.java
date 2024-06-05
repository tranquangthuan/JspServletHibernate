package com.fsoft.ctc.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.fsoft.ctc.entity.Product;
import com.fsoft.ctc.util.HibernateUtils;

public class ProductRepository {

	public List<Product> getProducts() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM Product";
		Query<Product> query = session.createQuery(hql, Product.class);
		List<Product> products = query.getResultList();

		session.close();
		return products;
	}

	public void addProduct(Product product) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		session.save(product);
		t.commit();
		session.close();
	}

}
