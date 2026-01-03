import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class _1980B_choosingCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int f = sc.nextInt();
            int k = sc.nextInt();
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int fav = arr[f - 1];

            Arrays.sort(arr, Collections.reverseOrder());

            if (arr[k - 1] < fav) {
                System.out.println("YES");
            } else if (arr[k - 1] > fav) {
                System.out.println("NO");
            } else {
                if(k==n) System.out.println("YES");
                else System.out.println((Objects.equals(arr[k - 1], arr[k])) ? "MAYBE" : "YES");
            }
        }
    }
}
