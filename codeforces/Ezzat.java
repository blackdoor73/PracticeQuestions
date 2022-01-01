// https://codeforces.com/contest/1557/problem/A

import java.util.*;

public class Ezzat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        double answer[] = new double[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int a[] = new int[n];
            answer[i] = findMax(a, n);
        }
        for(int i=0;i<answer.length;i++)     
            System.out.println(answer[i]);  
        sc.close();
    }

    private static double findMax(int[] a, int n) {
        int sumTotal = 0;
        for (int i = 0; i < n; i++)
            sumTotal += a[i];

        return findMaxSum(a, n, a[0], sumTotal);
    }

    private static double findMaxSum(int[] a, int n, double avg, double avgTotal) {
        int count = n;
        double ans = 0;
        int i = 0;
        while(count>0){
            --count;

            ans = Math.max((avg+a[i])/(i+1),(avgTotal-a[i]));
            ++i;
        }
        return 0;
    }
}



    
    
  

        
 