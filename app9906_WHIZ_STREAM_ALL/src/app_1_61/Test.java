package app_1_61;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

class Trade {
	int quality;
	double price;
	double total;
	String name;

	public Trade(int q, double p, String b) {

		this.quality = q;
		this.price = p;
		this.total = p * q;
		this.name = b;
	}

	public double getTotal() {
		return total;
	}
	
	public double getPrice() {
		return price;
	}

	public String toString() {
		return name + " " + total;
	}

}

public class Test {

	public static void main(String[] args) {

		Stream<Trade> l = Stream.of( 
				                     new Trade(1 , 1.5 , "John"),
				                     new Trade(2 , 2.5 , "Alice"),
				                     new Trade(2 , 2.5 , "Lisa")
				                    ); 
		
		Stream<Double> totals = l.map(Trade::getTotal);
		
	//	Stream<Double> totals = l.map( x -> x.getTotal());   this above line is same as this
		
		
      totals.forEach(System.out::println);
	
	// Note   .toString()   method return   name +" "+ total    but as in .map() we call only .getTotal() 
	} //                                                                so only total we see in printout

}
