package app_4_38;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
	
  static Path p1 =  Paths.get("C:\\a\\b\\c");
  
  public static String getValue1() {
		
		String x = p1.getName(0).toString();
		String y = p1.subpath(0, 1).toString();
		
		return x +" "+y;
	}
	public static void main(String[] args) {

		System.out.println(getValue1());

		
		
		
	}

}
