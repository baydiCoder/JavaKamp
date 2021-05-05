package gameArea.Entities;


import java.util.Date;

public class Discount {
	private String _description;
	private int _discountPercent;
	private Date _deadline;

	public Discount() {

	}

	public Discount(String description, int discountPercent, Date deadline) {

		this._description = description;
		this._discountPercent = discountPercent;
		this._deadline = deadline;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		this._description = description;
	}

	public int getDiscountPercent() {
		return _discountPercent;
	}

	public void setDiscountPercent(int discountPercent) {
		this._discountPercent = discountPercent;
	}

	public Date getDeadline() {
		return _deadline;
	}

	public void setDeadline(Date deadline) {
		this._deadline = deadline;
	}

}
