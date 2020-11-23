package app_06;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public void m1(Path desiredPath) throws Exception{
		
		Path suggestedPath = Paths.get("D:\\Extra_Space_For_FOS\\mmFolder");
	
	if(Files.isSameFile(suggestedPath,  desiredPath) && Files.exists(suggestedPath)) {
	//	Files.createDirectories(desiredPath);
		System.out.println("----------");
	}
	
	}
	
	
	public static void main(String[] args) throws Exception{

		
		Path w  = new File("D:\\Extra_Space_For_FOS\\A").toPath();
	  
		new Test().m1(w);
	}

}
//  Note:  the main point is Files.isSameFile(path_1, path_2);   this method take Path as argument
//         if we do not pass the PATH   that are same then this method() with throw a exception
//      to avoid this situation just put it in try/catch block.