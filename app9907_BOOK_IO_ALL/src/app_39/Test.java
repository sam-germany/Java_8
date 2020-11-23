package app_39;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
public class Test {

	public String reveiveTest2()  throws Exception{
		
		try(Reader r = new FileReader("D:\\Extra_Space_For_FOS_2\\messages1.txt")){
			StringBuilder s = new StringBuilder();
			int c;
			
			while((c = r.read())  != -1) {      //.read()  as we write on file ASCII valued of every character so 
				s.append((char)c);              // hier we are converting by typecasting the ASCII to char
			
				
				System.out.println(r.markSupported());     // false, just for checking purpose i print as FileReader
				if(r.markSupported()) {                     // does not support .mark() method
					r.mark(100);
					r.skip(10);
					r.reset();
					
				}}      
     return s.toString();
		}}
	
	public void sendText1(String message) throws Exception{
		
		try(Writer w = new FileWriter("D:\\Extra_Space_For_FOS_2\\messages1.txt")){
			
			for(int i = 0; i < message.length(); i++) {
				w.write(message.charAt(i));       //  .charAt(index) method  take the index value and retun the 
			}                                    // character on that index, and write that character on that file
		}}                                       // through  ASCII value
	public static void main(String[] args)  throws Exception{
		Test m = new Test();
		m.sendText1(" You up ? ");
		System.out.println(m.reveiveTest2());
		
	}

}
