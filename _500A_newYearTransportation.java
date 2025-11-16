
import java.util.Scanner;

public class _500A_newYearTransportation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(canGo(arr, t - 1) ? "YES" : "NO");
    }

    private static boolean canGo(int[] arr, int target) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (i == target) return true;
            if (i > target) return false;
            i = i + arr[i];
        }
        return false;
    }
}
