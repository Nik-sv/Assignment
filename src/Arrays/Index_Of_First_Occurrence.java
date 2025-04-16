package Arrays;

import java.util.Scanner;

public class Index_Of_First_Occurrence {


    public static int FirstOccurrence(int[] arr , int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  // index of first occurrence
            }
        }
        return -1;  // if not found
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

        System.out.println("Enter your target number: ");
        int target = sc.nextInt();



//         Index of First Occurrence
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == m) {
//                System.out.println(m);
//            }
//         }

           int index = FirstOccurrence(arr , target);


           if (index != -1) {
               System.out.println(" First occurrence of " + target + " is at index: " + index);
           } else {
               System.out.println(target + " not found in the array. ");
           }


    }
}
