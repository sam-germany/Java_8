package app_04_Batch_Updates;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Batch_2_Update_PreparedStatement {

	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Bunny","123");
		
		PreparedStatement pst = con.prepareStatement("insert into employee values(?,?,?,?)");
		
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			System.out.println("Employee Number");
			int eno= sc.nextInt();
			
			System.out.println("Employee Name");
			String ename= sc.next();
			
			System.out.println("Employee Sal");
			double esal = sc.nextDouble();
			
			System.out.print("Employee Address");
			
			String eaddr = sc.next();
			
			pst.setInt(1, eno);
			pst.setString(2, ename);
			pst.setDouble(3, esal);
			pst.setString(4, eaddr);
			
			pst.addBatch();  // till now the query is only added to BATCH, we can add more queris to this BATCH queue
     
			System.out.println("Do you want to enter more  YES/NO");
			
			String option = sc.next();
			if(option.equalsIgnoreCase("NO")) {
				
				break;
			}
		}
        
		   pst.executeBatch();
		   con.close();
	
	}

}
