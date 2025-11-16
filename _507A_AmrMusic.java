import java.util.*;

public class _507A_AmrMusic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // store {duration, index}
        int[][] songs = new int[n][2];
        for (int i = 0; i < n; i++) {
            songs[i][0] = arr[i];   // duration
            songs[i][1] = i + 1;    // original index (1-based)
        }

        // sort by duration
        Arrays.sort(songs, (a,b)->a[0]-b[0]);

        List<Integer> ans = new ArrayList<>();
        for (int[] song : songs) {
            if (song[0] <= k) {
                ans.add(song[1]);  // store index
                k -= song[0];
            }
        }

        System.out.println(ans.size());
        for (int idx : ans) {
            System.out.print(idx + " ");
        }
    }
}
