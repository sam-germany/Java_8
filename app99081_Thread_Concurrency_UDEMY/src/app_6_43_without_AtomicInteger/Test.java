package app_6_43_without_AtomicInteger;

class Counter implements Runnable {
    private  static   int i = 3;
 
    public void run() {
        System.out.print(i--);
    }
}
 
public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Counter());
        Thread t2 = new Thread(new Counter());
        Thread t3 = new Thread(new Counter());
        Thread[] threads = {t1, t2, t3};
        for(Thread thread : threads) {
            thread.start();
        }
    }
}

/*  Question 1  as per explanation
 * 
 * 
Given program will print 3 digits but all 3 digits 
can be different or same as variable i is not accessed in synchronized manner.


*/

