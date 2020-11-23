package app_05_BLOB_CLOB;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class a_Blob_Retriving_Type {

	public static void main(String[] args) throws SQLException, IOException {

	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Bunny","123");
	
	PreparedStatement ps = con.prepareStatement("select * from blobtable1");
	
	ResultSet rs = ps.executeQuery();
	
	FileOutputStream os = new FileOutputStream("D:\\Extra_Space_For_FOS\\images1\\imagenew.jpg");
	                    // simple example from data we are retriving the image with the help of FOS
	                    // and  in the above given target path we are writing that retrived image
	
	if(rs.next()) {
		
		String name= rs.getString(1);
		InputStream is = rs.getBinaryStream(2);
		
		byte[] buffer = new byte[10];
		
		while(is.read(buffer) > 0) {   // as read method return  0  or  -1
			
			os.write(buffer);
		//	break;                        i just for seeing the flow i put this break;   hier like if only
		}                                //   byte[10]   are tranfered form image, as the complete image 
		os.flush();                      // is not transfered, so see the newely created image nothing will
		                                 // be shown their
		System.out.println("completed");
	}
     con.close();	
	
	
	
	
	}

}
