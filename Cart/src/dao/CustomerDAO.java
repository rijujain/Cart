package dao;

import model.Customer;

public interface CustomerDAO {
	public Boolean verifyEmailId(String emailId);
	public Customer getCustomer(String emailId);
	public String updateCustomer(Customer customer);	
}
