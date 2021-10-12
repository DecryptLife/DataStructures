package FindDuplicateNumber;

public class solution_1
{
    public static int findDuplicate(int[] nums) {
        int count =1;
        for(int i=0;i<nums.length;i++)
        {
            count = 1;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i] == nums[j])
                    count++;
            }
            if(count > 1)
                return nums[i];
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};

        System.out.println(findDuplicate(nums));
    }
}