package app_64;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {
		
//                               1  2  3         index number
		Path p1 = Paths.get("F:\\A\\B\\C");
		
		System.out.printf("%d, %s %s", p1.getNameCount(), p1.getFileName(), p1.getName(1));
		
		
	}

}
// Read last line of explanation