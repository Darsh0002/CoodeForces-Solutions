import java.util.Scanner;

public class _550A_twoSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();

        int idx = s.indexOf("AB");
        if (idx != -1) {
            int idx2 = s.indexOf("BA", idx + 2);
            if (idx2 != -1) {
                System.out.println("YES");
                return;
            }
        }

        idx = s.indexOf("BA");
        if (idx != -1) {
            int idx2 = s.indexOf("AB", idx + 2);
            if (idx2 != -1) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
