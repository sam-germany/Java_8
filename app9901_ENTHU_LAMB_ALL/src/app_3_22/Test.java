package app_3_22;

import java.util.function.Predicate;

interface AmountValidator{
	  //  public boolean check1(double value);
	    
	    
	   // public boolean check2(double value);
}

public class Test {
	
  	public void m1(double bal) {
		
		Predicate<Double> p = x -> x >= 10.0;   // i just for understand purpose  in the anonymous inner class
		                                        // we need a Interface of a class with the above check1()  method
		boolean isOk = p.test(bal);             //  but as we are using  Predicate hier then we can directly
		                                        //  write it like this as i am writng we do not need interface anymore
      System.out.println(isOk);
                    }
	
  	
  	
          public static void main(String[] args) {
			
        	  Test t = new Test();
        	  t.m1(11);

	}

}