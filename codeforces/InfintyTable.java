
// https://codeforces.com/contest/1560/problem/B
import java.util.*;

public class InfintyTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            int r = 1;
            int c = 1;
            int cCheck = 0;
            int left = 0;
            int right = 1;
            while (!(k >= left && k <= right)) {
                ++c;
                left = right;
                right = ((c - r) * (c - r)) + 1;
                cCheck = c;
            }
            if (k == right) {
                r = 1;
                c = cCheck;
            } else {
                --c;
                if (left + c - 1 >= k) {
                    while (r <= c) {
                        if (left == k)
                            break;
                        else {
                            ++left;
                            ++r;
                        }
                    }
                } else {
                    left = left + c - 1;
                    r = r + c - 1;
                    while (c > 0) {
                        if (left == k)
                            break;
                        else {
                            ++left;
                            --c;
                        }
                    }
                }
            }
            if(k==1){
                r=1;
                c=1;
            }

            System.out.println(r + " " + c);

        }
        sc.close();
    }
}
