import java.util.Scanner;

public class _2178A_YESorYES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int y = 0;

            for (char c : s.toCharArray()) {
                if (c == 'Y') y++;
            }

            if (y > 1) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
