public class second_largest {
    static int findSecondLargest(int[] a)
    {
        int idx ;
        int s_idx;
        if(a[0] >a[1])
        {
            idx  =0;
            s_idx = 1;
        }
        else
        {
            idx = 1;
            s_idx = 0;
        }
        for(int i=2;i<a.length;i++)
            if(a[idx] < a[i])
            {
                idx = i;

            }
            else
            {
                if(a[s_idx]<a[i])
                    s_idx = i;
            }
        return a[s_idx];
    }
    public static void main(String[] args) {
        int[] a = {100,105,20,35,15,22,200,195};

        System.out.println(findSecondLargest(a));
    }
}
