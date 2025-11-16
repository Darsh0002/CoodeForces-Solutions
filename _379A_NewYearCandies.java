import java.util.Scanner;

public class _379A_NewYearCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();  // initial candles
        int b = sc.nextInt();  // how many used to make one new candle

        int count = a; // total burned candles

        while (a >= b) {
            int newCandles = a / b;     // new candles formed
            count += newCandles;        // add them to total
            a = newCandles + (a % b);   // remaining candles + new ones
        }

        System.out.println(count);
        sc.close();
    }
}
