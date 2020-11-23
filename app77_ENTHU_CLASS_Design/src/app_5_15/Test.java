package app_5_15;

interface Classic {
	int version = 1;

	public void read();
}

public class Test implements Classic {
	int version = 2;

	@Override

/*	public void read() {
		System.out.println(version);
	}
*/

   public void read() {
		System.out.println(   ((Classic)this).version  );
		
		System.out.println(Classic.version);
		
	 System.out.println(new Test().version);
	}
	
	
	public static void main(String[] args) {

      Test t = new Test();
      t.read();
		
	}

}
