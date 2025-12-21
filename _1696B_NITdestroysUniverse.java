import java.util.Scanner;

public class _1696B_NITdestroysUniverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int i = 0, cnt = 0;

            // count non-zero segments
            while (i < n) {
                if (arr[i] == 0) {
                    i++;
                } else {
                    cnt++;
                    while (i < n && arr[i] != 0) {
                        i++;
                    }
                }
            }

            // max operations allowed is 2
            System.out.println(Math.min(2, cnt));
        }
    }
}
