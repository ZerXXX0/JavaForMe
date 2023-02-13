package interfaces;

import user.Customer;

public interface ICustomerStorage{
	public void newCustomer(Customer k);
	public Customer load(int customerNumber);
	public void update(Customer k);
	public void cancel(int customerNumber);
}
