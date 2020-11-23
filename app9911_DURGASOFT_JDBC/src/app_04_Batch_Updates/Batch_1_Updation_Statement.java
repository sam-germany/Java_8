package app_04_Batch_Updates;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Batch_1_Updation_Statement {

	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Bunny","123");
		
		Statement st =  con.createStatement();
		
		st.addBatch("insert into employee values(77,'gg',7000,'hyd')");
		st.addBatch("update employee set esal=esal+10 where esal<6000");
		st.addBatch("delete from employee where esal<4000");
      
		 int updateCount = 0;
		
	   int[] count = st.executeBatch();
	   for(int x :count) {
		
		   updateCount = updateCount + x;
	  }
	   System.out.println(updateCount);
	
	   con.close();
	
	}

}
