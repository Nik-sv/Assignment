//import java.util.Scanner;
//
//public class Largest_Sum_Of_Any_Two_Elements {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the number of elements: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter the Elements: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//
//        // Largest Sum Of Any Two Elements
//        int largest = Integer.MIN_VALUE;
//        int Secondlargest = Integer.MIN_VALUE;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > largest) {
//                Secondlargest = largest;
//                    largest = arr[i];
//            } else if (arr[i] > Secondlargest && arr[i] != largest ) {
//                    Secondlargest = arr[i];
//            }
//
//            for (int j = i + 1; j < arr.length; j++) {
//
//                int diff = largest - Secondlargest;
//                if (diff > 1) {
//                    int Sum = largest + Secondlargest;
//                    while(Sum < largest) {
//
//                        System.out.println("Missing Number: " + Sum);
//
//                    }
//                }
//            }
//        }
//
//
//
//
//
//
//    }
//}









//import java.util.Scanner;
//
//public class Largest_Sum_Of_Any_Two_Elements {
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
//        if (n < 2) {
//            System.out.println("Need at least two elements to find the sum.");
//            return;
//        }
//
//        int largest = Integer.MIN_VALUE;
//        int secondLargest = Integer.MIN_VALUE;
//
//        for (int num : arr) {
//            if (num > largest) {
//                secondLargest = largest;
//                largest = num;
//            } else if (num > secondLargest) {
//                secondLargest = num;
//            }
//        }
//
//        int sum = largest + secondLargest;
//        System.out.println("Largest sum of any two elements: " + sum);
//    }
//}
//






import java.util.Scanner;

public class Largest_Sum_Of_Any_Two_Elements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the number of Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Largest Sum of any two elements


        int largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                SecondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > SecondLargest && arr[i] != largest) {
                arr[i] = SecondLargest;
            }

        }

        int Sum = largest + SecondLargest;
        System.out.println("The Sum of two largest and Second Largest Element is : " + Sum);
    }
}







