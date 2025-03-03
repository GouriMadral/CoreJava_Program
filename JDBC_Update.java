package Anp_D0453;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_Update {

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
			PreparedStatement ps=con.prepareStatement("update Person set name=? where person_id=?");
			ps.setString(1, "Rakshita");
			ps.setInt(2,2);
					
			//4.Execute queries
			int i=ps.executeUpdate();
			System.out.println(i+"Record deleted Successfully");
			
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
1Record deleted Successfully
mysql> select * from Person;
+-----------+----------+-----+
| person_id | name     | age |
+-----------+----------+-----+
|         2 | Rakshita |  33 |
|         3 | akash    |  21 |
|         4 | Gouri    |  21 |
+-----------+----------+-----+
*/
