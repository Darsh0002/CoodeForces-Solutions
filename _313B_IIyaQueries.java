import java.util.Scanner;

public class _313B_IIyaQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = s.length();

        int m = sc.nextInt();

        int[] pre = new int[n];

        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] + (s.charAt(i) == s.charAt(i - 1) ? 1 : 0);
        }

        while (m-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            System.out.println(pre[r - 1] - pre[l - 1]);
        }
    }
}
