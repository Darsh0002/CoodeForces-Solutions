import java.util.Scanner;

public class _556A_CaseOfZeroOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int count0 = 0, count1 = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') count0++;
            else count1++;
        }

        System.out.println(Math.abs(count1 - count0));
    }
}
