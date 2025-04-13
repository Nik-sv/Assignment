//import java.util.Scanner;
//
//public class Positive_Number {
//
//    // Array Contain Only Positive Number
//
//    public static boolean isPositive(int[] arr) {
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) {
//                return true;
//            }
//        }
//
//        return false;
//    }
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
//        System.out.println("Enter the number of Elements: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        System.out.println("Enter the Elements: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//
//        isPositive(arr);
//
//
//
//    }
//}








import java.util.Scanner;

public class Positive_Number {

    // Check if all elements are positive
    public static boolean isPositive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (isPositive(arr)) {
            System.out.println("All elements are positive.");
        } else {
            System.out.println("Array contains non-positive elements.");
        }
    }
}

