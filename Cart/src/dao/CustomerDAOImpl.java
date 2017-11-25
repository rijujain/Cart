package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Customer;
import resources.utility;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public Customer getCustomer(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean verifyEmailId(String emailId) {
		// TODO Auto-generated method stub
		Session session = null;
		Boolean value = null;
		try {
			SessionFactory sessionFactory = utility.createSessionFactory();
			session = sessionFactory.openSession();
			Query query = session.createQuery("select email from CustomerEntity");
			@SuppressWarnings("unchecked")
			List<String> customerEmaillist = query.list();
			if (customerEmaillist.isEmpty()) {
				throw new Exception("There is no record in the database");
			}
			for (String email : customerEmaillist) {
				System.out.println(email);
				System.out.println(emailId);
				if (emailId.equals(email)) {
					System.out.println("inside if true");
					value = false;
				} else {
					System.out.println("inside if false");
					value = true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return value;
	}
}