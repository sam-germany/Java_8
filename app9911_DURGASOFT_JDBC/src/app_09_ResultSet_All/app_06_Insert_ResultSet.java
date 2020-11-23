package app_09_ResultSet_All;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class app_06_Insert_ResultSet {

	public static void main(String[] args) throws SQLException{

	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Bunny","123");
	
	Statement st = con.createStatement(1005,1008);
	
	// type -2 driver as oracle i am using for updation purops we must use column name  for retriving the data
	// if we user select * from employee , it will give us a exception
	ResultSet rs = st.executeQuery("select eno,ename,esal,eaddr from employee");
	
	rs.moveToInsertRow(); // very important method for inserting, it creates a new empty row for insertion
	
	rs.updateInt(1, 88);
	rs.updateString(2, "ii");
	rs.updateInt(3, 8000);
	rs.updateString(4, "hyr");
	
	rs.insertRow();  // this method we need to insert our newely created row in Table
		
	con.close();
	}

}
