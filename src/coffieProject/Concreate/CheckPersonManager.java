package coffieProject.Concreate;

import coffieProject.Abstract.CheckPersonService;
import coffieProject.Entities.Customer;

public class CheckPersonManager implements CheckPersonService {

	@Override
	public boolean ifRealPerson(Customer customer) {
		return true;
	}

}