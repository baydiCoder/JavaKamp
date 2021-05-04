package coffeeShop.Abstract;

import coffeeShop.Entities.*;

public abstract class BaseCustomerManager implements CustomerService{
 public  void save(Customer customer) throws Exception {
	 System.out.println("Saved "+customer.getfirstName());
 }
}
