import java.util.Scanner;

public class _476A_Stairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if (m > n) {
            System.out.println(-1);
            return;
        }

        if (m == n) {
            System.out.println(m);
            return;
        }


        for (int i = 1; ; i++) {
            if (i * m * 2 >= n) {
                System.out.println(i * m);
                return;
            }
        }

    }
}
