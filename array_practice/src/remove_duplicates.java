public class remove_duplicates {

    static void removeDup(int[] a)
    {
        int pos=1;
        for(int i=1;i<a.length;i++)
        {
            if(a[i] != a[pos-1])
            {
                a[pos] = a[i];
                pos++;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {10,20,20,20,30,40,40,50};

        removeDup(a);

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
