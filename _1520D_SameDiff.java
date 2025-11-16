import java.util.Scanner;

public class _1520D_SameDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(countPairs(n, arr));
        }

        sc.close();
    }

    private static int countPairs(int n, int[] arr) {
        int count = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] - arr[i] == j - i) count++;
            }
        }
        return count;
    }
}
