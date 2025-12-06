import java.util.Scanner;

public class _2173A_SleepInClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String str = sc.next();

            int hours = 0, curr = 0;
            for (int i = 0; i < n; i++) {
                char c = str.charAt(i);

                if (c == '0') {
                    if (curr == 0) hours++;
                    else curr--;
                } else {
                    curr = k;
                }
            }
            System.out.println(hours);
        }
    }
}
