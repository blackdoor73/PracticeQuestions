import java.util.*;
public class ReverseStringRecursion {
    public static void reverse(int []arr,int start,int end){
        int temp;
        if(start>=end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end]= temp;
        reverse(arr,start+1,end-1);

    }
    public static void main(String args[]){
        int arr[] = new int[]{1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(arr));
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
