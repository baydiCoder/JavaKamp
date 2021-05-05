package gameArea.Abstract;

import gameArea.Entities.*;

public interface GameService {
	void add(Game game);

	void update(Game game);

	void delete(Game game);

	void addMultiple(Game[] games);

}
