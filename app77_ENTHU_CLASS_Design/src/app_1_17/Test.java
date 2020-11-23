package app_1_17;
abstract class Widget{
	
	 String data="data";
	String data1;
	static String data2;
	 
	public  void doWidgetStuff() {
		
	}
}
public class Test extends Widget{

	String data = "big data";
	
	public void doWidgetStuff() {
		System.out.println(data);
	}
	
	public static void main(String[] args) {

		Widget t = new Test();
		t.doWidgetStuff();
		
		System.out.println(t.data);
		System.out.println(t.data1);
		System.out.println(t.data2);
	}

}
