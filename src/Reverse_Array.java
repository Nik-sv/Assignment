import java.util.Scanner;

public class Reverse_Array {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0, j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        System.out.println("Reversed Array");
        for (int val: arr) {
            System.out.print(val + " ");
        }
    }
}
