public class rope_cut_prob {

    static int findMaxCuts(int n, int a, int b,int c)
    {
        if(n == 0)
            return 0;
        if(n < 0)
            return -1;

        int res = max(findMaxCuts(n-a,a,b,c),
                findMaxCuts(n-b,a,b,c),
                findMaxCuts(n-c,a,b,c));

        if(res == -1)
            return -1;

        return res + 1;

    }

    static int max(int a,int b, int c)
    {
        if(a >= b && a >= c )
            return a;
        else if(b >= a && b >= c)
            return b;
        else
            return c;

    }

    public static void main(String[] args) {
        int n = 23;
        int a = 11;
        int b = 9;
        int c = 2;

        System.out.println(findMaxCuts(n,a,b,c));
    }
}
