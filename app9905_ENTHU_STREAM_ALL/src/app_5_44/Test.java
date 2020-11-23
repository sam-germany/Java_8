package app_5_44;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Course{
	private String id;
	private String name;
	
	public Course(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
/*	public String toString() {
		return id+" "+name;
	}*/
}
public class Test {
	public static void main(String[] args) {

		List<Course> l = Arrays.asList(//         id     name
				                      new Course("803","OCA 8"),  // in enthuware question hier name is 
				                      new Course("808","OCA 8"),  //    "OCA 7"  i change it to "OCA 8"
				                      new Course("809","OCP 8")      // now output is different
				                      ); 
		/*
	    	String s = l.stream()
				        .filter( c ->c.getName().indexOf("8") > -1)
		        //      .peek(System.out::println)         
	            //      .map(c -> c.getId())
		                .collect(Collectors.joining("1ZO-"));
		
		System.out.println(s);
		*/
		
	       	String s = l.stream()
				        .filter( c ->c.getName().indexOf("8") > -1)
	                    .map(c -> c.getId())
		                .collect(Collectors.joining("1ZO-"));
		
		System.out.print(s);
		
		System.out.println("----------------------");
		
		                   l.stream()
                    		.forEach(c -> System.out.println(c.getId()));
		
	}

}
