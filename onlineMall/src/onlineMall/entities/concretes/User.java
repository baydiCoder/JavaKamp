package onlineMall.entities.concretes;

import onlineMall.entities.abstracts.Entity;

public class User implements Entity {

	private String _firstName;
	private String _lastName;
	private String _email;
	private String _password;
	private boolean _verifyMail;
	
	public User() {
		super();
	}

	public User(String firstName, String lastName, String email, String password) {
		super();
		this._firstName = firstName;
		this._lastName = lastName;
		this._email = email;
		this._password = password;
	}

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		this._firstName = firstName;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		this._lastName = lastName;
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

	public boolean isVerifyMail() {
		return _verifyMail;
	}

	public void setVerifyMail() {
		this._verifyMail = true;
	}
}
