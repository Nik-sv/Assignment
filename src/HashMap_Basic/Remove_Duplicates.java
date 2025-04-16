package HashMap_Basic;//package HashMap_Basic;
//
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.Scanner;
//
//public class Remove_Duplicates {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int[] arr =new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
////        HashSet<Integer> set = new HashSet<>();
////
////        for (int i = 0; i < arr.length; i++) {
////            System.out.println(set.add(arr[i]));
////        }
////
////        Iterator it = set.iterator();
////
////        while (it.hasNext()) {
////            System.out.print(it.next() + " ");
////        }
//
//        HashMap<Integer, Boolean> map = new HashMap<>();
//
//        for (int i = 0; i < arr.length; i++) {
//           if (!map.containsKey(arr[i])) {
//               map.put(arr[i], true);           // Store the Elements as key
//               System.out.print(arr[i] + " ");  // print the Element
//           }
//        }
//
//
//    }
//}




// Approach 1: Using HashSet (Best for Simplicity)

//import  java.util.*;
//
//public class Remove_Duplicates {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr =new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//
//        HashSet<Integer> set =  new HashSet<>();
//        for (int num : arr) {
//            set.add(num);  // Duplicates will be ignored directly
//        }
//
//        System.out.println(set);  // output
//    }
//}





// Approach 2: Using HashMap (Keys store unique elements)

import java.util.*;

public class Remove_Duplicates{
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4};

        Map<Integer, Boolean> map = new LinkedHashMap<>();
        for (int num : arr) {
            map.put(num, true);  // Keys will be unique
        }

        System.out.println(map.keySet());  // Output: [1, 2, 3, 4]
    }
}




