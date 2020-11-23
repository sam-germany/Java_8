package app_04_Date;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class app_2_Shortcut_for_inserting_Date {

	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Bunny","123");

	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter Person name");
		String uname = sc.next();
		
		System.out.println("Enter Date yyyy-MM-dd");
		String dob = sc.next();
		
		java.sql.Date sdate = java.sql.Date.valueOf(dob);
		
		String sqlQuery ="insert into userDate values(?,?)";
		
		PreparedStatement ps = con.prepareStatement(sqlQuery);
		ps.setString(1, uname);
        ps.setDate(2, sdate);	 // as we are setting Date so need to put       ps.setDate();
	
	    int resultSet = ps.executeUpdate();
	    
	    if(resultSet == 0) {
	    	System.out.println("No Record inserted");
	    }else{
	    	System.out.println("Record Inserted");
	    }

	    con.close();
	
	
	
	
	
	
	
	}
}
