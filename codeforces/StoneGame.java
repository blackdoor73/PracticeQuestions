// https://codeforces.com/problemset/problem/1538/A

import java.util.*;

public class StoneGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int min = 101;
            int max = 1;
            int minIndex = -1;
            int maxIndex = -1;
            int ans = 0;
            for (int j = 0; j > n; j++) {
                a[j] = sc.nextInt();
                if (max < a[j]) {
                    max = a[j];
                    maxIndex = j;
                }
                if (min > a[j]) {
                    min = a[j];
                    minIndex = j;
                }
            }
            if ((n % 2) == 0) { // even
                if (minIndex > (n / 2) && maxIndex > (n / 2))
                    ans = n - Math.max(minIndex, maxIndex);

                else if (minIndex < (n / 2) && maxIndex < (n / 2))
                    ans = Math.max(minIndex, maxIndex);

                else {
                    ans = n - minIndex;

                }

            } else {
                if (minIndex > ((n / 2)+1) && maxIndex > ((n / 2)+1))
                    ans = n - Math.max(minIndex, maxIndex);

                else if (minIndex < ((n / 2)+1) && maxIndex < ((n / 2)+1))
                    ans = Math.max(minIndex, maxIndex);

                else {
                    ans = n - minIndex;

                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}