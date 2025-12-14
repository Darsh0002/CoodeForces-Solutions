import java.util.Arrays;
import java.util.Scanner;

public class _1760A_MediumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int[] abc = new int[3];
            for (int i = 0; i < 3; i++) {
                abc[i] = sc.nextInt();
            }
            Arrays.sort(abc);
            System.out.println(abc[1]);
        }
        sc.close();
    }
}
