package app_2_52;

import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	static class Vendor{
		
		private String name;
		private int rating;
		
		Vendor(String name, int rating){
			this.name = name;           // just check it with --this.name--  and without --this--
			this.rating = rating;
		}
	}
	public static void main(String[] args) {

		Stream<Vendor> s = Stream.of(new Vendor("Dell",7),
		                       		new Vendor("Hp",9),
			                     	new Vendor("Cisco",6)
          				               );
			
		ToIntFunction<Vendor> toInt = p ->p.rating;
		
		IntStream out = s.mapToInt(toInt);
		
		System.out.println(out.skip(1).sum());
	}

}
// in example he do not use  this.name  = name;  ----this---   keyword he do not use, as this 
// not used then so when we call the  <Vendor>  then we call  .sum()  method but it will not
// get the provided  .rating  value as  this keyword is not used 