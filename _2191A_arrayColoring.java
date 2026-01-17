import java.util.*;

public class _2191A_arrayColoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            Map<Integer, Character> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    map.put(arr[i], 'r');
                } else {
                    map.put(arr[i], 'b');
                }
            }

            Arrays.sort(arr);
            boolean possible = true;

            for (int i = 0; i < n - 1; i++) {
                if (map.get(arr[i]) == map.get(arr[i + 1])) {
                    System.out.println("NO");
                    possible = false;
                    break;
                }
            }

            if (possible) System.out.println("YES");
        }
    }
}
