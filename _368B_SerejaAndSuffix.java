import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _368B_SerejaAndSuffix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Set<Integer> suffix = new HashSet<>();

        int[] suf = new int[n];

        for (int j = n - 1; j >= 0; j--) {
            suffix.add(arr[j]);
            suf[j] = suffix.size();
        }

        for (int i = 0; i < m; i++) {
            int pos = sc.nextInt();
            System.out.println(suf[pos - 1]);
        }


    }
}
