import java.util.Scanner;

public class _1805A_needZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int totalXor = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                totalXor = totalXor ^ arr[i];
            }

            if (n % 2 == 1) { // Check if the number of elements is odd
                System.out.println(totalXor); // Output the XOR if n is odd
            } else { // If the number of elements is even
                if (totalXor == 0) { // Check if the total XOR is zero
                    System.out.println(totalXor); // Output zero if total XOR is zero
                } else {
                    System.out.println(-1); // Output -1 if total XOR is not zero
                }
            }
        }
    }
}
