import java.util.Scanner;

public class _339B_Xenia_Ringroad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int houses = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(minTime(arr, houses));
    }

    private static long minTime(int[] nums, int houses) {
        long count = nums[0] - 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= nums[i - 1]) {
                count += nums[i] - nums[i - 1];
            } else {
                count += (houses - nums[i - 1]) + (nums[i]);
            }
        }
        return count;
    }
}
