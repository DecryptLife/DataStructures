public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {2,10,8,7};

        for(int i=0;i<arr.length-1;i++)
        {
            System.out.println("Pass 1 ");
            for(int j=0;j<arr.length-1-i;j++)
            {

                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                for(int k=0;k<arr.length;k++)
                {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }

        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
