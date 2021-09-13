package com.bridgelabz.addressbookgson;

import java.util.Arrays;

import org.junit.Test;

public class AddressBookTest {
	@Test
	public void showAddressBook() {
		ContactAddressBook[] arrayOfEmps= {
				new ContactAddressBook("Raaj", "Shetye", "Mulund","Mumbai","Maharashtra","4012","7051","raj@gmail.com"),
				new ContactAddressBook("Raj", "Shetye", "Mulund","Mumbai","Maharashtra","4012","7051","raj@gmail.com"),
				new ContactAddressBook("Raaaaaaj", "Shetye", "Mulund","Mumbai","Maharashtra","4012","7051","raj@gmail.com"),
		};
		AddressBookFileOperations address;
		address=new AddressBookFileOperations(Arrays.asList(arrayOfEmps));
		address.writeAddressData(IOService.FILE_IO);
    	address.printData(IOService.FILE_IO);
		
		
	
	}
}
