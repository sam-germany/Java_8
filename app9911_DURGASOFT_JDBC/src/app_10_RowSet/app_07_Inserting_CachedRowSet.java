package app_10_RowSet;

import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class app_07_Inserting_CachedRowSet {

	public static void main(String[] args) throws Exception{

		
		RowSetFactory rsf = RowSetProvider.newFactory();
		CachedRowSet crs = rsf.createCachedRowSet();
		crs.setUrl("jdbc:mysql://localhost/Bunny?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
		
		// in documentation  he uses   relaxAutoCommit=true   in url but i am using then it throws exception
		// rest code is fine
		
		crs.setUsername("root");
		crs.setPassword("");
		crs.setCommand("select eno,ename,esal,eaddr from employee");
		crs.execute();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Employee Number");
		    int eno= sc.nextInt();
		    
		    System.out.println("Employee Name");
		    String ename= sc.next();
		    
		    System.out.println("Employee Salary");
		    float esal = sc.nextFloat();
		    
		    System.out.println("Employee address");
		    String eaddr = sc.next();
		
		    crs.moveToInsertRow();
		    crs.updateInt(1, eno);
		    crs.updateString(2, ename);
		    crs.updateFloat(3, esal);
		    crs.updateString(4, eaddr);
		    
		    crs.insertRow();
		    
		    System.out.println("want to inert more y/ n");
		    
		    String option = sc.next();
		    if(option.equalsIgnoreCase("N")) {
		    	break;
		    }
		}
		   crs.moveToCurrentRow();  // these both 2 methods() we must use then only
		   crs.acceptChanges();     // the changes will be stored hier.
		
		
	     	crs.close();
		
		
	}

}
