package HashMap_Questions;

import java.util.HashSet;
import java.util.Scanner;

public class Intersection_of_2_arrays {

     public static int Intersection(int[] arr1, int[] arr2) {

         HashSet<Integer> set = new HashSet<>();  // step -> 1

         for (int i = 0; i < arr1.length; i++) {  // step -> 2
             set.add(arr1[i]);
         }

         int count = 0;
         for (int j = 0; j < arr2.length; j++) {
             if (set.contains(arr2[j])) count++;  // main working
             set.remove(arr2[j]);

         }
         return count;   // return intersection
     }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements arr1 : ");
        int n  = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the number of elements in second arr2: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int result = Intersection(arr1,arr2);
        System.out.println("Intersection count: " + result);

    }
}
