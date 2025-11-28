import java.util.Scanner;

public class _279B_Books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxBooks(arr, n, t));
    }

    private static int maxBooks(int[] arr, int n, int t) {
        int maxlen = 0;
        int l = 0, r = 0, sum = 0;
        while (r < n) {
            sum += arr[r];

            while (sum > t) {
                sum -= arr[l];
                l++;
            }

            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }
        return maxlen;
    }
}
