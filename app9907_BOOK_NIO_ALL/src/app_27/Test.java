package app_27;

import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {

		
		System.out.println(Paths.get("../sang").getParent()  +"  - 1-");
		
		System.out.println(Paths.get("../sang").getParent().getParent() +"  - 2-");
		
 
	
        System.out.println(Paths.get("/sang").getParent().getRoot()  +"  - 3-");

        
        System.out.println(Paths.get("../sang").getRoot() +"  - 4-");
        
        System.out.println(Paths.get("/sang").getRoot()  +"  - 5-");
        
        System.out.println(Paths.get("/sang").getRoot().getRoot()  +"  - 6-");

        
        System.out.println(Paths.get("/sang").getParent()   +"  - 7-");
        
        System.out.println(Paths.get("../sang").getRoot().getParent()   +"  - 8-");

        
	}

}
