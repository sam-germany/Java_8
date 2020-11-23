package app_10_RowSet;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class app_06_Retriving_CachedRowset {

	public static void main(String[] args) throws Exception{

		RowSetFactory rsf = RowSetProvider.newFactory();
		CachedRowSet crs = rsf.createCachedRowSet();
		crs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		crs.setUsername("Bunny");
		crs.setPassword("123");
		crs.setCommand("select eno,ename,esal,eaddr from employee");
		crs.execute();
		
		
		while(crs.next()) {
			System.out.println(crs.getInt(1)+" "+crs.getString(2)+" "+crs.getInt(3)+" "+crs.getString(4));
		}
		
		System.out.println("------------");
		
		while(crs.previous()) {
			System.out.println(crs.getInt(1)+" "+crs.getString(2)+" "+crs.getInt(3)+" "+crs.getString(4));
		}
		crs.close();
		
	}

}
