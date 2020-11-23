package app_05_BLOB_CLOB;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class b_Blob_Retriving {

	public static void main(String[] args) throws SQLException, IOException{

	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Bunny","123");
	
	PreparedStatement ps = con.prepareStatement("select * from clobTable1");
	
	ResultSet rs  = ps.executeQuery();
	
	FileWriter fw = new FileWriter("D:\\Extra_Space_For_FOS\\images1\\newDocument.docx");
	
	if(rs.next()) {
		
		String name = rs.getString(1);
		Reader r = rs.getCharacterStream(2);
		
		char[] buffer = new char[1024];
		
		while(r.read(buffer)> 0) {
		
			fw.write(buffer);
		}
		
		fw.flush();
		
		System.out.println("created succesfully");
	    
	    }
	
	   con.close();

	   
	}

}
