package app_04_Date;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class app_3_Retriving_Date_from_DB {

	public static void main(String[] args) throws SQLException{
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Bunny","123");
		
		PreparedStatement ps = con.prepareStatement("select * from userDate");
		
		ResultSet rs = ps.executeQuery();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyy");
		
		while(rs.next()) {
			
			String name = rs.getString(1);
			java.sql.Date sdate = rs.getDate(2);
			
			String s = sdf.format(sdate);
			System.out.println(name+ "...."+s);
		}

	 con.close();
	}
}
