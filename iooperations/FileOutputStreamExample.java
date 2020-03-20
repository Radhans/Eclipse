package iooperations;

import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Radha\\batch3\\upasana.txt");
			String s = "Welcome to my class,this java 3rd batch";
			byte b[] = s.getBytes();//converting string into byte array
			fout.write(b);
			fout.close();
			System.out.println("success....");
			
		}catch(Exception e) {
			
		
			System.out.println(e);
		}

	}


}