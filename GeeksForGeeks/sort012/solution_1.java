package sort012;

public class solution_1 {
    
    public static void sort012(int a[], int n)
    {
        // code here
        int order[] = {0,1};
        int temp = 0;
        int pos = 0;
        int index= 0;
        for(int j=0;j<order.length;j++)
        {
            for(int i=index;i<a.length;i++)
            {
                if(order[j] == a[i])
                {
                    temp = a[index];
                    pos = i;
                    a[index] = order[j];
                    a[pos] = temp;
                    index++;
                } 
            }
        }
    }

    public static void main(String[] args)
    {
        int[] a = {2,2,1,0,2,1,1,2,0,2};
        int n = a.length-1;

        sort012(a, n);
        for(int i = 0;i<=n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}

