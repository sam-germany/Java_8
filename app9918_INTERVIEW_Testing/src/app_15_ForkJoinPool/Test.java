package app_15_ForkJoinPool;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;


class UtilityClass1{
	
	public static int m1(int x) {
		return x + 1;
	}}


class A1 extends RecursiveAction{
	
	int[] ia;
	int from;
	int to;
	
	public A1 (int[] ia, int from, int to) {
		this.ia = ia;
		this.from = from;
		this.to = to;
	}

	@Override
	protected void compute() {
      
		if(from == to) {
			System.out.println(from+" "+to);
			
			ia[from] = UtilityClass1.m1(ia[from]);
		
		}else {
			int mid = (from+to)/2;
			System.out.println(from+" "+mid+" "+to);
			
             A1 newtask1 = new A1(ia, from, mid);
             A1 newtask2 = new A1(ia, mid+1, to);
             
             newtask2.fork();
             newtask1.compute();
             newtask2.join();
		}}}
public class Test {
	public static void main(String[] args) {

	   int ia[]   = new int[] {1,2,3,4,5,6,7};
	   
	   ForkJoinPool fjp = new ForkJoinPool();
	   A1 st = new A1(ia, 0,6);
	   fjp.invoke(st);
	   
	   System.out.println("New Array Values  ...");
	   
	   for(int i:ia) {
		   System.out.println(i +" ");
	   }}}