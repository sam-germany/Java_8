package app_4_3;

import java.util.TreeSet;

interface Measurement{
     public int getLength();
     
     public static int getBreadth() {
	  return 0;
}}
interface B extends Measurement{
	
}


public class Test implements B{

	public static void main(String[] args) {
		
		
	
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return 0;
	}
}
