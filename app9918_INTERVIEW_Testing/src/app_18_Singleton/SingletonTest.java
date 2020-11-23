package app_18_Singleton;

public class SingletonTest {

	private static SingletonTest instance1;
	
	private SingletonTest() {}
	
	
	
	
	public static  synchronized SingletonTest  getInstance1(){
                                 		if(instance1 == null){
		                                     	instance1 = new SingletonTest();
		                                                    }
		                    return instance1;
	                            }
	
}
/*
create a private static instance of same Class
define a private no-args constructor, so no body from outside access this class
create a static synchronized method , on every call of this method  make a check 
if already a object is created for this class, if yes then return that object
otherwise create a new object and return back. 


*/