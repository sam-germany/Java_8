package app_15;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public boolean m1() {
		Path p1 = Paths.get("D:\\Extra_Space_For_FOS_2\\aa\\1.txt");
		Path p2 = Paths.get("D:\\Extra_Space_For_FOS_2\\aa\\cc\\..\\.");
		
		Path p3 = p2.resolve("1.txt");
		
		return p1.equals(p3.normalize());
	}

	public static void main(String[] args) {

		System.out.println("--"+ (new Test().m1() ? "Yes" : "NO"));
		
		
	}

}
// note in the BOOK  in this example he do not store the  retued path that come form  .resolve() method
// but hier we are storing it.
