import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        hashMap.put("John", 32);
        hashMap.put("Alice", 27);
        hashMap.put("Bob", 45);
        hashMap.put("Lisa", 29);

        // Print the HashMap
        System.out.println("HashMap: " + hashMap);
    }
}