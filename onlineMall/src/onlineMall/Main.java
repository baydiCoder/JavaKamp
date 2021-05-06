package onlineMall;

import onlineMall.business.concretes.SignInManager;
import onlineMall.business.concretes.UserManager;
import onlineMall.core.GmailAdapter;
import onlineMall.dataAccess.concretes.OracleUserDao;
import onlineMall.entities.concretes.SignInUser;
import onlineMall.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserManager userManager= new UserManager(new OracleUserDao());
		User user1= new User("elif","baydi","bilcom87@gmail.com","123456");
		User user6= new User("elife","baydi","baydi@gmail.com","123456");
		
		userManager.SignUpUser(user1);
		
		userManager.VerifyMail(user1);
		
		User user2= new User("e","baydi","bilcom87@gmail.com","123456");
		User user3= new User("elif",null,"bilcom87@gmail.com","123456");
		User user4= new User("elif","baydi","bilcom87@gmailcom","123456");
		User user5= new User("elif","baydi","bilcom87@gmail.com","123");
		
		System.out.println("\n---Kullanıcı Ekleme------");
		userManager.SignUpUser(user2);
		userManager.SignUpUser(user3);
		userManager.SignUpUser(user4);
		userManager.SignUpUser(user5);
		userManager.SignUpUser(user1);
		userManager.SignUpUser(user6);
		
		System.out.println("\n----Sign In Local------");
		SignInManager signInManager= new SignInManager(userManager);
		signInManager.signInLocal(new SignInUser("bilcom87@gmail.com","123456"));
		signInManager.signInLocal(new SignInUser("java@kamp.com","123456"));

		System.out.println("\n----Sign In Gmail------");
		SignInManager signInManagerGmail= new SignInManager(new GmailAdapter());
		signInManagerGmail.signInAdapter(new SignInUser("bilcom87@gmail.com","123456"));
		signInManagerGmail.signInAdapter(new SignInUser("java@kamp.com","123456"));

		
	}

}
