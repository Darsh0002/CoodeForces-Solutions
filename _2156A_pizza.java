import java.util.Scanner;

public class _2156A_pizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();

            int hao = 0;

            while (n > 2) {
                int add = (n % 3 <= 1) ? 1 : n % 3;
                hao += add;

                n -= add;
                if (n % 2 == 0) n = n / 2;
                else n = n / 2 + 1;
            }
            System.out.println(hao);
        }
    }
}
