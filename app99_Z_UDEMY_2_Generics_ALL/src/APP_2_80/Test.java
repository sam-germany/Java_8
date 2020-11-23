package APP_2_80;

public class Test {

	private static boolean isDirection(int ch) {
		switch(ch) {
		case 'N':
		case 'E':
			break;
		case 'W':
		case 'S':

			return true;
		}
		
	     return false;
	}
	public static void main(String[] args) {

		String str = "North East West South";
		
		          str.chars()
		             .filter(Test::isDirection)                    // as isDirection() is a static method so we can call it 
		             .peek(System.out::println)                    // like (Test::isDirection) 
		             .forEach(x -> System.out.println((char)x));   // as i put the .peek() method it show that how 
		                                                           // we convert the character into ASCII value through
		                                                           //    str.chars()    method
// .chars()  it convert  string into  ASCII value		
	}

}
