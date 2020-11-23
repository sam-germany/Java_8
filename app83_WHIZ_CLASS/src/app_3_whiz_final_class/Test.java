package app_3_whiz_final_class;

public class Test {

	int x = 10;
	
	public static void method(int c, int i) {
		
		class  T2{
			public void in() {
				System.out.println(i);
			}
		}
		
		c+=1;
   
		 new T2().in();
		
	}
	
	
	public static void main(String[] args) {
                 
		Test.method(5, 10);
		
		
	}

}
