package FindDuplicateNumber;

import java.util.*;
public class solution_2 {

    public static int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();
        
        for(int num:nums)
        {
            if(seen.contains(num))
                return num;
            else
                seen.add(num);
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,1,1};

        System.out.println(findDuplicate(arr));
    }
}
