import java.util.Scanner;

public class _750A_newYearHurry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalProblems = sc.nextInt();
        int minToReach = sc.nextInt();

        int timeToSolve = 240 - minToReach;

        int[] arr = new int[totalProblems];
        for (int i = 0; i < totalProblems; i++) {
            arr[i] = 5 * (i + 1);
        }

        int[] prefix = new int[totalProblems];
        prefix[0] = arr[0];
        for (int i = 1; i < totalProblems; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        System.out.println(noOfQue(timeToSolve, prefix, totalProblems));

    }

    // this method will return the number of questions that can be solved in timeToSolve minutes
    private static int noOfQue(int timeToSolve, int[] prefix, int totalProblems) {
        int low = 0, high = totalProblems - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (prefix[mid] > timeToSolve) high = mid - 1;
            else low = mid + 1;
        }
        return high + 1;
    }
}
