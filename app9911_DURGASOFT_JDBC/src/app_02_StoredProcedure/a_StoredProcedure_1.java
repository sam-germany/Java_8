package app_02_StoredProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.OracleTypes;

public class a_StoredProcedure_1 {

	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Bunny","123");
	
	 CallableStatement cst = con.prepareCall("{call get1(?,?)}");
	 cst.setFloat(1, 1600);
	 
	 cst.registerOutParameter(2, OracleTypes.CURSOR);
	 cst.execute();
	 ResultSet rs = (ResultSet)cst.getObject(2);
	 
	 boolean flag = false;
	 
	 while(rs.next()) {
		 flag=true;
		 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getString(4));
              	 }

	if(flag == false) {
		System.out.println("No Records avilabel");
	}
	
	con.close();
	}

}
