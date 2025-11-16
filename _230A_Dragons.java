import java.util.Arrays;
import java.util.Scanner;

public class _230A_Dragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        boolean canWin = canWin(s, arr);

        if (canWin) System.out.println("YES");
        else System.out.println("NO");
    }

    private static boolean canWin(int s, int[][] arr) {
        int n = arr.length;
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        for (int i = 0; i < n; i++) {
            if (s < arr[i][0]) return false;
            s += arr[i][1];
        }
        return true;
    }
}
