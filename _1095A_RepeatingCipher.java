import java.util.Scanner;

public class _1095A_RepeatingCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        StringBuilder ans = new StringBuilder();
        int k = 0;
        for (int i = 0; i < n; i += k) {
            ans.append(str.charAt(i));
            k++;
        }

        System.out.println(ans.toString());
    }
}
