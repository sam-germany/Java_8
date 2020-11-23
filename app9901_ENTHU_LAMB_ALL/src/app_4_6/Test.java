package app_4_6;

import java.util.function.Function;

public class Test {

   public double process1(double payment , int rate) {
	   double defaultrate  = 0.10;
	   
	   if(rate>10) defaultrate = rate;
	   
	   
	   class Imp{
		   public int apply1(double payment) {    // 10       (10 * 5)   -----  10 + (50)=  60 output      
			   Function<Integer, Integer> f = x   -> x + (int)(x * rate); 
			                                                         
			   return f.apply((int)payment);                        // if we use hier inseted of rate - defaultrate
		             }}                                              // then we get  compilation error as
	                                                                // as defaultrate is not effectively final
	   Imp i = new Imp();                                        //  but as we do not modify rate so we can use rate 
	   return i.apply1(payment);
   }
	 
	
	public static void main(String[] args) {

		
		Test t = new Test();
		System.out.println(  t.process1(10, 5) );
		
	}

}
