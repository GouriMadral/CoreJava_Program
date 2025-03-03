package Anp_D0453;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//1.Register the Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.Create Connection
			Connection con=null;
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ANP_Java","root","security");
			System.out.println(con);
			
			//3.create statement
			Statement stmt=con.createStatement();
			
			//4.Execute queries
			ResultSet rs=stmt.executeQuery("select * from Person");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			
			//5.close connection
			con.close();
			
		}
		catch(Exception e) {
		System.out.println(e);
		}
	}
}
/*Output
com.mysql.cj.jdbc.ConnectionImpl@7d8704ef
2 Rakshita 33
3 akash 21
4 Gouri 21*/
