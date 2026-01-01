import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class _1915D_unNaturalLanguage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        Set<Character> C = new HashSet<>(List.of('b', 'c', 'd'));

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            StringBuilder ans = new StringBuilder();

            int i = 0;
            while (i < n) {
                if (i + 3 < n) {
                    if (C.contains(s.charAt(i + 3))) {
                        ans.append(s.substring(i, i + 3)).append(".");
                        i += 3;
                    } else {
                        ans.append(s.substring(i, i + 2)).append(".");
                        i += 2;
                    }
                } else {
                    ans.append(s.substring(i));
                    break;
                }
            }

            System.out.println(ans);
        }
    }
}
