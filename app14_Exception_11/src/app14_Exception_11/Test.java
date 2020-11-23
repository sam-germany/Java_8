package app14_Exception_11;

import java.io.Closeable;
import java.io.IOException;

public class Test {

	class Printer implements Closeable{

		public void print() {
			System.out.println("This just in");
		}
		
		
		@Override
		public void close() {}
		
	}
		public void printHeadlines() {
			
			try (  Printer p = new Printer() ) {
					p.print();
				}
		}
	
	public static void main(String[] args) {

		 new Test().printHeadlines();
		
	}

}
