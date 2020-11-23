package app_09_ResultSet_All;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class app_01_Scrollable {

	public static void main(String[] args) throws SQLException{

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Bunny","123");
		
		Statement st = con.createStatement(1004,1007);
		
		ResultSet rs = st.executeQuery("select * from employee"); 
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
		}
	
		
		System.out.println("---------------");
		
	   while(rs.previous()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
	   }
	
	}
	
	
	

	
}
