package com.bridgelabz.addressbookgson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class AddressBookOpenCSV {
	static String SAMPLE_CSV_FILE="addressbook.csv";
	

	
	  public static void readData()
	    {
		  try {
			Reader reader =Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE));
			CSVReader csvReader=new CSVReader(reader);
		
			List<String[]> nextRecord=csvReader.readAll();
			nextRecord.stream().forEach(record->{
				System.out.println(record[0]);
				System.out.println(record[1]);
				System.out.println(record[2]);
				System.out.println(record[3]);
				System.out.println(record[4]);
				System.out.println(record[5]);
				System.out.println(record[6]);
				System.out.println(record[7]);
			});
			csvReader.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	    	
	    }
	  public static void writeData()
	    {
       
	        File file = new File(SAMPLE_CSV_FILE);

	        try {
	            
	            FileWriter writerfile = new FileWriter(file);

	           
	            CSVWriter writer = new CSVWriter(writerfile);

	            
	            List<String[]> data = new ArrayList<String[]>();
	            data.add(new String[] {"firstname","lastname" ,"address" ,"city","state","zipcode","phonenum","email"});
	        
	            data.add(new String[] { "Raaj", "Shetye", "Mulund","Mumbai","Maharashtra","4012","7051","raj@gmail.com" });
	            data.add(new String[] { "Raj", "shetye", "mul","Mum","Maharashtra","4014","1245","rajs11@gmail.com"});
	            data.add(new String[] { "Raaaj", "Shetye", "mulund","mumbai","Maharashtra","4021","1234","rajshetye@xyz.com"});
	            writer.writeAll(data);

	          
	            writer.close();
	        }
	        catch (IOException e) {
	           
	            e.printStackTrace();
	        }
	    }
	  
	  public static void main(String []args) throws IOException {
			readData();
			writeData();
		}
}
