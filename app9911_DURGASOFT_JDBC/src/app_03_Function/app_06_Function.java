package app_03_Function;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class app_06_Function {

	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Bunny","123");
		
		CallableStatement cst = con.prepareCall("{?=call getAvg1(?,?)}");
		cst.setInt(2, 11);
		cst.setInt(3,22);
		cst.registerOutParameter(1, Types.FLOAT);
		
		cst.execute();
		
		System.out.println(cst.getFloat(1));
		
		con.close();
		
		
		
	}

}
