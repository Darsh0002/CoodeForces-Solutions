import java.util.Arrays;
import java.util.Scanner;

public class _977C_LessOrEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();


        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        if (k == 0) {
            if (arr[0] == 1) System.out.println(-1);
            else System.out.println(1);
            return;
        }
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                count++;
            } else {
                count += 2;
                i++;
            }

            if (count == k) {
                System.out.println(arr[i]);
                return;
            }
            if (count > k) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(arr[n-1]);
    }
}
