package whiz_1_51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Client{
	double budget;
	String name;
	String project;
	
	Client(String n, String pr, double p){
		budget = p;
		name = n;
		project = pr;
	}
	
	public String getName1() {
		return name;
	}
	public double getBudget() {
		return budget;
	}

	public String toString() {
		return name +" "+budget;
	}
}
public class Test {

	public static void main(String[] args) {

		List<Client>  l = new ArrayList<>();
		l.add(new Client("will", "java", 200));
		l.add(new Client("Rachel", ".net", 1200));
		l.add(new Client("Raj", "PHP", 750));
		
		Collections.sort(l, Comparator.comparing(Client::getName1));   // as we use  List<Client>  list of Client type
		System.out.println(l);                                        // so we can call non-static method .getName1()
                                                                // directly , we do not define .compare() or .compareTo() 
	                                                            // method, it is very important point to understand  that
		                                                        // we do not define  .compare() or .compareTo() 
		
		Collections.sort(l, Comparator.comparing(Client::getBudget));
		System.out.println(l);  
		
		Collections.sort(l, new Comparator<Client>() {
		                	    @Override
	                     		public int compare(Client s1, Client s2) {
				                 return s2.getName1().compareTo(s1.getName1());
        			                            }
		                               });
 	  System.out.println(l);
	}

}
