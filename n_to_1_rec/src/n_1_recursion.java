public class n_1_recursion {

    static int printNum(int n)
    {
        if(n==0)
            return 0;

        System.out.println(n);

        return 1 + printNum(n-1);


    }

    public static void main(String[] args) {
        int num = 10;

        printNum(num);
    }
}
