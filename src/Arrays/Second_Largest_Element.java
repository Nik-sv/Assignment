package Arrays;

import java.util.Scanner;

public class Second_Largest_Element {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Elements: ");
        for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;    // 0 Problematic hai -ve values k liye
        int SecoandLargest = Integer.MIN_VALUE;   // 0 Problematic hai -ve values k liye
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
               SecoandLargest = largest;
                largest = arr[i];
            } else if (arr[i] > SecoandLargest && arr[i] != largest) {
                SecoandLargest = arr[i];
            }
        }


       if (SecoandLargest == Integer.MIN_VALUE) {
           System.out.println("There is no second largest element");
       } else {
           System.out.println("Secoand Largest Element: " + SecoandLargest);
       }


    }
}
