package app_6_43;

interface Eatable{
	int types = 10;
}

class Food implements Eatable{
	public static int types = 20;
}

public class Test extends Food implements Eatable{
        int types = 5;
	
	public static void main(String[] args) {
           
            Test t = new Test();
            System.out.println(t.types);
            
            System.out.println(Eatable.types);
		
            Food f = new Test();
            System.out.println(f.types);
            
	}

}
