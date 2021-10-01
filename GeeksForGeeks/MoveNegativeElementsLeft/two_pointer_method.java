package MoveNegativeElementsLeft;

public class two_pointer_method {
    static void shiftToLeft(int[] arr, int left, int right)
    {
        int temp = 0;
        while(left <= right)
        {
            // when both are negative
            if(arr[left] < 0 && arr[right] < 0)
                left++;
            // when left is positive and right is negative
            else if(arr[left] > 0 && arr[right] < 0)
            {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
                left++;
            }
            // both are positive
            else if(arr[left] > 0 && arr[right] > 0)
            {
                left++;
            }
            else{
                left++;
                right--;
            }

        }


    }
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int n = arr.length;

        shiftToLeft(arr,0,n-1);

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    
}
