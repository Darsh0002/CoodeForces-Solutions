import java.util.*;

public class _1850D_BalancedRound {
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

            System.out.println(countProblemsToRemove(arr, k));
        }

        sc.close();
    }

    private static int countProblemsToRemove(int[] arr, int k) {
        Arrays.sort(arr);
        int maxLen = 1, curLen = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] <= k) {
                curLen++;
            } else {
                curLen = 1; // start new segment
            }
            maxLen = Math.max(maxLen, curLen);
        }

        return arr.length - maxLen;
    }
}
