package iooperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

public class DataStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin = new FileInputStream("C:\\Radha\\batch3\\upasana.txt");
            int i=0;
            while((i=fin.read())!=1) {
            	System.out.print((char)i);
            }
            fin.close();
	}catch(Exception e) {
		System.out.print(e);}
	}

}
