package app_5_14;

class TooSmallexception extends RuntimeException{ }

class Divider{
	public double divide1(double d1, double d2) {
		if(d1 <0.01 || d2 < 0.01) {
			throw new TooSmallexception();
		}else {
			return (d1/d2);
		}
	}
}

public class Test {

	public static void main(String[] args) {

		Divider d = new Divider();
		
		double i = Double.parseDouble(args[0]);
		double j = Double.parseDouble(args[1]);
		
		
		double ans = d.divide1(i,j);
		System.out.println(ans);
		
	}

}
