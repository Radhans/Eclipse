package application1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		menu m = new menu();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter username");
		String username = scn.next();
		System.out.println("Enter the pasword");
		String password = scn.next();
		try {
			String uname = "root";
			String pass = "1234";
			String url = "jdbc:mysql://localhost:3306/radha?useSSL=false";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pass);
			String querry = "select name,pasword from person where name='" + username + "'";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(querry);
			while (rs.next()) {

				String name = rs.getString("name");
				String pasword = rs.getString("pasword");

				if ((username.equals(name)) && (password.equals(pasword))) {
					System.out.println("username and pasword matched");

					System.out.println("Enter the input");
					int input = scn.nextInt();
					switch (input) {
					case 1:
						System.out.println("List of records:");
						m.list();;
						break;

					case 2:
						System.out.println("Add a new record:");
						m.AddRecord();
						break;

					case 3:
						System.out.println("Update an existing record:");
						m.Update(username);
						break;

					case 4:
						System.out.println("Show date of birth:");
						break;
					default:
						System.out.println("You are out of the system");

					}
				} 
				else {
					System.out.println("incorrect username and password");
				}
				break;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
}
