import java.util.Arrays;
import java.util.Scanner;

public class _34B_Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int earnings = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0 && m > 0) {
                earnings += arr[i];
                m--;
            }
        }
        System.out.println(Math.abs(earnings));
    }
}
