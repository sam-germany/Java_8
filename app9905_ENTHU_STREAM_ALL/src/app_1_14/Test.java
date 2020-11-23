package app_1_14;

import java.util.Arrays;
import java.util.List;

class Movie{
	
	static enum Genre { DRAMA, THRILLER, HORROR, ACTION; };
	
	private String name;
	private Genre genre;
	private char rating = 'R';
	
	Movie(String name, Genre genre, char rating){
		this.name = name;
		this.genre = genre;
		this.rating  = rating;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getRating() {
		return rating;
	}
	public void setRating(char rating) {
		this.rating = rating;
	}}
public class Test {

	public static void main(String[] args) {

		List<Movie> m = Arrays.asList( new Movie("Titanic", Movie.Genre.DRAMA,'U'),
			                        	new Movie("Psycho", Movie.Genre.THRILLER,'U'),
			                        	new Movie("Titanic", Movie.Genre.THRILLER,'R'),
		                          		new Movie("Tieee", Movie.Genre.HORROR,'U')
                             				); 
		
		 m.stream().filter(mov -> mov.getRating() =='R')
		           .peek(mov -> System.out.println(mov.getName()))
		           .map(mov -> mov.getName())    // as we put in .map( .getName())  then only name will be 
		           .forEach(System.out::println); // avilable for the .forEach() method, this is the reason 
		                                           // only name is printed                                 
		 
		System.out.println("----------------------------------------------");
		
		m.stream()
         .peek(mov -> System.out.println(mov.getName()))
         .filter(mov -> mov.getRating() =='R')
         .map(mov -> mov.getName())
         .forEach(System.out::println);  // in this output just obsery how 1 object is called and goes till
	}                                    // from .peek()  till .forEach() method then second object so calls
                                        // goes on
}
