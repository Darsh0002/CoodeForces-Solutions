import java.util.Scanner;

public class _2051B_Journey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int sum = a + b + c;
            int ans = 0;
            if (n >= sum) {
                ans = (n / sum) * 3;
                n = n % sum;
            }

            if (n > 0) {
                ans++;
                n -= a;
            }

            if (n > 0) {
                ans++;
                n -= b;
            }

            if (n > 0) {
                ans++;
                n -= c;
            }

            System.out.println(ans);
        }
    }
}
