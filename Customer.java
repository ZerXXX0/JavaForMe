package user;

import processing.ShoppingCart;

public class Customer{
	private String firstName;
	private String lastName;
	private String birthdate;
	private String gender;
	protected double minimumOrderValue;
	private ShoppingCart shoppingCart;
	private Address address;
	private int customerNumber;
	
	public int getCustomerNumber(){
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber){
		this.customerNumber = customerNumber;
	}
	public Customer() {
		this.shoppingCart = new ShoppingCart();
		this.minimumOrderValue = 10.0;
	}
	public Customer(String firstName, String lastName, String birthdate, String gender){
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthdate = birthdate;
		this.gender = gender;
		this.shoppingCart = new ShoppingCart();
		this.minimumOrderValue = 10.0;
	}
	public Customer(String firstName, String lastName){
		this();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Customer(String firstName){
		this.firstName = firstName;
	}
	public Customer(Customer oriCustomer){
		this.lastName = oriCustomer.lastName;
		this.firstName = oriCustomer.firstName;
		this.birthdate = oriCustomer.birthdate;
		this.gender = oriCustomer.gender;
		this.minimumOrderValue = oriCustomer.minimumOrderValue;
		this.shoppingCart = new ShoppingCart(oriCustomer.shoppingCart);
	}
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if(firstName == null){
			if(other.firstName != null)
				return false;
		} else if(!firstName.equals(other.firstName))
			return false;
		if(lastName == null){
			if(other.lastName != null)
				return false;
		} else if(!lastName.equals(other.lastName))
			return false;
		return true;
	}
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public String getBirthdate(){
		return birthdate;
	}
	public void setBirthdate(String birthdate){
		this.birthdate = birthdate;
	}
	public String getGender(){
		return gender;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public double getMinimumOrderValue(){
		return minimumOrderValue;
	}
	public void setMinimumOrderValue(double minimumOrderValue){
		this.minimumOrderValue = minimumOrderValue;
	}
	public ShoppingCart getShoppingCart(){
		return shoppingCart;
	}
	public void setShoppingCart(ShoppingCart shoppingCart){
		this.shoppingCart = shoppingCart;
	}
	public String toString() {
		return "first name: " + firstName + "\n"
		+ "last name: " + lastName + "\n"
		+ "birthdate: " + birthdate + "\n"
		+ "gender: " + gender
		+ "address" + address;
	}
	public Address getAddress(){
		return address;
	}
	public void setAddress(Address address){
		this.address = address;
	}
	@Override
	public Object clone(){
		try {
			Customer cust =(Customer) super.clone();
			cust.address = (Address) this.address.clone();
			return cust;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
