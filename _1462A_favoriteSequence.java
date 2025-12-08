import java.util.Scanner;

public class _1462A_favoriteSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int i = 0, j = n - 1;
            while (i < j) {
                System.out.print(arr[i++] + " " + arr[j--] + " ");
            }
            if (i == j) System.out.print(arr[i]);

            System.out.println();
        }
    }
}
