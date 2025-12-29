import java.util.Scanner;

public class _1440B_sumOfMedian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] arr = new long[n * k];
            for (int i = 0; i < n * k; i++) {
                arr[i] = sc.nextInt();
            }

            int idx = (n % 2 == 0) ? (n / 2 - 1) : (n / 2); // index of median when splitted
            int step = n - idx - 1;
            long maxSum = 0;

            for (int i = n * k - 1 - step; i >= 0; i = i - step - 1) {
                if (k > 0) {
                    maxSum += arr[i];
                    k--;
                }
            }

            System.out.println(maxSum);
        }
    }
}
