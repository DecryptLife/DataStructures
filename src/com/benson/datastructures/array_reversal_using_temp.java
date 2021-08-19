package com.benson.datastructures;

import java.util.*;
import java.lang.*;
import java.io.*;

class array_reversal_using_temp {
    public static void main(String[] args) {
            //code
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int arr[];
        int temp[];
        sc.nextLine();
        // no of test cases
        for(int i = 0; i < T; i++) {
            int k = 0;
            int N = sc.nextInt();
            arr = new int[N];
            int D = sc.nextInt();
            temp = new int[D];
            sc.nextLine();
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
            }
            for (int j = 0; j < D; j++) {
                temp[j] = arr[j];
            }
            for (int j = D; j < N; j++) {
                arr[j - D] = arr[j];
            }
            for (int j = arr.length - D; j < N; j++) {
                arr[j] = temp[k];
                k++;
            }
            for (int j = 0; j < N; j++)
                System.out.print(arr[j] + " ");
            System.out.println();
        }
    }
}


