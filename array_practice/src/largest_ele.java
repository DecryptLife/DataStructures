public class largest_ele {

    static int findLargestEle(int[] a)
    {
        int largest = -1;
        int idx = -1;
        for(int i=0;i<a.length;i++)
        {
            if(a[i] >largest)
            {
                largest = a[i];
                idx = i;
            }

        }

        return idx;
    }

    public static void main(String[] args) {
        int[] a= {1,1,1,1};

        int idx = findLargestEle(a);

        System.out.println(idx);
    }
}
