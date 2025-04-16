package Arrays;//import java.util.Scanner;
//
//public class Arrays.Even_and_Odd {
//
//
//    public static int EvenOdd(int[] arr , int n) {
//        // Count the number of Even and odd Elements
//        for (int i = 0; i < arr.length; i++) {
//            if (n % 2 == 0) {
//                System.out.println("The number is even: " + n);
//            } else if (n % 2 != 0) {
//                System.out.println("the number is odd: " + n );
//            }
//        }
//        return n;
//    }
//
//
//
//
//
//
//
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the number of elements: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        System.out.println("Enter the elements: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//
//
//        if (n <= -1) {
//            System.out.println(" The number not found: ");
//        } else {
//            System.out.println(" The number of even and odd is " + EvenOdd(arr , n));
//        }
//
//
//
//
//
//
//
//
//    }
//}


import java.util.Scanner;

public class Even_and_Odd {



    public static void CountEvenOdd(int[] arr){

        // Count the number of Even and Odd
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        // Output
        System.out.println("The Number of Even elements: " + countEven);
        System.out.println("The Number of Odd elements: " + countOdd);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the  number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the number of Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        CountEvenOdd(arr);



    }
}

















