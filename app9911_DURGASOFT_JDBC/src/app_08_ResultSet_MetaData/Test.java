package app_08_ResultSet_MetaData;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws SQLException{

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Bunny","123");
		
		int count = 0;
		
		DatabaseMetaData dbmd = con.getMetaData();
		
		String catalog       = null;
		String schemaPattern = null;
		String tableName     = null;
		String [] types      = null;
		
		ResultSet rs = dbmd.getTables(catalog, schemaPattern, tableName, types);
		
		while(rs.next()) {
			
			count++;
			System.out.println(rs.getString(3));
		}
		
		System.out.println("The number of tables"+ count);
		
		con.close();
		
		
		
	}

}
