import java.util.Scanner;

public class Check_for_Duplicate_Elements {


   public static boolean hasDuplicates(int[] arr) {
       for (int i = 0; i < arr.length; i++) {
           for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;  // Duplicate Found
                }
           }
       }
       return false;   // Duplicate Not Found
   }







    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Number Of Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        // Check for Duplicate Element
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j <arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    System.out.println("Duplicate Element: " + arr[i]);
//                } else {
//                    System.out.println("No Duplicate Element: " + arr[i]);
//                }
//            }
//        }



        if (hasDuplicates(arr)) {
            System.out.println("Duplicate Element Found: ");
        } else {
            System.out.println("No Duplicate Element Found: ");
        }

    }
}
