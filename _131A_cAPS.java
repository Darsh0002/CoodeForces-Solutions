import java.util.Scanner;

public class _131A_cAPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        if(input.equals(input.toUpperCase())){
            changeCase(input);
            return;
        }

        String sub = input.substring(1);
        if (Character.isLowerCase(input.charAt(0)) && sub.equals(sub.toUpperCase())) {
            changeCase(input);
            return;
        }

        System.out.println(input);
    }

    private static void changeCase(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else {
                sb.append(Character.toUpperCase(ch));
            }
        }

        System.out.println(sb.toString());

    }
}
