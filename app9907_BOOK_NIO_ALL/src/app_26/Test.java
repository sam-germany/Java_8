package app_26;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	/*
	public void tendGarden(Path p ) throws Exception{
		          Files.walk(p,1)
		                    .map(x -> x.toRealPath())
		                    .forEach(System.out::println);
	}
	
	public static void main(String[] args) throws Exception{

		new Test().tendGarden(Paths.get(args[0]));
	*/	
	
	public void tendGarden(Path p ) throws Exception{
          		Files.walk(p,1)
		                   .map(x -> {
		                             	try {
			                             	return x.toRealPath();
		                                 } catch (IOException e) {
				                            e.printStackTrace();
			                             }
			                          
		                             	return x;
		                  
		                          }).forEach(System.out::println);
	}
	
	public static void main(String[] args) throws Exception{

		new Test().tendGarden(Paths.get(args[0]));
		
	}

}
