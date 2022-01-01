import java.util.*;

public class KSmallest{
    public static void main(String args[]){
        int arr[] = new int[] {1,2,3,4,5,6,7,8,0};
        int k=2;
        Arrays.sort(arr);
        System.out.println(arr[k-1]);

    }
}