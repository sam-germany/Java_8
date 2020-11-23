package app_1_11_Compute;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

class Account{
	private String id;

	public Account(String id) {
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
	
}
public class Test extends Account{

	private double balance;
	
	public Test(String id, double balance) {
		super(id);
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	@Override
	public String toString() {
		return "Balance--"+ balance;
	}
	public static void main(String[] args) {

		Map<String, Account> m = new HashMap<>();
		m.put("111", new Account("111"));
		m.put("222", new Test("111",200.00));
		
		
		BiFunction<String, Account, Account> bif 
	          	= (aa, bb) -> bb instanceof Test ? new Test(aa, 300.0) : new Account(aa);
		
	      
	     m.computeIfPresent("222", bif);
	     
	     Test t = (Test)m.get("222");
	          	
	    	   System.out.println("-------------");
	    	   
	    	   for (Map.Entry<String, Account> entry : m.entrySet()) {
	    		   
	    			String k = entry.getKey();
	    			Account v = entry.getValue();
	    			System.out.println("key--"+ k + " Value --" + v);
	    		}

	    	   
	//m.put("111", new Account("111"));          	   
	//m.put("111", new Test("111",200.00));     just think in mind like this we are going to add a object    	   
	     
// if we draw like this in mind then it is easy to understand.	    	   
	}
	}


