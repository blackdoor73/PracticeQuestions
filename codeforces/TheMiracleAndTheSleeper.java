// https://codeforces.com/contest/1562/problem/A
import java.util.*;
 
public class TheMiracleAndTheSleeper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int min = sc.nextInt();
            int max = sc.nextInt();
            int ans = 0;
            float temp = max/2;
            if(((float)(max/2))<=min)
                ans = max%min;
            else if(max%2==0)
                ans= (int) (max%((Math.ceil(temp)+1)));
            else if(max%2==1)
                ans= (int) (max%((Math.ceil(temp)+0)));
            
            System.out.println(ans);
        }
        sc.close();
    }
}