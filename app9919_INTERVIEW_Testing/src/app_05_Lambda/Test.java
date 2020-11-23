package app_05_Lambda;

interface Operation{
	
	int operate (int x, int y);
}

public class Test {
	public static void main(String[] args) {

		
		Operation op = (a,b)-> a+b;
		
		System.out.println(op.operate(5, 10));
		
		
		
		
		
	}

}
