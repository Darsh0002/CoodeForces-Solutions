import java.util.*;

public class _734A_AntonDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int a = 0, d = 0;
        for (char c : s.toCharArray()) {
            if (c == 'A') a++;
            else d++;
        }

        if (a == d) System.out.println("Friendship");
        else System.out.println(a > d ? "Anton" : "Danik");
    }
}
