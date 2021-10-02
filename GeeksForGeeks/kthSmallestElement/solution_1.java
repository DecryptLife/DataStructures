package kthSmallestElement;
// import java.util.*;
public class solution_1 {
    static void merge(int[] arr, int low, int mid,int high)
    {
        System.out.println("Came for merging");
        int l_len = (mid-low)+1;
        int r_len = (high-mid);
        System.out.println("Left length: "+l_len+" Right length: "+r_len);
        System.out.println("Mid: "+mid);

        int[] larr = new int[l_len];
        int[] rarr = new int[r_len];

        for(int i=0;i<l_len;i++)
        {
            larr[i] = arr[low+i];
            // System.out.println("Element at "+i+" in left half "+ larr[i]);
        }
        for(int i = 0;i<r_len;i++)
        {
            rarr[i] = arr[mid+1+i];
            // System.out.println("Element at "+i+" in right half "+ rarr[i-1]);
        }
        int i = 0;
        int j = 0;
        int k = low;

        while(i<l_len && j<r_len)
        {
            if(larr[i] < rarr[j])
            {
                arr[k] = larr[i];
                i++;
            }
            else{
                arr[k] = rarr[j];
                j++;
            }
            k++;
        }

        for(;i<l_len;i++)
        {
            arr[k] = larr[i];
            k++;
        }
        for(;j<r_len;j++)
        {
            arr[k] = rarr[j];
            k++;
        }

    }
    static void mergeSort(int[] arr, int low, int high)
    {
        int mid;
        if(low<high)
        {
            mid = (low+high)/2;
            System.out.println("\nLeft side");
            System.out.println("Low: "+low+" Mid: "+mid);
            mergeSort(arr, low, mid);
            System.out.println("\nRight side");
            System.out.println("Mid: "+mid+" High: "+high);
            mergeSort(arr, mid+1, high);
            System.out.println("\nMerging");
            merge(arr,low,mid,high);
        }
        else{
            System.out.println("Low: "+low+" high: "+high);
        }
    }
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        mergeSort(arr,l,r);
        return arr[k-1];
    } 
    public static void main(String[] args)
    {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of elements of array: ");
        // int n = sc.nextInt();
        // System.out.println("Enter elements of the array: ");
        // int[] arr = new int[n];
        // for(int i=0;i<n;i++)
        // {
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("Enter the no of smallest element to be found: ");
        // int k = sc.nextInt();

        int[] arr = {9,8,19,4,66};
        int k = 2;
        int val = kthSmallest(arr, 0, arr.length-1, k);

        // for(int i=0;i<arr.length;i++)
        //     System.out.print(arr[i]+" ");

        System.out.println(k+" smallest number is "+val);
        // sc.close();
    }
}
