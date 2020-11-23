package app_2_32;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Movie{
	       
	  static enum A1{
		       DRAMA, THRILLER, HORROR, ACTION;
         	}
		
	
	    private A1 a1;
		private String name;
		
		
      	Movie( String name,A1 a1) {
			this.a1 = a1;
			this.name = name;
		}

		public A1 getA1() {
			return a1;
		}

		public String getName() {
			return name;
		}
}
public class Test {
	public static void main(String[] args) {

		List<Movie> m = Arrays.asList(  new Movie ("sunny", Movie.A1.DRAMA),
		                          		new Movie ("bunny", Movie.A1.HORROR),
                         				new Movie ("manny", Movie.A1.THRILLER),
                         				new Movie ("banny", Movie.A1.THRILLER)
				                     );
		
	Predicate<Movie> horror1 =  x -> x.getA1() == Movie.A1.THRILLER;
	Predicate<Movie> name1 = x -> x.getName().startsWith("m");
	
	  m.stream().filter(horror1)
	            .filter(name1)
	            .forEach(x -> System.out.println(x.getName()));
	
	}

}
