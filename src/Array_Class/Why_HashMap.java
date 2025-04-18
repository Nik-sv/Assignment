package Array_Class;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Why_HashMap {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        int[] frequency = new int[arr.length];
//        int[] count = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//           Arrays.stream(arr).sorted();
//           frequency[0] = 1;
//           count[0] = 0;
//           if (arr[i] == arr[frequency]) {
//              //
//
//           }
//        }
//    }
//}




import java.util.Scanner;

public class Why_HashMap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean[] visited = new boolean[n];

        // Input le lo
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Frequency count
        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }
}

