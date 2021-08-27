/*
        LeetCode
        27. Removing element

        Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.

        Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

        Return k after placing the final result in the first k slots of nums.

        Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

        Example:
        Input: nums = [3,2,2,3], val = 3
        Output: 2, nums = [2,2,_,_]
        Explanation: Your function should return k = 2, with the first two elements of nums being 2.
        It does not matter what you leave beyond the returned k (hence they are underscores).
*/
package com.benson.datastructures;

import java.util.Scanner;

public class in_place_element_removal_1 {

    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0)
            return 0;

        int size = 0;
        for(int i=0; i <nums.length; i++)
        {
            if(nums[i]!= val)
            {
                nums[size] = nums[i];
                size++;
            }

        }

        return size;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter the value to be removed");
        int val = sc.nextInt();

        // remove element
        int size = removeElement(arr,val);

        for(int i = 0; i<size;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
