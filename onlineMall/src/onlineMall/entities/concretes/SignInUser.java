package onlineMall.entities.concretes;

import onlineMall.entities.abstracts.Entity;

public class SignInUser implements Entity {
	private String _email;
	private String _password;
	
	public SignInUser(String email, String password) {
		super();
		this._email = email;
		this._password = password;
	}
	public String getEmail() {
		return _email;
	}
	public void setEmail(String email) {
		this._email = email;
	}
	public String getPassword() {
		return _password;
	}
	public void setPassword(String password) {
		this._password = password;
	}
}
