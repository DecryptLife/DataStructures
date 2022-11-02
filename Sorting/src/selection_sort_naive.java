public class selection_sort_naive {
    public static void main(String[] args) {
        int[] arr = { 10,6,2,4,15,8};
        int temp[] = new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            int index = 0;
            for(int j=0;j<arr.length -1;j++)
            {

                if(arr[j+1] < arr[index])
                {
                    index = j+1;
                }
            }

            temp[i] = arr[index];
            arr[index] = Integer.MAX_VALUE;
        }

        for (int i= 0;i<temp.length;i++)
        {
            System.out.println(temp[i]);
        }
    }
}
