import java.util.*;

public class ReverseString {
    public static void main (String[] args){
        // Scanner sc = new Scanner(System.in);
        int arr[];
        arr = new int[] {1,2,3,4,5,6,7,8};
        for(int i=0;i<(arr.length/2);i++){
            int temp = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i];
            arr[i] = temp;
        }
        
        System.out.println(Arrays.toString(arr));
    }
}
