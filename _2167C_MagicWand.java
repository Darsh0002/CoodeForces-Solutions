import java.util.Arrays;
import java.util.Scanner;

public class _2167C_MagicWand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                int smallest = arr[i];
                int idx = i;

                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < smallest && smallest % 2 != arr[j] % 2) {
                        smallest = arr[j];
                        idx = j;
                    }
                }

                arr[idx] = arr[i];
                arr[i] = smallest;
            }

            Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
            System.out.println();
        }
    }
}
