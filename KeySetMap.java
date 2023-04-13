import java.util.HashMap;
import java.util.Map;

public class KeySetMap{

    public static void main(String[] args) {
    
        Map<String, Integer> map = new HashMap<>();
      
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }