import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _499B_Lecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String first = sc.next();
            String second = sc.next();

            map.put(first, second);
        }

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
            int len1 = arr[i].length();
            int len2 = map.get(arr[i]).length();
            System.out.print(len2 < len1 ? map.get(arr[i]) : arr[i]);
            System.out.print(" ");
        }
    }
}
