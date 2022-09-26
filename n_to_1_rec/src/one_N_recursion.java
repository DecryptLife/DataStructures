public class one_N_recursion {

    static void oneToN(int n)
    {
        if(n == 0)
        {
            return;
        }
        oneToN(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int num = 10;

        oneToN(num);
    }

}
