import java.util.Scanner;

public class _1398C_Good_SubArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.charAt(i) - '0';
            }

            System.out.println(countGoodArrays(arr));
        }
    }

    private static int countGoodArrays(int[] arr) {
        int n = arr.length;
        int count = 0;

        int l = 0, r = 0;
        int sum = 0;

        while (r < n) {
            sum += arr[r];

            while (sum > r - l + 1) {
                if (r - l + 1 == 1) {
                    break;
                }
                sum -= arr[l];
                l++;
            }
            if (sum == r - l + 1) count++;
            r++;
        }

        return count;
    }
}
