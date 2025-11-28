import java.util.Scanner;

public class _279B_Books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxBooks(arr, n, t));
    }

    private static int maxBooks(int[] arr, int n, int t) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int temp = 0;
            int currTime = 0;
            for (int j = i; j < n; j++) {
                if (currTime + arr[j] <= t) {
                    currTime += arr[j];
                    temp++;
                } else {
                    break;
                }
            }
            ans = Math.max(temp, ans);
        }
        return ans;
    }
}
