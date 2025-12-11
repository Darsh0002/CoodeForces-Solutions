import java.util.Scanner;

public class _1999B_CardGames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();

            int[] A = {a1, a2};
            int[] B = {b1, b2};
            int wins = 0;
            for (int i = 0; i < 2; i++) {         // A's card flipped in round 1: A[i]
                for (int j = 0; j < 2; j++) {     // B's card flipped in round 1: B[j]
                    int sWins = 0, bWins = 0;
                    // round 1
                    if (A[i] > B[j]) sWins++;
                    else if (A[i] < B[j]) bWins++;

                    // round 2: remaining cards
                    int aRem = A[1 - i];
                    int bRem = B[1 - j];

                    if (aRem > bRem) sWins++;
                    else if (aRem < bRem) bWins++;

                    if (sWins > bWins) wins++;
                }
            }
            System.out.println(wins);

        }
    }
}
