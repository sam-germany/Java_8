package app_13;
import java.io.BufferedReader;
import java.io.File;
import java.io.Writer;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void copy1(Path source, Path target) throws Exception{
		
		try(    BufferedReader r = Files.newBufferedReader(source); 
				Writer w = Files.newBufferedWriter(target)           )   // as we know if the b.txt is now created then
		  {                                                             // newBufferedWriter() will create a new file
			String temp = null;                                        // and write the data on it.
			
			while((temp = r.readLine()) != null) {
				w.write(temp);
			}
		}
	}
	
	
	public static void main(String[] args) throws Throwable{
		
		Test.copy1(   Paths.get("D:\\Extra_Space_For_FOS\\a.txt"), 
				           FileSystems.getDefault().getPath("D:\\Extra_Space_For_FOS", "b.txt")     );
		
	    } 
	} 
// Test.copy1()  in this method we define 2 ways to get a Path instance  check them
// at end the data of    a.txt    will be copied to      b.txt


