public class optimized_gcd_euclid {
    static int findGCD(int a,int b)
    {
        if(b == 0)
            return a;

        return findGCD(b,a%b);
    }

    public static void main(String[] args) {
        int a = 90;
        int b = 150;

        System.out.println("GCD is "+findGCD(a,b));
    }
}
