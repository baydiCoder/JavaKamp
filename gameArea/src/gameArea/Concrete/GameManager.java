package gameArea.Concrete;

import gameArea.Abstract.*;
import gameArea.Entities.*;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " oyunu tanımlandı");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " oyunu güncellendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " oyunu silindi");
	}

	public void addMultiple(Game[] games) {
		for(Game game : games) {
			add(game);
		}
		
		
	}

}
