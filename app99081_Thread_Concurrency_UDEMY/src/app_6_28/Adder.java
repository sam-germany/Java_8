package app_6_28;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
//  before looking on this code think about app64_Factorials   how all the values goes in
//   "int sum";  and at the end  all the values will be stored in "sum" and it print total "sum"

public class Adder {
    private static long LIMIT = 1000000000;
    private static final int THREADS = 100;
 
    static class AdderTask extends RecursiveTask<Long> {
        long from;
        long to;
 
        public AdderTask(long from, long to) {
            this.from = from;
            this.to = to;
        }
 
        @Override
        protected Long compute() {
            if ((to - from) <= LIMIT/THREADS) {
                long localSum = 0;
                
                System.out.println(from +" "+to);
                
                for(long i = from; i <= to; i++) {
                    localSum += i;
                }
                return localSum;
            }
            else {
                long mid = (from + to) / 2;
                System.out.println(from+" "+mid+" "+to);                
                
                AdderTask first = new AdderTask(from, mid);
                AdderTask second = new AdderTask(mid +1, to);
                
                System.out.println(from+" "+mid+" "+to);
                
                first.fork();
                return second.compute() +first.join();
            }
        }
    }
 
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool(THREADS);
        long sum = pool.invoke(new AdderTask(1, LIMIT));
        System.out.printf("sum of the number from %d to %d is %d %n", 1, LIMIT, sum);
    }
}