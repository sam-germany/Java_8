package app_1_71;

import java.util.concurrent.RecursiveTask;

class ComplicatedTask extends RecursiveTask<Integer>{
	
       int[] ia;
       int from; 
         int to;
    public ComplicatedTask(int[] ia, int from, int to){
        this.ia = ia;
        this.from = from;
        this.to = to;
    }
    public int transform(int t){
      //this is a CPU intensive operation that
      //transforms t and returns the value
    	return 0;
    }
    protected Integer compute() {
        if(from == to){
            return transform(ia[from]);
        }
        else if(from+1==to){
            return transform(ia[from])+transform(ia[to]);
        }
        else{
            
            int mid = (from+to)/2;
            ComplicatedTask newtask1 = new ComplicatedTask(ia, from, mid);
            ComplicatedTask newtask2 = new ComplicatedTask(ia, mid+1, to);
            newtask1.fork();

            int x = newtask2.compute();  //LINE A
            int y = newtask1.join(); //LINE B

            return x+y;
        }
    }
}
public class Test{
	public static void main(String[] args) {

		
		
		
		
		
	}
}

