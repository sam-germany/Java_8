package app_1_28;

public class Test {

	 int i ;
	 int j;

	
	public double devide(int i, int j) {      // alloweed
		synchronized(this) {
			return (i/j);
		}}
	
	public void set (int i, int j) {          // alloweed
		synchronized(this) {
			this.i = i;
			this.j = j;
		}}
	
	
// only these 2 are alloweed , rest all defined are not alloweed ways to use synchronized keyword
	
//	synchronized(this)   means hier that when a instances is call for the current object then on that
//  object only one thread is alloweed to call  on the current object.
	
	public static void main(String[] args) {

	}

}
