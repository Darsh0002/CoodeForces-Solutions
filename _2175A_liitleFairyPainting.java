import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _2175A_liitleFairyPainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                set.add(arr[i]);
            }

            int s = set.size();
            for (int i = s; i <= 1000; i++) {
                if (set.contains(i)) {
                    System.out.println(i);
                    break;
                } else {
                    set.add(i);
                }
            }
        }
    }
}
