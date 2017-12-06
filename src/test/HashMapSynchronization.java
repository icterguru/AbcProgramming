package test;
import java.util.*;

public class HashMapSynchronization {
    public static void main(String[] args) {
        // create map
        Map<String,String> map = new HashMap<String,String>();
        
        // populate the map
        map.put("1","ALIVE ");
        map.put("2","IS");
        map.put("3","DONE");
        map.put("4","AWESOME");
      
        map.put("5","????");
        
        map.put("6","NONE");
        
        // create a synchronized map
        Map<String,String> syncMap = Collections.synchronizedMap(map);
        
        System.out.println("Synchronized map :"+syncMap);
    }
}