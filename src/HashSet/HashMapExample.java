package HashSet;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store student names and their grades
        HashMap<String, Integer> grades = new HashMap<>();

        // Add key-value pairs
        grades.put("Nikhil", 90);
        grades.put("Abhishek", 75);
        grades.put("Prashant", 85);

        // Get value using key
        System.out.println("Nikhil's grade: " + grades.get("Nikhil"));   // Output: 90

        // Remove a key-value pair
        grades.remove("Abhishek");


        // Check if a key exists
        if (grades.containsKey("Prashant")) {
            System.out.println("Prashant is in the map.");
        }

        // Size of HashMap
        System.out.println("Size of HashMap: " + grades.size());  // Output: 2


        // Print all key-value pairs
        for (String student : grades.keySet()) {
            System.out.println(student + ": " + grades.get(student));
        }


    }
}
