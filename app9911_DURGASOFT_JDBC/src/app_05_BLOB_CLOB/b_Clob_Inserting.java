package app_05_BLOB_CLOB;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class b_Clob_Inserting {

	public static void main(String[] args) throws SQLException ,IOException{

	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Bunny","123");
	
	String sqlQuery ="insert into clobTable1 values(?,?)";
	
	PreparedStatement ps = con.prepareStatement(sqlQuery);
	ps.setString(1,"Hydrabad");
	
	File f  = new File("D:\\Extra_Space_For_FOS\\images1\\nag.docx");  // hier we are taking the file from the 
	FileReader fr = new FileReader(f);          // source folder, as we are taking the file from the source
	ps.setCharacterStream(2, fr);         // folder so we need FileReader   and then we are putting it into DB
	
	int updateCount = ps.executeUpdate();
	
	if(updateCount == 1) {
		System.out.println("Record Inserted");
	}else {
		System.out.println("Record not inserted");
	}
	
	
	
	
	}
	

}
