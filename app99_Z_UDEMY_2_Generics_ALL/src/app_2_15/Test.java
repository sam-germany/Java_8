package app_2_15;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<? super String> l = new ArrayList<>();
        l.add("A");
        l.add("B");
        
        
        for(Object str : l) {        // we replaced  for(String str : l)     to     for(Object str : l)            
            System.out.print(str);        //  List<? super String>   return     super type as Object type
        }
    }
}