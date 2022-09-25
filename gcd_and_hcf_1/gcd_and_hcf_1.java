import java.util.Scanner;

public class gcd_and_hcf_1 {
    static  int findGCD(int a,int b)
    {
        int min = Math.min(a,b);

        while(min > 0)
        {
            if(a%min == 0 && b%min ==0)
            {
                break;
            }
            min--;
        }

        return min;
    }
    public static void main(String[] args) {

        int a = 435;
        int b = 45;

        System.out.println(findGCD( a, b));
    }
}
