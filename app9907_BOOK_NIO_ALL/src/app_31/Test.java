package app_31;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public Path  m1(Path p) {
		Path v = null;
		
		for(int i = 0; i<p.getNameCount(); i++) {

			System.out.println(p.getNameCount()+"----");  // this i put for understanding
			
			if(v== null) {
			    	v = p.getName(i);
			    System.out.println(v.getName(i));	 // this i put for understanding
			    	
		   }else {
	    		v = v.resolve(p.getName(i));
	    		System.out.println(v +"===");
		   }
		}

		return v;
	}
	public static void main(String[] args) throws Exception{
         
		final Test t = new Test(); //0       1        2            index nr
		Path original = Paths.get("/tissue/heart/chambers.tst");
		
		Path repaired = t.m1(original);
		
		System.out.println(original.equals(repaired));
		
		
		
	}

}
