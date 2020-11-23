package app_1_11_Compute;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
/*
class Account1{
	private String id;

	public Account1(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + "]";
	}	
	
}*/
public class Test2 {

	private double balance;
	private String id;
	
	public Test2(double balance, String id) {
		super();
		this.balance = balance;
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public static void main(String[] args) {

		Map<String,Test2> m = new HashMap<>();
	//	m.put("111", new Test2("111"));
		m.put("222", new Test2(200.00,"111"));
		
		 System.out.println(m);
		
		 BiFunction<String, Test2, Test2> bif 
	          	= (aa, bb) -> bb instanceof Test2 ? new Test2(aa, 300.0) : new Test2(aa);
		
	      
	     m.computeIfPresent("222", bif);
	     
	     Test2 t = (Test2)m.get("222");
	     //System.out.println(t.getBalance());
	    // System.out.println(t.getId());
	    // System.out.println(t.getClass());
	          	
	    	   System.out.println(m);
	    	   

	     
	}
	}
