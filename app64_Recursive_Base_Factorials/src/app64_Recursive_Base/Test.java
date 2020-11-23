package app64_Recursive_Base;

public class Test {

	public static long m1( long n) {
		
	                      if (n<1) { 
	                     		 return 1;
	                       }else { 
                    			return  n * m1(n-1);
		                  }
	}
	public static void main(String[] args) {

		Test t  = new Test();
		
		System.out.println(t.m1(5));
		
		
	}

}
/// to understand just think in mind that  when else {}  part execute then every time when
// it want to return a value but it is not able to return the value as we always call the 
// m1() method so