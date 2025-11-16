import java.util.Scanner;

public class _381A_SerejaDima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean turn = true; // true -> sereja, false -> dima
        int i = 0, j = n - 1;
        int sereja = 0, dima = 0;
        while (i <= j) {
            if (turn) {
                if (arr[j] > arr[i]) {
                    sereja += arr[j];
                    j--;
                } else {
                    sereja += arr[i];
                    i++;
                }
                turn = false;
            } else {
                if (arr[j] > arr[i]) {
                    dima += arr[j];
                    j--;
                } else {
                    dima += arr[i];
                    i++;
                }
                turn = true;
            }
        }
        System.out.println(sereja + " " + dima);
    }
}
