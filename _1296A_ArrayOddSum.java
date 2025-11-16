import java.util.Scanner;

public class _1296A_ArrayOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            boolean odd = false;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] % 2 != 0) odd = true;
            }

            if (odd) System.out.println("YES");
            else System.out.println("NO");
            tc--;
        }
    }
}
