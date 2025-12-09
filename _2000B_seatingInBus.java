import java.util.Scanner;

public class _2000B_seatingInBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int first = sc.nextInt();
            int l = first - 1, r = first + 1;

            String ans = "YES";
            for (int i = 1; i < n; i++) {
                int x = sc.nextInt();

                if (x == l) l--;
                else if (x == r) r++;
                else {
                    ans = "NO";

                    // consume remaining inputs for this test
                    for (int j = i + 1; j < n; j++) sc.nextInt();
                    break;
                }
            }

            System.out.println(ans);
        }
    }
}
