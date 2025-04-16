package Arrays;

import java.util.Scanner;

public class Palindrome_Array {


    public static boolean isPalindrome(int[] arr) {
        int i = 0 , j = arr.length - 1;

        while (i < j) {
           if (arr[i] != arr[j]) {
               return false;
            }

           i++;
           j--;
        }
        return true;
    }






    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Elemnts: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        if (isPalindrome(arr)) {
            System.out.println("Array is Palindrome ");
        } else {
            System.out.println("Array is NOT Palindrome");
        }
    }
}
