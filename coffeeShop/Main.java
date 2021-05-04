package coffeeShop;

import java.util.*;

import kahveDukkani.Abstract.*;
import kahveDukkani.Adapters.MernisServiceAdapter;
import kahveDukkani.Concrete.*;
import kahveDukkani.Entities.*;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		
		BaseCustomerManager customerManager= new StarbucksCustomerManager(new 
				MernisServiceAdapter());
		customerManager.save(new Customer(1,"ELİF","BAYDI",
				new Date(1900,1,1),"1234432111"));
	}

}



