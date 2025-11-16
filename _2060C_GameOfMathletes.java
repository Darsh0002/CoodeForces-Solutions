import java.util.Arrays;
import java.util.Scanner;

public class _2060C_GameOfMathletes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(countPairsWithSumK(arr, n, k));
        }
    }

    private static int countPairsWithSumK(int[] arr, int n, int k) {
        int count = 0;
        Arrays.sort(arr);
        int i = 0, j = n - 1;

        while (i <= j) {
            int sum = arr[i] + arr[j];

            if (sum == k) {
                count++;
                i++;
                j--;
            } else if (sum > k) {
                j--;
            } else {
                i++;
            }
        }

        return count;
    }
}
