import java.util.Scanner;

public class _1837B_comparisonString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int curr = 1;
            int max = 1;

            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    curr++;
                } else {
                    curr = 1;
                }
                max = Math.max(max, curr);
            }

            System.out.println(max + 1);
        }
    }
}
