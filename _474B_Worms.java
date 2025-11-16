import java.util.Scanner;

public class _474B_Worms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] prefix = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (i < 1) {
                prefix[i] = arr[i];
                continue;
            }

            prefix[i] = prefix[i - 1] + arr[i];
        }

        int m = sc.nextInt();
        int[] juicy = new int[m];
        for (int i = 0; i < m; i++) {
            juicy[i] = sc.nextInt();
            System.out.println(getPile(juicy[i], prefix, n));
        }

        sc.close();
    }

    private static int getPile(int label, int[] arr, int n) {
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (label <= arr[mid]) j = mid - 1;
            else i = mid + 1;
        }
        return i + 1;
    }
}
