package Javabasics;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> studentScores = new HashMap<>();

        // Adding key-value pairs
        studentScores.put("Alice", 90);
        studentScores.put("Bob", 85);
        studentScores.put("Charlie", 92);
        studentScores.put("David", 88);

        // Accessing elements
        System.out.println("Bob's score: " + studentScores.get("Bob"));

        // Iterating over the entries
        System.out.println("\nAll student scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Checking if a key is present
        String studentName = "Alice";
        if (studentScores.containsKey(studentName)) {
            System.out.println("\n" + studentName + "'s score: " + studentScores.get(studentName));
        } else {
            System.out.println("\n" + studentName + " not found in the map.");
        }

        // Removing a key-value pair
        studentScores.remove("David");
        System.out.println("\nAfter removing David's score:");

        // Iterating again after removal
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

       
    }

}
