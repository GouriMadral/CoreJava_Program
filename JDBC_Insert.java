package Anp_D0453;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Insert {

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
			PreparedStatement ps=con.prepareStatement("insert into Person values(?,?,?)");
			ps.setInt(1, 4);
			ps.setString(2,"Gouri");
			ps.setInt(3, 21);
			
			//4.Execute queries
			int i=ps.executeUpdate();
			System.out.println(i+"Record Inserted Successfully");
			
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
1Record Inserted Successfully
mysql> select * from Person;
+-----------+---------+-----+
| person_id | name    | age |
+-----------+---------+-----+
|         1 | raj     |  33 |
|         2 | Shubham |  33 |
|         3 | akash   |  21 |
|         4 | Gouri   |  21 |
+-----------+---------+-----+
*/