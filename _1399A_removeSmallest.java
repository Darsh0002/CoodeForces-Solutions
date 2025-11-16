import java.util.PriorityQueue;
import java.util.Scanner;

public class _1399A_removeSmallest {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 1; i <= tc; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            System.out.println(isPossible(arr));
        }
    }

    private static String isPossible(int[] arr) {
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int j = 0; j < n; j++) {
            pq.add(arr[j]);
        }

        while(pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();

            if(second-first<=1){
                pq.add(second);
            }else{
                return "NO";
            }
        }

        return "YES";
    }
}
