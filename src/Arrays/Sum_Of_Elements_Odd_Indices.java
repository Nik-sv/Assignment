package Arrays;

import java.util.Scanner;

public class Sum_Of_Elements_Odd_Indices {



    public static void Sum0fOddIndices(int[] arr){

        // Sum of Odd Indices


        int Sum = 0;
        for (int i = 1; i < arr.length; i += 2) {   // Only odd indices: 1, 3, 5, ...
            Sum += arr[i];
        }

        System.out.println("Sum of Odd Indicies are: " + Sum);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        Sum0fOddIndices(arr);



    }
}
