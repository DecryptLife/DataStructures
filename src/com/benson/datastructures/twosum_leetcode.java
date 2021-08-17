package com.benson.datastructures;

public class twosum_leetcode {
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int[] indices = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                else {
                    sum = nums[i] + nums[j];
                    if (sum == target) {
                        indices[0] = i;
                        indices[1] = j;
                        break;
                    }
                }
            }
        }
        return indices;
    }
}

// Runtime: 91ms, Memory Usage: 39.2mb

