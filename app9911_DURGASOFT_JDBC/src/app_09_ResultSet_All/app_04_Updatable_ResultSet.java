package app_09_ResultSet_All;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class app_04_Updatable_ResultSet {

	public static void main(String[] args) throws SQLException {

    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Bunny","123");
	
    Statement st = con.createStatement(1005,1008);
    
    ResultSet rs = st.executeQuery("select eno,ename,esal,eaddr from employee");
    
    while(rs.next()) {
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
	}
     rs.absolute(3);
     rs.updateString(2, "aa1");
     rs.updateRow();
     
     
     System.out.println("-----------");
     
     rs.first();
     while(rs.next()) {
 		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
 	}
    
    con.close();
    
	
	
	}

}
