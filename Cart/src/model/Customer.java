package model;

public class Customer {
	private String name;
	private String email;
	private int mobileNumber;
	private String password;
	private String address;
	private char customerType;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public char getCustomerType() {
		return customerType;
	}
	public void setCustomerType(char customerType) {
		this.customerType = customerType;
	}

	

}
