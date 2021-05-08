package coffieProject.Concreate;

import coffieProject.Abstract.CheckPersonService;
import coffieProject.Entities.Customer;

public class StarbucksCustomerManager extends CustomerManager {

	CheckPersonService checkPersonService;

	public StarbucksCustomerManager(CheckPersonService checkPersonService) {
		this.checkPersonService = checkPersonService;
	}

	@Override
	public void save(Customer customer) {

		if (checkPersonService.ifRealPerson(customer)) {
			System.out.println("User valid");
			super.save(customer);
		} else {
			System.out.println("User invalid");
		}

	}

}