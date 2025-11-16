import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _158B_Taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(minTaxiNeeded(arr));
    }

    private static int minTaxiNeeded(int[] nums) {
        int count = 0;
        int n = nums.length;
        int freq1 = 0;
        int freq2 = 0;
        int freq3 = 0;
        for (int num : nums) {
            if (num == 4) count++;
            else if (num == 3) {
                freq3++;
            } else if (num == 2) {
                freq2++;
            } else if (num == 1) {
                freq1++;
            }
        }

        // combination of group of 3 and 1 friends
        if (freq3 == freq1) {
            count += freq3;
            freq1 = 0;
            freq3 = 0;
        } else if (freq3 > freq1) {
            count += freq1; // both groups of 3 and 1 friends
            freq3 -= freq1;
            freq1 = 0;
            count += freq3;
            freq3 = 0;
        } else if (freq3 < freq1) {
            count += freq3; // both groups of 3 and 1 friends
            freq1 -= freq3;
            freq3 = 0;
        }

        // combination of group of 2 and 2 friends
        count += freq2 / 2;
        freq2 = freq2 % 2;

        // combination of group of 2 and 1 friends
        if (freq2 == 1) {
            count++;
            freq2 = 0;
            freq1 = (freq1 > 2) ? freq1 - 2 : 0;
        }

        // combination of group of 1 and 1 friends
        if (freq1 > 0) {
            if (freq1 <= 4) {
                count++;
            } else {
                count += freq1 / 4;
                if (freq1 % 2 != 0) count++;
            }
            freq1 = 0;
        }
        return count;
    }
}
