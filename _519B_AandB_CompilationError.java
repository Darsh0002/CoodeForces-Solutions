import java.util.Scanner;

public class _519B_AandB_CompilationError {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }

        long first = sum;
        for (int i = 0; i < n - 1; i++) {
            first -= sc.nextInt();
        }
        System.out.println(first);

        long sec = sum - first;
        for (int i = 0; i < n - 2; i++) {
            sec -= sc.nextInt();
        }
        System.out.println(sec);

        sc.close();
    }
}
