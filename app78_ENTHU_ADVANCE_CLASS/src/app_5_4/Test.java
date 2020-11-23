package app_5_4;

enum Y{
	 Y1, Y2,Y3;
}
public class Test{

	    public enum X{
	            	X1,X2,X3;
	    }

	    public Test() {
	    	System.out.println(X.X1+" "+Y.Y1);
	    }
	    
	    
	    
	public static void main(String[] args) {

		 new Test();
		
		
	}
}
