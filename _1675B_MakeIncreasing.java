import java.util.Scanner;

public class _1675B_MakeIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(solve(arr, n));
        }
    }

    private static int solve(int[] arr, int n) {
        int count = 0;
        for (int i = n - 2; i >= 0; i--) {
            while (arr[i] >= arr[i + 1]) {
                if (arr[i + 1] == 0) return -1;
                arr[i] = arr[i] / 2;
                count++;
            }
        }
        return count;
    }
}
