package gameArea.Abstract;

import gameArea.Entities.*;

public interface DiscountService {
	void add(Discount discount);

	void update(Discount discount);

	void delete(Discount discount);
	
	boolean validate(Discount discount);
}
