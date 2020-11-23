package app_3_49;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Account{
	private String id;
	private double balance;
	public Account(String id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
            @Override
            public String toString() {
            	return id +" "+balance;
            }
}     
public class Test implements Runnable{
	 
	Account from;
	Account to;
	double amount;
	
	public Test(Account from, Account to, double amount) {
		this.from = from;
		this.to = to;
		this.amount = amount;
	}
	@Override
	public void run() {
		  synchronized(from) {
			  from.setBalance(from.getBalance() - amount);
			  System.out.println(from.getBalance());
			  synchronized(to) {
				  to.setBalance(to.getBalance() + amount);
				  System.out.println(to.getBalance());
			  }}}
	
	public static void main(String[] args) {

		ExecutorService es = Executors.newCachedThreadPool();  // just draw in mind that we have 2 objects in
		Account sunny = new Account("Sunny", 1000);                // heap memory and all we are doing on 2
		Account bunny = new Account("Bunny", 1000);               // different objects, Sunny, Bunny
		
		es.submit(new Test(sunny, bunny ,200));     // .submit(Runnable task);  this method takes
		es.submit(new Test(bunny, sunny ,300));     // Runnable task as argument.
		
		System.out.println(sunny.getId()+" === "+sunny.getBalance());
		System.out.println(bunny.getId()+" --- "+bunny.getBalance());
		
		es.shutdown();
	}}
/*
700.0
Sunny === 1000.0
Bunny --- 700.0
800.0

this may be a type of output we can get. their are 2 point need to understand
(1) assuse we have 2  different object in Heap memeory. Sunny, Bunny, 
    and we want to transfer  200 from sunny to bunny
    and we want to transfer  300 from bunny to sunny
    
    like this if we have scenario, then as the above given code we have 2 different threads doing this process
    just draw in mind that 
    for t1 thread  Sunny (from) , Bunny (to)
    for t2 thread  Bunny (from), Sunny(to)
                                               it shows that for both we are using the same code Synchronized()
    methods.if i draw till this in mind then it is easy to understand now
    t1 execute it cut 200 from Sunny object and try to add 200 in Bunny object,
    but at same time t2 execute Bunny object and it cut 300 from Bunny account and try to add in Sunny
    
    but as show in .run() method  Sunny (from) object already cut the money and try to add in Bunny(to) 
    but as Bunny executed by t2 is busy so in this condition both the threads wait for each other
 (2) 
 as shown above    
      700.0                  ---- t1-- thread
      Sunny === 1000.0       ---- main thread
      
      no need to think about so much as 700 will be printed by t1 thread and after cutting the data is still in 
      the cache memory of processor, and before it update to main memory, main-Thread exectutes and any print
      the syso()  so it print still the old value which is defined at the time of creating object
      
     this is the reason. 
    


*/