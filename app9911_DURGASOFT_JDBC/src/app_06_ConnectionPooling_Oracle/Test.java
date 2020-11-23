package app_06_ConnectionPooling_Oracle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.pool.OracleConnectionPoolDataSource;

public class Test {

	public static void main(String[] args) throws SQLException {

		OracleConnectionPoolDataSource ds = new OracleConnectionPoolDataSource();
		ds.setURL("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUser("Bunny");
		ds.setPassword("123");
		
		
		Connection con =ds.getConnection();
		
		Statement st= con.createStatement();
		
		ResultSet rs = st.executeQuery("select * from employee");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getString(4));
		}
		
	}

}
