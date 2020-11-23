package app_2_04;

class GenericPrinter<T> {}




abstract class AbstractGenericPrinter<X,Y,T> extends GenericPrinter<T>{}
     
// as the Type   (T) is not defined so we must pass it as we are passing to this abstract class <X,Y,T>
// T must  be hier
 

abstract class AbstractGenericPrinter2<X,Y> extends GenericPrinter<String>{}
                                                                             
//  hier we defined the Type (T) parameter as <String>   so now we do not need to redefine it hier    <X,Y>                                                  
// the compile assume for class GenericPrinter<T>    as  class GenericPrinter<String>




abstract class AbstractGenericPrinter3 extends GenericPrinter<String>{}

// hier also same if we define the (T) parameter as String so we do not need to redefine in the extending class again






public class Test {

}
