package com.benson.datastructures;

import java.util.Scanner;

public class array_rotation_reversal_algo {
    static void leftRotate(int[] arr, int n, int d) {
        // code here
        if(d == 0)
            return;

        d = d%n;

        reverseArray(arr, 0 , d - 1);
        reverseArray(arr, d , n - 1);
        reverseArray(arr, 0 , n - 1);
    }
    static void reverseArray(int[] arr, int start, int end)
    {
        int temp;
        while(start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void printArray(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array: ");
        int n = sc.nextInt();
        System.out.println("Enter the array: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of rotations: ");
        int d = sc.nextInt();

        leftRotate(arr, n, d);
        printArray(arr);
    }
}
