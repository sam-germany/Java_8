package app_07_Transactions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class SavePoint {

	public static void main(String[] args) throws SQLException{

		// note this example will not work with oracle
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Bunny","123");
		
		Statement st = con.createStatement();
		
		con.setAutoCommit(false);
		
		st.executeUpdate("insert into employee values(66,'ff',6000,'bom')");
		st.executeUpdate("insert into employee values(77,'gg',7000,'bom')");
		
		Savepoint spoint = con.setSavepoint();
		
		st.executeUpdate("insert into employee values(88,'hh',8000,'bom')");
		
		con.rollback();
		
		con.commit();
		con.close();
	}

}
