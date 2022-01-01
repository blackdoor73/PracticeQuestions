// https://codeforces.com/contest/1574/problem/B

import java.util.*;

public class CombinatoricsHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();
            if((a/2 + b/2 + c/2) >= m)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}