package com.bridgelabz.addressbookgson;

import com.opencsv.bean.CsvBindByName;

public class AddressBookCSV {
	@CsvBindByName
	String firstname;
	
	@CsvBindByName
	String lastname;
	
	@CsvBindByName
	String address;
	
	@CsvBindByName
	String city;
	
	@CsvBindByName
	String state;
	
	@CsvBindByName
	String zipcode;
	
	@CsvBindByName
	String phonenum;
	
	@CsvBindByName
	String email;

	@Override
	public String toString() {
		return "AddressBookCSV [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + ", city="
				+ city + ", state=" + state + ", zipcode=" + zipcode + ", phonenum=" + phonenum + ", email=" + email
				+ "]";
	}

	
}
