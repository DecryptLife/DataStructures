public class array_reversal {

    static void reverseArray(int[] a)
    {
        int temp = 0;

        for(int i=0;i < a.length/2 ;i++)
        {
            temp = a[i];
            a[i] = a[a.length-(i+1)];
            a[a.length - (i+1)] = temp;
        }


    }

    public static void main(String[] args) {
        int[] a = {10,40,50,80,30};

        reverseArray(a);

        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
