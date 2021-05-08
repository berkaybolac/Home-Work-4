package coffieProject.Adapters;

import coffieProject.Abstract.CheckPersonService;
import coffieProject.Entities.Customer;

public class MernisServiceAdapter implements CheckPersonService {

	@Override
	public boolean ifRealPerson(Customer customer) {
		if (customer.getNationalId() != 0) {
			return true;
		}
		return false;
	}
}