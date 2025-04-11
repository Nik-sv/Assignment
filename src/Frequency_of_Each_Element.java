//import java.util.Scanner;
//
//public class Frequency_of_Each_Element {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the Number of Elements: ");
//        int n = sc.nextInt();
//
//
//        int[] arr = new int[n];
//        System.out.println("Enter the Elements: ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (arr[i] == j) {
//                    count++;
//                }
//            }
//        }
//
//        System.out.println("Frequency of each ELement is: " + count);
//    }
//}









//
//import java.util.Scanner;
//
//public class Frequency_of_Each_Element {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the Number of Elements: ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//        System.out.println("Enter the Elements: ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        // Count frequency for each Element
//        for (int i = 0; i < n; i++) {
//            boolean visited = false;
//
//            // Check if the Element is already counted
//            for (int j = 0; j < i; j++) {
//                if (arr[i] == arr[j]) {
//                    visited = true;
//                    break;
//                }
//            }
//
//            // Skip the element if already counted
//            if (visited)
//                continue;
//
//
//            int count = 1;
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//                }
//            }
//
//            System.out.println(arr[i] + ": " + count);
//        }
//
//    }
//}








// Optimal / Standard Approach (Using HashMap)







import java.util.Scanner;

public class Frequency_of_Each_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        boolean[] visited = new boolean[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Element : Frequency");
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                }
                visited[j] = true;
                    count++;
            }

            System.out.println(arr[i] + " : " + count);
        }
    }
}









//import java.util.*;
//
//public class Frequency_of_Each_Element {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of elements: ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//        System.out.println("Enter elements: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        // Using HashMap to store frequencies
//        Map<Integer, Integer> freqMap = new HashMap<>();
//
//        for (int num : arr) {
//            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
//        }
//
//        // Print frequencies
//        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//    }
//}



