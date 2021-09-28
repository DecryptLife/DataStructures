package kthSmallestElement;

public class lol {
    static int factorial(int num)
    {
        if(num == 0)
            return 1;
        else
            return (num * factorial(num-1));
    }
    public static void main(String[] args)
    {
        int[] num = {4,8,7,6,5};

        for(int i=0;i<num.length;i++)
        {
            System.out.println(factorial(num[i]));
        }
    }
}
