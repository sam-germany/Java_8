package app_10_RowSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class app_02_Jdbc_Rowset {

	public static void main(String[] args) throws SQLException{

	
	RowSetFactory rsf = RowSetProvider.newFactory();
	
	JdbcRowSet rs = rsf.createJdbcRowSet();
	rs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
	rs.setUsername("Bunny");
	rs.setPassword("123");
	
	rs.setCommand("select * from employee");
	rs.execute();
	
	while(rs.next()) {
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
	}
	System.out.println("--");
	
	while(rs.previous()) {
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
	}
	System.out.println("--");
	
	rs.absolute(3);
	System.out.println(rs.getRow()+"-->"+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));

	System.out.println("--");
	rs.first();
	System.out.println(rs.getRow()+"-->"+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
	
 	System.out.println("--");
 	rs.last();
 	System.out.println(rs.getRow()+"-->"+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
	
 	
 	rs.close();
	
	}

	
}
