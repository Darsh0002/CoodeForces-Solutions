import java.util.*;

public class _141A_amusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String guest = sc.next();
        String host = sc.next();
        String pile = sc.next();

        int[] freq = new int[26];

        // Count from guest + host
        for(char ch : (guest + host).toCharArray()){
            freq[ch - 'A']++;
        }

        // Subtract using pile
        for(char ch : pile.toCharArray()){
            freq[ch - 'A']--;
        }

        // If all become zero -> YES
        for(int x : freq){
            if(x != 0){
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
