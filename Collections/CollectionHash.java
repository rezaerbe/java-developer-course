package Collections;

import java.util.HashMap;
import java.util.Map;

public class CollectionHash {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "John");
        map.put(2, "Jena");
        map.put(3, "Laya");

        System.out.println(map.get(1));

        for (Map.Entry m:map.entrySet()) {
            System.out.println("key: " + m.getKey() + " value: "+ m.getValue());
        }
        
        map.put(1, "John Doe");
        System.out.println(map.get(1));

        map.remove(1);
    }
    
}