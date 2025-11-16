import java.util.*;

public class _1433A_BoringAppartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            String num = sc.next();
            int d = num.charAt(0) - '0';
            int len = num.length();
            int ans = (d - 1) * 10 + (len * (len + 1)) / 2;
            System.out.println(ans);
        }
    }
}
