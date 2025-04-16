package Arrays;

import java.util.Scanner;

public class Common_Elements_between_two_Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the First Array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        System.out.println("Enter the Elements of the first Array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of the Second Array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];

        System.out.println("Enter the Elements of the Second Array: ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

//        System.out.println("Common Elements between both the Arrays: ");
//        int r = sc.nextInt();
//        int[] resultent = new int[r];
//
//        for (int i = 0; i < r; i++) {
//            resultent[i] = sc.nextInt();
//        }

        // Common Elements Between two arrays


        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
              if (arr1[i] == arr2[j]) {
                  System.out.println("Common Element: " + arr2[j]);
              }
            }
        }


    }
}
