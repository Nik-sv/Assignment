package HashMap_Questions;

import java.util.HashMap;
import java.util.Scanner;

public class Majority_Element {




    public static void majorityElement(int[] arr) {

        // Step -> HashMap
        HashMap<Integer , Integer> map = new HashMap<>();

        // Step -> Find Frequency of all elements and store in map
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {  // true
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {  // false
                map.put(arr[i], 1);
            }
        }

        // step 3 -> Advance loop
        for (int key : map.keySet()) {
            if (map.get(key) > arr.length/ 3) {
                System.out.println(key);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       majorityElement(arr);

    }
}
