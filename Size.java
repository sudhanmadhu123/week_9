import java.util.HashMap;
import java.util.Map;

public class Size{
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        map.put("Rocky", 45);

        int size = map.size();

        System.out.println("The size of the map is: " + size);
    }
}