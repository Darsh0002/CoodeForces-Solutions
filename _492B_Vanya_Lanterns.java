import java.util.Arrays;
import java.util.Scanner;

public class _492B_Vanya_Lanterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findRadius(arr,l));
    }

    private static double findRadius(int[] nums,int l) {
        int n = nums.length;
        Arrays.sort(nums);
        int maxDiff = 0;
        for (int i = 1; i < n; i++) {
            maxDiff = Math.max(maxDiff,nums[i]-nums[i-1]);
        }

        double ans = maxDiff/2.0;

        if(nums[0]!=0){
            ans = Math.max(ans,nums[0]);
        }

        if(nums[n-1]!=l){
            ans = Math.max(ans,l - nums[n-1]);
        }

        return ans;
    }
}
