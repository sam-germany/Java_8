package app_03_Function;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.OracleTypes;

public class app_08_Function {

	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Bunny","123");
		
		CallableStatement cst = con.prepareCall("{ ?= call getDelete( ?,?) }");
	
		cst.setInt(2, 11);
		cst.registerOutParameter(1, OracleTypes.CURSOR);
		cst.registerOutParameter(3, Types.INTEGER);
		cst.execute();
		
		ResultSet rs = (ResultSet)cst.getObject(1);
	
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getString(4));
		}
	
		int count1 = cst.getInt(3);
		System.out.println(count1);
	
		con.close();
	
	
	
	
	
	
	}

}
