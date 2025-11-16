import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _1352A_sumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc > 0) {
            int n = sc.nextInt();
            List<Integer> ans = roundNumbers(n);
            System.out.println(ans.size());
            ans.forEach(num -> System.out.print(num + " "));
            System.out.println();
            tc--;
        }
    }

    private static List<Integer> roundNumbers(int n) {
        List<Integer> roundNumbers = new ArrayList<>();
        while (n > 0) {
            if (n == 10000) {
                roundNumbers.add(10000);
                n -= 10000;
            } else if (n > 999) {
                roundNumbers.add(n - (n % 1000));
                n = n % 1000;
            } else if (n > 99) {
                roundNumbers.add(n - (n % 100));
                n = n % 100;
            } else if (n > 9) {
                roundNumbers.add(n - (n % 10));
                n = n % 10;
            } else {
                roundNumbers.add(n);
                n = 0;
            }
        }
        return roundNumbers;
    }
}
