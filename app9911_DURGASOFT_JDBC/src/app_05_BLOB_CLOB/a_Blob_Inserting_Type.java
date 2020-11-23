package app_05_BLOB_CLOB;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class a_Blob_Inserting_Type {

	public static void main(String[] args) throws SQLException, FileNotFoundException {

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Bunny","123");
		
		String sqlQuery = "insert into blobtable1 values(?,?)";
		
		PreparedStatement ps = con.prepareStatement(sqlQuery);
		ps.setString(1, "kathrina");
		
		File f = new File("D:\\Extra_Space_For_FOS\\images1\\nagoor.jpg");
		FileInputStream fis = new FileInputStream(f);  // we read a image and put it in a PreparedStatement
		ps.setBinaryStream(2, fis);            // for this getting from  source folder of image till preparedStatement
		                                   // we need FileInputStrem and cover of Stream for this process 
		int updateCount= ps.executeUpdate();  // just draw this thing in mind.
		
		if(updateCount==1) {
			System.out.println(" Record inserted");
		}else {
			System.out.println("Record not inserted");
		}
		
		
	}

}
