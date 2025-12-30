import java.util.Scanner;

public class _1873D_1Deraser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int count = 0;
            int i = 0;
            while (i < n) {
                if (s.charAt(i) == 'B') {
                    count++;
                    i += k;
                } else
                    i++;
            }
            System.out.println(count);
        }
    }
}
