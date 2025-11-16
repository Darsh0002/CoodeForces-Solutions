import java.util.Scanner;

public class _2149A_Be_Positive_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(minNumberOfOperations(arr, n));
            tc--;
        }
    }

    private static int minNumberOfOperations(int[] arr, int n) {
        int count = 0;
        int minus = 0, zero = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == -1) minus++;
            if (arr[i] == 0) zero++;
        }

        if (minus % 2 != 0) {
            count = minus != 1 ? (minus - 1) * 2 : 2;
        }
        if (zero != 0) {
            count += zero;
        }
        return count;
    }
}
