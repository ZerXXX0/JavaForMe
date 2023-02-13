package user;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerAdministration{
//	private Collection<Customer> customer;
	private CustomerStorage customerStorage;
	private Map<Integer, Customer> customers;
	
	
	public CustomerAdministration(){
//		this.customer = new ArrayList<Customer>();
//		customer.add(new Customer("Shit", "Head"));
//		customer.add(new Customer("Joe", "Dix"));
//		customer.add(new Customer("Poo", "Shi"));
//		customerStorage = new CustomerStorage();
		
		//implementation of map irl
		customers = new HashMap<Integer, Customer>();
		
		Customer dataOfCustomer01 = new Customer("Jack", "Ma");
		Customer dataOfCustomer02 = new Customer("Yi Long", "Ma");
		Customer dataOfCustomer03 = new Customer("Cao Ni", "Ma");
		
		dataOfCustomer01.setCustomerNumber(1);
		dataOfCustomer02.setCustomerNumber(2);
		dataOfCustomer03.setCustomerNumber(3);
		
		customers.put(dataOfCustomer01.getCustomerNumber(), dataOfCustomer01);
		customers.put(dataOfCustomer02.getCustomerNumber(), dataOfCustomer02);
		customers.put(dataOfCustomer03.getCustomerNumber(), dataOfCustomer03);
		
		for(Customer k : customers.values()){
			System.out.println("Printing" + "\n" + k + "\n");
		}
	}
	
	public void updateAllCustomers(){
		//empty
	}
	//iterator() method and interface Iterable
	public void removeAllCustomer(Collection<Customer> c){
		Customer k = null;
		Iterator<Customer> it = c.iterator();
		while(it.hasNext()){
			k = it.next();
			if((k.getGender() == null) || k.getGender().equals("")){
				it.remove();
				System.out.println("Removing customer First Name=" + k.getFirstName() + " Last Name =" + k.getLastName());
				System.out.println("Removed");
			}
		}
	}
	
	public void printCollectionContent(Collection<Customer> c){
		System.out.println("\nStart of the method printCollectionContent");
		for(Customer k : c){
			System.out.println(k.toString());
		}
		System.out.println("End of it \n");
	}
//	//array
//	Customer[] customer = new Customer[]{
//			new Customer("Joe", "Dix"),
//			new Customer("Sukma", "Dix"),
//			new Customer("Ho", "Lee Sheet")
//	};
//	
//	System.out.println(customer[0]);
//	System.out.println(customer[1]);
//	System.out.println(customer[2]);
//	
//	CustomerStorage customerStorage = new CustomerStorage();
//	
//	public void updateAllCustomers(){
//		for(int index = 0; index < customer.length; index ++)
//			if(customer[index] != null){
//				customerStorage.update(customer[index]);
//			}
//	}
	public static void main(String[] args) {
		
//		CustomerAdministration customerAdministration = new CustomerAdministration();
//		Collection<Customer> collectionTest = customerAdministration.customer;
//		customerAdministration.printCollectionContent(collectionTest);
//		customerAdministration.removeAllCustomer(collectionTest);
//		customerAdministration.printCollectionContent(collectionTest);
		CustomerAdministration myAdministration01 = new CustomerAdministration();
	}
}

