import java.util.HashMap;
import java.util.Map;

public class MapCopyExample {
    public static void main(String[] args) {
        // create the first map
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 1);
        map1.put("banana", 2);
        map1.put("orange", 3);

        // create the second map
        Map<String, Integer> map2 = new HashMap<>();

        // copy all the key-value pairs from map1 to map2
        map2.putAll(map1);

        // print out the contents of map2 to verify the copy
        System.out.println("Map 2: " + map2);
    }
}