import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _1462C_UniqueNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int x = sc.nextInt();

            if (x > 45) {
                System.out.println(-1);
                continue;
            }

            List<Integer> digits = new ArrayList<>();

            for (int d = 9; d >= 1; d--) {
                if (x >= d) {
                    x -= d;
                    digits.add(d);
                }
            }

            if (x != 0) {
                System.out.println(-1);
            } else {
                Collections.sort(digits);
                for (int d : digits) {
                    System.out.print(d);
                }
                System.out.println();
            }
        }
    }
}
