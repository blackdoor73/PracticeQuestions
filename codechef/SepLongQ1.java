// https://www.codechef.com/SEPT21C/problems/AIRLINE
import java.util.*;
public class SepLongQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            int E = sc.nextInt();
            Boolean flag = true;
            if((A<=E&&(B+C)<=D)||(B<=E&&(A+C)<=D)||(C<=E&&(B+A)<=D))
                flag = true;
            else
                flag = false;

            if(flag==false)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
        sc.close();
    }
}
