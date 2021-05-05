
import java.util.Date;

import gameArea.Adapter.*;
import gameArea.Concrete.*;
import gameArea.Entities.*;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		UserManager userManager= new UserManager(new MernisServiceAdapter());
		User userElif= new User(1,"bilcom87","123456",
				"elif","baydi",new Date(1900,1,1),"12345678990");
		userManager.add(userElif);
		System.out.println();
		GameManager gameManager= new GameManager();
		Game gameAsphalt= new Game(1,"Asphalt",20);
		Game gameGta= new Game(1,"GTA",10.75);
		Game gameSims= new Game(1,"Sims",25.50);
		gameManager.addMultiple(new Game[] {gameAsphalt,gameGta,gameSims});
		System.out.println();
		DiscountManager discountManager= new DiscountManager();
		Discount discountSpring=new Discount("Bahar",10,new Date(2021-1900,6+1,15));
		Discount discountWinter=new Discount("Ara Tatil",10,new Date(2021-1900,4-1,15));
		discountManager.add(discountSpring);
		discountManager.add(discountWinter);
		
		System.out.println();
		SalesManager salesManager= new SalesManager(userManager,discountManager);
		salesManager.sold(gameGta, userElif);
		salesManager.sold(gameSims, userElif, discountSpring);
		salesManager.sold(gameAsphalt, userElif, discountWinter);
		System.out.println();
		userManager.getGames(userElif);
	}

}
