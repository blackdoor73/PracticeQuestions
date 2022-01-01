// https://codeforces.com/contest/1560/problem/B
import java.util.*;

public class Opposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int ans = -1;
            int total = 2 * (Math.abs(b - a));
            if (a <= total && b <= total && c <= total) {
                if ((c - (total / 2)) > 0 && c > (total / 2))
                    ans = c - (total / 2);
                else if ((c + (total / 2)) <= total && c <= (total / 2))
                    ans = c + (total / 2);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
