import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _43A_FootBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<String, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            map.put(s, map.getOrDefault(s, 0) + 1);
            max = Math.max(max, map.get(s));
        }

        for (String s : map.keySet()) {
            if (map.get(s) == max) {
                System.out.println(s);
                return;
            }
        }
    }
}
