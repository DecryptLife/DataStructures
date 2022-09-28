public class check_sorted {
    static boolean check_sorted(int[] a)
    {
        int j= a.length >1 ? 1:-1;
        int a_count=0;
        int d_count = 0;
        if(j == -1)
            return true;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i] <= a[j])
            {
                a_count++;
            }
            else if(a[i] >= a[j])
            {
                d_count++;
            }
            j++;
        }

        if( ((a_count+1) == a.length) || ((d_count+1) == a.length))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        int[] a = {1};

        System.out.println(check_sorted(a));
    }
}
