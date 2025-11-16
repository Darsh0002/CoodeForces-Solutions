import java.util.Scanner;

public class _510A_Fox_Snake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean placeLeft = false;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    System.out.print("#");
                }
                System.out.println();
            } else {
                if (placeLeft) {
                    System.out.print("#");
                    for (int j = 0; j < m - 1; j++) {
                        System.out.print(".");
                    }
                    System.out.println();
                    placeLeft = false;
                }
                else {
                    for (int j = 0; j < m - 1; j++) {
                        System.out.print(".");
                    }
                    System.out.println("#");
                    placeLeft = true;
                }
            }
        }
    }
}
