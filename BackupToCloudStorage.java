package storage;

import interfaces.ICustomerStorage;
import user.Customer;

public class BackupToCloudStorage implements ICustomerStorage{

	@Override
	public void newCustomer(Customer k){
		// TODO Auto-generated method stub
		System.out.println("saving new customer on Backup Cloud");
	}

	@Override
	public Customer load(int customerNumber){
		// TODO Auto-generated method stub
		System.out.println("loading customer on Backup Cloud");
		return null;
	}

	@Override
	public void update(Customer k){
		// TODO Auto-generated method stub
		System.out.println("updating customer on Backup Cloud");
	}

	@Override
	public void cancel(int customerNumber){
		// TODO Auto-generated method stub
		System.out.println("canceling on Backup Cloud");
	}

}
