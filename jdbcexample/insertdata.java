package jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class insertdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
}
