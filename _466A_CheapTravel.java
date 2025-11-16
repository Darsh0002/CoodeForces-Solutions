import java.util.Scanner;

public class _466A_CheapTravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(Math.min(usingOneTicket(n, a), usingSpecialTicket(n, m, b, a)));

        sc.close();
    }

    private static int usingOneTicket(int n, int a) {
        return n * a;
    }

    private static int usingSpecialTicket(int n, int m, int b, int a) {
        if (n % m == 0) {
            return (n / m) * b;
        }

        // Option 1: Buy extra special ticket to cover all rides
        int cost1 = (n / m + 1) * b;

        // Option 2: Mix of full special tickets + single tickets for remaining rides
        int cost2 = (n / m) * b + (n % m) * a;
        return Math.min(cost1, cost2);
    }
}
