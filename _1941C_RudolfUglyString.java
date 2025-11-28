import java.util.*;

public class _1941C_RudolfUglyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int ans = 0;

            for (int i = 0; i + 2 < n; ) {
                String sub = s.substring(i, i + 3);

                if (sub.equals("map") || sub.equals("pie")) {
                    ans++;
                    i += 3; // skip this whole substring
                } else {
                    i++;
                }
            }

            System.out.println(ans);
        }
    }
}
