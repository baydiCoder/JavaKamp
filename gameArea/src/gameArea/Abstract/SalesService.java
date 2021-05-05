package gameArea.Abstract;

import gameArea.Entities.*;

public interface SalesService {
	void sold(Game game,User user);
	
	void sold(Game game,User user,Discount discount);
}
