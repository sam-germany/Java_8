package app_0_28;

public class Test_29 {

	static int si = 10;


	int ii = 20;
	
   
	public static void inner11() {
		int ai = 30;
	//ai= 31;                       as it is no more final so not alloweed
	
		final int fai = 40;
		
		class Inner22{
			public Inner22() {
				System.out.println(si+" "+ai+" "+ fai);    // ii   if we try to acces not alloweed
			}
		}
		new Inner22();
	}
	public static void main(String[] args) {
       new Test_29().inner11();

		
		
	}

}
