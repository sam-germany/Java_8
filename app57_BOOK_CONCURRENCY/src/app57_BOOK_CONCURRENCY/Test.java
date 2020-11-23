package app57_BOOK_CONCURRENCY;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Test {

	long ticketSold;
	final AtomicInteger ticketTaken;
	
	public Test() {
		ticketSold= 0;
		ticketTaken = new AtomicInteger(0);
	}
	
	public void performJob() {
		IntStream.iterate(1, p-> p+1)
		          .parallel()
		          .limit(10)
		          .forEach(i -> ticketTaken.getAndIncrement());

	   IntStream.iterate(1, q -> q+1)
	   .limit(5)
	   .parallel()
	   .forEach(i -> ++ticketSold);
	   
	   
	   System.out.println(ticketTaken +"  "+ ticketSold);
	
	}
	
	public static void main(String[] args) {
		new Test().performJob();

	}

}
