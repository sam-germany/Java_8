package app_10_RowSet;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JoinRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class app_13_JoinRowSet_joining_2_sets {

	public static void main(String[] args) throws Exception{

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Bunny","123");

		RowSetFactory rsf = RowSetProvider.newFactory();
		
		
		CachedRowSet rs1 = rsf.createCachedRowSet();
		rs1.setCommand("select sid,sname,saddr,cid from students");
		rs1.execute(con);
		
		CachedRowSet rs2 = rsf.createCachedRowSet();
		rs2.setCommand("select cid,cname,ccost from courses");
		rs2.execute(con);
		
		JoinRowSet jrs =  rsf.createJoinRowSet();
		jrs.addRowSet(rs1, 4);
		jrs.addRowSet(rs2, 1);
		
		while(jrs.next()) {
			System.out.println(jrs.getString(1));
			System.out.println(jrs.getString(2));
			System.out.println(jrs.getString(3));
			System.out.println(jrs.getString(4));
			System.out.println(jrs.getString(5));
			System.out.println(jrs.getString(6));
		
		}

		con.close();
		
	}

}
