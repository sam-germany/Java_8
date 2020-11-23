package app_5_70;

import java.util.List;

class Bobby { }

class Dooby extends Bobby { }

class Tooby extends Dooby { }

public class Test {
	
	
		
	
	     Bobby b = new Bobby();
	     Tooby t = new Tooby();
//      Object e = new Object();
	
	
	
	public void addData1(List<? super Dooby> dataList) {
		dataList.add(t);
	}
	
	public void addData2(List <? extends Dooby> dataList) {
		b =  dataList.get(0);
	}

}/* read the explanation carefully, easy to understad, first understand his old examples then it is very easy to 
   understand , this is a very important example

  b =  dataList.get(0);   do not missunderstand, the main point is from this  <? extends Dooby>   we can get only
  
  Dobly object or a object of its subclasses.   but for the returned object we can give a refrence type 
  any Super class of  Dobbly  this we can do, as we can do like this always, just draw in mind.

*/