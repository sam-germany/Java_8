package app_10_RowSet;

import java.sql.SQLException;
import java.util.Scanner;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class app_03_Inserting_JdbcRowset  {

	public static void main(String[] args) throws SQLException{

		RowSetFactory rsf = RowSetProvider.newFactory();
		
		JdbcRowSet rs = rsf.createJdbcRowSet();
		rs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		rs.setUsername("Bunny");
		rs.setPassword("123");
		rs.setCommand("select eno,ename,esal,eaddr from employee");
		rs.execute();
		
		Scanner sc = new Scanner(System.in);
		rs.moveToInsertRow();
		
		while(true) {
			System.out.println("Employee number");
			int eno = sc.nextInt();
			
			System.out.println("Employee name");
			String ename = sc.next();
			
			System.out.println("Employee Salary");
			float esal = sc.nextFloat();
			
			System.out.println("Employee Address");
			String eaddr = sc.next();
			
			rs.updateInt(1, eno);
			rs.updateString(2, ename);
			rs.updateFloat(3, esal);
            rs.updateString(4, eaddr);
            
            rs.insertRow();
            
            System.out.println("Do u want to insert more  Y /N");
            
            String option = sc.next();
            if(option.equalsIgnoreCase("N")) {
            	break;
            }
		}
		
		rs.close();
	}

}
