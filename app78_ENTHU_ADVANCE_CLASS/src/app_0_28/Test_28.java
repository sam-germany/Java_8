package app_0_28;

public class Test_28 {

	static int si = 10;


	int ii = 20;
	
    //	ii=25;                       this we can not do as it gives us compilation error;
	
	public void inner11() {
		int ai = 30;
	//ai= 31;                       as it is no more final so not alloweed
	
		final int fai = 40;
		
		class Inner22{
			public Inner22() {
				System.out.println(si+" "+ ii+ " "+ai+" "+ fai);
			}
		}
		new Inner22();
	}
	public static void main(String[] args) {
       new Test_28().inner11();

		
		
	}

}
