package app_1_04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Item{
	private int id;
	private String name;
	
	public Item(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
}
public class Test {
	public static void main(String[] args) {

		List<Item> l  = Arrays.asList( new Item(3, "Screw"),
				                       new Item(2, "Nail"),
				                        new Item(1, "Bolt")
				                      );
		 
	                 	l.stream()
		                          .map((i) -> i.getName())   // as we define i.getName() it means only name
		                          .sorted()                  // will be avilable for the the other streams
		                          .forEach(System.out::println);//id is not returning back, this is the reason
	                 	                                        // we only see the name not the id in printout 
	                 	
	                /* 	l.stream()     if we directly use .sorted() method then it will give us compilation error
                		.sorted()        but as above if we use after map()   then it is ok,
                		.forEach(System.out::println); // 
	                 */	
		
	    System.out.println("-----------------------------------------------------");
	                 	
	                   l.stream()
	                            .sorted((a,b) ->a.getName().compareTo(b.getName()))
	                            .forEach(System.out::println);
	    
		System.out.println("-----------------------------------------------------");
		
                		l.stream()
                		.sorted(Comparator.comparing(a -> a.getName()))
                		.forEach(System.out::println);
		
		System.out.println("-----------------------------------------------------");
		
		                l.stream()
		                .sorted(Comparator.comparing(a -> a.getName()))
		                .map((i) -> i.getName())
		                .forEach(System.out::println);
		
		
	}

}
