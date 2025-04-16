package HashMap_Basic;

import java.util.HashMap;
import java.util.Scanner;

public class Index_of_First_Repeating_Element {

    public static int firstOccurrence(int[] arr) {

        HashMap<Integer , Integer> map = new HashMap<>();
        int minIndex = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                minIndex = Math.min(minIndex, map.get(arr[i]));
            } else {
                map.put(arr[i], i);
            }
        }

        if (minIndex == Integer.MAX_VALUE) {
            return -1; // No repeating element
        }
        return minIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = firstOccurrence(arr);
        if (ans == -1) {
            System.out.println("No repeating element found.");
        } else {
            System.out.println("Index of first repeating element is: " + ans);
        }
    }
}
