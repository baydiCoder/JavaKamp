package coffeeShop.Concrete;

import coffeeShop.Abstract.*;
import coffeeShop.Entities.*;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService _customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		_customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws Exception {

		if (_customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		} else {
			throw new Exception("Not a valid person");
		}
	}

}
