package app_3_64;

public class Test {

	interface Infra{
	
		String m1(int x ,String y);
	
	}
	
	
	public static void main(String[] args) {

		Infra d = (a,b) -> b.substring(0, a);
		
		System.out.println(d.m1(2, "12345"));
		
	 
		
		
		
		Infra d2 = (int a, String b) -> b.substring(0, a);
		
		System.out.println(d2.m1(2, "12345"));
		
	}

}
