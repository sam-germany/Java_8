package app_3_81;



public class PlaceHolder<K, V> {
    private K k;
    private V v;
    public PlaceHolder(K k, V v){
        this.k = k;
        this.v = v;
    }
   
   
    @Override
	public String toString() {
		return "PlaceHolder [k=" + k + ", v=" + v + "]";
	}
    
	public static <X> PlaceHolder<X, X> getDuplicateHolder(X x){
        return new PlaceHolder<X, X>(x, x);
    }
    
    public static void main(String[] args) {
    
      PlaceHolder<String, String> ph1 = PlaceHolder.getDuplicateHolder("b"); //1
      System.out.println(ph1);
      
      PlaceHolder<String, String> ph4 = new PlaceHolder<>("a", "b"); //4
      System.out.println(ph4);
      
      PlaceHolder<?, ?> ph5 = new PlaceHolder(10, 10); //5
      System.out.println(ph5);
    }
}
