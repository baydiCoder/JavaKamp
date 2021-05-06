package onlineMall.dataAccess.concretes;

import java.util.List;

import onlineMall.dataAccess.abstracts.UserDao;
import onlineMall.entities.concretes.User;

public class OracleUserDao implements UserDao{

	List<User> allUser;
	
	@Override
	public void add(User user) {
		System.out.println("Kayıt işlemi tamamlandı");
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

}
