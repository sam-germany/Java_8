package app_1_65;

import java.util.Arrays;
import java.util.List;
class Book{
	String title;
	double prise;
	
	public Book(String title, double prise) {
		this.title = title;
		this.prise = prise;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrise() {
		return prise;
	}
	public void setPrise(double prise) {
		this.prise = prise;
	}
}
public class Test {
	public static void main(String[] args) {

		List<List<Book>> book  = Arrays.asList(
	               		                  Arrays.asList(new Book("cc",1.0),  
	               		                		        new Book("bb",2.0)),
	               		                  
				                          Arrays.asList(new Book("dd",3.0), 
				                        		        new Book("aa",4.0))                  
                                    			);

		double d = book.stream()
				       .flatMap(bs -> bs.stream())   // we are not allowed to use .map() hier it give us
				       .mapToDouble(b ->b.getPrise()) //  compilation error ?  read explanation.
				       .sum();

		System.out.println(d);
/*
   just draw in mind.   .flatMap(Function)  take every object and create a new Stream of every object and after
   that combine all these  object Stream into a one big stream.
   
   as all theses objects are inside in a big Stream  and int our case we need  total of double variable
   so we use .mapToDouble( ToDoubleFunction)
   
   Note: as  List<Book>  list is of Book  type,  so as we use .flatMap()  so all object of Book class
   we put in a big Stream. so now only we can call in .mapToDouble( b -> b.getPrise())  
   
   Imp:  if we do not use .flatMap() and do not create for every   book object a new Stream
   then we are not alloweed to call   .getPrise()  method.
   
   so to use .getPrise()  method we need to use   .flatMap()   if we use  .map()  then we are not alloweed
   to call this  .getPrise() method
   
   
    
    
  
 
  
 		
 */

		
		
		
		
		
	}

}
