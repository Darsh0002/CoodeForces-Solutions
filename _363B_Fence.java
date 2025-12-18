
import java.util.Scanner;

public class _363B_Fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int l = 0, r = 0, sum = 0;

        // first window
        while (r < k) {
            sum += arr[r];
            r++;
        }
        int minHight = sum, ansIdx = 0;

        while (r < n) {
            sum -= arr[l];
            l++;
            sum += arr[r];

            if (sum < minHight) {
                minHight = sum;
                ansIdx = l;
            }
            r++;
        }

        System.out.println(ansIdx + 1);
        sc.close();
    }
}
