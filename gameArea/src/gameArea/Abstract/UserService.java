package gameArea.Abstract;

import gameArea.Entities.*;

public interface UserService {

	void add(User user) throws Exception;

	void update(User user);

	void delete(User user);

	void getGames(User user);

	void addGames(User user, Game game);
}
