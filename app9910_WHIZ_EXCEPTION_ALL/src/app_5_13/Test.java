package app_5_13;

public class Test {

	Integer i;
	
	public static void main(String[] args) {

		String s;
		
		try {
			s=  new Test().i.toString();
		}finally {
			
			
		        	   try {
				            int i  = Integer.parseInt(args[0]); 
		          	   }catch(NumberFormatException e) {
				            System.out.println("NumberFormat");
			           }finally {
				            System.out.println("Fin 2");
			           }
		        	
                 System.out.println("Fin 1");			
	    	   }
		
	}

}
