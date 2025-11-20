import java.util.*;

public class _339A_HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        ArrayList<Character> list = new ArrayList<>();

        for (char c : str.toCharArray()) {
            if (c > '0' && c <= '9') list.add(c);
        }

        Collections.sort(list);
        int n = list.size();
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i));
            if (i < n - 1) System.out.print("+");
        }
    }
}
