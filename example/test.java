package example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student();
		student s2=new student();
		student s3=new student();
		student s4=new student();
		
		List<student> sList=new ArrayList<>();
		sList.add(s1);
		sList.add(s2);
		//sList.add(s3);
		//sList.add(s4);
		Scanner scn=new Scanner(System.in);
		for(student s:sList)
		{
			System.out.println("enter name");
			s.name = scn.next();
			
			System.out.println("enter age");
			s.age=scn.nextInt();
			
			System.out.println("enter address");
			s.address=scn.next();
		}
		
		for(student s:sList)
		{
			System.out.println(s.name+" "+s.age+" "+s.address+" ");
		
			
		}

		


	}

}
