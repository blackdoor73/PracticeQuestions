// https://codeforces.com/contest/1561/problem/0
import java.util.*;
public class  SimplyStrangeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int arrSort[] = new int[n];
            int ans = 0;
            for (int j = 0; j < n; j++){
                arr[j] = sc.nextInt();
                arrSort[j] = arr[j];
            }
            Arrays.sort(arrSort);
            if (Arrays.equals(arr, arrSort))
                ans = 0;
            else
                for(int k = 0; k < n;k++){
                    for (int j = (k%2); j<(n-1); j = j+2)
                        if (arr[j]>arr[j+1]){
                            int temp;
                            temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                    
                    if (Arrays.equals(arr, arrSort)){
                        ans = k+1;
                        break;
                    }
                    
                }
            System.out.println(ans);
        }
        sc.close();
    }
}