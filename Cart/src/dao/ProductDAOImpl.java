package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import entity.ProductEntity;
import model.Product;
import resources.utility;

public class ProductDAOImpl implements ProductDAO {

	@Override
	public String insertDetails(List<Product> data) {
		// TODO Auto-generated method stub
		Session session = null;
		String message = null;
		try {
			SessionFactory sessionFactory = utility.createSessionFactory();
			session = sessionFactory.openSession();
			for (model.Product product : data) {
				ProductEntity productEntity = new ProductEntity();
				productEntity.setProductCategory(product.getProductCategory());
				productEntity.setProductImage(product.getProductImage());
				productEntity.setProductName(product.getProductName());
				productEntity.setProductPrice(product.getProductPrice());
				session.beginTransaction();
				session.persist(productEntity);
				session.getTransaction().commit();
			}
			message = "the data is inserted in the system";
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		} finally {
			session.close();
		}
		return message;
	}

	@Override
	public List<Product> getAllProducts() {

		Session session = null;
		List<Product> productList = new ArrayList<>();
		// TODO Auto-generated method stub
		try {
			SessionFactory sessionFactory = utility.createSessionFactory();
			session = sessionFactory.openSession();
			Query query = session.createQuery("from ProductEntity");
			@SuppressWarnings("unchecked")
			List<ProductEntity> productEntitylist = query.list();
			if (!productEntitylist.isEmpty()) {
				for (ProductEntity productEntity : productEntitylist) {
					Product product = new Product();
					product.setProductCategory(productEntity.getProductCategory());
					product.setProductImage(productEntity.getProductImage());
					product.setProductName(productEntity.getProductName());
					product.setProductPrice(productEntity.getProductPrice());
					productList.add(product);
				}

			} else {
				throw new Exception("there is no product for you");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return productList;
	}

}
