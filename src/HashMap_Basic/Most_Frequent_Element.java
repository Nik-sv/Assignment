//package HashMap_Basic;
//
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class Most_PFrequent_Element {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (map.containsKey(arr[i])) {
//                 map.put(arr[i], map.get(arr[i]) + 1);
//            } else {
//                map.put(arr[i] , 1);
//            }
//        }
//
//        // Step 3: Find the element with maximum frequency
//        int maxFreq = 0;
//        int mostFrequencyElement = -1;
//
//        for (int key: map.keySet()) {
//            int freq = map.get(key);           // Frequency of current key
//            if (freq > maxFreq) {
//                maxFreq = freq;               // Update max frequency
//                mostFrequencyElement = key;   // Store current key as a most frequent element
//            }
//        }
//
//
//        // Step 4: Output
//        System.out.println("Most Frequent Element: " + mostFrequencyElement);
//        System.out.println("Frequency: " + maxFreq);
//    }
//}










package HashMap_Basic;

import java.util.HashMap;
import java.util.Scanner;

public class Most_Frequent_Element {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input array
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 2: Create HashMap to store frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                // If already present, increase frequency
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                // First time seen, set frequency to 1
                map.put(arr[i], 1);
            }
        }

        // Step 3: Find the element with the maximum frequency
        int maxFreq = 0;
        int mostFrequentElement = -1;

        for (int key : map.keySet()) {
            int freq = map.get(key);  // Frequency of current key
            if (freq > maxFreq) {
                maxFreq = freq;                // Update max frequency
                mostFrequentElement = key;     // Store current key as most frequent
            }
        }

        // Step 4: Output
        System.out.println("Most Frequent Element: " + mostFrequentElement);
        System.out.println("Frequency: " + maxFreq);
    }
}

