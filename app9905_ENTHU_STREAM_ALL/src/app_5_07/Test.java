package app_5_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Book{
	private String title;
	private String genre;
	
	public Book(String title, String genre) {
		this.title = title;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String toString() {
		return title +" "+ genre;
	}
}
public class Test {
	public static void main(String[] args) {

		List<Book> list  = Arrays.asList(
			                          new Book("Gone", "Fiction"),
			                          new Book("Bourne","Thriller"),
			                          new Book("The Client","Thriller")
				                      );
		
		List<String> l1  = new ArrayList<>();
		
		        list.stream()
	               	.map(x -> x.toString())  //  hier we are concating the both field into one String type
	            	.forEach(s -> l1.add(s)); // it will add both title, genre  in l1 ArrayList<>();
		
		
		System.out.println(l1);
		System.out.println("--------------");
		
		
		List<String> l2  = new ArrayList<>();
		
	             list.stream()
	            	 .map(Book::getTitle)    // as in map we are taking only  Title so in Stream only title
            	 	 .forEach(x -> l2.add(x));   // goes further and in new List it add only Title field 
       
		l2.forEach(System.out::println);      
		System.out.println("--------------");
		
        
        List<String> l3  = new ArrayList<>();
        
               list.stream()
                   .map(Book::getTitle)
                   .forEach(l3::add);   
        
        System.out.println(l3);
        System.out.println("--------------");
        
        
        
        List<String> l4  = new ArrayList<>();
        
              list.stream()
                  .map(x -> x.getTitle())
                  .forEach(l4::add);
        
        System.out.println(l3);
        System.out.println("--------------");
        
        

        List<String> l5 = new ArrayList<>();
        
            l5 = list.stream()
                     .map(Book::getTitle)
                     .collect(Collectors.toList());  // hier we are converting the Stream into  List<String>
        
        System.out.println(l5);
	}

}
