package Arrays;

import java.util.Scanner;

public class Move_All_Zeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = 0;    // ye non zero element track karega

        // Step 1: Move all non-zero elements to front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }


        // Step 2:Fill remaining positions with zeros
        while (index < n) {
            arr[index++] = 0;
        }

        // Output the result
        System.out.println("Array after moving to end");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
