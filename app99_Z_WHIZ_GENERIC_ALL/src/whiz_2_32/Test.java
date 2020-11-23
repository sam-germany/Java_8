package whiz_2_32;

import java.util.HashMap;

public class Test {

	public static  void main(String[] args) {

		HashMap  c1 = new HashMap<>();
		
        c1.put(2, "sharma");
        c1.put(3, "naveen");
        c1.put(1, "livera");
        
        c1.replace(3, "naveen", "kkkk");
        
        c1.remove(3, "naveen");  
        
        
        System.out.println(c1);
		
	}

}
