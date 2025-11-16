import java.util.Scanner;

public class _1791C_prependAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            System.out.println(shortestLength(n, s));
        }
    }

    private static int shortestLength(int n, String s) {
        int i = 0, j = n - 1;

        while (i < j) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);

            if (c1 != c2) {
                i++;
                j--;
            } else {
                return j - i + 1;
            }

        }
        if (i == j) return 1;

        return 0; // never reaches
    }
}
