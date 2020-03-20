 package jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

}
