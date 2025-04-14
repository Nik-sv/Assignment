package HashMap_Questions;

import java.util.HashSet;
import java.util.Scanner;

public class Union_of_2_arrays {

    public static void Union(int[] arr1, int[] arr2) {

        // step -> 1
        HashSet<Integer> set = new HashSet<>();
        // step -> 2
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            set.add(arr2[j]);
        }
        // step -> 3
        System.out.println(set.size());
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


        Union(arr1,arr2);


    }
}
