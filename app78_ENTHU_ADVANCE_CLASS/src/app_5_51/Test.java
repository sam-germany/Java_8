package app_5_51;

class A{ }

public class Test {
                 
	            public class A{
	                         public void m() { System.out.println("111");} 
                                }
 
	            class B extends A{  }
	
	public static void main(String[] args) {

		 new Test().new A() {
               			 public void m() { System.out.println("2222");
               			                                            } 
		       
		                    };
 	}

}