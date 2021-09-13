package com.bridgelabz.addressbookgson;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.bridgelabz.addressbookgson.AddressBookIOService;
import com.bridgelabz.addressbookgson.IOService;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class AddressBookFileOperations {
	
	public List<ContactAddressBook> addressBookList;

	public AddressBookFileOperations() {
	}

	public AddressBookFileOperations(List<ContactAddressBook> addressBookList) {
		this.addressBookList = addressBookList;
	}

	public static void main(String[] args) {

		ArrayList<ContactAddressBook> addressBookList = new ArrayList<>();
		AddressBookFileOperations emp = new AddressBookFileOperations(addressBookList);
		Scanner input = new Scanner(System.in);
		emp.readAddressDetail(input, addressBookList);
		emp.writeAddressData(IOService.CONSOLE_IO);
	}

	public void readAddressDetail(Scanner sc, ArrayList<ContactAddressBook> employee) {
		
		System.out.println("Enter the First Name");
		String firstname = sc.next();

		System.out.println("Enter the Last Name");
		String lastname = sc.next();

		System.out.println("Enter the address");
		String address = sc.next();

		System.out.println("Enter the city");
		String city = sc.next();

		System.out.println("Enter the state");
		String state = sc.next();

		System.out.println("Enter the zip");
		String zipcode = sc.next();

		System.out.println("Enter the Phone number");
		String phonenum = sc.next();

		System.out.println("Enter the emailId");
		String email = sc.next();

		employee.add(
				new ContactAddressBook(firstname, lastname, address, city, state, zipcode, phonenum, email));

	}

	public void writeAddressData(IOService IOService) {
		if (IOService.equals(IOService.CONSOLE_IO)) {
			System.out.println(addressBookList);
		} else if (IOService.equals(IOService.FILE_IO)) {

			new AddressBookIOService().writeData(addressBookList);
		}
	}

	public void printData(IOService IOService) {
		if (IOService.equals(IOService.FILE_IO))
			new AddressBookIOService().printData();
	}

	

	
}