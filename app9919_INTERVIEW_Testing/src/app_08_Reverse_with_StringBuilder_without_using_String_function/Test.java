package app_08_Reverse_with_StringBuilder_without_using_String_function;

public class Test {

	public static void main(String[] args) {

		String  str1 = "Automation";
		
		StringBuilder str2 = new StringBuilder();
		
		str2.append(str1);
		
		str2.reverse();
		
		System.out.println(str2);
		
		
	}

}
