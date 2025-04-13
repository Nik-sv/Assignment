import java.util.Scanner;

public class Sum_Of_all_the_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements: ");

        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

//        int prev = 0, curr = prev + arr[i];
//        for (int i = 0; i < n; i++) {
//            int sum = prev + curr;
//            System.out.println(sum);
//        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);




    }
}
