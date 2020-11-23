package app_10_RowSet;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;

public class app_10_Writing_xml_WebRowSet {

	public static void main(String[] args) throws SQLException, IOException {

		RowSetFactory rsf = RowSetProvider.newFactory();
		
		WebRowSet wrs = rsf.createWebRowSet();
		wrs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		wrs.setUsername("Bunny");
		wrs.setPassword("123");
		wrs.setCommand("select eno,ename,esal,eaddr from employee");
		wrs.execute();
		
		FileWriter fw = new FileWriter("D:\\Extra_Space_For_FOS_2\\webRowSet_xml\\abc.xml");
	    wrs.writeXml(fw);
	
	    System.out.println("Employee data is transfered to xml");
	    fw.close();
	}

}
