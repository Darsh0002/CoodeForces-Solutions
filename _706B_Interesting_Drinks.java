import java.util.Arrays;
import java.util.Scanner;
// BRUTE FORCE:
/*
public class _706B_Interesting_Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        int[] capacity = new int[q];
        for (int i = 0; i < q; i++) {
            capacity[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (prices[j] <= capacity[i]) count++;
            }
            System.out.println(count);
        }
    }
}
*/

// OPTIMAL: USING BINARY SEARCH
public class _706B_Interesting_Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        Arrays.sort(prices); // sort prices for binary search

        int q = sc.nextInt();
        while (q-- > 0) {
            int money = sc.nextInt();
            int count = upperBound(prices, money); // how many ≤ money
            System.out.println(count);
        }
    }

    // binary search: index of first element > key
    private static int upperBound(int[] arr, int key) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] <= key) l = mid + 1;
            else r = mid;
        }
        return l;
    }
}