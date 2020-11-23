package app_4_4;

enum Point{
	LOSS(0),
	WIN(2),
	TIE(1);
	
	private int points;
	
	private Point(int x) {
		points = x;
	}
	public int getPoints() {
		return points;
	}}
public class Test {
	public static void main(String[] args) {

		System.out.println(Point.WIN.ordinal());
		
		System.out.println(Point.WIN.getPoints());
	}

}
