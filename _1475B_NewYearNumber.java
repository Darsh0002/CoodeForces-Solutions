import java.util.Scanner;

public class _1475B_NewYearNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            if (n < 2020) {
                System.out.println("NO");
                continue;
            }

            n -= 2021;

            if (n % 2020 == 0 || n % 2021 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        sc.close();
    }
}
