package com.bridgelabz.addressbookgson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

import com.google.gson.stream.JsonWriter;

public class AddressBookUsingJSON {
	
public static void writeData() {
	 String AddressbookFile="addressbookjson.json";
     try(FileWriter fileWriter = new FileWriter(AddressbookFile);
         JsonWriter jsonWriter = new JsonWriter(fileWriter)
     ) {
         jsonWriter.beginObject();
         jsonWriter.name("firstname").value("Raaj");
         jsonWriter.name("lastname").value("Shetye");
         jsonWriter.name("address").value("Mulund");
         jsonWriter.name("city").value("Mumbai");
         jsonWriter.name("state").value("Maharashtra");
         jsonWriter.name("zipcode").value("11");
         jsonWriter.name("phonenum").value("1235");
         jsonWriter.name("email").value("raj@gmail.com");
         jsonWriter.endObject();

         
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
public static void readData() {
	 try {
         Files.lines(new File("addressbookjson.json").toPath())
                 .forEach(System.out::println);
     }catch(IOException e) {
         e.printStackTrace();
     }
}
	public static void main(String[] args) {
		
		writeData();
		readData();
	}
}
