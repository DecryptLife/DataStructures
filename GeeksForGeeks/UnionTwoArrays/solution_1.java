package UnionTwoArrays;

public class solution_1 {
    public static void doUnion(int a[], int m, int b[], int n) 
    {
        int i=0, j =0;
        
        while(i<m && j<n)
        {
            if(a[i] > b[j])
                System.out.println(b[j++]+" ");
            else if(b[j] > a[i])
                System.out.println(a[i++]+" ");
            else
            {
                System.out.println(b[j++]+" ");
                i++;
            }
        }
        
        while(i<m)
        {
            System.out.println(a[i++]+" ");
        }
        while(j<n)
        {
            System.out.println(b[j++]+" ");
        }
        
    }
    public static void main(String[] args) {
        int[] a = {0,2,8,12};
        int[] b = {1,2,3,4,5};
        
        doUnion(a, a.length, b, b.length);


    }
}
