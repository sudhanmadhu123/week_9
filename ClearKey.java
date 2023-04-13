import java.util.Map;
import java.util.HashMap;

public class ClearKey {
    public static void main(String[] args) {
       
        Map<String, Integer> map = new HashMap<>();

        map.put("Sagar", 25);
        map.put("john", 30);
        map.put("Mary", 35);

        System.out.println("Map before clearing: " + map);

        map.clear();

        System.out.println("Map after clearing: " + map);
    }
}