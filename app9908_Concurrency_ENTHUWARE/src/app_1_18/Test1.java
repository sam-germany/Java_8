package app_1_18;



import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Test1 {
	
	static ConcurrentHashMap<String, Object> chm = new ConcurrentHashMap<String, Object>();


	public static void main(String[] args) {
	     
		chm.put("a", "aaa");
		 chm.put("b", "bbb");
		 chm.put("c", "ccc");
		 
		 System.out.println(chm +"--------");
		 
		 new Thread(){ 
			 public void run(){
			 Iterator<Entry   <String, Object>> it = Test1.chm.entrySet().iterator();
			 
          			 while(it.hasNext()){
			                   	 Entry<String, Object> en = it.next();
			                	 System.out.println(chm);
			                              }
			 }}.start();
				 
/* System.out.println(chm);	    {a=aaa, b=bbb, c=ccc}      it prints  every time like this
 
 so as it iterate()  3 times  so hier   3 times we  see this on console
				 
*/			     

	} }