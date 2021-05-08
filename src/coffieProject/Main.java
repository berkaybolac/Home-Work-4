package coffieProject;

import coffieProject.Adapters.MernisServiceAdapter;
import coffieProject.Concreate.CustomerManager;
import coffieProject.Concreate.StarbucksCustomerManager;
import coffieProject.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Berkay", "Bolaç", 25555));
	}

}
