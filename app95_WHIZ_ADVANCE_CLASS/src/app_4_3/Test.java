package app_4_3;

enum Month{
	MARCH(31), APRIL(10);
 
	 private int DAYS;
    private Month(int x) {
	     DAYS = x;
 }
    public int getDays(int y) {
    	return DAYS;
    }}
public class Test {

	public static void main(String[] args) {

		    System.out.println(Month.MARCH.getDays(0));
	}

}
