import java.util.Scanner;

public class _2148A_SublimeSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int x = sc.nextInt();
            int n = sc.nextInt();

            if (n % 2 == 0) System.out.println(0);
            else System.out.println(x);
        }
    }
}
