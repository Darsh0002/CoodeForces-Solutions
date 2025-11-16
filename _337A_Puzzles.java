import java.util.Arrays;
import java.util.Scanner;

public class _337A_Puzzles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(leastDiff(arr, n));
    }

    private static int leastDiff(int[] arr, int students) {
        int n = arr.length;
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;

        int j = students - 1;
        for (int i = 0; i <= n - students; i++) {
            minDiff = Math.min(minDiff, arr[j++] - arr[i]);
        }

        return minDiff;
    }
}
