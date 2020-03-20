package application1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class menu {
	public void list()
	{
		try {
			String uname = "root";
			String pass = "1234";
			String url = "jdbc:mysql://localhost:3306/radha?useSSL=false";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass);
			String querry = "select * from person";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(querry);
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String dob = rs.getString("dob");
				long phoneno = rs.getLong("phoneno");
				String address = rs.getString("address");
				System.out.println(id+" "+name+" "+email+" "+dob+" "+phoneno+" "+address);
						
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void AddRecord()
	{
		try {
			String uname = "root";
			String pass = "1234";
			String url = "jdbc:mysql://localhost:3306/radha?useSSL=false";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass);
			String querry = "select max(id) from person";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(querry);
			rs.next();
			int temp = rs.getInt(1);
			 int id = temp+1;
			 System.out.println("how many records to update");
			
			Scanner scn = new Scanner(System.in);
			int n=scn.nextInt();
			for(int i=0;i<n;i++)
			
			{
		     temp++;
		     System.out.println("enter the name");
		     String name = scn.next();
		     String querry1 = "insert into person(id,name) values("+temp+",'"+name + "')";
		     Statement st1 = con.createStatement();
			 st1.executeUpdate(querry1); 
			 System.out.println("success");
		    
			}
					
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}

	}
	
	public void Update(String user)
	{

		try {
			String uname = "root";
			String pass = "1234";
			String url = "jdbc:mysql://localhost:3306/radha?useSSL=false";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass);
			
			
		System.out.println("enter the input to update the record between 1 to 6");
		Scanner scn = new Scanner(System.in);
		int input = scn.nextInt();
		switch(input)
		{
		case 1:
			System.out.println("update Id");
			System.out.println("enter the id to be updated");
			int id =scn.nextInt();
			String querry = "update person set id="+id+" where name='"+user+ "'";
			Statement st = con.createStatement();
			st.executeUpdate(querry);  
			break;
		
		case 2:
			System.out.println("update name");
			System.out.println("enter the name to be updated");
			String name =scn.next();
			String querry1 = "update person set name='"+name+"' where name='"+user+ "'";
			Statement st1 = con.createStatement();
			st1.executeUpdate(querry1);  
			break;
			
		case 3:
			System.out.println("update email");
			System.out.println("enter the email to be updated");
			String email =scn.next();
			String querry2 = "update person set email='"+email+"' where name='"+user+ "'";
			Statement st2 = con.createStatement();
			st2.executeUpdate(querry2); 
			break;
			
		case 4:
			System.out.println("update date of birth");
			break;
			
		case 5:
			System.out.println("update phoneno");
			break;
			
		case 6:
			System.out.println("update address");
			break;
			
		default:
			System.out.println("update all");
		
		
		}
		
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	}
}

