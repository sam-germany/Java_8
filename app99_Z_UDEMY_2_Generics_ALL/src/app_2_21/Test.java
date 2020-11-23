package app_2_21;

interface Operation<T extends Integer>{
	T operate(T x, T y);
}

public class Test {
    public static void main(String[] args) {
        
    	Operation o1 = (x, y) -> x + y; 
        
    	System.out.println(o1.operate(5, 10));  //   (5.0, 10.2);
    }
}

/*  as already defined Integer is a final class so hier T  parameter must be  of Integer Type so we are
    bounding this   .operate() method that it must take  int as argument.
     
 

System.out.println(o1.operate(5.0, 10.0));   this will give us compilation error

*/