import java.util.Scanner;

public class _1746B_Rebellion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int count = 0, i = 0, j = n - 1;
            while (i < j) {
                if (arr[i] == 1) {
                    if (arr[j] == 0) count++;

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    j--;
                } else i++;
            }

            System.out.println(count);
        }
    }
}
