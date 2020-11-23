package app_6_64;

public class Test {

	public static void m1() throws Exception{
		System.out.println("-----------");
		throw new Exception ("Exception from m1 () method");
	}
	
	public static void m2() throws Exception{
		try {
			m1();
		}catch (Exception e) {
			System.out.println("-----------");
			throw e;
		}finally {
			
			System.out.println("-----------");
			throw new RuntimeException("Exception from finally");
		}
	}
	public static void main(String[] args) {

		try {
			m2();
		}catch (Exception e) {
			System.out.println(e);
			
			Throwable[] ta = e.getSuppressed();
			            
			for(Throwable t :ta) {
				System.out.println(t.getMessage());
			}
		}
		
	}

}
