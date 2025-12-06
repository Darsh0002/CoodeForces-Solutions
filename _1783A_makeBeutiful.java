import java.util.Arrays;
import java.util.Scanner;

public class _1783A_makeBeutiful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            if (arr[n - 1] == arr[0]) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                System.out.print(arr[n - 1] + " ");
                for (int i = 0; i < n - 1; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }

    }

}
