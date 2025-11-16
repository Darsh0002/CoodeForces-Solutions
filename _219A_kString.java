import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _219A_kString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String str = sc.next();

        int[] freq = new int[26];
        Set<Character> set = new HashSet<>();

        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
            set.add(c);
        }

        for (int fr : freq) {
            if (fr != k && fr != 0) {
                System.out.println(-1);
                return;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : set) {
            sb.append(c);
        }

        System.out.println(sb.toString().repeat(k));

    }
}
