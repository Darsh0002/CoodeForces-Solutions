import java.util.Scanner;

public class _1374B_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            System.out.println(numberOfMoves(n));
        }
    }

    private static int numberOfMoves(int n) {
        int count = 0;
        while (n > 2) {
            if (n % 6 == 0) n = n / 6;
            else n = n * 2;
            count++;
        }

        if (n == 1) return count;
        return -1;
    }
}
