package com.benson.datastructures;
import java.util.*;
import java.lang.*;
public class array_reversal

{
        public static void main (String[] args) {
            //code
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of test cases");
            int T = sc.nextInt();
            int arr[];
            sc.nextLine();
            for(int i = 0; i < T; i++)
            {
                System.out.println("Enter the size of array");
                int N = sc.nextInt();
                arr = new int[N];
                System.out.println("Enter the number of rotations to be done");
                int D = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter array elements");
                for(int j = 0; j<N;j++)
                {
                    arr[j] = sc.nextInt();
                }

                for(int k = 0; k<D;k++){
                    int temp = arr[0];
                    for(int m = 1; m<N;m++)
                    {
                        arr[m-1] = arr[m];
                    }
                    arr[N-1] = temp;

                }
                for(int n = 0 ; n < N ; n++)
                {
                    System.out.print(arr[n]+" ");

                }
                System.out.println();


            }

        }
    }


// not an efficient code
