package app_07b_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {
		
		Country india = new Country("India",1000);
		Country japan = new Country("India",10000);  // for understand i put hier also "India" normally 4 objects are 
	   Country france = new Country("France",2000);  //created, but as we try to put them in HashMap<>() 
	   Country russia = new Country("Russia",20000);    //as it does not take  duplicate keys,  so we  putted the 
 				                                        // hashCode() so see how the output comes
	   
	   
	   
          HashMap<Country, String> hm = new HashMap<Country, String>();  
              hm.put(india,"Delhi");         // so at the time of creating "new Country()"  i put same "name" then
              hm.put(japan,"Tokyo");         // HashMap  will see both these objects as equal  so first it insert
              hm.put(france,"Paris");         //   India,Delhi    but after that japan  count as same object so
              hm.put(russia,"Moscow");  	 // as we use .put() method then it just replace the value of the existing		 
                                             // object key  this is the reason   inoutput  Inida---Tokyo we get
              
              
              for(Country  ck : hm.keySet()) {
            	  System.out.println(ck  +"---"+hm.get(ck));
              }
              System.out.println("-------------------------");
              
              
		Iterator   it = hm.keySet().iterator(); 
		while( it.hasNext())  {  
       		Country c=  (Country) it.next();  
 		    String cap=  hm.get(c);            // as Map.get( key );    method return the value for the given key
 		 System.out.println(c.getName()+"----"+cap);  
		}  

		
		System.out.println("=========================");
		
		
		
		
		Iterator<Entry<Country,String>>  et = hm.entrySet().iterator();
        while(et.hasNext()) {
        	Entry<Country,String> entry1 =  et.next();
        	System.out.println(entry1.getKey()+"  "+entry1.getValue());
        }
		
		
	}
} 