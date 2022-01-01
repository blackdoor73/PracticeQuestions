// import java.util.*;
// public class sortWithoutSort {
    
// public static void main (String args[])
// {
//     int a[] = new int[] {1,1,2,2,2,2,2,2,0,0,0,0,0,1,2};
//     int count_0 = 0;
//     int count_1 = 0;
//     int count_2 = 0;
//     for(int i=0;i < a.length;i++){
//         if (a[i] == 0)
//             count_0++;
//         if (a[i] == 1)
//             count_1++;
//         if (a[i] == 2)
//             count_2++;
//     }
//     int i;
//     for(i=0;i<count_0;i++)
//         a[i] = 0;
//     for(;i<count_0 + count_1;i++)
//         a[i] = 1;
//     for(;i<count_0 + count_1 + count_2;i++)
//         a[i] = 2;
//     System.out.println(Arrays.toString(a));
// }
// }

// Java program to put all negative
// numbers before positive numbers
import java.io.*;

class sortWithoutSort {

	static void rearrange(int arr[], int n)
	{
		int j = 0, temp, k=n-1;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				if (i != j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
        for (int i = n-1; i >= 0; i--) {
            if (arr[i] == 2) {
				if (i != k) {
					temp = arr[i];
					arr[i] = arr[k];
					arr[k] = temp;
				}
				k--;
			}
        }
	}

	static void printArray(int arr[], int n)
	{
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}


	public static void main(String args[])
	{
		int arr[] = {0 ,1 ,2 ,2 ,2 ,2 ,2 ,2 ,2 ,1 ,0, 0, 0, 0, 1};
		int n = arr.length;
		rearrange(arr, n);
		printArray(arr, n);
	}
}


