package storage;

import interfaces.ICustomerStorage;
import user.Customer;

public class LocalStorage implements ICustomerStorage{

	@Override
	public void newCustomer(Customer k){
		// TODO Auto-generated method stub
		System.out.println("saving new customer on local");
	}

	@Override
	public Customer load(int customerNumber){
		// TODO Auto-generated method stub
		System.out.println("loading customer on local");
		return null;
	}

	@Override
	public void update(Customer k){
		// TODO Auto-generated method stub
		System.out.println("updating customer on local");
	}

	@Override
	public void cancel(int customerNumber){
		// TODO Auto-generated method stub
		System.out.println("canceling on local");
	}

}
