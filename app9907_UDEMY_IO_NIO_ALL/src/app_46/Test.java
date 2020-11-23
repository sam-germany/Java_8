package app_46;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {

		Path  p1 = Paths.get("D:\\Extra_Space_For_FOS\\A\\B\\C\\Book1.txt");   // all the loops do not
		                                                                 // check if these folder, file
		p1.forEach(System.out::println);                                 // exists or not, it print the 
		                                                               // result
		System.out.println("----------------");
		
		
		for(Path x: p1) {
			System.out.println(x);
	
			
	   System.out.println("-----------------------");
		
	   
	   for(int i = 0; i< p1.getNameCount(); i++) {
		   System.out.println(p1.getName(i));
	   }
	   
	   System.out.println("-----------------------------");
		
	   
	   Iterator<Path> it = p1.iterator();
	   while(it.hasNext()) {
		   System.out.println(it.next());
	   }
	   
			
			
		
		}
	}

}
