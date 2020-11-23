package app_04_Date;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class app_1_String_From_Date_Entered_By_Customer {

	public static void main(String[] args) throws SQLException, ParseException{

      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Bunny","123");
	
	  Scanner sc = new Scanner(System.in);
	
	  System.out.println("Enter person name");
	  String uname = sc.next();
	
	  System.out.println("Enter Date of Birth dd-MM-yyyy");
	  String dob = sc.next();
	  
	  SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy"); // with SimpleDateFormat class we are formatting
	  java.util.Date udate= sdf.parse(dob);         // the String type Date into   java.util.Date type
	  
	  long l = udate.getTime();   // normlly we get .getDate()  method to get the Date but it is depricated
	                              //  .getTime() method we will get both Date and Time
	  
	  
	  java.sql.Date sdate = new java.sql.Date(l);  //  we got the date and now changing the  java.util.Date   to  java.sql.Date
	  String sqlQuery="insert into user1 values(?,?)";
	  
	  PreparedStatement ps = con.prepareStatement(sqlQuery);
	  ps.setString(1, uname);
	  ps.setDate(2, sdate);
	  
	  int resultCount = ps.executeUpdate();
	  
	  if(resultCount==0) {
		  System.out.println("Record does not inserted");
	  }else {
		  System.out.println("Record Inserted");
	  }
	  
	  con.close();
	  
	}

}
