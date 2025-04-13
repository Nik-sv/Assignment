import java.util.Scanner;

public class Missing_Sequence {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of n: ");
        int n = sc.nextInt(); // Suppose n = 5
        int[] arr = new int[n - 1]; // Size should be n-1

        System.out.println("Enter " + (n - 1) + " elements: ");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }


        // Missing Number
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];

            if (diff > 1) {
                int missing = arr[i - 1] + 1;
                while(missing < arr[i]) {
                    System.out.println("Missing Number: " + missing);
                    missing++;
                }
            }
        }





    }
}
