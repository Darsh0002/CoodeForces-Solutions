import java.util.Scanner;

public class _1342A_roadToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();

            System.out.println((Math.min(x, y) * Math.min(b, 2 * a)) + (Math.abs(x - y) * a));
        }
    }
}
