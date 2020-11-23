package app_02_StoredProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleTypes;

public class a_storedProcedure_2 {
	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Bunny","123");
	
	 CallableStatement cst = con.prepareCall("{call get2(?,?)}");

     Scanner sc = new Scanner(System.in);	 
	 
     System.out.println("Enter initial character of the name");
     
     
     // check hier because of  "%"  sign it is like a search option that we can write only
     // one word and it search the matched result of all the names started with that word
     String initialchars = sc.next()+"%";
     
     cst.setString(1, initialchars);
     
     cst.registerOutParameter(2,  OracleTypes.CURSOR);
     
     cst.execute();
     ResultSet rs = (ResultSet)cst.getObject(2);
     
     boolean flag= false;
     
     while(rs.next()) {
    	 
    	 flag = true;
    	 
    	 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getString(4));
          }
	 
     if(flag== false) {
    	 System.out.println("No Records Avilable");
     }
	con.close();
	}
}