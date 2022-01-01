// https://codeforces.com/problemset/problem/1555/B
import java.util.Scanner;

public class TwoTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        double answer[] = new double[testCases];
        for (int i = 0; i < testCases; i++) {
            int W = sc.nextInt();
            int H = sc.nextInt();
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int w = sc.nextInt();
            int h = sc.nextInt();
            

            if ((x2 - x1 + w) <= W || (y2 - y1 + h) <= H) {
                if (Math.max(W - x2, x1) >= w || Math.max(H - y2, y1) >= h) {
                    answer[i] = 0;
                } else {
                    double a=0;
                    double b=0;
                    if (Math.max(W - x2, x1) < w && (x2 - x1 + w) <= W) {
                        a = (w-Math.max(W - x2, x1));

                    } 
                    else if (Math.max(H - y2, y1) < h && (y2 - y1 + h) <= H){
                        b = (h-Math.max(H - y2, y1));
                    }
                    answer[i] = (double) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
                }

            } else {
                answer[i] = -1;
            }

        }
        for(int i=0;i<answer.length;i++)     
            System.out.println(answer[i]);  
    }

}
