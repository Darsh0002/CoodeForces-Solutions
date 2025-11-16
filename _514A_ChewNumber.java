import java.util.Scanner;

public class _514A_ChewNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        StringBuilder ans = new StringBuilder();

        int first = s.charAt(0) - '0';
        if (first > 4 && first != 9) {
            first = 9 - first;
        }
        ans.append(first);

        for (int i = 1; i < s.length(); i++) {
            int c = s.charAt(i) - '0';
            if (c > 4) c = 9 - c;
            ans.append(c);
        }

        System.out.println(ans);
    }
}
