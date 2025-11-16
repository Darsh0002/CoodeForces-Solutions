import java.util.Scanner;

public class _1374C_MoveBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            System.out.println(Math.abs(countMinMoves(s)));

        }
    }

    private static int countMinMoves(String s) {
        int n = s.length();
        int minMoves = 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') count++;
            else count--;

            minMoves = Math.min(minMoves, count);
        }
        return minMoves;
    }
}
