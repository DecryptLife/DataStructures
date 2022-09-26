public class oneN_TailRec {

    static void oneToN(int n,int k)
    {
        if(n == 0)
            return;

        System.out.println(k);
        oneToN(n-1,k+1);
    }

    public static void main(String[] args) {
        int num = 10;
        int k=1;
        oneToN(num,k);
    }
}


// Tail recursive takes lesser time compared to a non tail recursive function