public class delete_element {
    static void delete_element(int[] a, int n, int ele, int pos)
    {
        int idx = pos-1;
        for(int i=pos-1;i<n-1;i++)
        {
            a[i] = a[i+1];
        }
        a[n-1]=0;

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[10];

        for(int i = 0;i<a.length;i++)
        {
            a[i] = (i+1) * 10;
        }
        int ele = 50;
        int pos = 4;

        delete_element(a,10,ele,5);
    }
}
