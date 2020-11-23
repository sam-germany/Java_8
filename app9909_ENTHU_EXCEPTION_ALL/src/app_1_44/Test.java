package app_1_44;

public class Test {

	public static boolean isGoodnumber(int n) {
		
		assert n> 5;
		return true;
	}
	public static void main(String[] args) {

		int i = Integer.parseInt(args[1]);
		int j = Integer.parseInt(args[2]);
		
		do {
			i--;
			if(i < 5) 
				System.out.println(i+" ---");
				break;
		
		}while( isGoodnumber(j--));
		
		System.out.println(i+" ==== ");
		System.out.println(j);
         		
	}

}
