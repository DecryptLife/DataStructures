package com.benson.datastructures;

import java.util.Scanner;

// The array is broken down to two parts
// A = [arr[0] .... arr[d]]
// B = [arr[d+1] ..... arr[n]]

public class block_swap_array_rotation {
    public static void leftRotate(int arr[], int d,
                                  int n)
    {
        leftRotateRec(arr, 0, d, n);
    }

    public static void leftRotateRec(int arr[], int i,
                                     int d, int n)
    {
        //System.out.println(String.format("i:%d, d: %d, n: %d",i,d,n));
        /* Return If number of elements to be rotated
        is zero or equal to array size */
        if(d == 0 || d == n)
            return;

        /*If number of elements to be rotated
        is exactly half of array size */
        if(n - d == d)
        {
            //System.out.println("Equal size");
            swap(arr, i, n - d + i, d);
            return;
        }

        /* If A is shorter*/
        if(d < n - d)
        {
//            System.out.println("In shorter A");
//            System.out.println(String.format("Values going to swap:- fi = %d, si = %d, d = %d",i,n-d+1,d));
//            System.out.println(String.format("Values going to recursive function:- i = %d, d = %d, n = %d",i,d,n-d));
            swap(arr, i, n - d + i, d);
            leftRotateRec(arr, i, d, n - d);
        }
        else /* If B is shorter*/
        {

        System.out.println(String.format("Values going to swap:- fi = %d, si = %d, d = %d",i,d, n-d));
            System.out.println(String.format("Values going to recursive function:- i = %d, d = %d, n = %d",n-d+1,2*d-n,d));
            swap(arr, i, d, n - d);
            leftRotateRec(arr, n - d + i, 2 * d - n, d); /*This is tricky*/
        }
    }


    /*This function swaps d elements
    starting at index fi with d elements
    starting at index si */
    public static void swap(int arr[], int fi,
                            int si, int d)
    {
        int i, temp;
        for(i = 0; i < d; i++)
        {
            temp = arr[fi + i];
            arr[fi + i] = arr[si + i];
            arr[si + i] = temp;
        }

        // After a swap
        printArray(arr);
    }


    private static void printArray(int[] arr) {
        for (int i: arr)
            System.out.print(i+" ");
        System.out.println();

    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the number of rotations: ");
        int d = sc.nextInt();
        System.out.println("Enter elements of array: ");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        leftRotate(arr,d,n);
        printArray(arr);

    }




}
