package app_10_RowSet;

import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class app_08_update_CachedRowSet {

	public static void main(String[] args) throws SQLException{

		RowSetFactory rsf = RowSetProvider.newFactory();
		CachedRowSet crs = rsf.createCachedRowSet();
		crs.setUrl("jdbc:mysql://localhost/Bunny?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
		
		// in documentation  he uses   relaxAutoCommit=true   in url but i am using then it throws exception
		// rest code is fine
		
		crs.setUsername("root");
		crs.setPassword("");
		crs.setCommand("select eno,ename,esal,eaddr from employee");
		crs.execute();
		
		while(crs.next()) {
			float esal= crs.getFloat(3);
			
			if(esal>5000) {
				esal = esal+555;
				crs.updateFloat(3, esal);
				crs.updateRow();
			}}
		crs.moveToCurrentRow();
		crs.acceptChanges();
		
		System.out.println("Records updated Succesfully");
		
		crs.close();
	}

}