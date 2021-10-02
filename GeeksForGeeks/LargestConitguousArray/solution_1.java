package LargestConitguousArray;

public class solution_1 {
    long maxSubarraySum(int arr[], int n){
        long max_current = 0 , max_global = Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            max_current+= arr[i];

            if(max_current > max_global)
                max_global = max_current;

            if(max_current<0)
                max_current = 0;
        }

        return max_global;
    }

    public static void main(String[] args) {
        solution_1 sol = new solution_1();
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = 9;

        System.out.println(sol.maxSubarraySum(arr, n));
    }
}
