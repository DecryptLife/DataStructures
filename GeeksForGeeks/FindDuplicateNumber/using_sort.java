package FindDuplicateNumber;
import java.util.*;
public class using_sort {
    static int findDuplicate(int[] nums)
    {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] == nums[i-1])
                return nums[i];
        }

        return -1;
    }
    
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};

        System.out.println(findDuplicate(nums));
    }
}
