import java.util.Scanner;

public class _1840C_SkiResort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextInt();
            long q = sc.nextInt();

            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(numberOfWays(arr, n, k, q));
        }
    }

    private static long numberOfWays(long[] arr, long n, long minDays, long maxTemp) {
        long count = 0;
        int l = 0, r = 0, startDay = 0;
        while (r < n) {
            long length = r - l + 1;
            if (length == minDays) startDay = r;

            if (arr[r] <= maxTemp && length >= minDays) {
                count += r - startDay + 1;
            } else if (arr[r] > maxTemp) {
                l = r + 1;
                startDay = l;
            }
            r++;
        }
        return count;
    }
}
