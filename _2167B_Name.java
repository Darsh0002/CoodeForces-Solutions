import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _2167B_Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String t = sc.next();

            char[] sArr = s.toCharArray();
            Arrays.sort(sArr);

            char[] tArr = t.toCharArray();
            Arrays.sort(tArr);

            // compare sorted versions
            if (Arrays.equals(sArr, tArr))
                System.out.println("YES");
            else
                System.out.println("NO");

//            Set<Character> set = new HashSet<>();
//            for (char c : s.toCharArray()) {
//                set.add(c);
//            }
//
//            boolean[] used = new boolean[n];
//            for (int i = 0; i < n; i++) {
//                char c = t.charAt(i);
//                if (set.contains(c) && !used[i]) {
//                    used[i] = true;
//                } else {
//                    System.out.println("NO");
//                    break;
//                }
//            }
//            System.out.println("YES");
        }
    }
}
