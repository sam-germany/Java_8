package app_2_37;

enum Title{
	MR("Mr.-- "), MRS("Mrs. "), MS("Ms. ");

	private String title;
	
	private Title (String s) {
	    title =s;
	}
	public String format1(String first, String last) {
		return title +" "+first+" "+last;
	}}
public class Test {
	void someMethod() {
		System.out.println(Title.MR.format1("SS", "RRR"));
	}
	public static void main(String[] args) {
		
		Test t = new Test();
		t.someMethod();
     
		output      Mr.-- SS RRR
	
	}
}
