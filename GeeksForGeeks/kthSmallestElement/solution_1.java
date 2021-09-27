package kthSmallestElement;
import java.util.*;
public class solution_1 {
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        int temp = 0;
        for(int i=0;i<=r;i++)
        {
            for(int j = 0;j<r;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr[k-1];
    } 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements of the array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the no of smallest element to be found: ");
        int k = sc.nextInt();

        int val = kthSmallest(arr, 0, arr.length-1, k);

        System.out.println(k+" smallest number is "+val);
        sc.close();
    }
}
