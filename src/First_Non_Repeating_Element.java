//import java.util.Scanner;
//
//public class First_Non_Repeating_Element {
//
//    //   First non-Repeating
//
//    public static int Non_Repeating(int arr[]) {
//
//        int target = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    System.out.println(false);
//                } else {
//                    System.out.println(target);
//                }
//            }
//        }
//        return target;
//    }
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the number of Elements: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        System.out.println("Enter the elemnts");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//
//    }
//}









import java.util.Scanner;

public class First_Non_Repeating_Element {

    public static int Non_Repeating(int[] arr) {
        int n = arr.length;
        boolean isRepeating;

        for (int i = 0; i < n; i++) {
            isRepeating = false;

            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isRepeating = true;
                    break;
                }
            }

            if (!isRepeating) {
                return arr[i];  // Pehla non-repeating element mil gaya
            }
        }

        return -1; // Agar koi non-repeating element nahi mila
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = Non_Repeating(arr);

        if (result != -1) {
            System.out.println("First non-repeating element is: " + result);
        } else {
            System.out.println("No non-repeating element found.");
        }
    }
}

