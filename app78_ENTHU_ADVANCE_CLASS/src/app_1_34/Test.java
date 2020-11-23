package app_1_34;

interface House{
	public default String getAddress() {
		return "101---";
	}
}

interface Office{
	public  static String getAddress() {
		return "102-----";
	}}

class HomeOffice implements House, Office{
	public String getAddress() {
		return "103-------";
	}
}
public class Test {

	public static void main(String[] args) {
 
		Office o = new HomeOffice();
	//	System.out.println(o.getAddress());
		
		System.out.println(Office.getAddress());
		
	}

}
