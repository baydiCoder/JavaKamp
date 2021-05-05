package gameArea.Entities;


import java.util.Date;

import gameArea.Abstract.*;

public class User implements Entity {

	private int _id;
	private String _userName;
	private String _password;
	private String _firstName;
	private String _lastName;
	private Date _dateOfBirth;
	private String _nationalityId;

	public User() {

	}

		
	public User(int _id, String _userName, String _password, String _firstName, String _lastName, Date _dateOfBirth,
			String _nationalityId) {
		super();
		this._id = _id;
		this._userName = _userName;
		this._password = _password;
		this._firstName = _firstName;
		this._lastName = _lastName;
		this._dateOfBirth = _dateOfBirth;
		this._nationalityId = _nationalityId;
	}



	public int getId() {
		return _id;
	}

	public void setId(int id) {
		this._id = id;
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

	public Date getDateOfBirth() {
		return _dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this._dateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return _nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this._nationalityId = nationalityId;
	}


	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		this._userName = userName;
	}

	public String getPassword() {
		return _password;
	}

	public void setPassword(String password) {
		this._password = password;
	}
}
