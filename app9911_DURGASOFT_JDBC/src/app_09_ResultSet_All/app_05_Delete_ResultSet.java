package app_09_ResultSet_All;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class app_05_Delete_ResultSet {

	public static void main(String[] args) throws SQLException{

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Bunny","123");
		
	    Statement st = con.createStatement(1005,1008);
	    
	    ResultSet rs = st.executeQuery("select eno,ename,esal,eaddr from employee");
	    
	    while(rs.next()) {
	    	float esal  = rs.getFloat(3);
	    	
	    	if(esal>5000) {
	    		
	    		float inc_sal = esal+777;
	    		rs.updateFloat(3, inc_sal);
	    		rs.updateRow();
	    	}
	    }
	    
	    con.close();
	}

}
