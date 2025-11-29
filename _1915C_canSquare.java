import java.util.*;

public class _1915C_canSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            long sum = 0;

            for (int i = 0; i < n; i++) {
                sum += sc.nextInt();
            }

            long r = (long) Math.sqrt(sum);
            System.out.println(r * r == sum ? "YES" : "NO");
        }
    }
}
