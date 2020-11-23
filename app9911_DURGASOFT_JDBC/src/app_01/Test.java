package app_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

	
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "Bunny";
		String pwd = "123";
		
		Connection con = DriverManager.getConnection(url,user,pwd);
		
		String query = "select * from employee";
		
		PreparedStatement st =   con.prepareStatement(query);

		ResultSet rs =  st.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getString(4));
			
		}
		
		
	}

}
