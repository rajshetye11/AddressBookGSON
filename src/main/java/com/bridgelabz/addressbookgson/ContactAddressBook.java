package com.bridgelabz.addressbookgson;

public class ContactAddressBook {
	
	String firstname;
	String lastname;
	String address;
	String city;
	String state;
	String zipcode;
	String phonenum;
	String email;
	
	ContactAddressBook(String firstname, String lastname, String address, 
						String city, String state, String zipcode, String phonenum, 
						String email){
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address; 
		this.city = city; 
		this.state = state;
		this.zipcode = zipcode;
		this.phonenum=phonenum; 
		this.email=email;
		
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "ContactAddressBook [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + ", phonenum=" + phonenum + ", email="
				+ email + "]";
	}
	
	
}
