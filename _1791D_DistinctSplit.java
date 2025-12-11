import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _1791D_DistinctSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            Set<Character> prefix = new HashSet<>();
            Set<Character> suffix = new HashSet<>();

            int[] pre = new int[n];
            int[] suf = new int[n];

            for (int i = 0; i < n; i++) {
                prefix.add(s.charAt(i));
                pre[i] = prefix.size();
            }

            for (int j = n - 1; j >= 0; j--) {
                suffix.add(s.charAt(j));
                suf[j] = suffix.size();
            }

            int maxVal = 0;
            for (int i = 0; i < n - 1; i++) {
                maxVal = Math.max(maxVal, pre[i] + suf[i + 1]);
            }
            System.out.println(maxVal);
        }
    }
}
