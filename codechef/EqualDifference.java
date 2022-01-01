
// https://www.codechef.com/COOK132C/problems/EQDIFFER
import java.util.*;

public class EqualDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int ans = 0;
            for (int j = 0; j > n; j++)
                arr[j] = sc.nextInt();

            if (n > 2) {
                ans = n;
            }
            System.out.println(ans);
        }
        sc.close();
    }

    
}
