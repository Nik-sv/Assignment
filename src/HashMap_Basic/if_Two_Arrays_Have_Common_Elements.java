package HashMap_Basic;

import java.util.HashMap;
import java.util.Scanner;

public class if_Two_Arrays_Have_Common_Elements {

    public static boolean Common_Elements(int[] arr1, int[] arr2) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        // Store elements of arr1 in map
        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], true);
        }


        // Check if any element in arr2 is present in map
        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i])) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        if(Common_Elements(arr1,arr2)) {
            System.out.println("Common elements(s) exist");
        } else {
            System.out.println("No common elements");
        }


    }
}
