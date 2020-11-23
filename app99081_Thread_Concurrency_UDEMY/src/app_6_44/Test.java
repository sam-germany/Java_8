package app_6_44;

import java.util.ArrayList;
import java.util.List;

class Book{
	String isbn;
	double price;
	
	public Book(String isbn, double price) {
		this.isbn = isbn;
		this.price = price;
	}

	@Override
	public String toString() {
    
		 return isbn+"   "+ price;
	}}
public class Test {
	public static void main(String[] args) {

		List<Book> books = new ArrayList<>();
		books.add(new Book("111",9.99));
		books.add(new Book("222",10.99));
		books.add(new Book("333",15.99));

		Book b  = books.stream()
				     .reduce(new Book("444", 0.0),(b1,b2) ->{
				    	                                 b1.price = b1.price + b2.price;
				    	                                  
				    	                                 return new Book(b1.isbn, b1.price);
                   				           });
		
		books.add(b);
		
		books.forEach(System.out::println);
		
		System.out.println("-------------");
		
		books.parallelStream().reduce((x,y) -> x.price > y.price ? x: y)
		                      .ifPresent(System.out::println);
	}}
/*
    Just draw in mind as till now how we work with the .reduce() method. in this code
                    base/ identity   
    .reduce(new Book("444", 0.0),(b1,b2) ->{
                                             b1.price = b1.price + b2.price;
     this is   base/identity   ("444",0.0)
      
    as their 3 objects defined in the List<Book>   so compiler will iterate 3 times
    
    
    Iteration (1)
                   (b1,b2)     means        b1=  new Book("444",0.0)
                                            b2=  new Book("111",9.99) 
                                   
          b1.price = b1.price + b2.price;        means   0.0 = 0.0 + 9.99;  
           
                                      return new Book("444",9.99);
                                      
     Iteration (2)
     
              (b1,b2)     means        b1=  new Book("444",9.99)
                                            b2=  new Book("222",10.99) 
                                   
          b1.price = b1.price + b2.price;        means   9.99 = 9.99 + 10.99;  
           
                                      return new Book("444",29.98);
           
     Iteration (3)
     
              (b1,b2)     means        b1=  new Book("444",29.98)
                                            b2=  new Book("333",15.99) 
                                   
          b1.price = b1.price + b2.price;        means   29.98 = 29.98 + 15.99;  
           
                                      return new Book("444",36.97);                                 
    ----------------------------------------------------------------------------------------
   
    books.parallelStream().reduce((x,y) -> x.price > y.price ? x: y)
	 	                      .ifPresent(System.out::println);
     
     this is also very much interesting question. as in this .reduce() method we do not put any
     base/identity   value so this .reduce() method return Optional
     
     (1)
    .reduce(x,y)         it takes 2 object
     
     (2)
     .reduce((x,y) -> x.price > y.price ? x: y)

     
     
     
     
     
     
     
 
  
 
 
 
 
 
 
 
 
 
 
 
 
 */
