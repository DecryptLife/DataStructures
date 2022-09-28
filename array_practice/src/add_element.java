public class add_element {

    static void insertEle(int[] a, int n,int ele, int cap, int pos)
    {
        if(n == cap)
            System.out.println("Array already full");
        else
        {
            int idx = pos - 1;
            for(int i=n-1;i> idx;i--)
            {
                a[i+1] = a[i];
            }
            a[idx]  = ele;
            for(int i=0;i<cap;i++)
            {
                System.out.println(a[i]);
            }
        }


    }
    public static void main(String[] args) {
        int[] a = new int[10];
        int ele = 100;
        int pos = 3;
        for(int i =0;i<a.length-2;i++)
        {
            a[i] = (i+1)*10;
            System.out.println("At "+i+" value is "+a[i]);
        }
        System.out.println(" Array is of size "+a[9]);

        insertEle(a,a.length-2,ele,10, pos);
    }
}
