package app_6_01;

class Counter implements Runnable {
    private static int i = 3;   
 
    public void run() {
        System.out.print(i--);
    }
}
 
public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Counter());
        Thread t2 = new Thread(new Counter());
        Thread t3 = new Thread(new Counter());
        
        Thread[] thr1 = {t1, t2, t3};
        
        for(Thread thr2 : thr1) {
            thr2.start();
        }
    }
}
/* must draw in mind how this code executes, 
(1) first output can be  312      as t1 executes first make the i--  from 3 to 2 and print  
   after that come t2 make the  i-- from 2 to 1  but it do not go for printing, inbetween come t2 and
   make the i-- value from 1 to o  and print 1 , at end t2 come for printing and print 2   
   in this situation we will get output as 312

(2) we can get the output as 333 also
   assume t1  executes first and make i-- from 3 to 2 and it want to print 3 as output inbetwee
   when t1 try to make i-- from 3 to 2 in between t2,t3 comes as t1 was busy in making i--  from 3 to 2
   t2,t3 goes for printing , but before t2,t3 tries to print  t1 makes i-- value 3 to 2   
   now  i-- = 2  but in next iteration it will print  2 but as   all the 3 threads are in between this
   gap of  static int i=3  and syso(i--) , hier in this condition all the 3 threads will print  333 as output
   

*/