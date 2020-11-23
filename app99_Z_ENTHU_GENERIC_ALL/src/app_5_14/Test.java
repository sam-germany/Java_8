package app_5_14;

class A<k>{
	
	public k pickOne(k k1, k k2) {
		
		System.out.println(k1.hashCode());   // return 1     as if we pass a .hashCode();  on int value then it
		System.out.println(k2.hashCode());               // return or we can say take the same int value as hashCode()
                                                           
		return k1.hashCode() < k2.hashCode() ? k1 :k2;      //Note:  but if we pass .hashCode() on a String value
	}                                                       //  "a".hashCode();  in this case a Java defineed 
}                                                           // hash value will be generated, or we can say the nr of the
                                                            /// bucket will be returned
public class Test {

	public static void main(String[] args) {

		A<Integer> t = new A<>();
		
		System.out.println(t.pickOne(1, 2).intValue() + 1);
		
		
	}

}
