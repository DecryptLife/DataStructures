public class gcd_hcf_euclid {

    static int findGCD(int a,int b)
    {
        while(a!=b)
        {
            if(a>b)
                a -= b;
            else
                b-=a;
        }

        return a;
    }


    public static void main(String[] args) {

        int a = 45;
        int b = 150;

        System.out.println("GCD of "+a+" and "+b+" is : "+findGCD(a,b));
    }
}
