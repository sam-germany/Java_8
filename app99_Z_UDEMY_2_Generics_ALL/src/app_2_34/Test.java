package app_2_34;

import java.util.Map;
import java.util.TreeMap;

enum TrafficLight {
    RED, YELLOW, GREEN
}
 
public class Test {
    public static void main(String[] args) {
        Map<TrafficLight, String> map = new TreeMap<>();
        map.put(TrafficLight.GREEN, "GO");
        map.put(TrafficLight.RED, "STOP");
        map.put(TrafficLight.YELLOW, "STOP IN 3 Seconds");
        map.put(TrafficLight.YELLOW, "READY TO STOP");
 
        for(String msg : map.values()) {
            System.out.println(msg);
        }
    }
}

// as   by default enum implements Comparable so hier   DNSO will come as output.