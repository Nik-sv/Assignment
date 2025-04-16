package Arrays;

import java.util.Scanner;

public class Sum_Of_Elements_OddEven {


    public static void PrintSumOfOddandEven(int[] arr){

        int SumOdd = 0;
        int SumEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                SumOdd += arr[i];
            } else if (arr[i] % 2 == 0){
                SumEven += arr[i];
            }
        }

        System.out.println("Sum of the Odd elements in the Array: " + SumOdd);
        System.out.println("Sum of the Even Elements Of the array: " + SumEven);


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        PrintSumOfOddandEven(arr);
    }
}
