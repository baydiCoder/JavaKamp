package gameArea.Concrete;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import gameArea.Abstract.*;
import gameArea.Entities.*;

public class DiscountManager implements DiscountService {

	@Override
	public void add(Discount discount) {
		System.out.println(discount.getDescription() + " kampanyası tanımlandı");

	}

	@Override
	public void update(Discount discount) {
		System.out.println(discount.getDescription() + " kampanyası güncellendi");

	}

	@Override
	public void delete(Discount discount) {
		System.out.println(discount.getDescription() + " kampanyası silindi");
	}

	@Override
	public boolean validate(Discount discount) {

		LocalDateTime localDateTime= LocalDateTime.now();
		return discount.getDeadline().after(Date.from( localDateTime.atZone
				( ZoneId.systemDefault()).toInstant()));

	}

}
