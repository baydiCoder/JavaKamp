package coffeeShop.Entities;

import java.util.Date;
import coffeeShop.Abstract.*;

public class Customer implements Entity{
private int _id;
private String _firstName;
private String _lastName;
private Date _dateOfBirth;
private String _nationalityId;

public Customer() {
	
}

public Customer(int id, String firstName, String lastName, Date dateOfBirth, String nationalityId) {
	
	this._id = id;
	this._firstName = firstName;
	this._lastName = lastName;
	this._dateOfBirth = dateOfBirth;
	this._nationalityId = nationalityId;
}

public int getid() {
	return _id;
}
public void setid(int id) {
	this._id = id;
}
public String getfirstName() {
	return _firstName;
}
public void setfirstName(String firstName) {
	this._firstName = firstName;
}
public String getlastName() {
	return _lastName;
}
public void set_lastName(String lastName) {
	this._lastName = lastName;
}
public Date getdateOfBirth() {
	return _dateOfBirth;
}
public void setdateOfBirth(Date dateOfBirth) {
	this._dateOfBirth = dateOfBirth;
}
public String getnationalityId() {
	return _nationalityId;
}
public void set_nationalityId(String nationalityId) {
	this._nationalityId = nationalityId;
}

}
