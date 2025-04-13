import java.util.Scanner;

public class Missing_Sequence {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Elements: ");
        for (int i = 0; i < n; i++) {
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
