package app_09_ResultSet_All;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class app_03_Scroll_Sensitive_ResultSet {

	public static void main(String[] args) throws SQLException, IOException{
		
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Bunny","123");
	
	System.out.println(con);
	
	Statement st = con.createStatement(1005,1008);
	
	// not we must user the column names in the case of SCROLL_SENSTIVE if we use select * from employee
	//                                                                            then we will get exception
	
	ResultSet rs= st.executeQuery("select eno,ename, esal,eaddr from employee");
	
	while(rs.next()) {
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
	}
	
	System.in.read();  // with this method compiler hier stop and when we press enter then it moves forward
	
	rs.beforeFirst();
	
	while(rs.next()) {
		
		rs.refreshRow();
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
	}
	
	
	
	}

}
