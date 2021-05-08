package coffieProject.Concreate;

import coffieProject.Abstract.CustomerService;
import coffieProject.Entities.Customer;

public abstract class CustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Saved " + customer.getFirstName());
	}

}