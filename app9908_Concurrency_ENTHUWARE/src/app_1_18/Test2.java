package app_1_18;



import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Test2 {
	
	static ConcurrentHashMap<String, Object> chm = new ConcurrentHashMap<String, Object>();


	public static void main(String[] args) {
	     
		chm.put("a", "aaa");
		 chm.put("b", "bbb");
		 chm.put("c", "ccc");
		 
		 System.out.println(chm); 
			 
			 new Thread(){ 
				 public void run(){
		              Iterator<Entry   <String, Object>> it = Test1.chm.entrySet().iterator();
				 
				 while(it.hasNext()){
					 Entry<String, Object> en = it.next();
					 if(en.getKey().equals("a") || en.getKey().equals("b")){
							it.remove();
							System.out.println(chm);
		  				 } 
				 }}}.start();	 
	} }
/* (1) 	 Iterator<String, Object> it = Test2.chm.iterator();   this will not work as in 
 *  ConcurrentHashMap<>  .iterator() dose not defiend  
 
 (2)
     System.out.println(chm);  as output it give us complete EntrySet with all the values in one Set   
       {a=aaa, b=bbb, c=ccc} .   so as we define a  if() statement in between so  with  .remove()
       method when one  .getKey()  is matched then it delete the exact key-value  from this EntrySet
       
    






*/

