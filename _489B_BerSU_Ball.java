import java.util.Arrays;
import java.util.Scanner;

public class _489B_BerSU_Ball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] boys = new int[n];

        for (int i = 0; i < n; i++) {
            boys[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] girls = new int[m];

        for (int i = 0; i < m; i++) {
            girls[i] = sc.nextInt();
        }

        System.out.println(maxPossiblePairs(boys, girls, n, m));
    }

    private static int maxPossiblePairs(int[] boys, int[] girls, int n, int m) {
        Arrays.sort(boys);
        Arrays.sort(girls);

        int pairs = 0;
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (Math.abs(boys[i] - girls[j]) <= 1) {
                pairs++;
                i++;
                j++;
            } else if (boys[i] < girls[j]) i++;
            else j++;
        }
        return pairs;
    }
}
