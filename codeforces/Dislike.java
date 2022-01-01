// https://codeforces.com/contest/1560/problem/0

import java.util.*;

public class Dislike{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            int ans = 0;
            for(int n = 1; n<=k; n++){
                ++ans;
                while((ans%10)==3||ans%3==0)
                    ++ans;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}