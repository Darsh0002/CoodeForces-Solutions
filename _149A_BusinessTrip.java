import java.util.Arrays;
import java.util.Scanner;

public class _149A_BusinessTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = new int[12];
        for (int i = 0; i < 12; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int i = 11, count = 0, sum = 0;
        while (sum < k && i >= 0) {
            sum += arr[i--];
            count++;
        }
        System.out.println((sum >= k) ? count : -1);
    }
}
