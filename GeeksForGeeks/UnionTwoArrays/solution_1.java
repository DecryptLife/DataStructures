package UnionTwoArrays;

public class solution_1 {
    public static void doUnion(int a[], int m, int b[], int n) 
    {
        int i=0, j =0;
        int count = 0;
        while(i<m && j<n)
        {
            if(a[i] > b[j]){
                count++;
                System.out.println(b[j++]+" ");}
            else if(b[j] > a[i]){
                count++;
                System.out.println(a[i++]+" ");}
            else
            {
                count++;
                System.out.println(b[j++]+" ");
                i++;
            }
        }
        
        while(i<m)
        {
            count++;
            System.out.println(a[i++]+" ");
        }
        while(j<n)
        {
            count++;
            System.out.println(b[j++]+" ");
        }
        System.out.println("Count : "+count);
    }
    public static void main(String[] args) {
        int[] a = {0,2,8,12};
        int[] b = {1,2,3,4,5};
        
        doUnion(a, a.length, b, b.length);


    }
}
