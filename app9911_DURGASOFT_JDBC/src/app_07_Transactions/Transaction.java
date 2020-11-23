package app_07_Transactions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Transaction {

	public static void main(String[] args)  throws SQLException{

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Bunny","123");
		
        Statement st = con.createStatement();
		
       ResultSet rs1 = st.executeQuery("select * from employee");
       
       while(rs1.next()) {
    	   System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getInt(3)+" "+rs1.getString(4));
       }
       
       con.setAutoCommit(false);
       
       st.executeUpdate("update employee set esal=esal+750 where ename='aa'");
       
       System.out.println("can you confimt this transaction Yes / No");
       
       
       Scanner sc = new Scanner(System.in);
       String option= sc.next();
       
       if(option.equalsIgnoreCase("yes")) {
    	   
    	   con.commit();
    	   System.out.println("Transaction committed");
       }else {
    	   con.rollback();
    	   System.out.println("Transaction rollback");
       }
       
       ResultSet rs2 = st.executeQuery("select * from employee");
       
       while(rs2.next()) {
    	   System.out.println(rs2.getInt(1)+" "+rs2.getString(2)+" "+rs2.getInt(3)+" "+rs2.getString(4));
       }
       
       con.close();
	}

}
