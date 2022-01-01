// https://www.codechef.com/AUG21C/problems/CHFINVNT

import java.util.*;

public class AugLongQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int answer[] = new int[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            int k = sc.nextInt();
            int days = 0;
            outerloop:
            for (int j = 0; j < k; j++){
                for (int l = 0; l < n; l++){
                    if(l % k == j){
                        ++days;
                    }
                    else if(l % k == j && l==p){
                        answer[i] = days;
                        break outerloop;
                    }
                }
            }
        }
        for(int i=0;i<answer.length;i++)     
            System.out.println(answer[i]);  
        sc.close();
    }
}
