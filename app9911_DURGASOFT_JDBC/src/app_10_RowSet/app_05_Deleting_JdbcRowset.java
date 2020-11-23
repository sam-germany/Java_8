package app_10_RowSet;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class app_05_Deleting_JdbcRowset {

	public static void main(String[] args) throws SQLException {

        RowSetFactory rsf = RowSetProvider.newFactory();
		
		JdbcRowSet rs = rsf.createJdbcRowSet();
		rs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		rs.setUsername("Bunny");
		rs.setPassword("123");
		rs.setCommand("select eno,ename,esal,eaddr from employee");
		rs.execute();
		
		while(rs.next()) {
			float esal= rs.getFloat(3);
				
			if(esal>8000) {
               rs.deleteRow();
				}
			}
		rs.close();
			
		}
	
	}
	
