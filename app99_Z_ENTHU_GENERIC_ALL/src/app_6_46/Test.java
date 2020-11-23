package app_6_46;

import java.util.ArrayList;

class Book{ }

class TextBook extends Book { }
                                                     // change .add(Object o);   to      .add11(Object o);
public class Test  extends ArrayList{

	public int count = 0;
	
	public boolean add11(Object o) {            
		if (o instanceof Book) {               
			return super.add((Book) o);    // as this Class Test  extends ArrayList     so   super.add() means we are calling     
		}else {                             // the .add() method of ArrayList
			return count++ == -1;            // as ArrayList<Book>  is of Book type so we can do    .add(Book)
		}
	}
	public static void main(String[] args) {

		Test list = new Test();                     
		list.add(new Book());      //as class Test extends ArrayList  so hier we use the .add()  method of ArrayList
		list.add(new TextBook());  //as ArrayList<Book>  is of  <Book>  type so the .add(Book b);  this  .add() method
	                               // takes as  (Book b) as argument.
		
		
		list.add11("hello");                  // at this point we are getting error, as if we use normal 
		                                     //  ArrayList. add(Book b)   method that it will never take 
		System.out.println(list.count);      //   list.add("String")   as parameter so hier if we call our own defined
		                                     //  .add11() method then it will not give us compilation error
		                                     
  //Note: this code shows us if a class extends ArrayList then we can call ArrayList method on the extended class also
		
		
		
		
		
	}                                       // but if we redefine above   add1(Object o);   then hier we can
                                           // use  use also    list.add1("hello")
}  
                                            // and as class Test extends ArrayList<>  so  .add() method we can use
                                            // as normal we are using.