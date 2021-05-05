package gameArea.Concrete;

import java.util.ArrayList;

import gameArea.Abstract.*;
import gameArea.Entities.*;

public class UserManager implements UserService {
	
	private UserCheckService _userCheckService;
	private ArrayList<Game> _games;

	public UserManager(UserCheckService userCheckService) {
		this._userCheckService = userCheckService;
		this._games= new ArrayList<Game>();
	}

	@Override
	public void add(User user) throws Exception {
		if (_userCheckService.checkIfRealPerson(user)) {
			System.out.println(user.getUserName()+" kullanıcı eklendi");
		} else {
			throw new Exception("Not a valid person");
		}
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getUserName()+" bilgiler güncellendi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getUserName()+" kullanıcı silindi");
		
	}

	@Override
	public void getGames(User user) {
		System.out.println(user.getUserName()+" aldığı oyunlar");
		for(Game game:_games) {
			System.out.println(" * "+game.getName());
		}
	}

	@Override
	public void addGames(User user, Game game) {
		this._games.add(game);
		System.out.println(user.getUserName()+" tarafından "+
		game.getName()+" satın alındı.");
		
	}

}
