package app_10_RowSet;

import java.sql.SQLException;
import javax.sql.RowSet;
import javax.sql.rowset.FilteredRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;

class FilterRowSetDemo implements javax.sql.rowset.Predicate{
	float low;
	float high;

	public FilterRowSetDemo(float low, float high) {
		this.low = low;
		this.high = high;
	}

	@Override
	public boolean evaluate(Object value, int column) throws SQLException {  return false;  }

	@Override
	public boolean evaluate(Object value, String columnName) throws SQLException {  return false;  }

	@Override
	public boolean evaluate(RowSet rs) {
	
		boolean eval = false;
		try {
			FilteredRowSet frs= (FilteredRowSet)rs;
		    float esal = frs.getFloat(3);
		    
		         if((esal>=low)&& (esal<=high)) {
		              	eval=true;
		           }else {
		    	      eval=false;
		              }
		   }catch(Exception e) {
			   e.printStackTrace();
		   }
		
		return eval;
	}
}

public class app_14_FilteredRowSet{

public static void main(String[] args) throws Exception{
		
		    RowSetFactory rsf = RowSetProvider.newFactory();
			
			FilteredRowSet frs = rsf.createFilteredRowSet();
			frs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			frs.setUsername("Bunny");
			frs.setPassword("123");
			frs.setCommand("select eno,ename,esal,eaddr from employee");
			frs.execute();

		System.out.println("Before Filtring");
			
		while(frs.next()) {
			System.out.println(frs.getInt(1)+" "+frs.getString(2)+" "+frs.getFloat(3)+" "+frs.getString(4));
		}
		
		System.out.println("--");
		
		FilterRowSetDemo f= new FilterRowSetDemo(1000, 5000);
		frs.setFilter(f);
		frs.beforeFirst();
		
		while(frs.next()) {
			System.out.println(frs.getInt(1)+" "+frs.getString(2)+" "+frs.getFloat(3)+" "+frs.getString(4));
		}
		
	}
}
