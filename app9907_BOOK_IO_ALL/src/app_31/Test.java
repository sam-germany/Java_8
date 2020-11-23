package app_31;

import java.io.ByteArrayInputStream;
import java.io.InputStream;



public class Test {

	public int m1(byte [] data) throws Exception{
		try(InputStream is = new ByteArrayInputStream(data)){
			
System.out.println(     is.read()+"--"                 );  // 0  it start reading from first index  and hier the 
			
			if(!is.markSupported()) return 22;        //   as InputStream support mark()  so if() statement will not execute
			
System.out.println(     is.read(new byte[3])+"-----"   );  // 3    // now cursor jump to 3rd index and print value

System.out.println(		is.read()                      );  // 4

                        is.mark(1);                      //now cursor go to 5th index and we are marking 5th index
System.out.println(		is.read()                      );  // 5   now we are reading 5th index
	
			            is.skip(1);                 // after 5th cursor goes to 6 but .skip() we skip the 6
			            is.reset();                //  .reset() we call reset so the cursor goese where we
			                                       // we set mark. in this code we set mark at 5th index
		
			return is.read();              // now cursor is on 5th index and we read so 5  is printing again hier
			
		}}
	public static void main(String[] args) throws Exception {

		final Test p  = new Test();

		System.out.println(p.m1(new byte[] {0,1,2,3,4,5,6,7,8,9,10}));
		
		
		
		
		
	}

}