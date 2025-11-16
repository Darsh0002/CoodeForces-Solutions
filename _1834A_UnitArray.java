import java.util.Scanner;

public class _1834A_UnitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(countOperations(arr));

        }
    }

    private static int countOperations(int[] nums) {

        int count = 0;
        int sum = 0;
        int neg = 0;
        for (int e : nums) {
            sum += e;
            if (e < 0) neg++;
        }

        if(sum<0){
            count += Math.abs(sum/2);
        }
        return count;
    }
}
