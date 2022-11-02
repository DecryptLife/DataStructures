public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {2,10,8,7};
        boolean swapped;
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.println("Pass 1 ");
            swapped  =false;
            for(int j=0;j<arr.length-1-i;j++)
            {

                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
                for(int k=0;k<arr.length;k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            if(swapped == false)
                break;

        }

    }
}
