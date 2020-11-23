package app_2_03;

class Printer<String> {
    private String t;
    Printer(String t){
        this.t = t;
    }
    public java.lang.String toString() {   //   the main point is Printer<String>  or Printer<T>  both are same
        return null;                         //  the point to understand is  as we define a toString(); method
    }                                        //  this method is not related to Generic type <String>  it is related
}                                            // to the Printer class not to the Generic type <String>
                                                // 
public class Test {                              // as to use toSting() method we need to import java.lang.String
    public static void main(String[] args) {        // package , as we import it then the error goes,  
        Printer<Integer> obj = new Printer<>(100);  // as we use Generic Type <String as parameter so we can do 
        System.out.println(obj);                    // normal   import  like we always do
    }                                               // import java.lang.String   so we have to do like this                              
                    
}                                                  // it shows clearly that this toString() method is connected to 
                                                      //Printer class not to  Generic type <String>